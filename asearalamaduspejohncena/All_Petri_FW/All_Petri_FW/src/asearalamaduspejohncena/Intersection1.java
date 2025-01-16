package asearalamaduspejohncena.Int1;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection1 {
	public static void main(String[] args) {
		
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Lanes Intersection";

		pn.NetworkPort = 1081;
		
		DataString green = new DataString();	 	
		green.Printable = false;
		green.SetName("green");
		green.SetValue("green");
		pn.ConstantPlaceList.add(green);

		DataString full = new DataString();
		full.Printable = false;
		full.SetName("full");
		full.SetValue("full");
		pn.ConstantPlaceList.add(full);

		// -------------------------------------------------------------------
		// -------------------------------Lane1--------------------------------
		// --------------------------------------------------------------------

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

		DataTransfer OP1 = new DataTransfer();
		OP1.SetName("OP1");
		OP1.Value = new TransferOperation("localhost", "1090", "in1");
		pn.PlaceList.add(OP1);

		// -------------------------------------------------------------------------------------
		// --------------------------------Lane2-----------------------------------------------
		// -------------------------------------------------------------------------------------

		DataCar p5 = new DataCar(); //p5.Printable = false;
		p5.SetName("P_a2");
		pn.PlaceList.add(p5);

		DataCarQueue p6 = new DataCarQueue(); //p6.Printable = false;
		p6.Value.Size = 3;
		p6.SetName("P_x2");
		pn.PlaceList.add(p6);

		DataString p7 = new DataString(); //p7.Printable = false;
		p7.SetName("P_TL2");
		pn.PlaceList.add(p7);

		DataCar p8 = new DataCar(); //p8.Printable = false;
		p8.SetName("P_b2");
		pn.PlaceList.add(p8);

		DataTransfer OP2 = new DataTransfer();
		OP2.SetName("OP2");
		OP2.Value = new TransferOperation("localhost", "1090", "in2");
		pn.PlaceList.add(OP2);

		// -------------------------------------------------------------------------------------
		// --------------------------------Lane4-----------------------------------------------
		// -------------------------------------------------------------------------------------

		DataCar p13 = new DataCar();
		p13.SetName("P_a4");
		pn.PlaceList.add(p13);

		DataCarQueue p14 = new DataCarQueue();
		p14.Value.Size = 3;
		p14.SetName("P_x4");
		pn.PlaceList.add(p14);

		DataCar p_a4_1 = new DataCar();
		p_a4_1.SetName("P_a4_1");
		pn.PlaceList.add(p_a4_1);

		DataCarQueue p_x4_1 = new DataCarQueue();
		p_x4_1.Value.Size = 3;
		p_x4_1.SetName("P_x4_1");
		pn.PlaceList.add(p_x4_1);

		DataCarQueue p_x4_2 = new DataCarQueue();
		p_x4_2.Value.Size = 3;
		p_x4_2.SetName("P_x4_2");
		pn.PlaceList.add(p_x4_2);

		DataCarQueue p_station = new DataCarQueue();
		p_station.Value.Size = 3;
		p_station.SetName("P_station");

		DataString p15 = new DataString();
		p15.SetName("P_TL4");
		pn.PlaceList.add(p15);

		DataTransfer OP3 = new DataTransfer();
		OP3.SetName("OP4");
		OP3.Value = new TransferOperation("localhost", "1090", "in4");
		pn.PlaceList.add(OP3);


		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 1-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p17 = new DataCarQueue(); //p17.Printable = false;
		p17.Value.Size = 3;
		p17.SetName("P_o1");
		pn.PlaceList.add(p17);

		DataCar p18 = new DataCar(); //p18.Printable = false;
		p18.SetName("P_o1Exit");
		pn.PlaceList.add(p18);

		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 2-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p19 = new DataCarQueue(); //p19.Printable = false;
		p19.Value.Size = 3;
		p19.SetName("P_o2");
		pn.PlaceList.add(p19);

		DataCar p20 = new DataCar(); //p20.Printable = false;
		p20.SetName("P_o2Exit");
		pn.PlaceList.add(p20);

		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 3-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p21 = new DataCarQueue(); //p21.Printable = false;
		p21.Value.Size = 3;
		p21.SetName("P_o3");
		pn.PlaceList.add(p21);

		DataCar p22 = new DataCar(); //p22.Printable = false;
		p22.SetName("P_o3Exit");
		pn.PlaceList.add(p22);

		// ----------------------------------------------------------------------------
		// ----------------------------Exit lane 4-------------------------------------
		// ----------------------------------------------------------------------------

		DataCarQueue p23 = new DataCarQueue();
		p23.Value.Size = 3;
		p23.SetName("P_o4");
		pn.PlaceList.add(p23);

		DataCar p24 = new DataCar();
		p24.SetName("P_o4Exit");
		pn.PlaceList.add(p24);

		DataCarQueue p_x4_1E = new DataCarQueue();
		p_x4_1E.Value.Size = 3;
		p_x4_1E.SetName("P_x4_1E");
		pn.PlaceList.add(p_x4_1E);

		DataCarQueue p_x4_2E = new DataCarQueue();
		p_x4_2E.Value.Size = 3;
		p_x4_2E.SetName("P_x4_2E");
		pn.PlaceList.add(p_x4_2E);

		DataCarQueue p_station2 = new DataCarQueue();
		p_station2.Value.Size = 3;
		p_station2.SetName("P_station2");

		DataCar P_o4Exit2 = new DataCar();
		P_o4Exit2.SetName("P_o4Exit2");
		pn.PlaceList.add(P_o4Exit2);

		// -------------------------------------------------------------------------------------------
		// --------------------------------Intersection-----------------------------------------------
		// -------------------------------------------------------------------------------------------

		DataCarQueue p25 = new DataCarQueue();
		p25.Value.Size = 3;
		p25.SetName("P_I");
		pn.PlaceList.add(p25);

//		// T1 ------------------------------------------------
//		PetriTransition t1 = new PetriTransition(pn);
//		t1.TransitionName = "T_u1";
//		t1.InputPlaceName.add("P_a1");
//		t1.InputPlaceName.add("P_x1");
//
//		Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
//		Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
//		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);
//
//		GuardMapping grdT1 = new GuardMapping();
//		grdT1.condition = T1Ct1;
//		grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));
//		t1.GuardMappingList.add(grdT1);
//
//		t1.Delay = 0;
//		pn.Transitions.add(t1);

		// T1 for priority ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "T_u1";
		t1.InputPlaceName.add("P_a1");

		Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition = T1Ct1;
		grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));
		t1.GuardMappingList.add(grdT1);

		Condition T1Ct21 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
		Condition T1Ct22 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
		Condition T1Ct23 = new Condition(t1, "P_a1", TransitionCondition.IsPriorityCar);
		T1Ct22.SetNextCondition(LogicConnector.AND, T1Ct23);
		T1Ct21.SetNextCondition(LogicConnector.AND, T1Ct22);

		GuardMapping grdT122 = new GuardMapping();
		grdT122.condition = T1Ct21;
		grdT122.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));
		t1.GuardMappingList.add(grdT122);

		t1.Delay = 0;
		pn.Transitions.add(t1);

		// T_out1 -----------------------------------------------
		PetriTransition t_out1 = new PetriTransition(pn);
		t_out1.TransitionName = "T_Out1";
		t_out1.InputPlaceName.add("P_a1");
		t_out1.InputPlaceName.add("P_x1");
		t_out1.IsAsync = true;

		Condition T_outCt1 = new Condition(t_out1, "P_a1", TransitionCondition.NotNull);
		Condition T_outCt2 = new Condition(t_out1, "P_x1", TransitionCondition.CanNotAddCars);
		T_outCt1.SetNextCondition(LogicConnector.AND, T_outCt2);

		GuardMapping grdT_out1 = new GuardMapping();
		grdT_out1.condition = T_outCt1;
		grdT_out1.Activations.add(new Activation(t_out1, "full", TransitionOperation.SendOverNetwork, "OP1"));
		t_out1.GuardMappingList.add(grdT_out1);

		t_out1.Delay = 0;
		pn.Transitions.add(t_out1);

