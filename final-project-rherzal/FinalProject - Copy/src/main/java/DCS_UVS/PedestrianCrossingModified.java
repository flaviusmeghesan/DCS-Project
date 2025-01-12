package DCS_UVS;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class PedestrianCrossingModified {
	public static void main(String[] args) {
		
		//--------------------------------------------------------------------
		//-------------------------------Lane1--------------------------------
		//--------------------------------------------------------------------
		
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Main Petri";
		pn.NetworkPort = 1080;
		
		DataCar p1 = new DataCar();
		p1.SetName("P_a1");
		pn.PlaceList.add(p1);

		DataCarQueue p2 = new DataCarQueue();
		p2.Value.Size = 3;
		p2.SetName("P_x1");
		pn.PlaceList.add(p2);

		DataString p3 = new DataString();
		p3.SetName("P_TL1");
		pn.PlaceList.add(p3);

		DataCar p4 = new DataCar();
		p4.SetName("P_b1");
		pn.PlaceList.add(p4);

		DataString p5 = new DataString();
		p5.SetName("P_PTL1");
		pn.PlaceList.add(p5);

		DataString p6 = new DataString();
		p6.SetName("UserReq");
		pn.PlaceList.add(p6);

		DataTransfer p7 = new DataTransfer();
		p7.SetName("OPReq");
		p7.Value = new TransferOperation("localhost", "1081" , "UserReq");
		pn.PlaceList.add(p7);

		DataString full = new DataString();
		full.SetName("full");
		full.SetValue("full");
		pn.ConstantPlaceList.add(full);

		DataString red = new DataString();
		//red.Printable = false;
		red.SetName("red");
		red.SetValue("red");
		pn.ConstantPlaceList.add(red);

		DataString green = new DataString();
		//green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.ConstantPlaceList.add(green);

		DataString yellow = new DataString();
		//yellow.Printable = false;
		yellow.SetName("yellow");
		yellow.SetValue("yellow");
		pn.ConstantPlaceList.add(yellow);
		
		// T1 ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T_u1";
		t1.InputPlaceName.add("P_a1");
		t1.InputPlaceName.add("P_x1");

		Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		Condition T1Ct3 = new Condition(t1, "P_a1", TransitionCondition.IsBus);
		T1Ct2.SetNextCondition(LogicConnector.AND, T1Ct3);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));


		Condition T11Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T11Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		Condition T11Ct3 = new Condition(t1, "P_a1", TransitionCondition.IsPriorityCar);
		T11Ct2.SetNextCondition(LogicConnector.AND, T11Ct3);
		T11Ct1.SetNextCondition(LogicConnector.AND, T11Ct2);

		GuardMapping grdT11 = new GuardMapping();
		grdT11.condition= T11Ct1;
		grdT11.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));



		t1.GuardMappingList.add(grdT1);
		t1.GuardMappingList.add(grdT11);

		t1.Delay = 0;
		pn.Transitions.add(t1);

		// T2 ------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T_e1";
		t2.InputPlaceName.add("P_x1");
		t2.InputPlaceName.add("P_TL1");
		t2.InputPlaceName.add("UserReq");
		t2.InputPlaceName.add("P_PTL1");

		Condition T2Grd1Ct1 = new Condition(t2, "P_TL1", TransitionCondition.Equal,"green");
		Condition T2Grd1Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveCar);
		T2Grd1Ct1.SetNextCondition(LogicConnector.AND, T2Grd1Ct2);

		GuardMapping grd1T2 = new GuardMapping();
		grd1T2.condition= T2Grd1Ct1;
		grd1T2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
		grd1T2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));
		grd1T2.Activations.add(new Activation(t2, "P_PTL1", TransitionOperation.Move, "P_PTL1"));
		t2.GuardMappingList.add(grd1T2);


		Condition T2Grd2Ct1 = new Condition(t2, "UserReq", TransitionCondition.NotNull);
		GuardMapping grd2T2 = new GuardMapping();
		grd2T2.condition= T2Grd2Ct1;
		grd2T2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));
		grd2T2.Activations.add(new Activation(t2, "P_PTL1", TransitionOperation.Move, "P_PTL1"));
		grd2T2.Activations.add(new Activation(t2, "UserReq", TransitionOperation.SendOverNetwork, "OPReq"));
		t2.GuardMappingList.add(grd2T2);

		Condition T2Grd3Ct1 = new Condition(t2, "P_x1", TransitionCondition.HavePriorityCar);
		GuardMapping grd3T2 = new GuardMapping();
		grd3T2.condition = T2Grd3Ct1;
		grd3T2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
		grd3T2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));
		grd3T2.Activations.add(new Activation(t2, "P_PTL1", TransitionOperation.Move, "P_PTL1"));
		t2.GuardMappingList.add(grd3T2);

		t2.Delay = 1;
		pn.Transitions.add(t2);
		
		
		
		//-------------------------------------------------------------------------------------
		//----------------------------PN Start-------------------------------------------------
		//-------------------------------------------------------------------------------------

		System.out.println("Lane started \n ------------------------------");
		pn.Delay = 2000;
		//pn.Start();
		
		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
	}
}
