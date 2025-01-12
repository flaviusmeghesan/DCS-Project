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

public class BucharestIntersection2 {
	public static void main(String[] args) {
		
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Main Petri";
		pn.NetworkPort = 1080;

		// BEGIN Intersection 2

		DataTransfer OP_CANTEMIR = new DataTransfer();
		OP_CANTEMIR.SetName("OP_CANTEMIR");
		OP_CANTEMIR.Value = new TransferOperation("localhost", "1081" , "IN_CANTEMIR");
		pn.PlaceList.add(OP_CANTEMIR);

		DataTransfer OP_SERBANVODA = new DataTransfer();
		OP_SERBANVODA.SetName("OP_SERBANVODA");
		OP_SERBANVODA.Value = new TransferOperation("localhost", "1081" , "IN_SERBANVODA");
		pn.PlaceList.add(OP_SERBANVODA);

		DataTransfer OP_SERBANVODA_BUS = new DataTransfer();
		OP_SERBANVODA_BUS.SetName("OP_SERBANVODA_BUS");
		OP_SERBANVODA_BUS.Value = new TransferOperation("localhost", "1081" , "IN_SERBANVODA_BUS");
		pn.PlaceList.add(OP_SERBANVODA_BUS);

		DataTransfer OP_SINCAI = new DataTransfer();
		OP_SINCAI.SetName("OP_SINCAI");
		OP_SINCAI.Value = new TransferOperation("localhost", "1081" , "IN_SINCAI");
		pn.PlaceList.add(OP_SINCAI);

		DataTransfer OP_SINCAINORD_BUS = new DataTransfer();
		OP_SINCAINORD_BUS.SetName("OP_SINCAINORD_BUS");
		OP_SINCAINORD_BUS.Value = new TransferOperation("localhost", "1081" , "IN_SINCAINORD_BUS");
		pn.PlaceList.add(OP_SINCAINORD_BUS);

		DataTransfer OP_TINERETULUI = new DataTransfer();
		OP_TINERETULUI.SetName("OP_TINERETULUI");
		OP_TINERETULUI.Value = new TransferOperation("localhost", "1081" , "IN_TINERETULUI");
		pn.PlaceList.add(OP_TINERETULUI);

		DataCar P_A_CANTEMIR = new DataCar();
		P_A_CANTEMIR.SetName("P_A_CANTEMIR");
		pn.PlaceList.add(P_A_CANTEMIR);

		DataCar P_A_SERBANVODA = new DataCar();
		P_A_SERBANVODA.SetName("P_A_SERBANVODA");
		pn.PlaceList.add(P_A_SERBANVODA);

		DataCar P_A_SERBANVODA_BUS = new DataCar();
		P_A_SERBANVODA_BUS.SetName("P_A_SERBANVODA_BUS");
		pn.PlaceList.add(P_A_SERBANVODA_BUS);

		DataCar P_A_SINCAI = new DataCar();
		P_A_SINCAI.SetName("P_A_SINCAI");
		pn.PlaceList.add(P_A_SINCAI);

		DataCar P_A_SINCAINORD_BUS = new DataCar();
		P_A_SINCAINORD_BUS.SetName("P_A_SINCAINORD_BUS");
		pn.PlaceList.add(P_A_SINCAINORD_BUS);

		DataCar P_A_TINERETULUI = new DataCar();
		P_A_TINERETULUI.SetName("P_A_TINERETULUI");
		pn.PlaceList.add(P_A_TINERETULUI);

		DataCar P_A1_SINCAINORD_BUS = new DataCar();
		P_A1_SINCAINORD_BUS.SetName("P_A1_SINCAINORD_BUS");
		pn.PlaceList.add(P_A1_SINCAINORD_BUS);

		DataCar P_B_CANTEMIR = new DataCar(); //p8.Printable = false;
		P_B_CANTEMIR.SetName("P_B_CANTEMIR");
		pn.PlaceList.add(P_B_CANTEMIR);

		DataCar P_B_SERBANVODA = new DataCar(); //p8.Printable = false;
		P_B_SERBANVODA.SetName("P_B_SERBANVODA");
		pn.PlaceList.add(P_B_SERBANVODA);

		DataCar P_B_SERBANVODA_BUS = new DataCar(); //p8.Printable = false;
		P_B_SERBANVODA_BUS.SetName("P_B_SERBANVODA_BUS");
		pn.PlaceList.add(P_B_SERBANVODA_BUS);

		DataCar P_B_SINCAI = new DataCar(); //p8.Printable = false;
		P_B_SINCAI.SetName("P_B_SINCAI");
		pn.PlaceList.add(P_B_SINCAI);

		DataCar P_B_SINCAINORD_BUS = new DataCar(); //p8.Printable = false;
		P_B_SINCAINORD_BUS.SetName("P_B_SINCAINORD_BUS");
		pn.PlaceList.add(P_B_SINCAINORD_BUS);

		DataCar P_B_TINERETULUI = new DataCar(); //p8.Printable = false;
		P_B_TINERETULUI.SetName("P_B_TINERETULUI");
		pn.PlaceList.add(P_B_TINERETULUI);

		DataCarQueue P_O_CANTEMIR = new DataCarQueue(); //p19.Printable = false;
		P_O_CANTEMIR.Value.Size = 3;
		P_O_CANTEMIR.SetName("P_O_CANTEMIR");
		pn.PlaceList.add(P_O_CANTEMIR);

		DataCarQueue P_O_SERBANVODA = new DataCarQueue(); //p19.Printable = false;
		P_O_SERBANVODA.Value.Size = 3;
		P_O_SERBANVODA.SetName("P_O_SERBANVODA");
		pn.PlaceList.add(P_O_SERBANVODA);

		DataCarQueue P_O_SERBANVODA_BUS = new DataCarQueue(); //p19.Printable = false;
		P_O_SERBANVODA_BUS.Value.Size = 3;
		P_O_SERBANVODA_BUS.SetName("P_O_SERBANVODA_BUS");
		pn.PlaceList.add(P_O_SERBANVODA_BUS);

		DataCarQueue P_O_SINCAI = new DataCarQueue(); //p19.Printable = false;
		P_O_SINCAI.Value.Size = 3;
		P_O_SINCAI.SetName("P_O_SINCAI");
		pn.PlaceList.add(P_O_SINCAI);

		DataCarQueue P_O_SINCAI_BUS = new DataCarQueue(); //p19.Printable = false;
		P_O_SINCAI_BUS.Value.Size = 3;
		P_O_SINCAI_BUS.SetName("P_O_SINCAI_BUS");
		pn.PlaceList.add(P_O_SINCAI_BUS);

		DataCarQueue P_O_TINERETULUI = new DataCarQueue(); //p19.Printable = false;
		P_O_TINERETULUI.Value.Size = 3;
		P_O_TINERETULUI.SetName("P_O_TINERETULUI");
		pn.PlaceList.add(P_O_TINERETULUI);


		DataCar P_OE_CANTEMIR = new DataCar();
		P_OE_CANTEMIR.SetName("P_OE_CANTEMIR");
		pn.PlaceList.add(P_OE_CANTEMIR);

		DataCar P_OE_SERBANVODA = new DataCar();
		P_OE_SERBANVODA.SetName("P_OE_SERBANVODA");
		pn.PlaceList.add(P_OE_SERBANVODA);

		DataCar P_OE_SERBANVODA_BUS = new DataCar();
		P_OE_SERBANVODA_BUS.SetName("P_OE_SERBANVODA_BUS");
		pn.PlaceList.add(P_OE_SERBANVODA_BUS);

		DataCar P_OE_SINCAI = new DataCar();
		P_OE_SINCAI.SetName("P_OE_SINCAI");
		pn.PlaceList.add(P_OE_SINCAI);

		DataCar P_OE_SINCAI_BUS = new DataCar();
		P_OE_SINCAI_BUS.SetName("P_OE_SINCAI_BUS");
		pn.PlaceList.add(P_OE_SINCAI_BUS);

		DataCar P_OE_TINERETULUI = new DataCar();
		P_OE_TINERETULUI.SetName("P_OE_TINERETULUI");
		pn.PlaceList.add(P_OE_TINERETULUI);

		DataCar P_OE1_SINCAI_BUS = new DataCar();
		P_OE1_SINCAI_BUS.SetName("P_OE1_SINCAI_BUS");
		pn.PlaceList.add(P_OE1_SINCAI_BUS);


		DataString P_SINCAINORD_BUS_TL = new DataString(); //p7.Printable = false;
		P_SINCAINORD_BUS_TL.SetName("P_SINCAINORD_BUS_TL");
		P_SINCAINORD_BUS_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_SINCAINORD_BUS_TL);