//		// T2 ------------------------------------------------
//		PetriTransition t2 = new PetriTransition(pn);
//		t2.TransitionName = "T_e1";
//		t2.InputPlaceName.add("P_x1");
//		t2.InputPlaceName.add("P_TL1");
//
//		Condition T2Ct1 = new Condition(t2, "P_TL1", TransitionCondition.Equal, "green");
//		Condition T2Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveCar);
//		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);
//
//		GuardMapping grdT2 = new GuardMapping();
//		grdT2.condition = T2Ct1;
//		grdT2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
//	    grdT2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));
//
//		t2.GuardMappingList.add(grdT2);
//
//		t2.Delay = 1;
//		pn.Transitions.add(t2);
		// T2 for priority ------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "T_e1";
		t2.InputPlaceName.add("P_x1");
		t2.InputPlaceName.add("P_TL1");

		Condition T2Ct1 = new Condition(t2, "P_TL1", TransitionCondition.Equal, "green");
		Condition T2Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveCar);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition = T2Ct1;
		grdT2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
		grdT2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));

		t2.GuardMappingList.add(grdT2);

		Condition T2Ct21 = new Condition(t2, "P_x1", TransitionCondition.HavePriorityCar);

		GuardMapping grdT22 = new GuardMapping();
		grdT22.condition = T2Ct21;
		grdT22.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
		grdT22.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));

		t2.Delay = 1;
		pn.Transitions.add(t2);

