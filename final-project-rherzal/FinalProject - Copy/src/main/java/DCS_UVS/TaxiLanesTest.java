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

import java.util.ArrayList;

public class TaxiLanesTest {
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

		DataCarQueue p3 = new DataCarQueue();
		p3.Value.Size = 3;
		p3.SetName("P_x2");
		pn.PlaceList.add(p3);

		DataCarQueue p4 = new DataCarQueue();
		p4.Value.Size = 3;
		p4.SetName("P_Station");
		pn.PlaceList.add(p4);

		DataCar p5 = new DataCar();
		p5.SetName("P_T2");
		pn.PlaceList.add(p5);

		DataCar p6 = new DataCar();
		p6.SetName("P_T3");
		pn.PlaceList.add(p6);

		DataString p7 = new DataString();
		p7.SetName("UserReq");
		pn.PlaceList.add(p7);

		DataString full = new DataString();
		full.SetName("full");
		full.SetValue("full");
		pn.ConstantPlaceList.add(full);
		
		// T1 ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T_u1";
		t1.InputPlaceName.add("P_a1");
		t1.InputPlaceName.add("P_x1");

		Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition= T1Ct1;
		grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));

		t1.GuardMappingList.add(grdT1);

		t1.Delay = 0;
		pn.Transitions.add(t1);

		// T2 ------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T_s";
		t2.InputPlaceName.add("P_x1");


		Condition T2Ct1 = new Condition(t2, "P_x1", TransitionCondition.HaveCarForMe);
		Condition T2Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveTaxi);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition = T2Ct1;
		grdT2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTargetToQueue, "P_Station"));
		t2.GuardMappingList.add(grdT2);

		t2.Delay = 0;
		pn.Transitions.add(t2);

		// T3 ------------------------------------------------

		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T_es";
		t3.InputPlaceName.add("P_Station");
		t3.InputPlaceName.add("UserReq");

		Condition T3Ct1 = new Condition(t3, "P_Station", TransitionCondition.HaveCar);
		Condition T3Ct2 = new Condition(t3, "UserReq", TransitionCondition.NotNull);
		T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

		ArrayList<String> input = new ArrayList<>();
		input.add("P_Station");
		input.add("UserReq");

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition = T3Ct1;
		grdT3.Activations.add(new Activation(t3, input, TransitionOperation.PopTaxiToQueue, "P_x2"));

		t3.GuardMappingList.add(grdT3);

		t3.Delay = 0;
		pn.Transitions.add(t3);

		// T4 --------------------------------------------------------------------------------

		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T2";
		t4.InputPlaceName.add("P_x2");

		Condition T4Ct1 = new Condition(t4, "P_x2", TransitionCondition.HaveCarForMe);

		GuardMapping grdT4 = new GuardMapping();

		grdT4.condition = T4Ct1;
		grdT4.Activations.add(new Activation(t4, "P_x2", TransitionOperation.PopElementWithTarget, "P_T2"));

		t4.GuardMappingList.add(grdT4);

		t4.Delay = 0;
		pn.Transitions.add(t4);

		// T5 --------------------------------------------------------------------------------

		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T3";
		t5.InputPlaceName.add("P_x2");

		Condition T5Ct1 = new Condition(t5, "P_x2", TransitionCondition.HaveCarForMe);

		GuardMapping grdT5 = new GuardMapping();

		grdT5.condition = T5Ct1;
		grdT5.Activations.add(new Activation(t5, "P_x2", TransitionOperation.PopElementWithTarget, "P_T3"));

		t5.GuardMappingList.add(grdT5);

		t5.Delay = 0;
		pn.Transitions.add(t5);

		// T6 --------------------------------------------------------------------------------

		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T1";
		t6.InputPlaceName.add("P_x1");
		t6.InputPlaceName.add("P_x2");

		Condition T6Ct1 = new Condition(t6, "P_x1", TransitionCondition.HaveCarForMe);
		Condition T6Ct2 = new Condition(t6, "P_x2", TransitionCondition.CanAddCars);
		T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

		GuardMapping grdT6 = new GuardMapping();

		grdT6.condition = T6Ct1;
		grdT6.Activations.add(new Activation(t6, "P_x1", TransitionOperation.PopElementWithTargetToQueue, "P_x2"));

		t6.GuardMappingList.add(grdT6);

		t6.Delay = 0;
		pn.Transitions.add(t6);
		
		
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