		DataString P_CANTEMIR_TL = new DataString(); //p7.Printable = false;
		P_CANTEMIR_TL.SetName("P_CANTEMIR_TL");
		P_CANTEMIR_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_CANTEMIR_TL);

		DataString P_SERBANVODA_BUS_TL = new DataString(); //p7.Printable = false;
		P_SERBANVODA_BUS_TL.SetName("P_SERBANVODA_BUS_TL");
		P_SERBANVODA_BUS_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_SERBANVODA_BUS_TL);

		DataString P_SERBANVODA_TL = new DataString(); //p7.Printable = false;
		P_SERBANVODA_TL.SetName("P_SERBANVODA_TL");
		P_SERBANVODA_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_SERBANVODA_TL);

		DataString P_SINCAI_TL = new DataString(); //p7.Printable = false;
		P_SINCAI_TL.SetName("P_SINCAI_TL");
		P_SINCAI_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_SINCAI_TL);

		DataString P_TINERETULUI_TL = new DataString(); //p7.Printable = false;
		P_TINERETULUI_TL.SetName("P_TINERETULUI_TL");
		P_TINERETULUI_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_TINERETULUI_TL);

		DataCarQueue P_STATION_SINCAI_BUS = new DataCarQueue();
		P_STATION_SINCAI_BUS.Value.Size = 3;
		P_STATION_SINCAI_BUS.SetName("P_STATION_SINCAI_BUS");
		pn.PlaceList.add(P_STATION_SINCAI_BUS);

		DataCarQueue P_STATION_SINCAINORD_BUS = new DataCarQueue();
		P_STATION_SINCAINORD_BUS.Value.Size = 3;
		P_STATION_SINCAINORD_BUS.SetName("P_STATION_SINCAINORD_BUS");
		pn.PlaceList.add(P_STATION_SINCAINORD_BUS);

		DataCarQueue P_X_CANTEMIR = new DataCarQueue();
		P_X_CANTEMIR.Value.Size = 3;
		P_X_CANTEMIR.SetName("P_X_CANTEMIR");
		pn.PlaceList.add(P_X_CANTEMIR);

		DataCarQueue P_X_SERBANVODA = new DataCarQueue();
		P_X_SERBANVODA.Value.Size = 3;
		P_X_SERBANVODA.SetName("P_X_SERBANVODA");
		pn.PlaceList.add(P_X_SERBANVODA);

		DataCarQueue P_X_SERBANVODA_BUS = new DataCarQueue();
		P_X_SERBANVODA_BUS.Value.Size = 3;
		P_X_SERBANVODA_BUS.SetName("P_X_SERBANVODA_BUS");
		pn.PlaceList.add(P_X_SERBANVODA_BUS);

		DataCarQueue P_X_SINCAI = new DataCarQueue();
		P_X_SINCAI.Value.Size = 3;
		P_X_SINCAI.SetName("P_X_SINCAI");
		pn.PlaceList.add(P_X_SINCAI);

		DataCarQueue P_X_TINERETULUI = new DataCarQueue();
		P_X_TINERETULUI.Value.Size = 3;
		P_X_TINERETULUI.SetName("P_X_TINERETULUI");
		pn.PlaceList.add(P_X_TINERETULUI);

		DataCarQueue P_X1_SINCAI_BUS = new DataCarQueue();
		P_X1_SINCAI_BUS.Value.Size = 3;
		P_X1_SINCAI_BUS.SetName("P_X1_SINCAI_BUS");
		pn.PlaceList.add(P_X1_SINCAI_BUS);

		DataCarQueue P_X1_SINCAINORD_BUS = new DataCarQueue();
		P_X1_SINCAINORD_BUS.Value.Size = 3;
		P_X1_SINCAINORD_BUS.SetName("P_X1_SINCAINORD_BUS");
		pn.PlaceList.add(P_X1_SINCAINORD_BUS);

		DataCarQueue P_X2_SINCAI_BUS = new DataCarQueue();
		P_X2_SINCAI_BUS.Value.Size = 3;
		P_X2_SINCAI_BUS.SetName("P_X2_SINCAI_BUS");
		pn.PlaceList.add(P_X2_SINCAI_BUS);

		DataCarQueue P_X2_SINCAINORD_BUS = new DataCarQueue();
		P_X2_SINCAINORD_BUS.Value.Size = 3;
		P_X2_SINCAINORD_BUS.SetName("P_X2_SINCAINORD_BUS");
		pn.PlaceList.add(P_X2_SINCAINORD_BUS);

		DataCarQueue P_X3_SINCAINORD_BUS = new DataCarQueue();
		P_X3_SINCAINORD_BUS.Value.Size = 3;
		P_X3_SINCAINORD_BUS.SetName("P_X3_SINCAINORD_BUS");
		pn.PlaceList.add(P_X3_SINCAINORD_BUS);

		DataCarQueue P_INTER_2 = new DataCarQueue();
		P_INTER_2.Value.Size = 20;
		P_INTER_2.SetName("P_INTER_2");
		pn.PlaceList.add(P_INTER_2);




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

		// END Intersection 1

		// BEGIN Transition Definitions

		// BEGIN CANTEMIR LANE

		PetriTransition T_U_CANTEMIR = new PetriTransition(pn);
		T_U_CANTEMIR.TransitionName = "T_U_CANTEMIR";
		T_U_CANTEMIR.InputPlaceName.add("P_A_CANTEMIR");
		T_U_CANTEMIR.InputPlaceName.add("P_X_CANTEMIR");

		Condition T_U_CANTEMIRCt1 = new Condition(T_U_CANTEMIR, "P_A_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U_CANTEMIRCt2 = new Condition(T_U_CANTEMIR, "P_X_CANTEMIR", TransitionCondition.CanAddCars);
		T_U_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U_CANTEMIRCt2);

		GuardMapping grdT_U_CANTEMIR = new GuardMapping();
		grdT_U_CANTEMIR.condition = T_U_CANTEMIRCt1;
		grdT_U_CANTEMIR.Activations.add(new Activation(T_U_CANTEMIR, "P_A_CANTEMIR", TransitionOperation.AddElement, "P_X_CANTEMIR"));
		T_U_CANTEMIR.GuardMappingList.add(grdT_U_CANTEMIR);

		T_U_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U_CANTEMIR);


		PetriTransition T_I_CANTEMIR = new PetriTransition(pn);
		T_I_CANTEMIR.TransitionName = "T_I_CANTEMIR";
		T_I_CANTEMIR.InputPlaceName.add("P_B_CANTEMIR");
		T_I_CANTEMIR.InputPlaceName.add("P_INTER_2");

		Condition T_I_CANTEMIRCt1 = new Condition(T_I_CANTEMIR, "P_B_CANTEMIR", TransitionCondition.NotNull);
		Condition T_I_CANTEMIRCt2 = new Condition(T_I_CANTEMIR, "P_INTER_2", TransitionCondition.CanAddCars);
		T_I_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_I_CANTEMIRCt2);

		GuardMapping grdT_I_CANTEMIR = new GuardMapping();
		grdT_I_CANTEMIR.condition = T_I_CANTEMIRCt1;
		grdT_I_CANTEMIR.Activations.add(new Activation(T_I_CANTEMIR, "P_B_CANTEMIR", TransitionOperation.AddElement, "P_INTER_2"));
		T_I_CANTEMIR.GuardMappingList.add(grdT_I_CANTEMIR);

		T_I_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_I_CANTEMIR);


		PetriTransition T_E_CANTEMIR = new PetriTransition(pn);
		T_E_CANTEMIR.TransitionName = "T_E_CANTEMIR";
		T_E_CANTEMIR.InputPlaceName.add("P_X_CANTEMIR");
		T_E_CANTEMIR.InputPlaceName.add("P_CANTEMIR_TL");

		Condition T_E_CANTEMIRCt1 = new Condition(T_E_CANTEMIR, "P_CANTEMIR_TL", TransitionCondition.Equal,"green");
		Condition T_E_CANTEMIRCt2 = new Condition(T_E_CANTEMIR, "P_X_CANTEMIR", TransitionCondition.HaveCar);
		T_E_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_E_CANTEMIRCt2);

		GuardMapping grdT_E_CANTEMIR = new GuardMapping();
		grdT_E_CANTEMIR.condition= T_E_CANTEMIRCt1;
		grdT_E_CANTEMIR.Activations.add(new Activation(T_E_CANTEMIR, "P_X_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_B_CANTEMIR"));
		grdT_E_CANTEMIR.Activations.add(new Activation(T_E_CANTEMIR, "P_CANTEMIR_TL", TransitionOperation.Move, "P_CANTEMIR_TL"));
		T_E_CANTEMIR.GuardMappingList.add(grdT_E_CANTEMIR);

		Condition T_E_CANTEMIR1Ct1 = new Condition(T_E_CANTEMIR, "P_X_CANTEMIR", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_CANTEMIR1 = new GuardMapping();
		grdT_E_CANTEMIR1.condition = T_E_CANTEMIR1Ct1;
		grdT_E_CANTEMIR1.Activations.add(new Activation(T_E_CANTEMIR, "P_X_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_B_CANTEMIR"));
		grdT_E_CANTEMIR1.Activations.add(new Activation(T_E_CANTEMIR, "P_CANTEMIR_TL", TransitionOperation.Move, "P_CANTEMIR_TL"));
		T_E_CANTEMIR.GuardMappingList.add(grdT_E_CANTEMIR1);

		T_E_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E_CANTEMIR);


		PetriTransition T_O_CANTEMIR = new PetriTransition(pn);
		T_O_CANTEMIR.TransitionName = "T_O_CANTEMIR";
		T_O_CANTEMIR.InputPlaceName.add("P_INTER_2");
		T_O_CANTEMIR.InputPlaceName.add("P_O_CANTEMIR");

		Condition T_O_CANTEMIRCt1 = new Condition(T_O_CANTEMIR, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_CANTEMIRCt2 = new Condition(T_O_CANTEMIR, "P_O_CANTEMIR", TransitionCondition.CanAddCars);
		T_O_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_O_CANTEMIRCt2);

		GuardMapping grdT_O_CANTEMIR = new GuardMapping();
		grdT_O_CANTEMIR.condition = T_O_CANTEMIRCt1;
		grdT_O_CANTEMIR.Activations.add(new Activation(T_O_CANTEMIR, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_CANTEMIR"));
		T_O_CANTEMIR.GuardMappingList.add(grdT_O_CANTEMIR);

		T_O_CANTEMIR.Delay = 1;
		pn.Transitions.add(T_O_CANTEMIR);

		PetriTransition T_OE_CANTEMIR = new PetriTransition(pn);

		T_OE_CANTEMIR.TransitionName = "T_OE_CANTEMIR";
		T_OE_CANTEMIR.InputPlaceName.add("P_O_CANTEMIR");
		Condition T_OE_CANTEMIRCt1 = new Condition(T_OE_CANTEMIR, "P_O_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_CANTEMIR = new GuardMapping();
		grdT_OE_CANTEMIR.condition = T_OE_CANTEMIRCt1;
		grdT_OE_CANTEMIR.Activations.add(new Activation(T_OE_CANTEMIR, "P_O_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_OE_CANTEMIR"));

		T_OE_CANTEMIR.GuardMappingList.add(grdT_OE_CANTEMIR);
		T_OE_CANTEMIR.Delay = 2;

		pn.Transitions.add(T_OE_CANTEMIR);


		PetriTransition T_OUT_CANTEMIR = new PetriTransition(pn);
		T_OUT_CANTEMIR.TransitionName = "T_OUT_CANTEMIR";
		T_OUT_CANTEMIR.InputPlaceName.add("P_A_CANTEMIR");
		T_OUT_CANTEMIR.InputPlaceName.add("P_X_CANTEMIR");
		T_OUT_CANTEMIR.IsAsync = true;

		Condition T_OUT_CANTEMIRCt1 = new Condition(T_OUT_CANTEMIR, "P_A_CANTEMIR", TransitionCondition.NotNull);
		Condition T_OUT_CANTEMIRCt2 = new Condition(T_OUT_CANTEMIR, "P_X_CANTEMIR", TransitionCondition.CanNotAddCars);
		T_OUT_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_OUT_CANTEMIRCt2);

		GuardMapping grdT_OUT_CANTEMIR = new GuardMapping();
		grdT_OUT_CANTEMIR.condition= T_OUT_CANTEMIRCt1;
		grdT_OUT_CANTEMIR.Activations.add(new Activation(T_OUT_CANTEMIR, "full", TransitionOperation.SendOverNetwork, "OP_CANTEMIR"));
		T_OUT_CANTEMIR.GuardMappingList.add(grdT_OUT_CANTEMIR);

		T_OUT_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_OUT_CANTEMIR);




		// BEGIN SERBAN VODA LANE

		PetriTransition T_U_SERBANVODA = new PetriTransition(pn);
		T_U_SERBANVODA.TransitionName = "T_U_SERBANVODA";
		T_U_SERBANVODA.InputPlaceName.add("P_A_SERBANVODA");
		T_U_SERBANVODA.InputPlaceName.add("P_X_SERBANVODA");

		Condition T_U_SERBANVODACt1 = new Condition(T_U_SERBANVODA, "P_A_SERBANVODA", TransitionCondition.NotNull);
		Condition T_U_SERBANVODACt2 = new Condition(T_U_SERBANVODA, "P_X_SERBANVODA", TransitionCondition.CanAddCars);
		T_U_SERBANVODACt1.SetNextCondition(LogicConnector.AND, T_U_SERBANVODACt2);

		GuardMapping grdT_U_SERBANVODA = new GuardMapping();
		grdT_U_SERBANVODA.condition = T_U_SERBANVODACt1;
		grdT_U_SERBANVODA.Activations.add(new Activation(T_U_SERBANVODA, "P_A_SERBANVODA", TransitionOperation.AddElement, "P_X_SERBANVODA"));
		T_U_SERBANVODA.GuardMappingList.add(grdT_U_SERBANVODA);

		T_U_SERBANVODA.Delay = 2;
		pn.Transitions.add(T_U_SERBANVODA);


		PetriTransition T_I_SERBANVODA = new PetriTransition(pn);
		T_I_SERBANVODA.TransitionName = "T_I_SERBANVODA";
		T_I_SERBANVODA.InputPlaceName.add("P_B_SERBANVODA");
		T_I_SERBANVODA.InputPlaceName.add("P_INTER_2");

		Condition T_I_SERBANVODACt1 = new Condition(T_I_SERBANVODA, "P_B_SERBANVODA", TransitionCondition.NotNull);
		Condition T_I_SERBANVODACt2 = new Condition(T_I_SERBANVODA, "P_INTER_2", TransitionCondition.CanAddCars);
		T_I_SERBANVODACt1.SetNextCondition(LogicConnector.AND, T_I_SERBANVODACt2);

		GuardMapping grdT_I_SERBANVODA = new GuardMapping();
		grdT_I_SERBANVODA.condition = T_I_SERBANVODACt1;
		grdT_I_SERBANVODA.Activations.add(new Activation(T_I_SERBANVODA, "P_B_SERBANVODA", TransitionOperation.AddElement, "P_INTER_2"));
		T_I_SERBANVODA.GuardMappingList.add(grdT_I_SERBANVODA);

		T_I_SERBANVODA.Delay = 2;
		pn.Transitions.add(T_I_SERBANVODA);


		PetriTransition T_E_SERBANVODA = new PetriTransition(pn);
		T_E_SERBANVODA.TransitionName = "T_E_SERBANVODA";
		T_E_SERBANVODA.InputPlaceName.add("P_X_SERBANVODA");
		T_E_SERBANVODA.InputPlaceName.add("P_SERBANVODA_TL");

		Condition T_E_SERBANVODACt1 = new Condition(T_E_SERBANVODA, "P_SERBANVODA_TL", TransitionCondition.Equal,"green");
		Condition T_E_SERBANVODACt2 = new Condition(T_E_SERBANVODA, "P_X_SERBANVODA", TransitionCondition.HaveCar);
		T_E_SERBANVODACt1.SetNextCondition(LogicConnector.AND, T_E_SERBANVODACt2);

		GuardMapping grdT_E_SERBANVODA = new GuardMapping();
		grdT_E_SERBANVODA.condition= T_E_SERBANVODACt1;
		grdT_E_SERBANVODA.Activations.add(new Activation(T_E_SERBANVODA, "P_X_SERBANVODA", TransitionOperation.PopElementWithoutTarget, "P_B_SERBANVODA"));
		grdT_E_SERBANVODA.Activations.add(new Activation(T_E_SERBANVODA, "P_SERBANVODA_TL", TransitionOperation.Move, "P_SERBANVODA_TL"));
		T_E_SERBANVODA.GuardMappingList.add(grdT_E_SERBANVODA);

		Condition T_E_SERBANVODA1Ct1 = new Condition(T_E_SERBANVODA, "P_X_SERBANVODA", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_SERBANVODA1 = new GuardMapping();
		grdT_E_SERBANVODA1.condition = T_E_SERBANVODA1Ct1;
		grdT_E_SERBANVODA1.Activations.add(new Activation(T_E_SERBANVODA, "P_X_SERBANVODA", TransitionOperation.PopElementWithoutTarget, "P_B_SERBANVODA"));
		grdT_E_SERBANVODA1.Activations.add(new Activation(T_E_SERBANVODA, "P_SERBANVODA_TL", TransitionOperation.Move, "P_SERBANVODA_TL"));
		T_E_SERBANVODA.GuardMappingList.add(grdT_E_SERBANVODA1);

		T_E_SERBANVODA.Delay = 2;
		pn.Transitions.add(T_E_SERBANVODA);


		PetriTransition T_O_SERBANVODA = new PetriTransition(pn);
		T_O_SERBANVODA.TransitionName = "T_O_SERBANVODA";
		T_O_SERBANVODA.InputPlaceName.add("P_INTER_2");
		T_O_SERBANVODA.InputPlaceName.add("P_O_SERBANVODA");

		Condition T_O_SERBANVODACt1 = new Condition(T_O_SERBANVODA, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_SERBANVODACt2 = new Condition(T_O_SERBANVODA, "P_O_SERBANVODA", TransitionCondition.CanAddCars);
		T_O_SERBANVODACt1.SetNextCondition(LogicConnector.AND, T_O_SERBANVODACt2);

		GuardMapping grdT_O_SERBANVODA = new GuardMapping();
		grdT_O_SERBANVODA.condition = T_O_SERBANVODACt1;
		grdT_O_SERBANVODA.Activations.add(new Activation(T_O_SERBANVODA, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_SERBANVODA"));
		T_O_SERBANVODA.GuardMappingList.add(grdT_O_SERBANVODA);

		T_O_SERBANVODA.Delay = 1;
		pn.Transitions.add(T_O_SERBANVODA);


		PetriTransition T_OE_SERBANVODA = new PetriTransition(pn);

		T_OE_SERBANVODA.TransitionName = "T_OE_SERBANVODA";
		T_OE_SERBANVODA.InputPlaceName.add("P_O_SERBANVODA");
		Condition T_OE_SERBANVODACt1 = new Condition(T_OE_SERBANVODA, "P_O_SERBANVODA", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_SERBANVODA = new GuardMapping();
		grdT_OE_SERBANVODA.condition = T_OE_SERBANVODACt1;
		grdT_OE_SERBANVODA.Activations.add(new Activation(T_OE_SERBANVODA, "P_O_SERBANVODA", TransitionOperation.PopElementWithoutTarget, "P_OE_SERBANVODA"));

		T_OE_SERBANVODA.GuardMappingList.add(grdT_OE_SERBANVODA);
		T_OE_SERBANVODA.Delay = 2;

		pn.Transitions.add(T_OE_SERBANVODA);


		PetriTransition T_OUT_SERBANVODA = new PetriTransition(pn);
		T_OUT_SERBANVODA.TransitionName = "T_OUT_SERBANVODA";
		T_OUT_SERBANVODA.InputPlaceName.add("P_A_SERBANVODA");
		T_OUT_SERBANVODA.InputPlaceName.add("P_X_SERBANVODA");
		T_OUT_SERBANVODA.IsAsync = true;

		Condition T_OUT_SERBANVODACt1 = new Condition(T_OUT_SERBANVODA, "P_A_SERBANVODA", TransitionCondition.NotNull);
		Condition T_OUT_SERBANVODACt2 = new Condition(T_OUT_SERBANVODA, "P_X_SERBANVODA", TransitionCondition.CanNotAddCars);
		T_OUT_SERBANVODACt1.SetNextCondition(LogicConnector.AND, T_OUT_SERBANVODACt2);

		GuardMapping grdT_OUT_SERBANVODA = new GuardMapping();
		grdT_OUT_SERBANVODA.condition= T_OUT_SERBANVODACt1;
		grdT_OUT_SERBANVODA.Activations.add(new Activation(T_OUT_SERBANVODA, "full", TransitionOperation.SendOverNetwork, "OP_SERBANVODA"));
		T_OUT_SERBANVODA.GuardMappingList.add(grdT_OUT_SERBANVODA);

		T_OUT_SERBANVODA.Delay = 2;
		pn.Transitions.add(T_OUT_SERBANVODA);




		//BEGIN SINCAI LANE

		PetriTransition T_U_SINCAI = new PetriTransition(pn);
		T_U_SINCAI.TransitionName = "T_U_SINCAI";
		T_U_SINCAI.InputPlaceName.add("P_A_SINCAI");
		T_U_SINCAI.InputPlaceName.add("P_X_SINCAI");

		Condition T_U_SINCAICt1 = new Condition(T_U_SINCAI, "P_A_SINCAI", TransitionCondition.NotNull);
		Condition T_U_SINCAICt2 = new Condition(T_U_SINCAI, "P_X_SINCAI", TransitionCondition.CanAddCars);
		T_U_SINCAICt1.SetNextCondition(LogicConnector.AND, T_U_SINCAICt2);

		GuardMapping grdT_U_SINCAI = new GuardMapping();
		grdT_U_SINCAI.condition = T_U_SINCAICt1;
		grdT_U_SINCAI.Activations.add(new Activation(T_U_SINCAI, "P_A_SINCAI", TransitionOperation.AddElement, "P_X_SINCAI"));
		T_U_SINCAI.GuardMappingList.add(grdT_U_SINCAI);

		T_U_SINCAI.Delay = 2;
		pn.Transitions.add(T_U_SINCAI);


		PetriTransition T_I_SINCAI = new PetriTransition(pn);
		T_I_SINCAI.TransitionName = "T_I_SINCAI";
		T_I_SINCAI.InputPlaceName.add("P_B_SINCAI");
		T_I_SINCAI.InputPlaceName.add("P_INTER_2");

		Condition T_I_SINCAICt1 = new Condition(T_I_SINCAI, "P_B_SINCAI", TransitionCondition.NotNull);
		Condition T_I_SINCAICt2 = new Condition(T_I_SINCAI, "P_INTER_2", TransitionCondition.CanAddCars);
		T_I_SINCAICt1.SetNextCondition(LogicConnector.AND, T_I_SINCAICt2);

		GuardMapping grdT_I_SINCAI = new GuardMapping();
		grdT_I_SINCAI.condition = T_I_SINCAICt1;
		grdT_I_SINCAI.Activations.add(new Activation(T_I_SINCAI, "P_B_SINCAI", TransitionOperation.AddElement, "P_INTER_2"));
		T_I_SINCAI.GuardMappingList.add(grdT_I_SINCAI);

		T_I_SINCAI.Delay = 2;
		pn.Transitions.add(T_I_SINCAI);



		PetriTransition T_E_SINCAI = new PetriTransition(pn);
		T_E_SINCAI.TransitionName = "T_E_SINCAI";
		T_E_SINCAI.InputPlaceName.add("P_X_SINCAI");
		T_E_SINCAI.InputPlaceName.add("P_SINCAI_TL");

		Condition T_E_SINCAICt1 = new Condition(T_E_SINCAI, "P_SINCAI_TL", TransitionCondition.Equal,"green");
		Condition T_E_SINCAICt2 = new Condition(T_E_SINCAI, "P_X_SINCAI", TransitionCondition.HaveCar);
		T_E_SINCAICt1.SetNextCondition(LogicConnector.AND, T_E_SINCAICt2);

		GuardMapping grdT_E_SINCAI = new GuardMapping();
		grdT_E_SINCAI.condition= T_E_SINCAICt1;
		grdT_E_SINCAI.Activations.add(new Activation(T_E_SINCAI, "P_X_SINCAI", TransitionOperation.PopElementWithoutTarget, "P_B_SINCAI"));
		grdT_E_SINCAI.Activations.add(new Activation(T_E_SINCAI, "P_SINCAI_TL", TransitionOperation.Move, "P_SINCAI_TL"));
		T_E_SINCAI.GuardMappingList.add(grdT_E_SINCAI);

		Condition T_E_SINCAI1Ct1 = new Condition(T_E_SINCAI, "P_X_SINCAI", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_SINCAI1 = new GuardMapping();
		grdT_E_SINCAI1.condition = T_E_SINCAI1Ct1;
		grdT_E_SINCAI1.Activations.add(new Activation(T_E_SINCAI, "P_X_SINCAI", TransitionOperation.PopElementWithoutTarget, "P_B_SINCAI"));
		grdT_E_SINCAI1.Activations.add(new Activation(T_E_SINCAI, "P_SINCAI_TL", TransitionOperation.Move, "P_SINCAI_TL"));
		T_E_SINCAI.GuardMappingList.add(grdT_E_SINCAI1);

		T_E_SINCAI.Delay = 2;
		pn.Transitions.add(T_E_SINCAI);


		PetriTransition T_O_SINCAI = new PetriTransition(pn);
		T_O_SINCAI.TransitionName = "T_O_SINCAI";
		T_O_SINCAI.InputPlaceName.add("P_INTER_2");
		T_O_SINCAI.InputPlaceName.add("P_O_SINCAI");

		Condition T_O_SINCAICt1 = new Condition(T_O_SINCAI, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_SINCAICt2 = new Condition(T_O_SINCAI, "P_O_SINCAI", TransitionCondition.CanAddCars);
		T_O_SINCAICt1.SetNextCondition(LogicConnector.AND, T_O_SINCAICt2);

		GuardMapping grdT_O_SINCAI = new GuardMapping();
		grdT_O_SINCAI.condition = T_O_SINCAICt1;
		grdT_O_SINCAI.Activations.add(new Activation(T_O_SINCAI, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_SINCAI"));
		T_O_SINCAI.GuardMappingList.add(grdT_O_SINCAI);

		T_O_SINCAI.Delay = 1;
		pn.Transitions.add(T_O_SINCAI);


		PetriTransition T_OE_SINCAI = new PetriTransition(pn);

		T_OE_SINCAI.TransitionName = "T_OE_SINCAI";
		T_OE_SINCAI.InputPlaceName.add("P_O_SINCAI");
		Condition T_OE_SINCAICt1 = new Condition(T_OE_SINCAI, "P_O_SINCAI", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_SINCAI = new GuardMapping();
		grdT_OE_SINCAI.condition = T_OE_SINCAICt1;
		grdT_OE_SINCAI.Activations.add(new Activation(T_OE_SINCAI, "P_O_SINCAI", TransitionOperation.PopElementWithoutTarget, "P_OE_SINCAI"));

		T_OE_SINCAI.GuardMappingList.add(grdT_OE_SINCAI);
		T_OE_SINCAI.Delay = 2;

		pn.Transitions.add(T_OE_SINCAI);

		PetriTransition T_OUT_SINCAI = new PetriTransition(pn);
		T_OUT_SINCAI.TransitionName = "T_OUT_SINCAI";
		T_OUT_SINCAI.InputPlaceName.add("P_A_SINCAI");
		T_OUT_SINCAI.InputPlaceName.add("P_X_SINCAI");
		T_OUT_SINCAI.IsAsync = true;

		Condition T_OUT_SINCAICt1 = new Condition(T_OUT_SINCAI, "P_A_SINCAI", TransitionCondition.NotNull);
		Condition T_OUT_SINCAICt2 = new Condition(T_OUT_SINCAI, "P_X_SINCAI", TransitionCondition.CanNotAddCars);
		T_OUT_SINCAICt1.SetNextCondition(LogicConnector.AND, T_OUT_SINCAICt2);

		GuardMapping grdT_OUT_SINCAI = new GuardMapping();
		grdT_OUT_SINCAI.condition= T_OUT_SINCAICt1;
		grdT_OUT_SINCAI.Activations.add(new Activation(T_OUT_SINCAI, "full", TransitionOperation.SendOverNetwork, "OP_SINCAI"));
		T_OUT_SINCAI.GuardMappingList.add(grdT_OUT_SINCAI);

		T_OUT_SINCAI.Delay = 2;
		pn.Transitions.add(T_OUT_SINCAI);



		// BEGIN TINERETULUI LANE

		PetriTransition T_U_TINERETULUI = new PetriTransition(pn);
		T_U_TINERETULUI.TransitionName = "T_U_TINERETULUI";
		T_U_TINERETULUI.InputPlaceName.add("P_A_TINERETULUI");
		T_U_TINERETULUI.InputPlaceName.add("P_X_TINERETULUI");

		Condition T_U_TINERETULUICt1 = new Condition(T_U_TINERETULUI, "P_A_TINERETULUI", TransitionCondition.NotNull);
		Condition T_U_TINERETULUICt2 = new Condition(T_U_TINERETULUI, "P_X_TINERETULUI", TransitionCondition.CanAddCars);
		T_U_TINERETULUICt1.SetNextCondition(LogicConnector.AND, T_U_TINERETULUICt2);

		GuardMapping grdT_U_TINERETULUI = new GuardMapping();
		grdT_U_TINERETULUI.condition = T_U_TINERETULUICt1;
		grdT_U_TINERETULUI.Activations.add(new Activation(T_U_TINERETULUI, "P_A_TINERETULUI", TransitionOperation.AddElement, "P_X_TINERETULUI"));
		T_U_TINERETULUI.GuardMappingList.add(grdT_U_TINERETULUI);

		T_U_TINERETULUI.Delay = 2;
		pn.Transitions.add(T_U_TINERETULUI);

		PetriTransition T_I_TINERETULUI = new PetriTransition(pn);
		T_I_TINERETULUI.TransitionName = "T_I_TINERETULUI";
		T_I_TINERETULUI.InputPlaceName.add("P_B_TINERETULUI");
		T_I_TINERETULUI.InputPlaceName.add("P_INTER_2");

		Condition T_I_TINERETULUICt1 = new Condition(T_I_TINERETULUI, "P_B_TINERETULUI", TransitionCondition.NotNull);
		Condition T_I_TINERETULUICt2 = new Condition(T_I_TINERETULUI, "P_INTER_2", TransitionCondition.CanAddCars);
		T_I_TINERETULUICt1.SetNextCondition(LogicConnector.AND, T_I_TINERETULUICt2);

		GuardMapping grdT_I_TINERETULUI = new GuardMapping();
		grdT_I_TINERETULUI.condition = T_I_TINERETULUICt1;
		grdT_I_TINERETULUI.Activations.add(new Activation(T_I_TINERETULUI, "P_B_TINERETULUI", TransitionOperation.AddElement, "P_INTER_2"));
		T_I_TINERETULUI.GuardMappingList.add(grdT_I_TINERETULUI);

		T_I_TINERETULUI.Delay = 2;
		pn.Transitions.add(T_I_TINERETULUI);


		PetriTransition T_E_TINERETULUI = new PetriTransition(pn);
		T_E_TINERETULUI.TransitionName = "T_E_TINERETULUI";
		T_E_TINERETULUI.InputPlaceName.add("P_X_TINERETULUI");
		T_E_TINERETULUI.InputPlaceName.add("P_TINERETULUI_TL");

		Condition T_E_TINERETULUICt1 = new Condition(T_E_TINERETULUI, "P_TINERETULUI_TL", TransitionCondition.Equal,"green");
		Condition T_E_TINERETULUICt2 = new Condition(T_E_TINERETULUI, "P_X_TINERETULUI", TransitionCondition.HaveCar);
		T_E_TINERETULUICt1.SetNextCondition(LogicConnector.AND, T_E_TINERETULUICt2);

		GuardMapping grdT_E_TINERETULUI = new GuardMapping();
		grdT_E_TINERETULUI.condition= T_E_TINERETULUICt1;
		grdT_E_TINERETULUI.Activations.add(new Activation(T_E_TINERETULUI, "P_X_TINERETULUI", TransitionOperation.PopElementWithoutTarget, "P_B_TINERETULUI"));
		grdT_E_TINERETULUI.Activations.add(new Activation(T_E_TINERETULUI, "P_TINERETULUI_TL", TransitionOperation.Move, "P_TINERETULUI_TL"));
		T_E_TINERETULUI.GuardMappingList.add(grdT_E_TINERETULUI);

		Condition T_E_TINERETULUI1Ct1 = new Condition(T_E_TINERETULUI, "P_X_TINERETULUI", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_TINERETULUI1 = new GuardMapping();
		grdT_E_TINERETULUI1.condition = T_E_TINERETULUI1Ct1;
		grdT_E_TINERETULUI1.Activations.add(new Activation(T_E_TINERETULUI, "P_X_TINERETULUI", TransitionOperation.PopElementWithoutTarget, "P_B_TINERETULUI"));
		grdT_E_TINERETULUI1.Activations.add(new Activation(T_E_TINERETULUI, "P_TINERETULUI_TL", TransitionOperation.Move, "P_TINERETULUI_TL"));
		T_E_TINERETULUI.GuardMappingList.add(grdT_E_TINERETULUI1);

		T_E_TINERETULUI.Delay = 2;
		pn.Transitions.add(T_E_TINERETULUI);


		PetriTransition T_O_TINERETULUI = new PetriTransition(pn);
		T_O_TINERETULUI.TransitionName = "T_O_TINERETULUI";
		T_O_TINERETULUI.InputPlaceName.add("P_INTER_2");
		T_O_TINERETULUI.InputPlaceName.add("P_O_TINERETULUI");

		Condition T_O_TINERETULUICt1 = new Condition(T_O_TINERETULUI, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_TINERETULUICt2 = new Condition(T_O_TINERETULUI, "P_O_TINERETULUI", TransitionCondition.CanAddCars);
		T_O_TINERETULUICt1.SetNextCondition(LogicConnector.AND, T_O_TINERETULUICt2);

		GuardMapping grdT_O_TINERETULUI = new GuardMapping();
		grdT_O_TINERETULUI.condition = T_O_TINERETULUICt1;
		grdT_O_TINERETULUI.Activations.add(new Activation(T_O_TINERETULUI, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_TINERETULUI"));
		T_O_TINERETULUI.GuardMappingList.add(grdT_O_TINERETULUI);

		T_O_TINERETULUI.Delay = 1;
		pn.Transitions.add(T_O_TINERETULUI);


		PetriTransition T_OE_TINERETULUI = new PetriTransition(pn);

		T_OE_TINERETULUI.TransitionName = "T_OE_TINERETULUI";
		T_OE_TINERETULUI.InputPlaceName.add("P_O_TINERETULUI");
		Condition T_OE_TINERETULUICt1 = new Condition(T_OE_TINERETULUI, "P_O_TINERETULUI", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_TINERETULUI = new GuardMapping();
		grdT_OE_TINERETULUI.condition = T_OE_TINERETULUICt1;
		grdT_OE_TINERETULUI.Activations.add(new Activation(T_OE_TINERETULUI, "P_O_TINERETULUI", TransitionOperation.PopElementWithoutTarget, "P_OE_TINERETULUI"));

		T_OE_TINERETULUI.GuardMappingList.add(grdT_OE_TINERETULUI);
		T_OE_TINERETULUI.Delay = 2;

		pn.Transitions.add(T_OE_TINERETULUI);

		PetriTransition T_OUT_TINERETULUI = new PetriTransition(pn);
		T_OUT_TINERETULUI.TransitionName = "T_OUT_TINERETULUI";
		T_OUT_TINERETULUI.InputPlaceName.add("P_A_TINERETULUI");
		T_OUT_TINERETULUI.InputPlaceName.add("P_X_TINERETULUI");
		T_OUT_TINERETULUI.IsAsync = true;

		Condition T_OUT_TINERETULUICt1 = new Condition(T_OUT_TINERETULUI, "P_A_TINERETULUI", TransitionCondition.NotNull);
		Condition T_OUT_TINERETULUICt2 = new Condition(T_OUT_TINERETULUI, "P_X_TINERETULUI", TransitionCondition.CanNotAddCars);
		T_OUT_TINERETULUICt1.SetNextCondition(LogicConnector.AND, T_OUT_TINERETULUICt2);

		GuardMapping grdT_OUT_TINERETULUI = new GuardMapping();
		grdT_OUT_TINERETULUI.condition= T_OUT_TINERETULUICt1;
		grdT_OUT_TINERETULUI.Activations.add(new Activation(T_OUT_TINERETULUI, "full", TransitionOperation.SendOverNetwork, "OP_TINERETULUI"));
		T_OUT_TINERETULUI.GuardMappingList.add(grdT_OUT_TINERETULUI);

		T_OUT_TINERETULUI.Delay = 2;
		pn.Transitions.add(T_OUT_TINERETULUI);



		// BEGIN SINCAINORD BUS LANE

		PetriTransition T_U_SINCAINORD_BUS = new PetriTransition(pn);
		T_U_SINCAINORD_BUS.TransitionName = "T_U_SINCAINORD_BUS";
		T_U_SINCAINORD_BUS.InputPlaceName.add("P_A_SINCAINORD_BUS");
		T_U_SINCAINORD_BUS.InputPlaceName.add("P_X1_SINCAINORD_BUS");

		Condition T_U_SINCAINORD_BUSCt1 = new Condition(T_U_SINCAINORD_BUS, "P_A_SINCAINORD_BUS", TransitionCondition.NotNull);
		Condition T_U_SINCAINORD_BUSCt2 = new Condition(T_U_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionCondition.CanAddCars);
		Condition T_U_SINCAINORD_BUSCt3 = new Condition(T_U_SINCAINORD_BUS, "P_A_SINCAINORD_BUS", TransitionCondition.IsBus);
		T_U_SINCAINORD_BUSCt2.SetNextCondition(LogicConnector.AND, T_U_SINCAINORD_BUSCt3);
		T_U_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_U_SINCAINORD_BUSCt2);

		GuardMapping grdT_U_SINCAINORD_BUS = new GuardMapping();
		grdT_U_SINCAINORD_BUS.condition= T_U_SINCAINORD_BUSCt1;
		grdT_U_SINCAINORD_BUS.Activations.add(new Activation(T_U_SINCAINORD_BUS, "P_A_SINCAINORD_BUS", TransitionOperation.AddElement, "P_X1_SINCAINORD_BUS"));

		Condition T_U_SINCAINORD_BUS1Ct1 = new Condition(T_U_SINCAINORD_BUS, "P_A_SINCAINORD_BUS", TransitionCondition.NotNull);
		Condition T_U_SINCAINORD_BUS1Ct2 = new Condition(T_U_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionCondition.CanAddCars);
		Condition T_U_SINCAINORD_BUS1Ct3 = new Condition(T_U_SINCAINORD_BUS, "P_A_SINCAINORD_BUS", TransitionCondition.IsPriorityCar);
		T_U_SINCAINORD_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_U_SINCAINORD_BUS1Ct3);
		T_U_SINCAINORD_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_U_SINCAINORD_BUS1Ct2);

		GuardMapping grdT_U_SINCAINORD_BUS1 = new GuardMapping();
		grdT_U_SINCAINORD_BUS1.condition= T_U_SINCAINORD_BUS1Ct1;
		grdT_U_SINCAINORD_BUS1.Activations.add(new Activation(T_U_SINCAINORD_BUS, "P_A_SINCAINORD_BUS", TransitionOperation.AddElement, "P_X1_SINCAINORD_BUS"));

		T_U_SINCAINORD_BUS.GuardMappingList.add(grdT_U_SINCAINORD_BUS);
		T_U_SINCAINORD_BUS.GuardMappingList.add(grdT_U_SINCAINORD_BUS1);

		T_U_SINCAINORD_BUS.Delay = 2;
		pn.Transitions.add(T_U_SINCAINORD_BUS);



		PetriTransition T_U1_SINCAINORD_BUS = new PetriTransition(pn);

		T_U1_SINCAINORD_BUS.TransitionName = "T_U1_SINCAINORD_BUS";
		T_U1_SINCAINORD_BUS.InputPlaceName.add("P_X2_SINCAINORD_BUS");
		Condition T_U1_SINCAINORD_BUSCt1 = new Condition(T_U1_SINCAINORD_BUS, "P_X2_SINCAINORD_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_U1_SINCAINORD_BUS = new GuardMapping();
		grdT_U1_SINCAINORD_BUS.condition = T_U1_SINCAINORD_BUSCt1;
		grdT_U1_SINCAINORD_BUS.Activations.add(new Activation(T_U1_SINCAINORD_BUS, "P_X2_SINCAINORD_BUS", TransitionOperation.PopElementWithoutTarget, "P_A1_SINCAINORD_BUS"));

		T_U1_SINCAINORD_BUS.GuardMappingList.add(grdT_U1_SINCAINORD_BUS);
		T_U1_SINCAINORD_BUS.Delay = 2;

		pn.Transitions.add(T_U1_SINCAINORD_BUS);


		PetriTransition T_U2_SINCAINORD_BUS = new PetriTransition(pn);
		T_U2_SINCAINORD_BUS.TransitionName = "T_U2_SINCAINORD_BUS";
		T_U2_SINCAINORD_BUS.InputPlaceName.add("P_A1_SINCAINORD_BUS");
		T_U2_SINCAINORD_BUS.InputPlaceName.add("P_X3_SINCAINORD_BUS");

		Condition T_U2_SINCAINORD_BUSCt1 = new Condition(T_U2_SINCAINORD_BUS, "P_A1_SINCAINORD_BUS", TransitionCondition.NotNull);
		Condition T_U2_SINCAINORD_BUSCt2 = new Condition(T_U2_SINCAINORD_BUS, "P_X3_SINCAINORD_BUS", TransitionCondition.CanAddCars);
		T_U2_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_U2_SINCAINORD_BUSCt2);

		GuardMapping grdT_U2_SINCAINORD_BUS = new GuardMapping();
		grdT_U2_SINCAINORD_BUS.condition = T_U2_SINCAINORD_BUSCt1;
		grdT_U2_SINCAINORD_BUS.Activations.add(new Activation(T_U2_SINCAINORD_BUS, "P_A1_SINCAINORD_BUS", TransitionOperation.AddElement, "P_X3_SINCAINORD_BUS"));
		T_U2_SINCAINORD_BUS.GuardMappingList.add(grdT_U2_SINCAINORD_BUS);

		T_U2_SINCAINORD_BUS.Delay = 2;
		pn.Transitions.add(T_U2_SINCAINORD_BUS);



		PetriTransition T_C_SINCAINORD_BUS = new PetriTransition(pn);
		T_C_SINCAINORD_BUS.TransitionName = "T_C_SINCAINORD_BUS";
		T_C_SINCAINORD_BUS.InputPlaceName.add("P_X1_SINCAINORD_BUS");
		T_C_SINCAINORD_BUS.InputPlaceName.add("P_X2_SINCAINORD_BUS");

		Condition T_C_SINCAINORD_BUSCt1 = new Condition(T_C_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionCondition.HaveCarForMe);
		Condition T_C_SINCAINORD_BUSCt2 = new Condition(T_C_SINCAINORD_BUS, "P_X2_SINCAINORD_BUS", TransitionCondition.CanAddCars);
		T_C_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_C_SINCAINORD_BUSCt2);

		GuardMapping grdT_C_SINCAINORD_BUS = new GuardMapping();

		grdT_C_SINCAINORD_BUS.condition = T_C_SINCAINORD_BUSCt1;
		grdT_C_SINCAINORD_BUS.Activations.add(new Activation(T_C_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionOperation.PopElementWithTargetToQueue, "P_X2_SINCAINORD_BUS"));

		T_C_SINCAINORD_BUS.GuardMappingList.add(grdT_C_SINCAINORD_BUS);

		T_C_SINCAINORD_BUS.Delay = 2;
		pn.Transitions.add(T_C_SINCAINORD_BUS);



		PetriTransition T_E_SINCAINORD_BUS = new PetriTransition(pn);
		T_E_SINCAINORD_BUS.TransitionName = "T_E_SINCAINORD_BUS";
		T_E_SINCAINORD_BUS.InputPlaceName.add("P_X3_SINCAINORD_BUS");
		T_E_SINCAINORD_BUS.InputPlaceName.add("P_SINCAINORD_BUS_TL");

		Condition T_E_SINCAINORD_BUSCt1 = new Condition(T_E_SINCAINORD_BUS, "P_SINCAINORD_BUS_TL", TransitionCondition.Equal,"green");
		Condition T_E_SINCAINORD_BUSCt2 = new Condition(T_E_SINCAINORD_BUS, "P_X3_SINCAINORD_BUS", TransitionCondition.HaveCar);
		T_E_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_E_SINCAINORD_BUSCt2);

		GuardMapping grdT_E_SINCAINORD_BUS = new GuardMapping();
		grdT_E_SINCAINORD_BUS.condition= T_E_SINCAINORD_BUSCt1;
		grdT_E_SINCAINORD_BUS.Activations.add(new Activation(T_E_SINCAINORD_BUS, "P_X3_SINCAINORD_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_SINCAINORD_BUS"));
		grdT_E_SINCAINORD_BUS.Activations.add(new Activation(T_E_SINCAINORD_BUS, "P_SINCAINORD_BUS_TL", TransitionOperation.Move, "P_SINCAINORD_BUS_TL"));
		T_E_SINCAINORD_BUS.GuardMappingList.add(grdT_E_SINCAINORD_BUS);

		Condition T_E_SINCAINORD_BUS1Ct1 = new Condition(T_E_SINCAINORD_BUS, "P_X3_SINCAINORD_BUS", TransitionCondition.HavePriorityCar);

		GuardMapping grdT_E_SINCAINORD_BUS1 = new GuardMapping();
		grdT_E_SINCAINORD_BUS1.condition = T_E_SINCAINORD_BUS1Ct1;
		grdT_E_SINCAINORD_BUS1.Activations.add(new Activation(T_E_SINCAINORD_BUS, "P_X3_SINCAINORD_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_SINCAINORD_BUS"));
		grdT_E_SINCAINORD_BUS1.Activations.add(new Activation(T_E_SINCAINORD_BUS, "P_SINCAINORD_BUS_TL", TransitionOperation.Move, "P_SINCAINORD_BUS_TL"));
		T_E_SINCAINORD_BUS.GuardMappingList.add(grdT_E_SINCAINORD_BUS1);

		T_E_SINCAINORD_BUS.Delay = 1;
		pn.Transitions.add(T_E_SINCAINORD_BUS);


		PetriTransition T_ES_SINCAINORD_BUS = new PetriTransition(pn);
		T_ES_SINCAINORD_BUS.TransitionName = "T_ES_SINCAINORD_BUS";
		T_ES_SINCAINORD_BUS.InputPlaceName.add("P_STATION_SINCAINORD_BUS");
		T_ES_SINCAINORD_BUS.InputPlaceName.add("P_X2_SINCAINORD_BUS");

		Condition T_ES_SINCAINORD_BUSCt1 = new Condition(T_ES_SINCAINORD_BUS, "P_STATION_SINCAINORD_BUS", TransitionCondition.HaveCar);
		Condition T_ES_SINCAINORD_BUSCt2 = new Condition(T_ES_SINCAINORD_BUS, "P_X2_SINCAINORD_BUS", TransitionCondition.CanAddCars);
		T_ES_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_ES_SINCAINORD_BUSCt2);

		GuardMapping grdT_ES_SINCAINORD_BUS = new GuardMapping();
		grdT_ES_SINCAINORD_BUS.condition = T_ES_SINCAINORD_BUSCt1;
		grdT_ES_SINCAINORD_BUS.Activations.add(new Activation(T_ES_SINCAINORD_BUS, "P_STATION_SINCAINORD_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_X2_SINCAINORD_BUS"));

		T_ES_SINCAINORD_BUS.GuardMappingList.add(grdT_ES_SINCAINORD_BUS);

		T_ES_SINCAINORD_BUS.Delay = 2;
		pn.Transitions.add(T_ES_SINCAINORD_BUS);


		PetriTransition T_I_SINCAINORD_BUS = new PetriTransition(pn);
		T_I_SINCAINORD_BUS.TransitionName = "T_I_SINCAINORD_BUS";
		T_I_SINCAINORD_BUS.InputPlaceName.add("P_B_SINCAINORD_BUS");
		T_I_SINCAINORD_BUS.InputPlaceName.add("P_INTER_2");

		Condition T_I_SINCAINORD_BUSCt1 = new Condition(T_I_SINCAINORD_BUS, "P_B_SINCAINORD_BUS", TransitionCondition.NotNull);
		Condition T_I_SINCAINORD_BUSCt2 = new Condition(T_I_SINCAINORD_BUS, "P_INTER_2", TransitionCondition.CanAddCars);
		T_I_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_I_SINCAINORD_BUSCt2);

		GuardMapping grdT_I_SINCAINORD_BUS = new GuardMapping();
		grdT_I_SINCAINORD_BUS.condition = T_I_SINCAINORD_BUSCt1;
		grdT_I_SINCAINORD_BUS.Activations.add(new Activation(T_I_SINCAINORD_BUS, "P_B_SINCAINORD_BUS", TransitionOperation.AddElement, "P_INTER_2"));
		T_I_SINCAINORD_BUS.GuardMappingList.add(grdT_I_SINCAINORD_BUS);

		T_I_SINCAINORD_BUS.Delay = 2;
		pn.Transitions.add(T_I_SINCAINORD_BUS);



		PetriTransition T_OUT_SINCAINORD_BUS = new PetriTransition(pn);
		T_OUT_SINCAINORD_BUS.TransitionName = "T_OUT_SINCAINORD_BUS";
		T_OUT_SINCAINORD_BUS.InputPlaceName.add("P_A1_SINCAINORD_BUS");
		T_OUT_SINCAINORD_BUS.InputPlaceName.add("P_X3_SINCAINORD_BUS");
		T_OUT_SINCAINORD_BUS.IsAsync = true;

		Condition T_OUT_SINCAINORD_BUSCt1 = new Condition(T_OUT_SINCAINORD_BUS, "P_A1_SINCAINORD_BUS", TransitionCondition.NotNull);
		Condition T_OUT_SINCAINORD_BUSCt2 = new Condition(T_OUT_SINCAINORD_BUS, "P_X3_SINCAINORD_BUS", TransitionCondition.CanNotAddCars);
		T_OUT_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_OUT_SINCAINORD_BUSCt2);

		GuardMapping grdT_OUT_SINCAINORD_BUS = new GuardMapping();
		grdT_OUT_SINCAINORD_BUS.condition= T_OUT_SINCAINORD_BUSCt1;
		grdT_OUT_SINCAINORD_BUS.Activations.add(new Activation(T_OUT_SINCAINORD_BUS, "full", TransitionOperation.SendOverNetwork, "OP_SINCAINORD_BUS"));
		T_OUT_SINCAINORD_BUS.GuardMappingList.add(grdT_OUT_SINCAINORD_BUS);

		T_OUT_SINCAINORD_BUS.Delay = 0;
		pn.Transitions.add(T_OUT_SINCAINORD_BUS);


		PetriTransition T_S_SINCAINORD_BUS = new PetriTransition(pn);
		T_S_SINCAINORD_BUS.TransitionName = "T_S_SINCAINORD_BUS";
		T_S_SINCAINORD_BUS.InputPlaceName.add("P_X1_SINCAINORD_BUS");

		Condition T_S_SINCAINORD_BUSCt1 = new Condition(T_S_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionCondition.HaveCarForMe);
		Condition T_S_SINCAINORD_BUSCt2 = new Condition(T_S_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionCondition.HaveBus);
		T_S_SINCAINORD_BUSCt1.SetNextCondition(LogicConnector.AND, T_S_SINCAINORD_BUSCt2);

		GuardMapping grdT_S_SINCAINORD_BUS = new GuardMapping();
		grdT_S_SINCAINORD_BUS.condition = T_S_SINCAINORD_BUSCt1;
		grdT_S_SINCAINORD_BUS.Activations.add(new Activation(T_S_SINCAINORD_BUS, "P_X1_SINCAINORD_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_STATION_SINCAINORD_BUS"));
		T_S_SINCAINORD_BUS.GuardMappingList.add(grdT_S_SINCAINORD_BUS);

		T_S_SINCAINORD_BUS.Delay = 2;
		pn.Transitions.add(T_S_SINCAINORD_BUS);




		// BEGIN SINCAI BUS LANE

		PetriTransition T_U_SINCAI_BUS = new PetriTransition(pn);
		T_U_SINCAI_BUS.TransitionName = "T_U_SINCAI_BUS";
		T_U_SINCAI_BUS.InputPlaceName.add("P_OE_SINCAI_BUS");
		T_U_SINCAI_BUS.InputPlaceName.add("P_X1_SINCAI_BUS");

		Condition T_U_SINCAI_BUSCt1 = new Condition(T_U_SINCAI_BUS, "P_OE_SINCAI_BUS", TransitionCondition.NotNull);
		Condition T_U_SINCAI_BUSCt2 = new Condition(T_U_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionCondition.CanAddCars);
		Condition T_U_SINCAI_BUSCt3 = new Condition(T_U_SINCAI_BUS, "P_OE_SINCAI_BUS", TransitionCondition.IsBus);
		T_U_SINCAI_BUSCt2.SetNextCondition(LogicConnector.AND, T_U_SINCAI_BUSCt3);
		T_U_SINCAI_BUSCt1.SetNextCondition(LogicConnector.AND, T_U_SINCAI_BUSCt2);

		GuardMapping grdT_U_SINCAI_BUS = new GuardMapping();
		grdT_U_SINCAI_BUS.condition= T_U_SINCAI_BUSCt1;
		grdT_U_SINCAI_BUS.Activations.add(new Activation(T_U_SINCAI_BUS, "P_OE_SINCAI_BUS", TransitionOperation.AddElement, "P_X1_SINCAI_BUS"));

		Condition T_U_SINCAI_BUS1Ct1 = new Condition(T_U_SINCAI_BUS, "P_OE_SINCAI_BUS", TransitionCondition.NotNull);
		Condition T_U_SINCAI_BUS1Ct2 = new Condition(T_U_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionCondition.CanAddCars);
		Condition T_U_SINCAI_BUS1Ct3 = new Condition(T_U_SINCAI_BUS, "P_OE_SINCAI_BUS", TransitionCondition.IsPriorityCar);
		T_U_SINCAI_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_U_SINCAI_BUS1Ct3);
		T_U_SINCAI_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_U_SINCAI_BUS1Ct2);

		GuardMapping grdT_U_SINCAI_BUS1 = new GuardMapping();
		grdT_U_SINCAI_BUS1.condition= T_U_SINCAI_BUS1Ct1;
		grdT_U_SINCAI_BUS1.Activations.add(new Activation(T_U_SINCAI_BUS, "P_OE_SINCAI_BUS", TransitionOperation.AddElement, "P_X1_SINCAI_BUS"));


		T_U_SINCAI_BUS.GuardMappingList.add(grdT_U_SINCAI_BUS);
		T_U_SINCAI_BUS.GuardMappingList.add(grdT_U_SINCAI_BUS1);

		T_U_SINCAI_BUS.Delay = 2;
		pn.Transitions.add(T_U_SINCAI_BUS);





		PetriTransition T_C_SINCAI_BUS = new PetriTransition(pn);
		T_C_SINCAI_BUS.TransitionName = "T_C_SINCAI_BUS";
		T_C_SINCAI_BUS.InputPlaceName.add("P_X1_SINCAI_BUS");
		T_C_SINCAI_BUS.InputPlaceName.add("P_X2_SINCAI_BUS");

		Condition T_C_SINCAI_BUSCt1 = new Condition(T_C_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionCondition.HaveCarForMe);
		Condition T_C_SINCAI_BUSCt2 = new Condition(T_C_SINCAI_BUS, "P_X2_SINCAI_BUS", TransitionCondition.CanAddCars);
		T_C_SINCAI_BUSCt1.SetNextCondition(LogicConnector.AND, T_C_SINCAI_BUSCt2);

		GuardMapping grdT_C_SINCAI_BUS = new GuardMapping();

		grdT_C_SINCAI_BUS.condition = T_C_SINCAI_BUSCt1;
		grdT_C_SINCAI_BUS.Activations.add(new Activation(T_C_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionOperation.PopElementWithTargetToQueue, "P_X2_SINCAI_BUS"));

		T_C_SINCAI_BUS.GuardMappingList.add(grdT_C_SINCAI_BUS);

		T_C_SINCAI_BUS.Delay = 2;
		pn.Transitions.add(T_C_SINCAI_BUS);


		PetriTransition T_ES_SINCAI_BUS = new PetriTransition(pn);
		T_ES_SINCAI_BUS.TransitionName = "T_ES_SINCAI_BUS";
		T_ES_SINCAI_BUS.InputPlaceName.add("P_STATION_SINCAI_BUS");
		T_ES_SINCAI_BUS.InputPlaceName.add("P_X2_SINCAI_BUS");

		Condition T_ES_SINCAI_BUSCt1 = new Condition(T_ES_SINCAI_BUS, "P_STATION_SINCAI_BUS", TransitionCondition.HaveCar);
		Condition T_ES_SINCAI_BUSCt2 = new Condition(T_ES_SINCAI_BUS, "P_X2_SINCAI_BUS", TransitionCondition.CanAddCars);
		T_ES_SINCAI_BUSCt1.SetNextCondition(LogicConnector.AND, T_ES_SINCAI_BUSCt2);

		GuardMapping grdT_ES_SINCAI_BUS = new GuardMapping();
		grdT_ES_SINCAI_BUS.condition = T_ES_SINCAI_BUSCt1;
		grdT_ES_SINCAI_BUS.Activations.add(new Activation(T_ES_SINCAI_BUS, "P_STATION_SINCAI_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_X2_SINCAI_BUS"));

		T_ES_SINCAI_BUS.GuardMappingList.add(grdT_ES_SINCAI_BUS);

		T_ES_SINCAI_BUS.Delay = 2;
		pn.Transitions.add(T_ES_SINCAI_BUS);






		PetriTransition T_O_SINCAI_BUS = new PetriTransition(pn);
		T_O_SINCAI_BUS.TransitionName = "T_O_SINCAI_BUS";
		T_O_SINCAI_BUS.InputPlaceName.add("P_INTER_2");
		T_O_SINCAI_BUS.InputPlaceName.add("P_O_SINCAI_BUS");

		Condition T_O_SINCAI_BUSCt1 = new Condition(T_O_SINCAI_BUS, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_SINCAI_BUSCt2 = new Condition(T_O_SINCAI_BUS, "P_O_SINCAI_BUS", TransitionCondition.CanAddCars);
		Condition T_O_SINCAI_BUSCt3 = new Condition(T_O_SINCAI_BUS, "P_INTER_2", TransitionCondition.HaveBus);
		T_O_SINCAI_BUSCt2.SetNextCondition(LogicConnector.AND, T_O_SINCAI_BUSCt3);
		T_O_SINCAI_BUSCt1.SetNextCondition(LogicConnector.AND, T_O_SINCAI_BUSCt2);

		GuardMapping grdT_O_SINCAI_BUS = new GuardMapping();
		grdT_O_SINCAI_BUS.condition = T_O_SINCAI_BUSCt1;
		grdT_O_SINCAI_BUS.Activations.add(new Activation(T_O_SINCAI_BUS, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_SINCAI_BUS"));
		T_O_SINCAI_BUS.GuardMappingList.add(grdT_O_SINCAI_BUS);


		Condition T_O_SINCAI_BUS1Ct1 = new Condition(T_O_SINCAI_BUS, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_SINCAI_BUS1Ct2 = new Condition(T_O_SINCAI_BUS, "P_O_SINCAI_BUS", TransitionCondition.CanAddCars);
		Condition T_O_SINCAI_BUS1Ct3 = new Condition(T_O_SINCAI_BUS, "P_INTER_2", TransitionCondition.HavePriorityCar);
		T_O_SINCAI_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_O_SINCAI_BUS1Ct3);
		T_O_SINCAI_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_O_SINCAI_BUS1Ct2);

		GuardMapping grdT_O_SINCAI_BUS1 = new GuardMapping();
		grdT_O_SINCAI_BUS1.condition = T_O_SINCAI_BUS1Ct1;
		grdT_O_SINCAI_BUS1.Activations.add(new Activation(T_O_SINCAI_BUS, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_SINCAI_BUS"));
		T_O_SINCAI_BUS.GuardMappingList.add(grdT_O_SINCAI_BUS1);


		T_O_SINCAI_BUS.Delay = 1;
		pn.Transitions.add(T_O_SINCAI_BUS);




		PetriTransition T_OE_SINCAI_BUS = new PetriTransition(pn);

		T_OE_SINCAI_BUS.TransitionName = "T_OE_SINCAI_BUS";
		T_OE_SINCAI_BUS.InputPlaceName.add("P_O_SINCAI_BUS");
		Condition T_OE_SINCAI_BUSCt1 = new Condition(T_OE_SINCAI_BUS, "P_O_SINCAI_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_SINCAI_BUS = new GuardMapping();
		grdT_OE_SINCAI_BUS.condition = T_OE_SINCAI_BUSCt1;
		grdT_OE_SINCAI_BUS.Activations.add(new Activation(T_OE_SINCAI_BUS, "P_O_SINCAI_BUS", TransitionOperation.PopElementWithoutTarget, "P_OE_SINCAI_BUS"));

		T_OE_SINCAI_BUS.GuardMappingList.add(grdT_OE_SINCAI_BUS);
		T_OE_SINCAI_BUS.Delay = 2;

		pn.Transitions.add(T_OE_SINCAI_BUS);



		PetriTransition T_OE1_SINCAI_BUS = new PetriTransition(pn);

		T_OE1_SINCAI_BUS.TransitionName = "T_OE1_SINCAI_BUS";
		T_OE1_SINCAI_BUS.InputPlaceName.add("P_X2_SINCAI_BUS");
		Condition T_OE1_SINCAI_BUSCt1 = new Condition(T_OE1_SINCAI_BUS, "P_X2_SINCAI_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_OE1_SINCAI_BUS = new GuardMapping();
		grdT_OE1_SINCAI_BUS.condition = T_OE1_SINCAI_BUSCt1;
		grdT_OE1_SINCAI_BUS.Activations.add(new Activation(T_OE1_SINCAI_BUS, "P_X2_SINCAI_BUS", TransitionOperation.PopElementWithoutTarget, "P_OE1_SINCAI_BUS"));

		T_OE1_SINCAI_BUS.GuardMappingList.add(grdT_OE1_SINCAI_BUS);
		T_OE1_SINCAI_BUS.Delay = 2;

		pn.Transitions.add(T_OE1_SINCAI_BUS);


		PetriTransition T_S_SINCAI_BUS = new PetriTransition(pn);
		T_S_SINCAI_BUS.TransitionName = "T_S_SINCAI_BUS";
		T_S_SINCAI_BUS.InputPlaceName.add("P_X1_SINCAI_BUS");

		Condition T_S_SINCAI_BUSCt1 = new Condition(T_S_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionCondition.HaveCarForMe);
		Condition T_S_SINCAI_BUSCt2 = new Condition(T_S_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionCondition.HaveBus);
		T_S_SINCAI_BUSCt1.SetNextCondition(LogicConnector.AND, T_S_SINCAI_BUSCt2);

		GuardMapping grdT_S_SINCAI_BUS = new GuardMapping();
		grdT_S_SINCAI_BUS.condition = T_S_SINCAI_BUSCt1;
		grdT_S_SINCAI_BUS.Activations.add(new Activation(T_S_SINCAI_BUS, "P_X1_SINCAI_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_STATION_SINCAI_BUS"));
		T_S_SINCAI_BUS.GuardMappingList.add(grdT_S_SINCAI_BUS);

		T_S_SINCAI_BUS.Delay = 2;
		pn.Transitions.add(T_S_SINCAI_BUS);


		//BEGIN SERBAN VODA BUS LANE

		PetriTransition T_U_SERBANVODA_BUS = new PetriTransition(pn);
		T_U_SERBANVODA_BUS.TransitionName = "T_U_SERBANVODA_BUS";
		T_U_SERBANVODA_BUS.InputPlaceName.add("P_A_SERBANVODA_BUS");
		T_U_SERBANVODA_BUS.InputPlaceName.add("P_X_SERBANVODA_BUS");

		Condition T_U_SERBANVODA_BUSCt1 = new Condition(T_U_SERBANVODA_BUS, "P_A_SERBANVODA_BUS", TransitionCondition.NotNull);
		Condition T_U_SERBANVODA_BUSCt2 = new Condition(T_U_SERBANVODA_BUS, "P_X_SERBANVODA_BUS", TransitionCondition.CanAddCars);
		T_U_SERBANVODA_BUSCt1.SetNextCondition(LogicConnector.AND, T_U_SERBANVODA_BUSCt2);

		GuardMapping grdT_U_SERBANVODA_BUS = new GuardMapping();
		grdT_U_SERBANVODA_BUS.condition = T_U_SERBANVODA_BUSCt1;
		grdT_U_SERBANVODA_BUS.Activations.add(new Activation(T_U_SERBANVODA_BUS, "P_A_SERBANVODA_BUS", TransitionOperation.AddElement, "P_X_SERBANVODA_BUS"));
		T_U_SERBANVODA_BUS.GuardMappingList.add(grdT_U_SERBANVODA_BUS);

		T_U_SERBANVODA_BUS.Delay = 2;
		pn.Transitions.add(T_U_SERBANVODA_BUS);


		PetriTransition T_E_SERBANVODA_BUS = new PetriTransition(pn);
		T_E_SERBANVODA_BUS.TransitionName = "T_E_SERBANVODA_BUS";
		T_E_SERBANVODA_BUS.InputPlaceName.add("P_X_SERBANVODA_BUS");
		T_E_SERBANVODA_BUS.InputPlaceName.add("P_SERBANVODA_BUS_TL");

		Condition T_E_SERBANVODA_BUSCt1 = new Condition(T_E_SERBANVODA_BUS, "P_SERBANVODA_BUS_TL", TransitionCondition.Equal,"green");
		Condition T_E_SERBANVODA_BUSCt2 = new Condition(T_E_SERBANVODA_BUS, "P_X_SERBANVODA_BUS", TransitionCondition.HaveCar);
		T_E_SERBANVODA_BUSCt1.SetNextCondition(LogicConnector.AND, T_E_SERBANVODA_BUSCt2);

		GuardMapping grdT_E_SERBANVODA_BUS = new GuardMapping();
		grdT_E_SERBANVODA_BUS.condition= T_E_SERBANVODA_BUSCt1;
		grdT_E_SERBANVODA_BUS.Activations.add(new Activation(T_E_SERBANVODA_BUS, "P_X_SERBANVODA_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_SERBANVODA_BUS"));
		grdT_E_SERBANVODA_BUS.Activations.add(new Activation(T_E_SERBANVODA_BUS, "P_SERBANVODA_BUS_TL", TransitionOperation.Move, "P_SERBANVODA_BUS_TL"));
		T_E_SERBANVODA_BUS.GuardMappingList.add(grdT_E_SERBANVODA_BUS);

		Condition T_E_SERBANVODA_BUS1Ct1 = new Condition(T_E_SERBANVODA_BUS, "P_X_SERBANVODA_BUS", TransitionCondition.HavePriorityCar);

		GuardMapping grdT_E_SERBANVODA_BUS1 = new GuardMapping();
		grdT_E_SERBANVODA_BUS1.condition = T_E_SERBANVODA_BUS1Ct1;
		grdT_E_SERBANVODA_BUS1.Activations.add(new Activation(T_E_SERBANVODA_BUS, "P_X_SERBANVODA_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_SERBANVODA_BUS"));
		grdT_E_SERBANVODA_BUS1.Activations.add(new Activation(T_E_SERBANVODA_BUS, "P_SERBANVODA_BUS_TL", TransitionOperation.Move, "P_SERBANVODA_BUS_TL"));
		T_E_SERBANVODA_BUS.GuardMappingList.add(grdT_E_SERBANVODA_BUS1);

		T_E_SERBANVODA_BUS.Delay = 1;
		pn.Transitions.add(T_E_SERBANVODA_BUS);



		PetriTransition T_I_SERBANVODA_BUS = new PetriTransition(pn);
		T_I_SERBANVODA_BUS.TransitionName = "T_I_SERBANVODA_BUS";
		T_I_SERBANVODA_BUS.InputPlaceName.add("P_B_SERBANVODA_BUS");
		T_I_SERBANVODA_BUS.InputPlaceName.add("P_INTER_2");

		Condition T_I_SERBANVODA_BUSCt1 = new Condition(T_I_SERBANVODA_BUS, "P_B_SERBANVODA_BUS", TransitionCondition.NotNull);
		Condition T_I_SERBANVODA_BUSCt2 = new Condition(T_I_SERBANVODA_BUS, "P_INTER_2", TransitionCondition.CanAddCars);
		T_I_SERBANVODA_BUSCt1.SetNextCondition(LogicConnector.AND, T_I_SERBANVODA_BUSCt2);

		GuardMapping grdT_I_SERBANVODA_BUS = new GuardMapping();
		grdT_I_SERBANVODA_BUS.condition = T_I_SERBANVODA_BUSCt1;
		grdT_I_SERBANVODA_BUS.Activations.add(new Activation(T_I_SERBANVODA_BUS, "P_B_SERBANVODA_BUS", TransitionOperation.AddElement, "P_INTER_2"));
		T_I_SERBANVODA_BUS.GuardMappingList.add(grdT_I_SERBANVODA_BUS);

		T_I_SERBANVODA_BUS.Delay = 2;
		pn.Transitions.add(T_I_SERBANVODA_BUS);

		PetriTransition T_O_SERBANVODA_BUS = new PetriTransition(pn);
		T_O_SERBANVODA_BUS.TransitionName = "T_O_SERBANVODA_BUS";
		T_O_SERBANVODA_BUS.InputPlaceName.add("P_INTER_2");
		T_O_SERBANVODA_BUS.InputPlaceName.add("P_O_SERBANVODA_BUS");

		Condition T_O_SERBANVODA_BUSCt1 = new Condition(T_O_SERBANVODA_BUS, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_SERBANVODA_BUSCt2 = new Condition(T_O_SERBANVODA_BUS, "P_O_SERBANVODA_BUS", TransitionCondition.CanAddCars);
		Condition T_O_SERBANVODA_BUSCt3 = new Condition(T_O_SERBANVODA_BUS, "P_INTER_2", TransitionCondition.HaveBus);
		T_O_SERBANVODA_BUSCt2.SetNextCondition(LogicConnector.AND, T_O_SERBANVODA_BUSCt3);
		T_O_SERBANVODA_BUSCt1.SetNextCondition(LogicConnector.AND, T_O_SERBANVODA_BUSCt2);

		GuardMapping grdT_O_SERBANVODA_BUS = new GuardMapping();
		grdT_O_SERBANVODA_BUS.condition = T_O_SERBANVODA_BUSCt1;
		grdT_O_SERBANVODA_BUS.Activations.add(new Activation(T_O_SERBANVODA_BUS, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_SERBANVODA_BUS"));
		T_O_SERBANVODA_BUS.GuardMappingList.add(grdT_O_SERBANVODA_BUS);


		Condition T_O_SERBANVODA_BUS1Ct1 = new Condition(T_O_SERBANVODA_BUS, "P_INTER_2", TransitionCondition.HaveCarForMe);
		Condition T_O_SERBANVODA_BUS1Ct2 = new Condition(T_O_SERBANVODA_BUS, "P_O_SERBANVODA_BUS", TransitionCondition.CanAddCars);
		Condition T_O_SERBANVODA_BUS1Ct3 = new Condition(T_O_SERBANVODA_BUS, "P_INTER_2", TransitionCondition.HavePriorityCar);
		T_O_SERBANVODA_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_O_SERBANVODA_BUS1Ct3);
		T_O_SERBANVODA_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_O_SERBANVODA_BUS1Ct2);

		GuardMapping grdT_O_SERBANVODA_BUS1 = new GuardMapping();
		grdT_O_SERBANVODA_BUS1.condition = T_O_SERBANVODA_BUS1Ct1;
		grdT_O_SERBANVODA_BUS1.Activations.add(new Activation(T_O_SERBANVODA_BUS, "P_INTER_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_SERBANVODA_BUS"));
		T_O_SERBANVODA_BUS.GuardMappingList.add(grdT_O_SERBANVODA_BUS1);


		T_O_SERBANVODA_BUS.Delay = 1;
		pn.Transitions.add(T_O_SERBANVODA_BUS);





		PetriTransition T_OE_SERBANVODA_BUS = new PetriTransition(pn);

		T_OE_SERBANVODA_BUS.TransitionName = "T_OE_SERBANVODA_BUS";
		T_OE_SERBANVODA_BUS.InputPlaceName.add("P_O_SERBANVODA_BUS");
		Condition T_OE_SERBANVODA_BUSCt1 = new Condition(T_OE_SERBANVODA_BUS, "P_O_SERBANVODA_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_SERBANVODA_BUS = new GuardMapping();
		grdT_OE_SERBANVODA_BUS.condition = T_OE_SERBANVODA_BUSCt1;
		grdT_OE_SERBANVODA_BUS.Activations.add(new Activation(T_OE_SERBANVODA_BUS, "P_O_SERBANVODA_BUS", TransitionOperation.PopElementWithoutTarget, "P_OE_SERBANVODA_BUS"));

		T_OE_SERBANVODA_BUS.GuardMappingList.add(grdT_OE_SERBANVODA_BUS);
		T_OE_SERBANVODA_BUS.Delay = 2;

		pn.Transitions.add(T_OE_SERBANVODA_BUS);





		PetriTransition T_OUT_SERBANVODA_BUS = new PetriTransition(pn);
		T_OUT_SERBANVODA_BUS.TransitionName = "T_OUT_SERBANVODA_BUS";
		T_OUT_SERBANVODA_BUS.InputPlaceName.add("P_A_SERBANVODA_BUS");
		T_OUT_SERBANVODA_BUS.InputPlaceName.add("P_X_SERBANVODA_BUS");
		T_OUT_SERBANVODA_BUS.IsAsync = true;

		Condition T_OUT_SERBANVODA_BUSCt1 = new Condition(T_OUT_SERBANVODA_BUS, "P_A_SERBANVODA_BUS", TransitionCondition.NotNull);
		Condition T_OUT_SERBANVODA_BUSCt2 = new Condition(T_OUT_SERBANVODA_BUS, "P_X_SERBANVODA_BUS", TransitionCondition.CanNotAddCars);
		T_OUT_SERBANVODA_BUSCt1.SetNextCondition(LogicConnector.AND, T_OUT_SERBANVODA_BUSCt2);

		GuardMapping grdT_OUT_SERBANVODA_BUS = new GuardMapping();
		grdT_OUT_SERBANVODA_BUS.condition= T_OUT_SERBANVODA_BUSCt1;
		grdT_OUT_SERBANVODA_BUS.Activations.add(new Activation(T_OUT_SERBANVODA_BUS, "full", TransitionOperation.SendOverNetwork, "OP_SERBANVODA_BUS"));
		T_OUT_SERBANVODA_BUS.GuardMappingList.add(grdT_OUT_SERBANVODA_BUS);

		T_OUT_SERBANVODA_BUS.Delay = 0;
		pn.Transitions.add(T_OUT_SERBANVODA_BUS);


		
		
		
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