//		// T3 ------------------------------------------------
//		PetriTransition t3 = new PetriTransition(pn);
//		t3.TransitionName = "T_u2";
//		t3.InputPlaceName.add("P_a2");
//		t3.InputPlaceName.add("P_x2");
//
//		Condition T3Ct1 = new Condition(t3, "P_a2", TransitionCondition.NotNull);
//		Condition T3Ct2 = new Condition(t3, "P_x2", TransitionCondition.CanAddCars);
//		T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);
//
//		GuardMapping grdT3 = new GuardMapping();
//		grdT3.condition = T3Ct1;
//		grdT3.Activations.add(new Activation(t3, "P_a2", TransitionOperation.AddElement, "P_x2"));
//		t3.GuardMappingList.add(grdT3);
//
//		t3.Delay = 0;
//		pn.Transitions.add(t3);

		// T3 for priority ------------------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "T_u2";
		t3.InputPlaceName.add("P_a2");


		Condition T3Ct1 = new Condition(t3, "P_a2", TransitionCondition.NotNull);
		Condition T3Ct2 = new Condition(t3, "P_x2", TransitionCondition.CanAddCars);
		T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition = T3Ct1;
		grdT3.Activations.add(new Activation(t3, "P_a2", TransitionOperation.AddElement, "P_x2"));
		t3.GuardMappingList.add(grdT3);

		Condition T3Ct21 = new Condition(t3, "P_a2", TransitionCondition.NotNull);
		Condition T3Ct22 = new Condition(t3, "P_x2", TransitionCondition.CanAddCars);
		Condition T3Ct23 = new Condition(t3, "P_a2", TransitionCondition.IsPriorityCar);
		T3Ct22.SetNextCondition(LogicConnector.AND, T3Ct23);
		T3Ct21.SetNextCondition(LogicConnector.AND, T3Ct22);

		GuardMapping grdT32 = new GuardMapping();
		grdT32.condition = T3Ct21;
		grdT32.Activations.add(new Activation(t3, "P_a2", TransitionOperation.AddElement, "P_x2"));
		t3.GuardMappingList.add(grdT32);

		t3.Delay = 0;
		pn.Transitions.add(t3);


		// T_out2 -----------------------------------------------
		PetriTransition t_out2 = new PetriTransition(pn);
		t_out2.TransitionName = "T_Out2";
		t_out2.InputPlaceName.add("P_a2");
		t_out2.InputPlaceName.add("P_x2");
		t_out2.IsAsync = true;

		Condition T_out2Ct1 = new Condition(t_out2, "P_a2", TransitionCondition.NotNull);
		Condition T_out2Ct2 = new Condition(t_out2, "P_x2", TransitionCondition.CanNotAddCars);
		T_out2Ct1.SetNextCondition(LogicConnector.AND, T_out2Ct2);

		GuardMapping grdT_out2 = new GuardMapping();
		grdT_out2.condition = T_out2Ct1;
		grdT_out2.Activations.add(new Activation(t_out2, "full", TransitionOperation.SendOverNetwork, "OP2"));
		t_out2.GuardMappingList.add(grdT_out2);

		t_out2.Delay = 0;
		pn.Transitions.add(t_out2);

//		// T4 ------------------------------------------------
//		PetriTransition t4 = new PetriTransition(pn);
//		t4.TransitionName = "T_e2";
//		t4.InputPlaceName.add("P_x2");
//		t4.InputPlaceName.add("P_TL2");
//
//		Condition T4Ct1 = new Condition(t4, "P_TL2", TransitionCondition.Equal, "green");
//		Condition T4Ct2 = new Condition(t4, "P_x2", TransitionCondition.HaveCar);
//		T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);
//
//		GuardMapping grdT4 = new GuardMapping();
//		grdT4.condition = T4Ct1;
//		grdT4.Activations.add(new Activation(t4, "P_x2", TransitionOperation.PopElementWithoutTarget, "P_b2"));
//		grdT4.Activations.add(new Activation(t4, "P_TL2", TransitionOperation.Move, "P_TL2"));
//		t4.GuardMappingList.add(grdT2);
//
//		t4.Delay = 1;
//		pn.Transitions.add(t4);

		// T4 for priority ------------------------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName = "T_e2";
		t4.InputPlaceName.add("P_x2");
		t4.InputPlaceName.add("P_TL2");

		Condition T4Ct1 = new Condition(t4, "P_TL2", TransitionCondition.Equal, "green");
		Condition T4Ct2 = new Condition(t4, "P_x2", TransitionCondition.HaveCar);
		T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition = T4Ct1;
		grdT4.Activations.add(new Activation(t4, "P_x2", TransitionOperation.PopElementWithoutTarget, "P_b2"));
		grdT4.Activations.add(new Activation(t4, "P_TL2", TransitionOperation.Move, "P_TL2"));
		t4.GuardMappingList.add(grdT2);

		Condition T4Ct21 = new Condition(t4, "P_x2", TransitionCondition.HavePriorityCar);

		GuardMapping grdT42 = new GuardMapping();
		grdT42.condition = T4Ct21;
		grdT42.Activations.add(new Activation(t4, "P_x2", TransitionOperation.PopElementWithoutTarget, "P_b2"));
		grdT42.Activations.add(new Activation(t4, "P_TL2", TransitionOperation.Move, "P_TL2"));

		t4.GuardMappingList.add(grdT42);

		t4.Delay = 1;
		pn.Transitions.add(t4);

		// T_u4_1 ------------------------------------------------
		PetriTransition t_u4_1 = new PetriTransition(pn);
		t_u4_1.TransitionName = "T_u4_1";
		t_u4_1.InputPlaceName.add("P_a4_1");

		Condition Tu4_1Ct11 = new Condition(t_u4_1, "P_a4_1", TransitionCondition.NotNull);
		Condition Tu4_1Ct12 = new Condition(t_u4_1, "P_x4_1", TransitionCondition.CanAddCars);
		Condition Tu4_1Ct13 = new Condition(t_u4_1, "P_a4_1", TransitionCondition.HaveCar);
		Tu4_1Ct12.SetNextCondition(LogicConnector.AND, Tu4_1Ct13);
		Tu4_1Ct11.SetNextCondition(LogicConnector.AND, Tu4_1Ct12);

		GuardMapping grdTu4_11 = new GuardMapping();
		grdTu4_11.condition= Tu4_1Ct11;
		grdTu4_11.Activations.add(new Activation(t_u4_1, "P_a4_1", TransitionOperation.AddElement, "P_x4_1"));
		t_u4_1.GuardMappingList.add(grdTu4_11);

		Condition Tu4_11Ct21 = new Condition(t_u4_1, "P_a4_1", TransitionCondition.NotNull);
		Condition Tu4_11Ct22 = new Condition(t_u4_1, "P_x4_1", TransitionCondition.CanAddCars);
		Condition Tu4_11Ct23 = new Condition(t_u4_1, "P_a4_1", TransitionCondition.IsPriorityCar);
		Tu4_11Ct22.SetNextCondition(LogicConnector.AND, Tu4_11Ct23);
		Tu4_11Ct21.SetNextCondition(LogicConnector.AND, Tu4_11Ct22);

		GuardMapping grdTu4_112 = new GuardMapping();
		grdTu4_112.condition= Tu4_11Ct21;
		grdTu4_112.Activations.add(new Activation(t_u4_1, "P_a4_1", TransitionOperation.AddElement, "P_x4_1"));
		t_u4_1.GuardMappingList.add(grdTu4_112);

		t_u4_1.Delay = 0;
		pn.Transitions.add(t_u4_1);

		//T_s
		PetriTransition t_s = new PetriTransition(pn);
		t_s.TransitionName = "T_s";
		t_s.InputPlaceName.add("P_x4_1");

		Condition TsCt1 = new Condition(t_s, "P_x4_1", TransitionCondition.HaveBus);
		Condition TsCt2 = new Condition(t_s, "P_x4_1", TransitionCondition.HaveCarForMe);
		TsCt2.SetNextCondition(LogicConnector.AND, TsCt1);

		GuardMapping grdTs = new GuardMapping();
		grdTs.condition = TsCt1;
		grdTs.Activations.add(new Activation(t_s, "P_x4_1", TransitionOperation.PopElementWithTargetToQueue, "P_station"));

		t_s.GuardMappingList.add(grdTs);

		t_s.Delay = 1;
		pn.Transitions.add(t_s);

		//T_2_
		PetriTransition T_2_ = new PetriTransition(pn);
		T_2_.TransitionName = "T_2_";
		T_2_.InputPlaceName.add("P_x4_1");

//		Condition T_2_4Ct1 = new Condition(T_2_4, "P_x4_2", TransitionCondition.HaveCarForMe);
		Condition T_2_Ct1 = new Condition(T_2_, "P_x4_1", TransitionCondition.HaveCar);
		GuardMapping grdT_2_ = new GuardMapping();
		grdT_2_.condition = T_2_Ct1;
//		grdT_2_4.Activations.add(new Activation(T_2_4, "P_x4_2", TransitionOperation.PopElementWithTarget, "P_a4"));
		grdT_2_.Activations.add(new Activation(T_2_, "P_x4_1", TransitionOperation.PopElementWithoutTarget, "P_x4_2"));
		T_2_.GuardMappingList.add(grdT_2_);

		T_2_.Delay = 1;
		pn.Transitions.add(T_2_);
		//T_es
		PetriTransition t_es = new PetriTransition(pn);
		t_es.TransitionName = "T_es";
		t_es.InputPlaceName.add("P_station");
//		t_es.InputPlaceName.add("User_req");

		Condition TesCt1 = new Condition(t_es, "P_station", TransitionCondition.HaveCar);
//		Condition TesCt2 = new Condition(t_es, "User_req", TransitionCondition.NotNull);
//		TesCt2.SetNextCondition(LogicConnector.AND, TesCt1);

		GuardMapping grdTes = new GuardMapping();
		grdTes.condition = TesCt1;

//		ArrayList<String> input = new ArrayList<>();
//		input.add(new String("P_station"));
//		input.add(new String("User_req"));

		grdTes.Activations.add(new Activation(t_es, "P_station", TransitionOperation.PopElementWithoutTargetToQueue, "P_x4_2"));

		t_s.GuardMappingList.add(grdTes);

		t_s.Delay = 1;
		pn.Transitions.add(t_es);

		//T_2_4
		PetriTransition T_2_4 = new PetriTransition(pn);
		T_2_4.TransitionName = "T_2_4";
		T_2_4.InputPlaceName.add("P_x4_2");

//		Condition T_2_4Ct1 = new Condition(T_2_4, "P_x4_2", TransitionCondition.HaveCarForMe);
		Condition T_2_4Ct1 = new Condition(T_2_4, "P_x4_2", TransitionCondition.HaveCar);
		GuardMapping grdT_2_4 = new GuardMapping();
		grdT_2_4.condition = T_2_4Ct1;
//		grdT_2_4.Activations.add(new Activation(T_2_4, "P_x4_2", TransitionOperation.PopElementWithTarget, "P_a4"));
		grdT_2_4.Activations.add(new Activation(T_2_4, "P_x4_2", TransitionOperation.PopElementWithoutTarget, "P_a4"));
		T_2_4.GuardMappingList.add(grdT_2_4);

		T_2_4.Delay = 1;
		pn.Transitions.add(T_2_4);

//		// T5 ------------------------------------------------
//		PetriTransition t5 = new PetriTransition(pn);
//		t5.TransitionName = "T_u4";
//		t5.InputPlaceName.add("P_a4");
//		t5.InputPlaceName.add("P_x4");
//
//		Condition T5Ct1 = new Condition(t5, "P_a4", TransitionCondition.NotNull);
//		Condition T5Ct2 = new Condition(t5, "P_x4", TransitionCondition.CanAddCars);
//		T5Ct1.SetNextCondition(LogicConnector.AND, T5Ct2);
//
//		GuardMapping grdT5 = new GuardMapping();
//		grdT5.condition = T5Ct1;
//		grdT5.Activations.add(new Activation(t5, "P_a4", TransitionOperation.AddElement, "P_x4"));
//		t5.GuardMappingList.add(grdT5);
//
//		t5.Delay = 0;
//		pn.Transitions.add(t5);

		// T5 ------------------------------------------------
		PetriTransition t5 = new PetriTransition(pn);
		t5.TransitionName = "T_u4";
		t5.InputPlaceName.add("P_a4");

		Condition T5Ct1 = new Condition(t5, "P_a4", TransitionCondition.NotNull);
		Condition T5Ct2 = new Condition(t5, "P_x4", TransitionCondition.CanAddCars);
		T5Ct1.SetNextCondition(LogicConnector.AND, T5Ct2);

		GuardMapping grdT5 = new GuardMapping();
		grdT5.condition = T5Ct1;
		grdT5.Activations.add(new Activation(t5, "P_a4", TransitionOperation.AddElement, "P_x4"));
		t5.GuardMappingList.add(grdT5);

		Condition T5Ct21 = new Condition(t5, "P_a4", TransitionCondition.NotNull);
		Condition T5Ct22 = new Condition(t5, "P_x4", TransitionCondition.CanAddCars);
		Condition T5Ct23 = new Condition(t5, "P_a4", TransitionCondition.IsPriorityCar);
		T5Ct22.SetNextCondition(LogicConnector.AND, T5Ct23);
		T5Ct21.SetNextCondition(LogicConnector.AND, T5Ct22);

		GuardMapping grdT52 = new GuardMapping();
		grdT52.condition = T5Ct21;
		grdT52.Activations.add(new Activation(t5, "P_a4", TransitionOperation.AddElement, "P_x4"));
		t5.GuardMappingList.add(grdT52);

		t5.Delay = 0;
		pn.Transitions.add(t5);

		// T_out3 -----------------------------------------------
		PetriTransition t_out3 = new PetriTransition(pn);
		t_out3.TransitionName = "T_Out4";
		t_out3.InputPlaceName.add("P_a4");
		t_out3.InputPlaceName.add("P_x4");
		t_out3.IsAsync = true;

		Condition T_out3Ct1 = new Condition(t_out3, "P_a4", TransitionCondition.NotNull);
		Condition T_out3Ct2 = new Condition(t_out3, "P_x4", TransitionCondition.CanNotAddCars);
		T_out3Ct1.SetNextCondition(LogicConnector.AND, T_out3Ct2);

		GuardMapping grdT_out3 = new GuardMapping();
		grdT_out3.condition = T_out3Ct1;
		grdT_out3.Activations.add(new Activation(t_out3, "full", TransitionOperation.SendOverNetwork, "OP4"));
		t_out3.GuardMappingList.add(grdT_out3);

		t_out3.Delay = 0;
		pn.Transitions.add(t_out3);

		// T6 ------------------------------------------------
		PetriTransition t6 = new PetriTransition(pn);
		t6.TransitionName = "T_e4";
		t6.InputPlaceName.add("P_x4");
		t6.InputPlaceName.add("P_TL4");

		Condition T6Ct1 = new Condition(t6, "P_TL4", TransitionCondition.Equal, "green");
		Condition T6Ct2 = new Condition(t6, "P_x4", TransitionCondition.HaveCar);
		T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

		GuardMapping grdT6 = new GuardMapping();
		grdT6.condition = T6Ct1;
		grdT6.Activations.add(new Activation(t6, "P_x4", TransitionOperation.PopElementWithoutTarget, "P_b4"));
		grdT6.Activations.add(new Activation(t6, "P_TL4", TransitionOperation.Move, "P_TL4"));
		t6.GuardMappingList.add(grdT6);

		t6.Delay = 1;
		pn.Transitions.add(t6);


		// T9----------------------------------------------------------------

		PetriTransition t9 = new PetriTransition(pn);
		t9.TransitionName = "T_g1Exit";
		t9.InputPlaceName.add("P_o1");

		Condition T9Ct1 = new Condition(t9, "P_o1", TransitionCondition.HaveCar);

		GuardMapping grdT9 = new GuardMapping();
		grdT9.condition = T9Ct1;
		grdT9.Activations.add(new Activation(t9, "P_o1", TransitionOperation.PopElementWithoutTarget, "P_o1Exit"));
		t9.GuardMappingList.add(grdT9);

		t9.Delay = 0;
		pn.Transitions.add(t9);

		// T10----------------------------------------------------------------

		PetriTransition t10 = new PetriTransition(pn);
		t10.TransitionName = "T_g2Exit";
		t10.InputPlaceName.add("P_o2");

		Condition T10Ct1 = new Condition(t10, "P_o2", TransitionCondition.HaveCar);

		GuardMapping grdT10 = new GuardMapping();
		grdT10.condition = T10Ct1;
		grdT10.Activations.add(new Activation(t10, "P_o2", TransitionOperation.PopElementWithoutTarget, "P_o2Exit"));
		t10.GuardMappingList.add(grdT10);

		t10.Delay = 0;
		pn.Transitions.add(t10);

		// T11----------------------------------------------------------------

		PetriTransition t11 = new PetriTransition(pn);
		t11.TransitionName = "T_g3Exit";
		t11.InputPlaceName.add("P_o3");

		Condition T11Ct1 = new Condition(t11, "P_o3", TransitionCondition.HaveCar);

		GuardMapping grdT11 = new GuardMapping();
		grdT11.condition = T11Ct1;
		grdT11.Activations.add(new Activation(t11, "P_o3", TransitionOperation.PopElementWithoutTarget, "P_o3Exit"));
		t11.GuardMappingList.add(grdT11);

		t11.Delay = 0;
		pn.Transitions.add(t11);

		// T12----------------------------------------------------------------

		PetriTransition t12 = new PetriTransition(pn);
		t12.TransitionName = "T_g4Exit";
		t12.InputPlaceName.add("P_o4");

		Condition T12Ct1 = new Condition(t12, "P_o4", TransitionCondition.HaveCar);

		GuardMapping grdT12 = new GuardMapping();
		grdT12.condition = T12Ct1;
		grdT12.Activations.add(new Activation(t12, "P_o4", TransitionOperation.PopElementWithoutTarget, "P_o4Exit"));
		t12.GuardMappingList.add(grdT12);

		t12.Delay = 0;
		pn.Transitions.add(t12);

		// T_u4_1 ------------------------------------------------
		PetriTransition t_uE_4 = new PetriTransition(pn);
		t_uE_4.TransitionName = "t_uE_4";
		t_uE_4.InputPlaceName.add("P_o4Exit");

		Condition TuE_4_1Ct11 = new Condition(t_uE_4, "P_o4Exit", TransitionCondition.NotNull);
		Condition TuE_4_1Ct12 = new Condition(t_uE_4, "P_x4_1E", TransitionCondition.CanAddCars);
		Condition TuE_4_1Ct13 = new Condition(t_uE_4, "P_o4Exit", TransitionCondition.HaveCar);
		TuE_4_1Ct12.SetNextCondition(LogicConnector.AND, TuE_4_1Ct13);
		TuE_4_1Ct11.SetNextCondition(LogicConnector.AND, TuE_4_1Ct12);

		GuardMapping grdTuE_4_11 = new GuardMapping();
		grdTuE_4_11.condition= TuE_4_1Ct11;
		grdTuE_4_11.Activations.add(new Activation(t_uE_4, "P_o4Exit", TransitionOperation.AddElement, "P_x4_1E"));
		t_uE_4.GuardMappingList.add(grdTuE_4_11);

		Condition TuE_4_11Ct21 = new Condition(t_uE_4, "P_o4Exit", TransitionCondition.NotNull);
		Condition TuE_4_11Ct22 = new Condition(t_uE_4, "P_x4_1E", TransitionCondition.CanAddCars);
		Condition TuE_4_11Ct23 = new Condition(t_uE_4, "P_o4Exit", TransitionCondition.IsPriorityCar);
		TuE_4_11Ct22.SetNextCondition(LogicConnector.AND, TuE_4_11Ct23);
		TuE_4_11Ct21.SetNextCondition(LogicConnector.AND, TuE_4_11Ct22);

		GuardMapping grdTuE_4_112 = new GuardMapping();
		grdTuE_4_112.condition= TuE_4_11Ct21;
		grdTuE_4_112.Activations.add(new Activation(t_uE_4, "P_o4Exit", TransitionOperation.AddElement, "P_x4_1E"));
		t_uE_4.GuardMappingList.add(grdTuE_4_112);

		t_uE_4.Delay = 0;
		pn.Transitions.add(t_uE_4);

		//T_s
		PetriTransition t_sE = new PetriTransition(pn);
		t_sE.TransitionName = "T_sE";
		t_sE.InputPlaceName.add("P_x4_1E");

		Condition TsECt1 = new Condition(t_sE, "P_x4_1E", TransitionCondition.HaveBus);
		Condition TsECt2 = new Condition(t_sE, "P_x4_1E", TransitionCondition.HaveCarForMe);
		TsECt2.SetNextCondition(LogicConnector.AND, TsECt1);

		GuardMapping grdTsE = new GuardMapping();
		grdTsE.condition = TsECt1;
		grdTsE.Activations.add(new Activation(t_sE, "P_x4_1E", TransitionOperation.PopElementWithTargetToQueue, "P_station2"));

		t_sE.GuardMappingList.add(grdTsE);

		t_sE.Delay = 1;
		pn.Transitions.add(t_sE);

		//T_2_4
		PetriTransition T_2_E = new PetriTransition(pn);
		T_2_E.TransitionName = "T_2_E";
		T_2_E.InputPlaceName.add("P_x4_1E");

//		Condition T_2_4Ct1 = new Condition(T_2_4, "P_x4_2", TransitionCondition.HaveCarForMe);
		Condition T_2_ECt1 = new Condition(T_2_4, "P_x4_1E", TransitionCondition.HaveCar);
		GuardMapping grdT_2_E = new GuardMapping();
		grdT_2_E.condition = T_2_ECt1;
//		grdT_2_4.Activations.add(new Activation(T_2_4, "P_x4_2", TransitionOperation.PopElementWithTarget, "P_a4"));
		grdT_2_E.Activations.add(new Activation(T_2_4, "P_x4_1E", TransitionOperation.PopElementWithoutTarget, "P_x4_2E"));
		T_2_E.GuardMappingList.add(grdT_2_E);

		T_2_E.Delay = 1;
		pn.Transitions.add(T_2_E);

		//T_es
		PetriTransition t_esE = new PetriTransition(pn);
		t_esE.TransitionName = "T_esE";
		t_esE.InputPlaceName.add("P_station2");
//		t_es.InputPlaceName.add("User_req");

		Condition TesECt1 = new Condition(t_esE, "P_station2", TransitionCondition.HaveCar);
//		Condition TesECt2 = new Condition(t_esE, "User_req", TransitionCondition.NotNull);
//		TesCt2.SetNextCondition(LogicConnector.AND, TesCt1);

		GuardMapping grdTesE = new GuardMapping();
		grdTesE.condition = TesECt1;

//		ArrayList<String> input = new ArrayList<>();
//		input.add(new String("P_station"));
//		input.add(new String("User_req"));

		grdTesE.Activations.add(new Activation(t_esE, "P_station2", TransitionOperation.PopElementWithoutTargetToQueue, "P_x4_2"));

		t_esE.GuardMappingList.add(grdTesE);

		t_esE.Delay = 1;
		pn.Transitions.add(t_esE);

		//T_2_4
		PetriTransition T_2_4E = new PetriTransition(pn);
		T_2_4E.TransitionName = "T_2_4E";
		T_2_4E.InputPlaceName.add("P_x4_2E");

//		Condition T_2_4Ct1 = new Condition(T_2_4, "P_x4_2", TransitionCondition.HaveCarForMe);
		Condition T_2_4ECt1 = new Condition(T_2_4E, "P_x4_2E", TransitionCondition.HaveCar);
		GuardMapping grdT_2_4E = new GuardMapping();
		grdT_2_4E.condition = T_2_4ECt1;
//		grdT_2_4.Activations.add(new Activation(T_2_4, "P_x4_2", TransitionOperation.PopElementWithTarget, "P_a4"));
		grdT_2_4E.Activations.add(new Activation(T_2_4E, "P_x4_2E", TransitionOperation.PopElementWithoutTarget, "P_o4Exit2"));
		T_2_4E.GuardMappingList.add(grdT_2_4E);

		T_2_4E.Delay = 1;
		pn.Transitions.add(T_2_4E);

		// --------------------------------------firstpart-------------------------------------------

		// T13 ------------------------------------------------
		PetriTransition t13 = new PetriTransition(pn);
		t13.TransitionName = "T_i1";
		t13.InputPlaceName.add("P_b1");
		t13.InputPlaceName.add("P_I");

		Condition T13Ct1 = new Condition(t13, "P_b1", TransitionCondition.NotNull);
		Condition T13Ct2 = new Condition(t13, "P_I", TransitionCondition.CanAddCars);
		T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

		GuardMapping grdT13 = new GuardMapping();
		grdT13.condition = T13Ct1;
		grdT13.Activations.add(new Activation(t13, "P_b1", TransitionOperation.AddElement, "P_I"));
		t13.GuardMappingList.add(grdT13);

		t13.Delay = 0;
		pn.Transitions.add(t13);

		// T14-----------------------------------------------------------
		PetriTransition t14 = new PetriTransition(pn);
		t14.TransitionName = "T_g1";
		t14.InputPlaceName.add("P_b4");
		t14.InputPlaceName.add("P_o1");

		Condition T14Ct1 = new Condition(t14, "P_b4", TransitionCondition.HaveCarForMe);
		Condition T14Ct2 = new Condition(t14, "P_o1", TransitionCondition.CanAddCars);
		T14Ct1.SetNextCondition(LogicConnector.AND, T14Ct2);

		GuardMapping grdT14 = new GuardMapping();
		grdT14.condition = T14Ct1;
		grdT14.Activations.add(new Activation(t14, "P_b4", TransitionOperation.PopElementWithTargetToQueue, "P_o1"));
		t14.GuardMappingList.add(grdT14);

		t14.Delay = 1;
		pn.Transitions.add(t14);

		// ---------------------------------SecondPart-------------------------------------------

		// T15 ------------------------------------------------
		PetriTransition t15 = new PetriTransition(pn);
		t15.TransitionName = "T_i2";
		t15.InputPlaceName.add("P_b2");
		t15.InputPlaceName.add("P_I");

		Condition T15Ct1 = new Condition(t15, "P_b2", TransitionCondition.NotNull);
		Condition T15Ct2 = new Condition(t15, "P_I", TransitionCondition.CanAddCars);
		T15Ct1.SetNextCondition(LogicConnector.AND, T15Ct2);

		GuardMapping grdT15 = new GuardMapping();
		grdT15.condition = T15Ct1;
		grdT15.Activations.add(new Activation(t15, "P_b2", TransitionOperation.AddElement, "P_I"));
		t15.GuardMappingList.add(grdT15);

		t15.Delay = 0;
		pn.Transitions.add(t15);

		// T16-----------------------------------------------------------
		PetriTransition t16 = new PetriTransition(pn);
		t16.TransitionName = "T_g2";
		t16.InputPlaceName.add("P_I");
		t16.InputPlaceName.add("P_o2");

		Condition T16Ct1 = new Condition(t16, "P_I", TransitionCondition.HaveCarForMe);
		Condition T16Ct2 = new Condition(t16, "P_o2", TransitionCondition.CanAddCars);
		T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);

		GuardMapping grdT16 = new GuardMapping();
		grdT16.condition = T16Ct1;
		grdT16.Activations.add(new Activation(t16, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o2"));
		t16.GuardMappingList.add(grdT16);

		t16.Delay = 1;
		pn.Transitions.add(t16);

		// ----------------------ThirdPart----------------------------------------------------------------

		// T17 ------------------------------------------------
		PetriTransition t17 = new PetriTransition(pn);
		t17.TransitionName = "T_i3";
		t17.InputPlaceName.add("P_b3");
		t17.InputPlaceName.add("P_I");

		Condition T17Ct1 = new Condition(t17, "P_b3", TransitionCondition.NotNull);
		Condition T17Ct2 = new Condition(t17, "P_I", TransitionCondition.CanAddCars);
		T17Ct1.SetNextCondition(LogicConnector.AND, T17Ct2);

		GuardMapping grdT17 = new GuardMapping();
		grdT17.condition = T17Ct1;
		grdT17.Activations.add(new Activation(t17, "P_b3", TransitionOperation.AddElement, "P_I"));
		t17.GuardMappingList.add(grdT17);

		t17.Delay = 0;
		pn.Transitions.add(t17);

		// T18---------------------------------------------------------

		PetriTransition t18 = new PetriTransition(pn);
		t18.TransitionName = "T_g3";
		t18.InputPlaceName.add("P_I");
		t18.InputPlaceName.add("P_o3");

		Condition T18Ct1 = new Condition(t18, "P_I", TransitionCondition.HaveCarForMe);
		Condition T18Ct2 = new Condition(t18, "P_o3", TransitionCondition.CanAddCars);
		T18Ct1.SetNextCondition(LogicConnector.AND, T18Ct2);

		GuardMapping grdT18 = new GuardMapping();
		grdT18.condition = T18Ct1;
		grdT18.Activations.add(new Activation(t18, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o3"));
		t18.GuardMappingList.add(grdT18);

		t18.Delay = 1;
		pn.Transitions.add(t18);

		// -------------------------------------FourthPart------------------------------------------

		// T19 ------------------------------------------------
		PetriTransition t19 = new PetriTransition(pn);
		t19.TransitionName = "T_i4";
		t19.InputPlaceName.add("P_b4");
		t19.InputPlaceName.add("P_I");

		Condition T19Ct1 = new Condition(t19, "P_b4", TransitionCondition.HaveCarForMe);
		Condition T19Ct2 = new Condition(t19, "P_I", TransitionCondition.CanAddCars);
		T19Ct1.SetNextCondition(LogicConnector.AND, T19Ct2);

		GuardMapping grdT19 = new GuardMapping();
		grdT19.condition = T19Ct1;
		grdT19.Activations.add(new Activation(t19, "P_b4", TransitionOperation.PopElementWithoutTarget, "P_I"));
		t19.GuardMappingList.add(grdT19);

		t19.Delay = 0;
		pn.Transitions.add(t19);

		// T20---------------------------------------------------------

		PetriTransition t20 = new PetriTransition(pn);
		t20.TransitionName = "T_g4";
		t20.InputPlaceName.add("P_I");
		t20.InputPlaceName.add("P_o4");

		Condition T20Ct1 = new Condition(t20, "P_I", TransitionCondition.HaveCarForMe);
		Condition T20Ct2 = new Condition(t20, "P_o4", TransitionCondition.CanAddCars);
		T20Ct1.SetNextCondition(LogicConnector.AND, T20Ct2);

		GuardMapping grdT20 = new GuardMapping();
		grdT20.condition = T20Ct1;
		grdT20.Activations.add(new Activation(t20, "P_I", TransitionOperation.PopElementWithTargetToQueue, "P_o4"));
		t20.GuardMappingList.add(grdT20);

		t20.Delay = 1;
		pn.Transitions.add(t20);

		// -------------------------------------------------------------------------------------
		// ----------------------------PNStart-------------------------------------------------
		// -------------------------------------------------------------------------------------

		System.out.println("Lanes_Intersection started \n ------------------------------");
		pn.Delay = 2000;
		// pn.Start();

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
	}
}
