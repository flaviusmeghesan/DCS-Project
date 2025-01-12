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

public class BucharestMegalopolis {
	public static void main(String[] args) {
		
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Main Petri";
		pn.NetworkPort = 1080;

		// BEGIN Intersection 1

		DataCar P_A_CANTEMIRNORD = new DataCar();
		P_A_CANTEMIRNORD.SetName("P_A_CANTEMIRNORD");
		pn.PlaceList.add(P_A_CANTEMIRNORD);

		DataCar P_A_CANTEMIRSUD = new DataCar();
		P_A_CANTEMIRSUD.SetName("P_A_CANTEMIRSUD");
		pn.PlaceList.add(P_A_CANTEMIRSUD);

		DataCar P_A_MARASESTIEST = new DataCar();
		P_A_MARASESTIEST.SetName("P_A_MARASESTIEST");
		pn.PlaceList.add(P_A_MARASESTIEST);

		DataCar P_A_MARASESTIEST_BUS = new DataCar();
		P_A_MARASESTIEST_BUS.SetName("P_A_MARASESTIEST_BUS");
		pn.PlaceList.add(P_A_MARASESTIEST_BUS);

		DataCar P_A_MARASESTIVEST = new DataCar();
		P_A_MARASESTIVEST.SetName("P_A_MARASESTIVEST");
		pn.PlaceList.add(P_A_MARASESTIVEST);

		DataCar P_A_MARASESTIVEST_BUS = new DataCar();
		P_A_MARASESTIVEST_BUS.SetName("P_A_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_A_MARASESTIVEST_BUS);

		DataCar P_A1_MARASESTIEST_BUS = new DataCar();
		P_A1_MARASESTIEST_BUS.SetName("P_A1_MARASESTIEST_BUS");
		pn.PlaceList.add(P_A1_MARASESTIEST_BUS);

		DataCar P_A1_MARASESTIVEST_BUS = new DataCar();
		P_A1_MARASESTIVEST_BUS.SetName("P_A1_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_A1_MARASESTIVEST_BUS);

		DataTransfer OP_CANTEMIRNORD = new DataTransfer();
		OP_CANTEMIRNORD.SetName("OP_CANTEMIRNORD");
		OP_CANTEMIRNORD.Value = new TransferOperation("localhost", "1081" , "IN_CANTEMIRNORD");
		pn.PlaceList.add(OP_CANTEMIRNORD);

		DataTransfer OP_CANTEMIRSUD = new DataTransfer();
		OP_CANTEMIRSUD.SetName("OP_CANTEMIRSUD");
		OP_CANTEMIRSUD.Value = new TransferOperation("localhost", "1081", "IN_CANTEMIRSUD");
		pn.PlaceList.add(OP_CANTEMIRSUD);

		DataTransfer OP_MARASESTIEST = new DataTransfer();
		OP_MARASESTIEST.SetName("OP_MARASESTIEST");
		OP_MARASESTIEST.Value = new TransferOperation("localhost", "1081", "IN_MARASESTIEST");
		pn.PlaceList.add(OP_MARASESTIEST);

		DataTransfer OP_MARASESTIEST_BUS = new DataTransfer();
		OP_MARASESTIEST_BUS.SetName("OP_MARASESTIEST_BUS");
		OP_MARASESTIEST_BUS.Value = new TransferOperation("localhost", "1081", "IN_MARASESTIEST_BUS");
		pn.PlaceList.add(OP_MARASESTIEST_BUS);

		DataTransfer OP_MARASESTIVEST = new DataTransfer();
		OP_MARASESTIVEST.SetName("OP_MARASESTIVEST");
		OP_MARASESTIVEST.Value = new TransferOperation("localhost", "1081", "IN_MARASESTIVEST");
		pn.PlaceList.add(OP_MARASESTIVEST);

		DataTransfer OP_MARASESTIVEST_BUS = new DataTransfer();
		OP_MARASESTIVEST_BUS.SetName("OP_MARASESTIVEST_BUS");
		OP_MARASESTIVEST_BUS.Value = new TransferOperation("localhost", "1081", "IN_MARASESTIVEST_BUS");
		pn.PlaceList.add(OP_MARASESTIVEST_BUS);


		DataCar P_B_CANTEMIRNORD = new DataCar(); //p8.Printable = false;
		P_B_CANTEMIRNORD.SetName("P_B_CANTEMIRNORD");
		pn.PlaceList.add(P_B_CANTEMIRNORD);

		DataCar P_B_CANTEMIRSUD = new DataCar(); //p8.Printable = false;
		P_B_CANTEMIRSUD.SetName("P_B_CANTEMIRSUD");
		pn.PlaceList.add(P_B_CANTEMIRSUD);

		DataCar P_B_MARASESTIEST = new DataCar(); //p8.Printable = false;
		P_B_MARASESTIEST.SetName("P_B_MARASESTIEST");
		pn.PlaceList.add(P_B_MARASESTIEST);

		DataCar P_B_MARASESTIEST_BUS = new DataCar(); //p8.Printable = false;
		P_B_MARASESTIEST_BUS.SetName("P_B_MARASESTIEST_BUS");
		pn.PlaceList.add(P_B_MARASESTIEST_BUS);

		DataCar P_B_MARASESTIVEST = new DataCar(); //p8.Printable = false;
		P_B_MARASESTIVEST.SetName("P_B_MARASESTIVEST");
		pn.PlaceList.add(P_B_MARASESTIVEST);

		DataCar P_B_MARASESTIVEST_BUS = new DataCar(); //p8.Printable = false;
		P_B_MARASESTIVEST_BUS.SetName("P_B_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_B_MARASESTIVEST_BUS);

		DataString P_CANTEMIRNORD_TL = new DataString(); //p7.Printable = false;
		P_CANTEMIRNORD_TL.SetName("P_CANTEMIRNORD_TL");
		P_CANTEMIRNORD_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_CANTEMIRNORD_TL);

		DataString P_CANTEMIRSUD_TL = new DataString(); //p7.Printable = false;
		P_CANTEMIRSUD_TL.SetName("P_CANTEMIRSUD_TL");
		P_CANTEMIRSUD_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_CANTEMIRSUD_TL);

		DataString P_MARASESTIEST_BUS_TL = new DataString(); //p7.Printable = false;
		P_MARASESTIEST_BUS_TL.SetName("P_MARASESTIEST_BUS_TL");
		P_MARASESTIEST_BUS_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_MARASESTIEST_BUS_TL);

		DataString P_MARASESTIEST_TL = new DataString(); //p7.Printable = false;
		P_MARASESTIEST_TL.SetName("P_MARASESTIEST_TL");
		P_MARASESTIEST_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 		pn.PlaceList.add(P_MARASESTIEST_TL);

		DataString P_MARASESTIVEST_BUS_TL = new DataString(); //p7.Printable = false;
		P_MARASESTIVEST_BUS_TL.SetName("P_MARASESTIVEST_BUS_TL");
		P_MARASESTIVEST_BUS_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_MARASESTIVEST_BUS_TL);

		DataString P_MARASESTIVEST_TL = new DataString(); //p7.Printable = false;
		P_MARASESTIVEST_TL.SetName("P_MARASESTIVEST_TL");
		P_MARASESTIVEST_TL.SetValue("red"); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		pn.PlaceList.add(P_MARASESTIVEST_TL);

		DataCarQueue P_INTER_1 = new DataCarQueue();
		P_INTER_1.Value.Size = 20;
		P_INTER_1.SetName("P_INTER_1");
		pn.PlaceList.add(P_INTER_1);

		DataCarQueue P_O_CANTEMIRNORD = new DataCarQueue(); //p19.Printable = false;
		P_O_CANTEMIRNORD.Value.Size = 3;
		P_O_CANTEMIRNORD.SetName("P_O_CANTEMIRNORD");
		pn.PlaceList.add(P_O_CANTEMIRNORD);

		DataCarQueue P_O_CANTEMIRSUD = new DataCarQueue(); //p19.Printable = false;
		P_O_CANTEMIRSUD.Value.Size = 3;
		P_O_CANTEMIRSUD.SetName("P_O_CANTEMIRSUD");
		pn.PlaceList.add(P_O_CANTEMIRSUD);

		DataCarQueue P_O_MARASESTIEST = new DataCarQueue(); //p19.Printable = false;
		P_O_MARASESTIEST.Value.Size = 3;
		P_O_MARASESTIEST.SetName("P_O_MARASESTIEST");
		pn.PlaceList.add(P_O_MARASESTIEST);

		DataCarQueue P_O_MARASESTIEST_BUS = new DataCarQueue(); //p19.Printable = false;
		P_O_MARASESTIEST_BUS.Value.Size = 3;
		P_O_MARASESTIEST_BUS.SetName("P_O_MARASESTIEST_BUS");
		pn.PlaceList.add(P_O_MARASESTIEST_BUS);

		DataCarQueue P_O_MARASESTIVEST = new DataCarQueue(); //p19.Printable = false;
		P_O_MARASESTIVEST.Value.Size = 3;
		P_O_MARASESTIVEST.SetName("P_O_MARASESTIVEST");
		pn.PlaceList.add(P_O_MARASESTIVEST);

		DataCarQueue P_O_MARASESTIVEST_BUS = new DataCarQueue(); //p19.Printable = false;
		P_O_MARASESTIVEST_BUS.Value.Size = 3;
		P_O_MARASESTIVEST_BUS.SetName("P_O_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_O_MARASESTIVEST_BUS);

		DataCar P_OE_CANTEMIRNORD = new DataCar();
		P_OE_CANTEMIRNORD.SetName("P_OE_CANTEMIRNORD");
		pn.PlaceList.add(P_OE_CANTEMIRNORD);

		DataCar P_OE_CANTEMIRSUD = new DataCar();
		P_OE_CANTEMIRSUD.SetName("P_OE_CANTEMIRSUD");
		pn.PlaceList.add(P_OE_CANTEMIRSUD);

		DataCar P_OE_MARASESTIEST = new DataCar();
		P_OE_MARASESTIEST.SetName("P_OE_MARASESTIEST");
		pn.PlaceList.add(P_OE_MARASESTIEST);

		DataCar P_OE_MARASESTIEST_BUS = new DataCar();
		P_OE_MARASESTIEST_BUS.SetName("P_OE_MARASESTIEST_BUS");
		pn.PlaceList.add(P_OE_MARASESTIEST_BUS);

		DataCar P_OE_MARASESTIVEST = new DataCar();
		P_OE_MARASESTIVEST.SetName("P_OE_MARASESTIVEST");
		pn.PlaceList.add(P_OE_MARASESTIVEST);

		DataCar P_OE_MARASESTIVEST_BUS = new DataCar();
		P_OE_MARASESTIVEST_BUS.SetName("P_OE_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_OE_MARASESTIVEST_BUS);


		DataCarQueue P_STATION_MARASESTIEST_BUS = new DataCarQueue();
		P_STATION_MARASESTIEST_BUS.Value.Size = 3;
		P_STATION_MARASESTIEST_BUS.SetName("P_STATION_MARASESTIEST_BUS");
		pn.PlaceList.add(P_STATION_MARASESTIEST_BUS);

		DataCarQueue P_STATION_MARASESTIVEST_BUS = new DataCarQueue();
		P_STATION_MARASESTIVEST_BUS.Value.Size = 3;
		P_STATION_MARASESTIVEST_BUS.SetName("P_STATION_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_STATION_MARASESTIVEST_BUS);

		DataCarQueue P_X_CANTEMIRNORD = new DataCarQueue();
		P_X_CANTEMIRNORD.Value.Size = 3;
		P_X_CANTEMIRNORD.SetName("P_X_CANTEMIRNORD");
		pn.PlaceList.add(P_X_CANTEMIRNORD);

		DataCarQueue P_X_CANTEMIRSUD = new DataCarQueue();
		P_X_CANTEMIRSUD.Value.Size = 3;
		P_X_CANTEMIRSUD.SetName("P_X_CANTEMIRSUD");
		pn.PlaceList.add(P_X_CANTEMIRSUD);

		DataCarQueue P_X_MARASESTIEST = new DataCarQueue();
		P_X_MARASESTIEST.Value.Size = 3;
		P_X_MARASESTIEST.SetName("P_X_MARASESTIEST");
		pn.PlaceList.add(P_X_MARASESTIEST);

		DataCarQueue P_X_MARASESTIVEST = new DataCarQueue();
		P_X_MARASESTIVEST.Value.Size = 3;
		P_X_MARASESTIVEST.SetName("P_X_MARASESTIVEST");
		pn.PlaceList.add(P_X_MARASESTIVEST);

		DataCarQueue P_X1_MARASESTIEST_BUS = new DataCarQueue();
		P_X1_MARASESTIEST_BUS.Value.Size = 3;
		P_X1_MARASESTIEST_BUS.SetName("P_X1_MARASESTIEST_BUS");
		pn.PlaceList.add(P_X1_MARASESTIEST_BUS);

		DataCarQueue P_X1_MARASESTIVEST_BUS = new DataCarQueue();
		P_X1_MARASESTIVEST_BUS.Value.Size = 3;
		P_X1_MARASESTIVEST_BUS.SetName("P_X1_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_X1_MARASESTIVEST_BUS);

		DataCarQueue P_X2_MARASESTIEST_BUS = new DataCarQueue();
		P_X2_MARASESTIEST_BUS.Value.Size = 3;
		P_X2_MARASESTIEST_BUS.SetName("P_X2_MARASESTIEST_BUS");
		pn.PlaceList.add(P_X2_MARASESTIEST_BUS);

		DataCarQueue P_X2_MARASESTIVEST_BUS = new DataCarQueue();
		P_X2_MARASESTIVEST_BUS.Value.Size = 3;
		P_X2_MARASESTIVEST_BUS.SetName("P_X2_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_X2_MARASESTIVEST_BUS);

		DataCarQueue P_X3_MARASESTIEST_BUS = new DataCarQueue();
		P_X3_MARASESTIEST_BUS.Value.Size = 3;
		P_X3_MARASESTIEST_BUS.SetName("P_X3_MARASESTIEST_BUS");
		pn.PlaceList.add(P_X3_MARASESTIEST_BUS);

		DataCarQueue P_X3_MARASESTIVEST_BUS = new DataCarQueue();
		P_X3_MARASESTIVEST_BUS.Value.Size = 3;
		P_X3_MARASESTIVEST_BUS.SetName("P_X3_MARASESTIVEST_BUS");
		pn.PlaceList.add(P_X3_MARASESTIVEST_BUS);

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

		// INPUT LANE CANTEMIR SUD

		PetriTransition T_U_CANTEMIRSUD = new PetriTransition(pn);
		T_U_CANTEMIRSUD.TransitionName = "T_U_CANTEMIRSUD";
		T_U_CANTEMIRSUD.InputPlaceName.add("P_A_CANTEMIRSUD");
		T_U_CANTEMIRSUD.InputPlaceName.add("P_X_CANTEMIRSUD");

		Condition T_U_CANTEMIRSUDCt1 = new Condition(T_U_CANTEMIRSUD, "P_A_CANTEMIRSUD", TransitionCondition.NotNull);
		Condition T_U_CANTEMIRSUDCt2 = new Condition(T_U_CANTEMIRSUD, "P_X_CANTEMIRSUD", TransitionCondition.CanAddCars);
		T_U_CANTEMIRSUDCt1.SetNextCondition(LogicConnector.AND, T_U_CANTEMIRSUDCt2);

		GuardMapping grdT_U_CANTEMIRSUD = new GuardMapping();
		grdT_U_CANTEMIRSUD.condition = T_U_CANTEMIRSUDCt1;
		grdT_U_CANTEMIRSUD.Activations.add(new Activation(T_U_CANTEMIRSUD, "P_A_CANTEMIRSUD", TransitionOperation.AddElement, "P_X_CANTEMIRSUD"));
		T_U_CANTEMIRSUD.GuardMappingList.add(grdT_U_CANTEMIRSUD);

		T_U_CANTEMIRSUD.Delay = 2;
		pn.Transitions.add(T_U_CANTEMIRSUD);


		PetriTransition T_E_CANTEMIRSUD = new PetriTransition(pn);
		T_E_CANTEMIRSUD.TransitionName = "T_E_CANTEMIRSUD";
		T_E_CANTEMIRSUD.InputPlaceName.add("P_X_CANTEMIRSUD");
		T_E_CANTEMIRSUD.InputPlaceName.add("P_CANTEMIRSUD_TL");

		Condition T_E_CANTEMIRSUDCt1 = new Condition(T_E_CANTEMIRSUD, "P_CANTEMIRSUD_TL", TransitionCondition.Equal,"green");
		Condition T_E_CANTEMIRSUDCt2 = new Condition(T_E_CANTEMIRSUD, "P_X_CANTEMIRSUD", TransitionCondition.HaveCar);
		T_E_CANTEMIRSUDCt1.SetNextCondition(LogicConnector.AND, T_E_CANTEMIRSUDCt2);

		GuardMapping grdT_E_CANTEMIRSUD = new GuardMapping();
		grdT_E_CANTEMIRSUD.condition= T_E_CANTEMIRSUDCt1;
		grdT_E_CANTEMIRSUD.Activations.add(new Activation(T_E_CANTEMIRSUD, "P_X_CANTEMIRSUD", TransitionOperation.PopElementWithoutTarget, "P_B_CANTEMIRSUD"));
		grdT_E_CANTEMIRSUD.Activations.add(new Activation(T_E_CANTEMIRSUD, "P_CANTEMIRSUD_TL", TransitionOperation.Move, "P_CANTEMIRSUD_TL"));
		T_E_CANTEMIRSUD.GuardMappingList.add(grdT_E_CANTEMIRSUD);

		Condition T_E_CANTEMIRSUD1Ct1 = new Condition(T_E_CANTEMIRSUD, "P_X_CANTEMIRSUD", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_CANTEMIRSUD1 = new GuardMapping();
		grdT_E_CANTEMIRSUD1.condition = T_E_CANTEMIRSUD1Ct1;
		grdT_E_CANTEMIRSUD1.Activations.add(new Activation(T_E_CANTEMIRSUD, "P_X_CANTEMIRSUD", TransitionOperation.PopElementWithoutTarget, "P_B_CANTEMIRSUD"));
		grdT_E_CANTEMIRSUD1.Activations.add(new Activation(T_E_CANTEMIRSUD, "P_CANTEMIRSUD_TL", TransitionOperation.Move, "P_CANTEMIRSUD_TL"));
		T_E_CANTEMIRSUD.GuardMappingList.add(grdT_E_CANTEMIRSUD1);

		T_E_CANTEMIRSUD.Delay = 2;
		pn.Transitions.add(T_E_CANTEMIRSUD);



		PetriTransition T_O_CANTEMIRSUD = new PetriTransition(pn);
		T_O_CANTEMIRSUD.TransitionName = "T_O_CANTEMIRSUD";
		T_O_CANTEMIRSUD.InputPlaceName.add("P_INTER_1");
		T_O_CANTEMIRSUD.InputPlaceName.add("P_O_CANTEMIRSUD");

		Condition T_O_CANTEMIRSUDCt1 = new Condition(T_O_CANTEMIRSUD, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_CANTEMIRSUDCt2 = new Condition(T_O_CANTEMIRSUD, "P_O_CANTEMIRSUD", TransitionCondition.CanAddCars);
		T_O_CANTEMIRSUDCt1.SetNextCondition(LogicConnector.AND, T_O_CANTEMIRSUDCt2);

		GuardMapping grdT_O_CANTEMIRSUD = new GuardMapping();
		grdT_O_CANTEMIRSUD.condition = T_O_CANTEMIRSUDCt1;
		grdT_O_CANTEMIRSUD.Activations.add(new Activation(T_O_CANTEMIRSUD, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_CANTEMIRSUD"));
		T_O_CANTEMIRSUD.GuardMappingList.add(grdT_O_CANTEMIRSUD);

		T_O_CANTEMIRSUD.Delay = 1;
		pn.Transitions.add(T_O_CANTEMIRSUD);


		PetriTransition T_OE_CANTEMIRSUD = new PetriTransition(pn);

		T_OE_CANTEMIRSUD.TransitionName = "T_OE_CANTEMIRSUD";
		T_OE_CANTEMIRSUD.InputPlaceName.add("P_O_CANTEMIRSUD");
		Condition T_OE_CANTEMIRSUDCt1 = new Condition(T_OE_CANTEMIRSUD, "P_O_CANTEMIRSUD", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_CANTEMIRSUD = new GuardMapping();
		grdT_OE_CANTEMIRSUD.condition = T_OE_CANTEMIRSUDCt1;
		grdT_OE_CANTEMIRSUD.Activations.add(new Activation(T_OE_CANTEMIRSUD, "P_O_CANTEMIRSUD", TransitionOperation.PopElementWithoutTarget, "P_OE_CANTEMIRSUD"));

		T_OE_CANTEMIRSUD.GuardMappingList.add(grdT_OE_CANTEMIRSUD);
		T_OE_CANTEMIRSUD.Delay = 2;

		pn.Transitions.add(T_OE_CANTEMIRSUD);


		PetriTransition T_I_CANTEMIRSUD = new PetriTransition(pn);
		T_I_CANTEMIRSUD.TransitionName = "T_I_CANTEMIRSUD";
		T_I_CANTEMIRSUD.InputPlaceName.add("P_B_CANTEMIRSUD");
		T_I_CANTEMIRSUD.InputPlaceName.add("P_INTER_1");

		Condition T_I_CANTEMIRSUDCt1 = new Condition(T_I_CANTEMIRSUD, "P_B_CANTEMIRSUD", TransitionCondition.NotNull);
		Condition T_I_CANTEMIRSUDCt2 = new Condition(T_I_CANTEMIRSUD, "P_INTER_1", TransitionCondition.CanAddCars);
		T_I_CANTEMIRSUDCt1.SetNextCondition(LogicConnector.AND, T_I_CANTEMIRSUDCt2);

		GuardMapping grdT_I_CANTEMIRSUD = new GuardMapping();
		grdT_I_CANTEMIRSUD.condition = T_I_CANTEMIRSUDCt1;
		grdT_I_CANTEMIRSUD.Activations.add(new Activation(T_I_CANTEMIRSUD, "P_B_CANTEMIRSUD", TransitionOperation.AddElement, "P_INTER_1"));
		T_I_CANTEMIRSUD.GuardMappingList.add(grdT_I_CANTEMIRSUD);

		T_I_CANTEMIRSUD.Delay = 2;
		pn.Transitions.add(T_I_CANTEMIRSUD);

		PetriTransition T_OUT_CANTEMIRSUD = new PetriTransition(pn);
		T_OUT_CANTEMIRSUD.TransitionName = "T_OUT_CANTEMIRSUD";
		T_OUT_CANTEMIRSUD.InputPlaceName.add("P_A_CANTEMIRSUD");
		T_OUT_CANTEMIRSUD.InputPlaceName.add("P_X_CANTEMIRSUD");
		T_OUT_CANTEMIRSUD.IsAsync = true;

		Condition T_OUT_CANTEMIRSUDCt1 = new Condition(T_OUT_CANTEMIRSUD, "P_A_CANTEMIRSUD", TransitionCondition.NotNull);
		Condition T_OUT_CANTEMIRSUDCt2 = new Condition(T_OUT_CANTEMIRSUD, "P_X_CANTEMIRSUD", TransitionCondition.CanNotAddCars);
		T_OUT_CANTEMIRSUDCt1.SetNextCondition(LogicConnector.AND, T_OUT_CANTEMIRSUDCt2);

		GuardMapping grdT_OUT_CANTEMIRSUD = new GuardMapping();
		grdT_OUT_CANTEMIRSUD.condition= T_OUT_CANTEMIRSUDCt1;
		grdT_OUT_CANTEMIRSUD.Activations.add(new Activation(T_OUT_CANTEMIRSUD, "full", TransitionOperation.SendOverNetwork, "OP_CANTEMIRSUD"));
		T_OUT_CANTEMIRSUD.GuardMappingList.add(grdT_OUT_CANTEMIRSUD);

		T_OUT_CANTEMIRSUD.Delay = 2;
		pn.Transitions.add(T_OUT_CANTEMIRSUD);


		// INPUT LANE CANTEMIRNORD
		PetriTransition T_U_CANTEMIRNORD = new PetriTransition(pn);
		T_U_CANTEMIRNORD.TransitionName = "T_U_CANTEMIRNORD";
		T_U_CANTEMIRNORD.InputPlaceName.add("P_A_CANTEMIRNORD");
		T_U_CANTEMIRNORD.InputPlaceName.add("P_X_CANTEMIRNORD");

		Condition T_U_CANTEMIRNORDCt1 = new Condition(T_U_CANTEMIRNORD, "P_A_CANTEMIRNORD", TransitionCondition.NotNull);
		Condition T_U_CANTEMIRNORDCt2 = new Condition(T_U_CANTEMIRNORD, "P_X_CANTEMIRNORD", TransitionCondition.CanAddCars);
		T_U_CANTEMIRNORDCt1.SetNextCondition(LogicConnector.AND, T_U_CANTEMIRNORDCt2);

		GuardMapping grdT_U_CANTEMIRNORD = new GuardMapping();
		grdT_U_CANTEMIRNORD.condition = T_U_CANTEMIRNORDCt1;
		grdT_U_CANTEMIRNORD.Activations.add(new Activation(T_U_CANTEMIRNORD, "P_A_CANTEMIRNORD", TransitionOperation.AddElement, "P_X_CANTEMIRNORD"));
		T_U_CANTEMIRNORD.GuardMappingList.add(grdT_U_CANTEMIRNORD);

		T_U_CANTEMIRNORD.Delay = 2;
		pn.Transitions.add(T_U_CANTEMIRNORD);


		PetriTransition T_E_CANTEMIRNORD = new PetriTransition(pn);
		T_E_CANTEMIRNORD.TransitionName = "T_E_CANTEMIRNORD";
		T_E_CANTEMIRNORD.InputPlaceName.add("P_X_CANTEMIRNORD");
		T_E_CANTEMIRNORD.InputPlaceName.add("P_CANTEMIRNORD_TL");

		Condition T_E_CANTEMIRNORDCt1 = new Condition(T_E_CANTEMIRNORD, "P_CANTEMIRNORD_TL", TransitionCondition.Equal,"green");
		Condition T_E_CANTEMIRNORDCt2 = new Condition(T_E_CANTEMIRNORD, "P_X_CANTEMIRNORD", TransitionCondition.HaveCar);
		T_E_CANTEMIRNORDCt1.SetNextCondition(LogicConnector.AND, T_E_CANTEMIRNORDCt2);

		GuardMapping grdT_E_CANTEMIRNORD = new GuardMapping();
		grdT_E_CANTEMIRNORD.condition= T_E_CANTEMIRNORDCt1;
		grdT_E_CANTEMIRNORD.Activations.add(new Activation(T_E_CANTEMIRNORD, "P_X_CANTEMIRNORD", TransitionOperation.PopElementWithoutTarget, "P_B_CANTEMIRNORD"));
		grdT_E_CANTEMIRNORD.Activations.add(new Activation(T_E_CANTEMIRNORD, "P_CANTEMIRNORD_TL", TransitionOperation.Move, "P_CANTEMIRNORD_TL"));
		T_E_CANTEMIRNORD.GuardMappingList.add(grdT_E_CANTEMIRNORD);

		Condition T_E_CANTEMIRNORD1Ct1 = new Condition(T_E_CANTEMIRNORD, "P_X_CANTEMIRNORD", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_CANTEMIRNORD1 = new GuardMapping();
		grdT_E_CANTEMIRNORD1.condition = T_E_CANTEMIRNORD1Ct1;
		grdT_E_CANTEMIRNORD1.Activations.add(new Activation(T_E_CANTEMIRNORD, "P_X_CANTEMIRNORD", TransitionOperation.PopElementWithoutTarget, "P_B_CANTEMIRNORD"));
		grdT_E_CANTEMIRNORD1.Activations.add(new Activation(T_E_CANTEMIRNORD, "P_CANTEMIRNORD_TL", TransitionOperation.Move, "P_CANTEMIRNORD_TL"));
		T_E_CANTEMIRNORD.GuardMappingList.add(grdT_E_CANTEMIRNORD1);

		T_E_CANTEMIRNORD.Delay = 2;
		pn.Transitions.add(T_E_CANTEMIRNORD);


		PetriTransition T_O_CANTEMIRNORD = new PetriTransition(pn);
		T_O_CANTEMIRNORD.TransitionName = "T_O_CANTEMIRNORD";
		T_O_CANTEMIRNORD.InputPlaceName.add("P_INTER_1");
		T_O_CANTEMIRNORD.InputPlaceName.add("P_O_CANTEMIRNORD");

		Condition T_O_CANTEMIRNORDCt1 = new Condition(T_O_CANTEMIRNORD, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_CANTEMIRNORDCt2 = new Condition(T_O_CANTEMIRNORD, "P_O_CANTEMIRNORD", TransitionCondition.CanAddCars);
		T_O_CANTEMIRNORDCt1.SetNextCondition(LogicConnector.AND, T_O_CANTEMIRNORDCt2);

		GuardMapping grdT_O_CANTEMIRNORD = new GuardMapping();
		grdT_O_CANTEMIRNORD.condition = T_O_CANTEMIRNORDCt1;
		grdT_O_CANTEMIRNORD.Activations.add(new Activation(T_O_CANTEMIRNORD, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_CANTEMIRNORD"));
		T_O_CANTEMIRNORD.GuardMappingList.add(grdT_O_CANTEMIRNORD);

		T_O_CANTEMIRNORD.Delay = 1;
		pn.Transitions.add(T_O_CANTEMIRNORD);

		PetriTransition T_OE_CANTEMIRNORD = new PetriTransition(pn);

		T_OE_CANTEMIRNORD.TransitionName = "T_OE_CANTEMIRNORD";
		T_OE_CANTEMIRNORD.InputPlaceName.add("P_O_CANTEMIRNORD");
		Condition T_OE_CANTEMIRNORDCt1 = new Condition(T_OE_CANTEMIRNORD, "P_O_CANTEMIRNORD", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_CANTEMIRNORD = new GuardMapping();
		grdT_OE_CANTEMIRNORD.condition = T_OE_CANTEMIRNORDCt1;
		grdT_OE_CANTEMIRNORD.Activations.add(new Activation(T_OE_CANTEMIRNORD, "P_O_CANTEMIRNORD", TransitionOperation.PopElementWithoutTarget, "P_OE_CANTEMIRNORD"));

		T_OE_CANTEMIRNORD.GuardMappingList.add(grdT_OE_CANTEMIRNORD);
		T_OE_CANTEMIRNORD.Delay = 2;

		pn.Transitions.add(T_OE_CANTEMIRNORD);



		PetriTransition T_I_CANTEMIRNORD = new PetriTransition(pn);
		T_I_CANTEMIRNORD.TransitionName = "T_I_CANTEMIRNORD";
		T_I_CANTEMIRNORD.InputPlaceName.add("P_B_CANTEMIRNORD");
		T_I_CANTEMIRNORD.InputPlaceName.add("P_INTER_1");

		Condition T_I_CANTEMIRNORDCt1 = new Condition(T_I_CANTEMIRNORD, "P_B_CANTEMIRNORD", TransitionCondition.NotNull);
		Condition T_I_CANTEMIRNORDCt2 = new Condition(T_I_CANTEMIRNORD, "P_INTER_1", TransitionCondition.CanAddCars);
		T_I_CANTEMIRNORDCt1.SetNextCondition(LogicConnector.AND, T_I_CANTEMIRNORDCt2);

		GuardMapping grdT_I_CANTEMIRNORD = new GuardMapping();
		grdT_I_CANTEMIRNORD.condition = T_I_CANTEMIRNORDCt1;
		grdT_I_CANTEMIRNORD.Activations.add(new Activation(T_I_CANTEMIRNORD, "P_B_CANTEMIRNORD", TransitionOperation.AddElement, "P_INTER_1"));
		T_I_CANTEMIRNORD.GuardMappingList.add(grdT_I_CANTEMIRNORD);

		T_I_CANTEMIRNORD.Delay = 2;
		pn.Transitions.add(T_I_CANTEMIRNORD);

		PetriTransition T_OUT_CANTEMIRNORD = new PetriTransition(pn);
		T_OUT_CANTEMIRNORD.TransitionName = "T_OUT_CANTEMIRNORD";
		T_OUT_CANTEMIRNORD.InputPlaceName.add("P_A_CANTEMIRNORD");
		T_OUT_CANTEMIRNORD.InputPlaceName.add("P_X_CANTEMIRNORD");
		T_OUT_CANTEMIRNORD.IsAsync = true;

		Condition T_OUT_CANTEMIRNORDCt1 = new Condition(T_OUT_CANTEMIRNORD, "P_A_CANTEMIRNORD", TransitionCondition.NotNull);
		Condition T_OUT_CANTEMIRNORDCt2 = new Condition(T_OUT_CANTEMIRNORD, "P_X_CANTEMIRNORD", TransitionCondition.CanNotAddCars);
		T_OUT_CANTEMIRNORDCt1.SetNextCondition(LogicConnector.AND, T_OUT_CANTEMIRNORDCt2);

		GuardMapping grdT_OUT_CANTEMIRNORD = new GuardMapping();
		grdT_OUT_CANTEMIRNORD.condition= T_OUT_CANTEMIRNORDCt1;
		grdT_OUT_CANTEMIRNORD.Activations.add(new Activation(T_OUT_CANTEMIRNORD, "full", TransitionOperation.SendOverNetwork, "OP_CANTEMIRNORD"));
		T_OUT_CANTEMIRNORD.GuardMappingList.add(grdT_OUT_CANTEMIRNORD);

		T_OUT_CANTEMIRNORD.Delay = 2;
		pn.Transitions.add(T_OUT_CANTEMIRNORD);


		// INPUT LANE MARASESTIEST

		PetriTransition T_U_MARASESTIEST = new PetriTransition(pn);
		T_U_MARASESTIEST.TransitionName = "T_U_MARASESTIEST";
		T_U_MARASESTIEST.InputPlaceName.add("P_A_MARASESTIEST");
		T_U_MARASESTIEST.InputPlaceName.add("P_X_MARASESTIEST");

		Condition T_U_MARASESTIESTCt1 = new Condition(T_U_MARASESTIEST, "P_A_MARASESTIEST", TransitionCondition.NotNull);
		Condition T_U_MARASESTIESTCt2 = new Condition(T_U_MARASESTIEST, "P_X_MARASESTIEST", TransitionCondition.CanAddCars);
		T_U_MARASESTIESTCt1.SetNextCondition(LogicConnector.AND, T_U_MARASESTIESTCt2);

		GuardMapping grdT_U_MARASESTIEST = new GuardMapping();
		grdT_U_MARASESTIEST.condition = T_U_MARASESTIESTCt1;
		grdT_U_MARASESTIEST.Activations.add(new Activation(T_U_MARASESTIEST, "P_A_MARASESTIEST", TransitionOperation.AddElement, "P_X_MARASESTIEST"));
		T_U_MARASESTIEST.GuardMappingList.add(grdT_U_MARASESTIEST);

		T_U_MARASESTIEST.Delay = 2;
		pn.Transitions.add(T_U_MARASESTIEST);




		PetriTransition T_E_MARASESTIEST = new PetriTransition(pn);
		T_E_MARASESTIEST.TransitionName = "T_E_MARASESTIEST";
		T_E_MARASESTIEST.InputPlaceName.add("P_X_MARASESTIEST");
		T_E_MARASESTIEST.InputPlaceName.add("P_MARASESTIEST_TL");

		Condition T_E_MARASESTIESTCt1 = new Condition(T_E_MARASESTIEST, "P_MARASESTIEST_TL", TransitionCondition.Equal,"green");
		Condition T_E_MARASESTIESTCt2 = new Condition(T_E_MARASESTIEST, "P_X_MARASESTIEST", TransitionCondition.HaveCar);
		T_E_MARASESTIESTCt1.SetNextCondition(LogicConnector.AND, T_E_MARASESTIESTCt2);

		GuardMapping grdT_E_MARASESTIEST = new GuardMapping();
		grdT_E_MARASESTIEST.condition= T_E_MARASESTIESTCt1;
		grdT_E_MARASESTIEST.Activations.add(new Activation(T_E_MARASESTIEST, "P_X_MARASESTIEST", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIEST"));
		grdT_E_MARASESTIEST.Activations.add(new Activation(T_E_MARASESTIEST, "P_MARASESTIEST_TL", TransitionOperation.Move, "P_MARASESTIEST_TL"));
		T_E_MARASESTIEST.GuardMappingList.add(grdT_E_MARASESTIEST);

		Condition T_E_MARASESTIEST1Ct1 = new Condition(T_E_MARASESTIEST, "P_X_MARASESTIEST", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_MARASESTIEST1 = new GuardMapping();
		grdT_E_MARASESTIEST1.condition = T_E_MARASESTIEST1Ct1;
		grdT_E_MARASESTIEST1.Activations.add(new Activation(T_E_MARASESTIEST, "P_X_MARASESTIEST", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIEST"));
		grdT_E_MARASESTIEST1.Activations.add(new Activation(T_E_MARASESTIEST, "P_MARASESTIEST_TL", TransitionOperation.Move, "P_MARASESTIEST_TL"));
		T_E_MARASESTIEST.GuardMappingList.add(grdT_E_MARASESTIEST1);

		T_E_MARASESTIEST.Delay = 2;
		pn.Transitions.add(T_E_MARASESTIEST);


		PetriTransition T_O_MARASESTIEST = new PetriTransition(pn);
		T_O_MARASESTIEST.TransitionName = "T_O_MARASESTIEST";
		T_O_MARASESTIEST.InputPlaceName.add("P_INTER_1");
		T_O_MARASESTIEST.InputPlaceName.add("P_O_MARASESTIEST");

		Condition T_O_MARASESTIESTCt1 = new Condition(T_O_MARASESTIEST, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_MARASESTIESTCt2 = new Condition(T_O_MARASESTIEST, "P_O_MARASESTIEST", TransitionCondition.CanAddCars);
		T_O_MARASESTIESTCt1.SetNextCondition(LogicConnector.AND, T_O_MARASESTIESTCt2);

		GuardMapping grdT_O_MARASESTIEST = new GuardMapping();
		grdT_O_MARASESTIEST.condition = T_O_MARASESTIESTCt1;
		grdT_O_MARASESTIEST.Activations.add(new Activation(T_O_MARASESTIEST, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_MARASESTIEST"));
		T_O_MARASESTIEST.GuardMappingList.add(grdT_O_MARASESTIEST);

		T_O_MARASESTIEST.Delay = 1;
		pn.Transitions.add(T_O_MARASESTIEST);



		PetriTransition T_OE_MARASESTIEST = new PetriTransition(pn);

		T_OE_MARASESTIEST.TransitionName = "T_OE_MARASESTIEST";
		T_OE_MARASESTIEST.InputPlaceName.add("P_O_MARASESTIEST");
		Condition T_OE_MARASESTIESTCt1 = new Condition(T_OE_MARASESTIEST, "P_O_MARASESTIEST", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_MARASESTIEST = new GuardMapping();
		grdT_OE_MARASESTIEST.condition = T_OE_MARASESTIESTCt1;
		grdT_OE_MARASESTIEST.Activations.add(new Activation(T_OE_MARASESTIEST, "P_O_MARASESTIEST", TransitionOperation.PopElementWithoutTarget, "P_OE_MARASESTIEST"));

		T_OE_MARASESTIEST.GuardMappingList.add(grdT_OE_MARASESTIEST);
		T_OE_MARASESTIEST.Delay = 2;

		pn.Transitions.add(T_OE_MARASESTIEST);


		PetriTransition T_I_MARASESTIEST = new PetriTransition(pn);
		T_I_MARASESTIEST.TransitionName = "T_I_MARASESTIEST";
		T_I_MARASESTIEST.InputPlaceName.add("P_B_MARASESTIEST");
		T_I_MARASESTIEST.InputPlaceName.add("P_INTER_1");

		Condition T_I_MARASESTIESTCt1 = new Condition(T_I_MARASESTIEST, "P_B_MARASESTIEST", TransitionCondition.NotNull);
		Condition T_I_MARASESTIESTCt2 = new Condition(T_I_MARASESTIEST, "P_INTER_1", TransitionCondition.CanAddCars);
		T_I_MARASESTIESTCt1.SetNextCondition(LogicConnector.AND, T_I_MARASESTIESTCt2);

		GuardMapping grdT_I_MARASESTIEST = new GuardMapping();
		grdT_I_MARASESTIEST.condition = T_I_MARASESTIESTCt1;
		grdT_I_MARASESTIEST.Activations.add(new Activation(T_I_MARASESTIEST, "P_B_MARASESTIEST", TransitionOperation.AddElement, "P_INTER_1"));
		T_I_MARASESTIEST.GuardMappingList.add(grdT_I_MARASESTIEST);

		T_I_MARASESTIEST.Delay = 2;
		pn.Transitions.add(T_I_MARASESTIEST);


		PetriTransition T_OUT_MARASESTIEST = new PetriTransition(pn);
		T_OUT_MARASESTIEST.TransitionName = "T_OUT_MARASESTIEST";
		T_OUT_MARASESTIEST.InputPlaceName.add("P_A_MARASESTIEST");
		T_OUT_MARASESTIEST.InputPlaceName.add("P_X_MARASESTIEST");
		T_OUT_MARASESTIEST.IsAsync = true;

		Condition T_OUT_MARASESTIESTCt1 = new Condition(T_OUT_MARASESTIEST, "P_A_MARASESTIEST", TransitionCondition.NotNull);
		Condition T_OUT_MARASESTIESTCt2 = new Condition(T_OUT_MARASESTIEST, "P_X_MARASESTIEST", TransitionCondition.CanNotAddCars);
		T_OUT_MARASESTIESTCt1.SetNextCondition(LogicConnector.AND, T_OUT_MARASESTIESTCt2);

		GuardMapping grdT_OUT_MARASESTIEST = new GuardMapping();
		grdT_OUT_MARASESTIEST.condition= T_OUT_MARASESTIESTCt1;
		grdT_OUT_MARASESTIEST.Activations.add(new Activation(T_OUT_MARASESTIEST, "full", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST"));
		T_OUT_MARASESTIEST.GuardMappingList.add(grdT_OUT_MARASESTIEST);

		T_OUT_MARASESTIEST.Delay = 0;
		pn.Transitions.add(T_OUT_MARASESTIEST);


		// INTPUT LANE MARASESTIVEST

		PetriTransition T_U_MARASESTIVEST = new PetriTransition(pn);
		T_U_MARASESTIVEST.TransitionName = "T_U_MARASESTIVEST";
		T_U_MARASESTIVEST.InputPlaceName.add("P_A_MARASESTIVEST");
		T_U_MARASESTIVEST.InputPlaceName.add("P_X_MARASESTIVEST");

		Condition T_U_MARASESTIVESTCt1 = new Condition(T_U_MARASESTIVEST, "P_A_MARASESTIVEST", TransitionCondition.NotNull);
		Condition T_U_MARASESTIVESTCt2 = new Condition(T_U_MARASESTIVEST, "P_X_MARASESTIVEST", TransitionCondition.CanAddCars);
		T_U_MARASESTIVESTCt1.SetNextCondition(LogicConnector.AND, T_U_MARASESTIVESTCt2);

		GuardMapping grdT_U_MARASESTIVEST = new GuardMapping();
		grdT_U_MARASESTIVEST.condition = T_U_MARASESTIVESTCt1;
		grdT_U_MARASESTIVEST.Activations.add(new Activation(T_U_MARASESTIVEST, "P_A_MARASESTIVEST", TransitionOperation.AddElement, "P_X_MARASESTIVEST"));
		T_U_MARASESTIVEST.GuardMappingList.add(grdT_U_MARASESTIVEST);

		T_U_MARASESTIVEST.Delay = 2;
		pn.Transitions.add(T_U_MARASESTIVEST);




		PetriTransition T_E_MARASESTIVEST = new PetriTransition(pn);
		T_E_MARASESTIVEST.TransitionName = "T_E_MARASESTIVEST";
		T_E_MARASESTIVEST.InputPlaceName.add("P_X_MARASESTIVEST");
		T_E_MARASESTIVEST.InputPlaceName.add("P_MARASESTIVEST_TL");

		Condition T_E_MARASESTIVESTCt1 = new Condition(T_E_MARASESTIVEST, "P_MARASESTIVEST_TL", TransitionCondition.Equal,"green");
		Condition T_E_MARASESTIVESTCt2 = new Condition(T_E_MARASESTIVEST, "P_X_MARASESTIVEST", TransitionCondition.HaveCar);
		T_E_MARASESTIVESTCt1.SetNextCondition(LogicConnector.AND, T_E_MARASESTIVESTCt2);

		GuardMapping grdT_E_MARASESTIVEST = new GuardMapping();
		grdT_E_MARASESTIVEST.condition= T_E_MARASESTIVESTCt1;
		grdT_E_MARASESTIVEST.Activations.add(new Activation(T_E_MARASESTIVEST, "P_X_MARASESTIVEST", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIVEST"));
		grdT_E_MARASESTIVEST.Activations.add(new Activation(T_E_MARASESTIVEST, "P_MARASESTIVEST_TL", TransitionOperation.Move, "P_MARASESTIVEST_TL"));
		T_E_MARASESTIVEST.GuardMappingList.add(grdT_E_MARASESTIVEST);

		Condition T_E_MARASESTIVEST1Ct1 = new Condition(T_E_MARASESTIVEST, "P_X_MARASESTIVEST", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_E_MARASESTIVEST1 = new GuardMapping();
		grdT_E_MARASESTIVEST1.condition = T_E_MARASESTIVEST1Ct1;
		grdT_E_MARASESTIVEST1.Activations.add(new Activation(T_E_MARASESTIVEST, "P_X_MARASESTIVEST", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIVEST"));
		grdT_E_MARASESTIVEST1.Activations.add(new Activation(T_E_MARASESTIVEST, "P_MARASESTIVEST_TL", TransitionOperation.Move, "P_MARASESTIVEST_TL"));
		T_E_MARASESTIVEST.GuardMappingList.add(grdT_E_MARASESTIVEST1);

		T_E_MARASESTIVEST.Delay = 2;
		pn.Transitions.add(T_E_MARASESTIVEST);




		PetriTransition T_O_MARASESTIVEST = new PetriTransition(pn);
		T_O_MARASESTIVEST.TransitionName = "T_O_MARASESTIVEST";
		T_O_MARASESTIVEST.InputPlaceName.add("P_INTER_1");
		T_O_MARASESTIVEST.InputPlaceName.add("P_O_MARASESTIVEST");

		Condition T_O_MARASESTIVESTCt1 = new Condition(T_O_MARASESTIVEST, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_MARASESTIVESTCt2 = new Condition(T_O_MARASESTIVEST, "P_O_MARASESTIVEST", TransitionCondition.CanAddCars);
		T_O_MARASESTIVESTCt1.SetNextCondition(LogicConnector.AND, T_O_MARASESTIVESTCt2);

		GuardMapping grdT_O_MARASESTIVEST = new GuardMapping();
		grdT_O_MARASESTIVEST.condition = T_O_MARASESTIVESTCt1;
		grdT_O_MARASESTIVEST.Activations.add(new Activation(T_O_MARASESTIVEST, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_MARASESTIVEST"));
		T_O_MARASESTIVEST.GuardMappingList.add(grdT_O_MARASESTIVEST);

		T_O_MARASESTIVEST.Delay = 1;
		pn.Transitions.add(T_O_MARASESTIVEST);




		PetriTransition T_OE_MARASESTIVEST = new PetriTransition(pn);

		T_OE_MARASESTIVEST.TransitionName = "T_OE_MARASESTIVEST";
		T_OE_MARASESTIVEST.InputPlaceName.add("P_O_MARASESTIVEST");
		Condition T_OE_MARASESTIVESTCt1 = new Condition(T_OE_MARASESTIVEST, "P_O_MARASESTIVEST", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_MARASESTIVEST = new GuardMapping();
		grdT_OE_MARASESTIVEST.condition = T_OE_MARASESTIVESTCt1;
		grdT_OE_MARASESTIVEST.Activations.add(new Activation(T_OE_MARASESTIVEST, "P_O_MARASESTIVEST", TransitionOperation.PopElementWithoutTarget, "P_OE_MARASESTIVEST"));

		T_OE_MARASESTIVEST.GuardMappingList.add(grdT_OE_MARASESTIVEST);
		T_OE_MARASESTIVEST.Delay = 2;

		pn.Transitions.add(T_OE_MARASESTIVEST);


		PetriTransition T_OUT_MARASESTIVEST = new PetriTransition(pn);
		T_OUT_MARASESTIVEST.TransitionName = "T_OUT_MARASESTIVEST";
		T_OUT_MARASESTIVEST.InputPlaceName.add("P_A_MARASESTIVEST");
		T_OUT_MARASESTIVEST.InputPlaceName.add("P_X_MARASESTIVEST");
		T_OUT_MARASESTIVEST.IsAsync = true;

		Condition T_OUT_MARASESTIVESTCt1 = new Condition(T_OUT_MARASESTIVEST, "P_A_MARASESTIVEST", TransitionCondition.NotNull);
		Condition T_OUT_MARASESTIVESTCt2 = new Condition(T_OUT_MARASESTIVEST, "P_X_MARASESTIVEST", TransitionCondition.CanNotAddCars);
		T_OUT_MARASESTIVESTCt1.SetNextCondition(LogicConnector.AND, T_OUT_MARASESTIVESTCt2);

		GuardMapping grdT_OUT_MARASESTIVEST = new GuardMapping();
		grdT_OUT_MARASESTIVEST.condition= T_OUT_MARASESTIVESTCt1;
		grdT_OUT_MARASESTIVEST.Activations.add(new Activation(T_OUT_MARASESTIVEST, "full", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST"));
		T_OUT_MARASESTIVEST.GuardMappingList.add(grdT_OUT_MARASESTIVEST);

		T_OUT_MARASESTIVEST.Delay = 0;
		pn.Transitions.add(T_OUT_MARASESTIVEST);

		// INPUT LANE MARASESTIEST_BUS

		PetriTransition T_U_MARASESTIEST_BUS = new PetriTransition(pn);
		T_U_MARASESTIEST_BUS.TransitionName = "T_U_MARASESTIEST_BUS";
		T_U_MARASESTIEST_BUS.InputPlaceName.add("P_A_MARASESTIEST_BUS");
		T_U_MARASESTIEST_BUS.InputPlaceName.add("P_X1_MARASESTIEST_BUS");

		Condition T_U_MARASESTIEST_BUSCt1 = new Condition(T_U_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionCondition.NotNull);
		Condition T_U_MARASESTIEST_BUSCt2 = new Condition(T_U_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		Condition T_U_MARASESTIEST_BUSCt3 = new Condition(T_U_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionCondition.IsBus);
		T_U_MARASESTIEST_BUSCt2.SetNextCondition(LogicConnector.AND, T_U_MARASESTIEST_BUSCt3);
		T_U_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_U_MARASESTIEST_BUSCt2);

		GuardMapping grdT_U_MARASESTIEST_BUS = new GuardMapping();
		grdT_U_MARASESTIEST_BUS.condition= T_U_MARASESTIEST_BUSCt1;
		grdT_U_MARASESTIEST_BUS.Activations.add(new Activation(T_U_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionOperation.AddElement, "P_X1_MARASESTIEST_BUS"));

		Condition T_U_MARASESTIEST_BUS1Ct1 = new Condition(T_U_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionCondition.NotNull);
		Condition T_U_MARASESTIEST_BUS1Ct2 = new Condition(T_U_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		Condition T_U_MARASESTIEST_BUS1Ct3 = new Condition(T_U_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionCondition.IsPriorityCar);
		T_U_MARASESTIEST_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_U_MARASESTIEST_BUS1Ct3);
		T_U_MARASESTIEST_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_U_MARASESTIEST_BUS1Ct2);

		GuardMapping grdT_U_MARASESTIEST_BUS1 = new GuardMapping();
		grdT_U_MARASESTIEST_BUS1.condition= T_U_MARASESTIEST_BUS1Ct1;
		grdT_U_MARASESTIEST_BUS1.Activations.add(new Activation(T_U_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionOperation.AddElement, "P_X1_MARASESTIEST_BUS"));

		T_U_MARASESTIEST_BUS.GuardMappingList.add(grdT_U_MARASESTIEST_BUS);
		T_U_MARASESTIEST_BUS.GuardMappingList.add(grdT_U_MARASESTIEST_BUS1);

		T_U_MARASESTIEST_BUS.Delay = 2;
		pn.Transitions.add(T_U_MARASESTIEST_BUS);


		PetriTransition T_E_MARASESTIEST_BUS = new PetriTransition(pn);
		T_E_MARASESTIEST_BUS.TransitionName = "T_E_MARASESTIEST_BUS";
		T_E_MARASESTIEST_BUS.InputPlaceName.add("P_X3_MARASESTIEST_BUS");
		T_E_MARASESTIEST_BUS.InputPlaceName.add("P_MARASESTIEST_BUS_TL");

		Condition T_E_MARASESTIEST_BUSCt1 = new Condition(T_E_MARASESTIEST_BUS, "P_MARASESTIEST_BUS_TL", TransitionCondition.Equal,"green");
		Condition T_E_MARASESTIEST_BUSCt2 = new Condition(T_E_MARASESTIEST_BUS, "P_X3_MARASESTIEST_BUS", TransitionCondition.HaveCar);
		T_E_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_E_MARASESTIEST_BUSCt2);

		GuardMapping grdT_E_MARASESTIEST_BUS = new GuardMapping();
		grdT_E_MARASESTIEST_BUS.condition= T_E_MARASESTIEST_BUSCt1;
		grdT_E_MARASESTIEST_BUS.Activations.add(new Activation(T_E_MARASESTIEST_BUS, "P_X3_MARASESTIEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIEST_BUS"));
		grdT_E_MARASESTIEST_BUS.Activations.add(new Activation(T_E_MARASESTIEST_BUS, "P_MARASESTIEST_BUS_TL", TransitionOperation.Move, "P_MARASESTIEST_BUS_TL"));
		T_E_MARASESTIEST_BUS.GuardMappingList.add(grdT_E_MARASESTIEST_BUS);

		Condition T_E_MARASESTIEST_BUS1Ct1 = new Condition(T_E_MARASESTIEST_BUS, "P_X3_MARASESTIEST_BUS", TransitionCondition.HavePriorityCar);

		GuardMapping grdT_E_MARASESTIEST_BUS1 = new GuardMapping();
		grdT_E_MARASESTIEST_BUS1.condition = T_E_MARASESTIEST_BUS1Ct1;
		grdT_E_MARASESTIEST_BUS1.Activations.add(new Activation(T_E_MARASESTIEST_BUS, "P_X3_MARASESTIEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIEST_BUS"));
		grdT_E_MARASESTIEST_BUS1.Activations.add(new Activation(T_E_MARASESTIEST_BUS, "P_MARASESTIEST_BUS_TL", TransitionOperation.Move, "P_MARASESTIEST_BUS_TL"));
		T_E_MARASESTIEST_BUS.GuardMappingList.add(grdT_E_MARASESTIEST_BUS1);

		T_E_MARASESTIEST_BUS.Delay = 1;
		pn.Transitions.add(T_E_MARASESTIEST_BUS);




		PetriTransition T_O_MARASESTIEST_BUS = new PetriTransition(pn);
		T_O_MARASESTIEST_BUS.TransitionName = "T_O_MARASESTIEST_BUS";
		T_O_MARASESTIEST_BUS.InputPlaceName.add("P_INTER_1");
		T_O_MARASESTIEST_BUS.InputPlaceName.add("P_O_MARASESTIEST_BUS");

		Condition T_O_MARASESTIEST_BUSCt1 = new Condition(T_O_MARASESTIEST_BUS, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_MARASESTIEST_BUSCt2 = new Condition(T_O_MARASESTIEST_BUS, "P_O_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		Condition T_O_MARASESTIEST_BUSCt3 = new Condition(T_O_MARASESTIEST_BUS, "P_INTER_1", TransitionCondition.HaveBus);
		T_O_MARASESTIEST_BUSCt2.SetNextCondition(LogicConnector.AND, T_O_MARASESTIEST_BUSCt3);
		T_O_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_O_MARASESTIEST_BUSCt2);

		GuardMapping grdT_O_MARASESTIEST_BUS = new GuardMapping();
		grdT_O_MARASESTIEST_BUS.condition = T_O_MARASESTIEST_BUSCt1;
		grdT_O_MARASESTIEST_BUS.Activations.add(new Activation(T_O_MARASESTIEST_BUS, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_MARASESTIEST_BUS"));
		T_O_MARASESTIEST_BUS.GuardMappingList.add(grdT_O_MARASESTIEST_BUS);


		Condition T_O_MARASESTIEST_BUS1Ct1 = new Condition(T_O_MARASESTIEST_BUS, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_MARASESTIEST_BUS1Ct2 = new Condition(T_O_MARASESTIEST_BUS, "P_O_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		Condition T_O_MARASESTIEST_BUS1Ct3 = new Condition(T_O_MARASESTIEST_BUS, "P_INTER_1", TransitionCondition.HavePriorityCar);
		T_O_MARASESTIEST_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_O_MARASESTIEST_BUS1Ct3);
		T_O_MARASESTIEST_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_O_MARASESTIEST_BUS1Ct2);

		GuardMapping grdT_O_MARASESTIEST_BUS1 = new GuardMapping();
		grdT_O_MARASESTIEST_BUS1.condition = T_O_MARASESTIEST_BUS1Ct1;
		grdT_O_MARASESTIEST_BUS1.Activations.add(new Activation(T_O_MARASESTIEST_BUS, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_MARASESTIEST_BUS"));
		T_O_MARASESTIEST_BUS.GuardMappingList.add(grdT_O_MARASESTIEST_BUS1);


		T_O_MARASESTIEST_BUS.Delay = 1;
		pn.Transitions.add(T_O_MARASESTIEST_BUS);


		PetriTransition T_OE_MARASESTIEST_BUS = new PetriTransition(pn);

		T_OE_MARASESTIEST_BUS.TransitionName = "T_OE_MARASESTIEST_BUS";
		T_OE_MARASESTIEST_BUS.InputPlaceName.add("P_O_MARASESTIEST_BUS");
		Condition T_OE_MARASESTIEST_BUSCt1 = new Condition(T_OE_MARASESTIEST_BUS, "P_O_MARASESTIEST_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_MARASESTIEST_BUS = new GuardMapping();
		grdT_OE_MARASESTIEST_BUS.condition = T_OE_MARASESTIEST_BUSCt1;
		grdT_OE_MARASESTIEST_BUS.Activations.add(new Activation(T_OE_MARASESTIEST_BUS, "P_O_MARASESTIEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_OE_MARASESTIEST_BUS"));

		T_OE_MARASESTIEST_BUS.GuardMappingList.add(grdT_OE_MARASESTIEST_BUS);
		T_OE_MARASESTIEST_BUS.Delay = 2;

		pn.Transitions.add(T_OE_MARASESTIEST_BUS);

		PetriTransition T_I_MARASESTIEST_BUS = new PetriTransition(pn);
		T_I_MARASESTIEST_BUS.TransitionName = "T_I_MARASESTIEST_BUS";
		T_I_MARASESTIEST_BUS.InputPlaceName.add("P_B_MARASESTIEST_BUS");
		T_I_MARASESTIEST_BUS.InputPlaceName.add("P_INTER_1");

		Condition T_I_MARASESTIEST_BUSCt1 = new Condition(T_I_MARASESTIEST_BUS, "P_B_MARASESTIEST_BUS", TransitionCondition.NotNull);
		Condition T_I_MARASESTIEST_BUSCt2 = new Condition(T_I_MARASESTIEST_BUS, "P_INTER_1", TransitionCondition.CanAddCars);
		T_I_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_I_MARASESTIEST_BUSCt2);

		GuardMapping grdT_I_MARASESTIEST_BUS = new GuardMapping();
		grdT_I_MARASESTIEST_BUS.condition = T_I_MARASESTIEST_BUSCt1;
		grdT_I_MARASESTIEST_BUS.Activations.add(new Activation(T_I_MARASESTIEST_BUS, "P_B_MARASESTIEST_BUS", TransitionOperation.AddElement, "P_INTER_1"));
		T_I_MARASESTIEST_BUS.GuardMappingList.add(grdT_I_MARASESTIEST_BUS);

		T_I_MARASESTIEST_BUS.Delay = 2;
		pn.Transitions.add(T_I_MARASESTIEST_BUS);



		PetriTransition T_OUT_MARASESTIEST_BUS = new PetriTransition(pn);
		T_OUT_MARASESTIEST_BUS.TransitionName = "T_OUT_MARASESTIEST_BUS";
		T_OUT_MARASESTIEST_BUS.InputPlaceName.add("P_A_MARASESTIEST_BUS");
		T_OUT_MARASESTIEST_BUS.InputPlaceName.add("P_X_MARASESTIEST_BUS");
		T_OUT_MARASESTIEST_BUS.IsAsync = true;

		Condition T_OUT_MARASESTIEST_BUSCt1 = new Condition(T_OUT_MARASESTIEST_BUS, "P_A_MARASESTIEST_BUS", TransitionCondition.NotNull);
		Condition T_OUT_MARASESTIEST_BUSCt2 = new Condition(T_OUT_MARASESTIEST_BUS, "P_X_MARASESTIEST_BUS", TransitionCondition.CanNotAddCars);
		T_OUT_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_OUT_MARASESTIEST_BUSCt2);

		GuardMapping grdT_OUT_MARASESTIEST_BUS = new GuardMapping();
		grdT_OUT_MARASESTIEST_BUS.condition= T_OUT_MARASESTIEST_BUSCt1;
		grdT_OUT_MARASESTIEST_BUS.Activations.add(new Activation(T_OUT_MARASESTIEST_BUS, "full", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST_BUS"));
		T_OUT_MARASESTIEST_BUS.GuardMappingList.add(grdT_OUT_MARASESTIEST_BUS);

		T_OUT_MARASESTIEST_BUS.Delay = 0;
		pn.Transitions.add(T_OUT_MARASESTIEST_BUS);



		PetriTransition T_C_MARASESTIEST_BUS = new PetriTransition(pn);
		T_C_MARASESTIEST_BUS.TransitionName = "T_C_MARASESTIEST_BUS";
		T_C_MARASESTIEST_BUS.InputPlaceName.add("P_X1_MARASESTIEST_BUS");
		T_C_MARASESTIEST_BUS.InputPlaceName.add("P_X2_MARASESTIEST_BUS");

		Condition T_C_MARASESTIEST_BUSCt1 = new Condition(T_C_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionCondition.HaveCarForMe);
		Condition T_C_MARASESTIEST_BUSCt2 = new Condition(T_C_MARASESTIEST_BUS, "P_X2_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		T_C_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_C_MARASESTIEST_BUSCt2);

		GuardMapping grdT_C_MARASESTIEST_BUS = new GuardMapping();

		grdT_C_MARASESTIEST_BUS.condition = T_C_MARASESTIEST_BUSCt1;
		grdT_C_MARASESTIEST_BUS.Activations.add(new Activation(T_C_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionOperation.PopElementWithTargetToQueue, "P_X2_MARASESTIEST_BUS"));

		T_C_MARASESTIEST_BUS.GuardMappingList.add(grdT_C_MARASESTIEST_BUS);

		T_C_MARASESTIEST_BUS.Delay = 2;
		pn.Transitions.add(T_C_MARASESTIEST_BUS);

		PetriTransition T_S_MARASESTIEST_BUS = new PetriTransition(pn);
		T_S_MARASESTIEST_BUS.TransitionName = "T_S_MARASESTIEST_BUS";
		T_S_MARASESTIEST_BUS.InputPlaceName.add("P_X1_MARASESTIEST_BUS");

		Condition T_S_MARASESTIEST_BUSCt1 = new Condition(T_S_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionCondition.HaveCarForMe);
		Condition T_S_MARASESTIEST_BUSCt2 = new Condition(T_S_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionCondition.HaveBus);
		T_S_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_S_MARASESTIEST_BUSCt2);

		GuardMapping grdT_S_MARASESTIEST_BUS = new GuardMapping();
		grdT_S_MARASESTIEST_BUS.condition = T_S_MARASESTIEST_BUSCt1;
		grdT_S_MARASESTIEST_BUS.Activations.add(new Activation(T_S_MARASESTIEST_BUS, "P_X1_MARASESTIEST_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_STATION_MARASESTIEST_BUS"));
		T_S_MARASESTIEST_BUS.GuardMappingList.add(grdT_S_MARASESTIEST_BUS);

		T_S_MARASESTIEST_BUS.Delay = 2;
		pn.Transitions.add(T_S_MARASESTIEST_BUS);



		PetriTransition T_ES_MARASESTIEST_BUS = new PetriTransition(pn);
		T_ES_MARASESTIEST_BUS.TransitionName = "T_ES_MARASESTIEST_BUS";
		T_ES_MARASESTIEST_BUS.InputPlaceName.add("P_STATION_MARASESTIEST_BUS");
		T_ES_MARASESTIEST_BUS.InputPlaceName.add("P_X2_MARASESTIEST_BUS");

		Condition T_ES_MARASESTIEST_BUSCt1 = new Condition(T_ES_MARASESTIEST_BUS, "P_STATION_MARASESTIEST_BUS", TransitionCondition.HaveCar);
		Condition T_ES_MARASESTIEST_BUSCt2 = new Condition(T_ES_MARASESTIEST_BUS, "P_X2_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		T_ES_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_ES_MARASESTIEST_BUSCt2);

		GuardMapping grdT_ES_MARASESTIEST_BUS = new GuardMapping();
		grdT_ES_MARASESTIEST_BUS.condition = T_ES_MARASESTIEST_BUSCt1;
		grdT_ES_MARASESTIEST_BUS.Activations.add(new Activation(T_ES_MARASESTIEST_BUS, "P_STATION_MARASESTIEST_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_X2_MARASESTIEST_BUS"));

		T_ES_MARASESTIEST_BUS.GuardMappingList.add(grdT_ES_MARASESTIEST_BUS);

		T_ES_MARASESTIEST_BUS.Delay = 2;
		pn.Transitions.add(T_ES_MARASESTIEST_BUS);


		PetriTransition T_U1_MARASESTIEST_BUS = new PetriTransition(pn);

		T_U1_MARASESTIEST_BUS.TransitionName = "T_U1_MARASESTIEST_BUS";
		T_U1_MARASESTIEST_BUS.InputPlaceName.add("P_X2_MARASESTIEST_BUS");
		Condition T_U1_MARASESTIEST_BUSCt1 = new Condition(T_U1_MARASESTIEST_BUS, "P_X2_MARASESTIEST_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_U1_MARASESTIEST_BUS = new GuardMapping();
		grdT_U1_MARASESTIEST_BUS.condition = T_U1_MARASESTIEST_BUSCt1;
		grdT_U1_MARASESTIEST_BUS.Activations.add(new Activation(T_U1_MARASESTIEST_BUS, "P_X2_MARASESTIEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_A1_MARASESTIEST_BUS"));

		T_U1_MARASESTIEST_BUS.GuardMappingList.add(grdT_U1_MARASESTIEST_BUS);
		T_U1_MARASESTIEST_BUS.Delay = 2;

		pn.Transitions.add(T_U1_MARASESTIEST_BUS);


		PetriTransition T_U2_MARASESTIEST_BUS = new PetriTransition(pn);
		T_U2_MARASESTIEST_BUS.TransitionName = "T_U2_MARASESTIEST_BUS";
		T_U2_MARASESTIEST_BUS.InputPlaceName.add("P_A1_MARASESTIEST_BUS");
		T_U2_MARASESTIEST_BUS.InputPlaceName.add("P_X3_MARASESTIEST_BUS");

		Condition T_U2_MARASESTIEST_BUSCt1 = new Condition(T_U2_MARASESTIEST_BUS, "P_A1_MARASESTIEST_BUS", TransitionCondition.NotNull);
		Condition T_U2_MARASESTIEST_BUSCt2 = new Condition(T_U2_MARASESTIEST_BUS, "P_X3_MARASESTIEST_BUS", TransitionCondition.CanAddCars);
		T_U2_MARASESTIEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_U2_MARASESTIEST_BUSCt2);

		GuardMapping grdT_U2_MARASESTIEST_BUS = new GuardMapping();
		grdT_U2_MARASESTIEST_BUS.condition = T_U2_MARASESTIEST_BUSCt1;
		grdT_U2_MARASESTIEST_BUS.Activations.add(new Activation(T_U2_MARASESTIEST_BUS, "P_A1_MARASESTIEST_BUS", TransitionOperation.AddElement, "P_X3_MARASESTIEST_BUS"));
		T_U2_MARASESTIEST_BUS.GuardMappingList.add(grdT_U2_MARASESTIEST_BUS);

		T_U2_MARASESTIEST_BUS.Delay = 2;
		pn.Transitions.add(T_U2_MARASESTIEST_BUS);




		// INPUT LANE MARASESTIVEST_BUS

		PetriTransition T_U_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_U_MARASESTIVEST_BUS.TransitionName = "T_U_MARASESTIVEST_BUS";
		T_U_MARASESTIVEST_BUS.InputPlaceName.add("P_A_MARASESTIVEST_BUS");
		T_U_MARASESTIVEST_BUS.InputPlaceName.add("P_X1_MARASESTIVEST_BUS");

		Condition T_U_MARASESTIVEST_BUSCt1 = new Condition(T_U_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionCondition.NotNull);
		Condition T_U_MARASESTIVEST_BUSCt2 = new Condition(T_U_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		Condition T_U_MARASESTIVEST_BUSCt3 = new Condition(T_U_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionCondition.IsBus);
		T_U_MARASESTIVEST_BUSCt2.SetNextCondition(LogicConnector.AND, T_U_MARASESTIVEST_BUSCt3);
		T_U_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_U_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_U_MARASESTIVEST_BUS = new GuardMapping();
		grdT_U_MARASESTIVEST_BUS.condition= T_U_MARASESTIVEST_BUSCt1;
		grdT_U_MARASESTIVEST_BUS.Activations.add(new Activation(T_U_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionOperation.AddElement, "P_X1_MARASESTIVEST_BUS"));

		Condition T_U_MARASESTIVEST_BUS1Ct1 = new Condition(T_U_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionCondition.NotNull);
		Condition T_U_MARASESTIVEST_BUS1Ct2 = new Condition(T_U_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		Condition T_U_MARASESTIVEST_BUS1Ct3 = new Condition(T_U_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionCondition.IsPriorityCar);
		T_U_MARASESTIVEST_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_U_MARASESTIVEST_BUS1Ct3);
		T_U_MARASESTIVEST_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_U_MARASESTIVEST_BUS1Ct2);

		GuardMapping grdT_U_MARASESTIVEST_BUS1 = new GuardMapping();
		grdT_U_MARASESTIVEST_BUS1.condition= T_U_MARASESTIVEST_BUS1Ct1;
		grdT_U_MARASESTIVEST_BUS1.Activations.add(new Activation(T_U_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionOperation.AddElement, "P_X1_MARASESTIVEST_BUS"));


		T_U_MARASESTIVEST_BUS.GuardMappingList.add(grdT_U_MARASESTIVEST_BUS);
		T_U_MARASESTIVEST_BUS.GuardMappingList.add(grdT_U_MARASESTIVEST_BUS1);

		T_U_MARASESTIVEST_BUS.Delay = 2;
		pn.Transitions.add(T_U_MARASESTIVEST_BUS);



		PetriTransition T_E_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_E_MARASESTIVEST_BUS.TransitionName = "T_E_MARASESTIVEST_BUS";
		T_E_MARASESTIVEST_BUS.InputPlaceName.add("P_X3_MARASESTIVEST_BUS");
		T_E_MARASESTIVEST_BUS.InputPlaceName.add("P_MARASESTIVEST_BUS_TL");

		Condition T_E_MARASESTIVEST_BUSCt1 = new Condition(T_E_MARASESTIVEST_BUS, "P_MARASESTIVEST_BUS_TL", TransitionCondition.Equal,"green");
		Condition T_E_MARASESTIVEST_BUSCt2 = new Condition(T_E_MARASESTIVEST_BUS, "P_X3_MARASESTIVEST_BUS", TransitionCondition.HaveCar);
		T_E_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_E_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_E_MARASESTIVEST_BUS = new GuardMapping();
		grdT_E_MARASESTIVEST_BUS.condition= T_E_MARASESTIVEST_BUSCt1;
		grdT_E_MARASESTIVEST_BUS.Activations.add(new Activation(T_E_MARASESTIVEST_BUS, "P_X3_MARASESTIVEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIVEST_BUS"));
		grdT_E_MARASESTIVEST_BUS.Activations.add(new Activation(T_E_MARASESTIVEST_BUS, "P_MARASESTIVEST_BUS_TL", TransitionOperation.Move, "P_MARASESTIVEST_BUS_TL"));
		T_E_MARASESTIVEST_BUS.GuardMappingList.add(grdT_E_MARASESTIVEST_BUS);

		Condition T_E_MARASESTIVEST_BUS1Ct1 = new Condition(T_E_MARASESTIVEST_BUS, "P_X3_MARASESTIVEST_BUS", TransitionCondition.HavePriorityCar);

		GuardMapping grdT_E_MARASESTIVEST_BUS1 = new GuardMapping();
		grdT_E_MARASESTIVEST_BUS1.condition = T_E_MARASESTIVEST_BUS1Ct1;
		grdT_E_MARASESTIVEST_BUS1.Activations.add(new Activation(T_E_MARASESTIVEST_BUS, "P_X3_MARASESTIVEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_B_MARASESTIVEST_BUS"));
		grdT_E_MARASESTIVEST_BUS1.Activations.add(new Activation(T_E_MARASESTIVEST_BUS, "P_MARASESTIVEST_BUS_TL", TransitionOperation.Move, "P_MARASESTIVEST_BUS_TL"));
		T_E_MARASESTIVEST_BUS.GuardMappingList.add(grdT_E_MARASESTIVEST_BUS1);

		T_E_MARASESTIVEST_BUS.Delay = 1;
		pn.Transitions.add(T_E_MARASESTIVEST_BUS);



		PetriTransition T_O_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_O_MARASESTIVEST_BUS.TransitionName = "T_O_MARASESTIVEST_BUS";
		T_O_MARASESTIVEST_BUS.InputPlaceName.add("P_INTER_1");
		T_O_MARASESTIVEST_BUS.InputPlaceName.add("P_O_MARASESTIVEST_BUS");

		Condition T_O_MARASESTIVEST_BUSCt1 = new Condition(T_O_MARASESTIVEST_BUS, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_MARASESTIVEST_BUSCt2 = new Condition(T_O_MARASESTIVEST_BUS, "P_O_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		Condition T_O_MARASESTIVEST_BUSCt3 = new Condition(T_O_MARASESTIVEST_BUS, "P_INTER_1", TransitionCondition.HaveBus);
		T_O_MARASESTIVEST_BUSCt2.SetNextCondition(LogicConnector.AND, T_O_MARASESTIVEST_BUSCt3);
		T_O_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_O_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_O_MARASESTIVEST_BUS = new GuardMapping();
		grdT_O_MARASESTIVEST_BUS.condition = T_O_MARASESTIVEST_BUSCt1;
		grdT_O_MARASESTIVEST_BUS.Activations.add(new Activation(T_O_MARASESTIVEST_BUS, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_MARASESTIVEST_BUS"));
		T_O_MARASESTIVEST_BUS.GuardMappingList.add(grdT_O_MARASESTIVEST_BUS);


		Condition T_O_MARASESTIVEST_BUS1Ct1 = new Condition(T_O_MARASESTIVEST_BUS, "P_INTER_1", TransitionCondition.HaveCarForMe);
		Condition T_O_MARASESTIVEST_BUS1Ct2 = new Condition(T_O_MARASESTIVEST_BUS, "P_O_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		Condition T_O_MARASESTIVEST_BUS1Ct3 = new Condition(T_O_MARASESTIVEST_BUS, "P_INTER_1", TransitionCondition.HavePriorityCar);
		T_O_MARASESTIVEST_BUS1Ct2.SetNextCondition(LogicConnector.AND, T_O_MARASESTIVEST_BUS1Ct3);
		T_O_MARASESTIVEST_BUS1Ct1.SetNextCondition(LogicConnector.AND, T_O_MARASESTIVEST_BUS1Ct2);

		GuardMapping grdT_O_MARASESTIVEST_BUS1 = new GuardMapping();
		grdT_O_MARASESTIVEST_BUS1.condition = T_O_MARASESTIVEST_BUS1Ct1;
		grdT_O_MARASESTIVEST_BUS1.Activations.add(new Activation(T_O_MARASESTIVEST_BUS, "P_INTER_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_MARASESTIVEST_BUS"));
		T_O_MARASESTIVEST_BUS.GuardMappingList.add(grdT_O_MARASESTIVEST_BUS1);


		T_O_MARASESTIVEST_BUS.Delay = 1;
		pn.Transitions.add(T_O_MARASESTIVEST_BUS);


		PetriTransition T_OE_MARASESTIVEST_BUS = new PetriTransition(pn);

		T_OE_MARASESTIVEST_BUS.TransitionName = "T_OE_MARASESTIVEST_BUS";
		T_OE_MARASESTIVEST_BUS.InputPlaceName.add("P_O_MARASESTIVEST_BUS");
		Condition T_OE_MARASESTIVEST_BUSCt1 = new Condition(T_OE_MARASESTIVEST_BUS, "P_O_MARASESTIVEST_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_OE_MARASESTIVEST_BUS = new GuardMapping();
		grdT_OE_MARASESTIVEST_BUS.condition = T_OE_MARASESTIVEST_BUSCt1;
		grdT_OE_MARASESTIVEST_BUS.Activations.add(new Activation(T_OE_MARASESTIVEST_BUS, "P_O_MARASESTIVEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_OE_MARASESTIVEST_BUS"));

		T_OE_MARASESTIVEST_BUS.GuardMappingList.add(grdT_OE_MARASESTIVEST_BUS);
		T_OE_MARASESTIVEST_BUS.Delay = 2;

		pn.Transitions.add(T_OE_MARASESTIVEST_BUS);

		PetriTransition T_I_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_I_MARASESTIVEST_BUS.TransitionName = "T_I_MARASESTIVEST_BUS";
		T_I_MARASESTIVEST_BUS.InputPlaceName.add("P_B_MARASESTIVEST_BUS");
		T_I_MARASESTIVEST_BUS.InputPlaceName.add("P_INTER_1");

		Condition T_I_MARASESTIVEST_BUSCt1 = new Condition(T_I_MARASESTIVEST_BUS, "P_B_MARASESTIVEST_BUS", TransitionCondition.NotNull);
		Condition T_I_MARASESTIVEST_BUSCt2 = new Condition(T_I_MARASESTIVEST_BUS, "P_INTER_1", TransitionCondition.CanAddCars);
		T_I_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_I_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_I_MARASESTIVEST_BUS = new GuardMapping();
		grdT_I_MARASESTIVEST_BUS.condition = T_I_MARASESTIVEST_BUSCt1;
		grdT_I_MARASESTIVEST_BUS.Activations.add(new Activation(T_I_MARASESTIVEST_BUS, "P_B_MARASESTIVEST_BUS", TransitionOperation.AddElement, "P_INTER_1"));
		T_I_MARASESTIVEST_BUS.GuardMappingList.add(grdT_I_MARASESTIVEST_BUS);

		T_I_MARASESTIVEST_BUS.Delay = 2;
		pn.Transitions.add(T_I_MARASESTIVEST_BUS);

		PetriTransition T_OUT_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_OUT_MARASESTIVEST_BUS.TransitionName = "T_OUT_MARASESTIVEST_BUS";
		T_OUT_MARASESTIVEST_BUS.InputPlaceName.add("P_A_MARASESTIVEST_BUS");
		T_OUT_MARASESTIVEST_BUS.InputPlaceName.add("P_X_MARASESTIVEST_BUS");
		T_OUT_MARASESTIVEST_BUS.IsAsync = true;

		Condition T_OUT_MARASESTIVEST_BUSCt1 = new Condition(T_OUT_MARASESTIVEST_BUS, "P_A_MARASESTIVEST_BUS", TransitionCondition.NotNull);
		Condition T_OUT_MARASESTIVEST_BUSCt2 = new Condition(T_OUT_MARASESTIVEST_BUS, "P_X_MARASESTIVEST_BUS", TransitionCondition.CanNotAddCars);
		T_OUT_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_OUT_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_OUT_MARASESTIVEST_BUS = new GuardMapping();
		grdT_OUT_MARASESTIVEST_BUS.condition= T_OUT_MARASESTIVEST_BUSCt1;
		grdT_OUT_MARASESTIVEST_BUS.Activations.add(new Activation(T_OUT_MARASESTIVEST_BUS, "full", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST_BUS"));
		T_OUT_MARASESTIVEST_BUS.GuardMappingList.add(grdT_OUT_MARASESTIVEST_BUS);

		T_OUT_MARASESTIVEST_BUS.Delay = 0;
		pn.Transitions.add(T_OUT_MARASESTIVEST_BUS);

		PetriTransition T_C_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_C_MARASESTIVEST_BUS.TransitionName = "T_C_MARASESTIVEST_BUS";
		T_C_MARASESTIVEST_BUS.InputPlaceName.add("P_X1_MARASESTIVEST_BUS");
		T_C_MARASESTIVEST_BUS.InputPlaceName.add("P_X2_MARASESTIVEST_BUS");

		Condition T_C_MARASESTIVEST_BUSCt1 = new Condition(T_C_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionCondition.HaveCarForMe);
		Condition T_C_MARASESTIVEST_BUSCt2 = new Condition(T_C_MARASESTIVEST_BUS, "P_X2_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		T_C_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_C_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_C_MARASESTIVEST_BUS = new GuardMapping();

		grdT_C_MARASESTIVEST_BUS.condition = T_C_MARASESTIVEST_BUSCt1;
		grdT_C_MARASESTIVEST_BUS.Activations.add(new Activation(T_C_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionOperation.PopElementWithTargetToQueue, "P_X2_MARASESTIVEST_BUS"));

		T_C_MARASESTIVEST_BUS.GuardMappingList.add(grdT_C_MARASESTIVEST_BUS);

		T_C_MARASESTIVEST_BUS.Delay = 2;
		pn.Transitions.add(T_C_MARASESTIVEST_BUS);


		PetriTransition T_S_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_S_MARASESTIVEST_BUS.TransitionName = "T_S_MARASESTIVEST_BUS";
		T_S_MARASESTIVEST_BUS.InputPlaceName.add("P_X1_MARASESTIVEST_BUS");

		Condition T_S_MARASESTIVEST_BUSCt1 = new Condition(T_S_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionCondition.HaveCarForMe);
		Condition T_S_MARASESTIVEST_BUSCt2 = new Condition(T_S_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionCondition.HaveBus);
		T_S_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_S_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_S_MARASESTIVEST_BUS = new GuardMapping();
		grdT_S_MARASESTIVEST_BUS.condition = T_S_MARASESTIVEST_BUSCt1;
		grdT_S_MARASESTIVEST_BUS.Activations.add(new Activation(T_S_MARASESTIVEST_BUS, "P_X1_MARASESTIVEST_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_STATION_MARASESTIVEST_BUS"));
		T_S_MARASESTIVEST_BUS.GuardMappingList.add(grdT_S_MARASESTIVEST_BUS);

		T_S_MARASESTIVEST_BUS.Delay = 2;
		pn.Transitions.add(T_S_MARASESTIVEST_BUS);




		PetriTransition T_ES_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_ES_MARASESTIVEST_BUS.TransitionName = "T_ES_MARASESTIVEST_BUS";
		T_ES_MARASESTIVEST_BUS.InputPlaceName.add("P_STATION_MARASESTIVEST_BUS");
		T_ES_MARASESTIVEST_BUS.InputPlaceName.add("P_X2_MARASESTIVEST_BUS");

		Condition T_ES_MARASESTIVEST_BUSCt1 = new Condition(T_ES_MARASESTIVEST_BUS, "P_STATION_MARASESTIVEST_BUS", TransitionCondition.HaveCar);
		Condition T_ES_MARASESTIVEST_BUSCt2 = new Condition(T_ES_MARASESTIVEST_BUS, "P_X2_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		T_ES_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_ES_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_ES_MARASESTIVEST_BUS = new GuardMapping();
		grdT_ES_MARASESTIVEST_BUS.condition = T_ES_MARASESTIVEST_BUSCt1;
		grdT_ES_MARASESTIVEST_BUS.Activations.add(new Activation(T_ES_MARASESTIVEST_BUS, "P_STATION_MARASESTIVEST_BUS", TransitionOperation.PopElementWithoutTargetToQueue, "P_X2_MARASESTIVEST_BUS"));

		T_ES_MARASESTIVEST_BUS.GuardMappingList.add(grdT_ES_MARASESTIVEST_BUS);

		T_ES_MARASESTIVEST_BUS.Delay = 2;
		pn.Transitions.add(T_ES_MARASESTIVEST_BUS);


		PetriTransition T_U1_MARASESTIVEST_BUS = new PetriTransition(pn);

		T_U1_MARASESTIVEST_BUS.TransitionName = "T_U1_MARASESTIVEST_BUS";
		T_U1_MARASESTIVEST_BUS.InputPlaceName.add("P_X2_MARASESTIVEST_BUS");
		Condition T_U1_MARASESTIVEST_BUSCt1 = new Condition(T_U1_MARASESTIVEST_BUS, "P_X2_MARASESTIVEST_BUS", TransitionCondition.HaveCar);

		GuardMapping grdT_U1_MARASESTIVEST_BUS = new GuardMapping();
		grdT_U1_MARASESTIVEST_BUS.condition = T_U1_MARASESTIVEST_BUSCt1;
		grdT_U1_MARASESTIVEST_BUS.Activations.add(new Activation(T_U1_MARASESTIVEST_BUS, "P_X2_MARASESTIVEST_BUS", TransitionOperation.PopElementWithoutTarget, "P_A1_MARASESTIVEST_BUS"));

		T_U1_MARASESTIVEST_BUS.GuardMappingList.add(grdT_U1_MARASESTIVEST_BUS);
		T_U1_MARASESTIVEST_BUS.Delay = 2;

		pn.Transitions.add(T_U1_MARASESTIVEST_BUS);


		PetriTransition T_U2_MARASESTIVEST_BUS = new PetriTransition(pn);
		T_U2_MARASESTIVEST_BUS.TransitionName = "T_U2_MARASESTIVEST_BUS";
		T_U2_MARASESTIVEST_BUS.InputPlaceName.add("P_A1_MARASESTIVEST_BUS");
		T_U2_MARASESTIVEST_BUS.InputPlaceName.add("P_X3_MARASESTIVEST_BUS");

		Condition T_U2_MARASESTIVEST_BUSCt1 = new Condition(T_U2_MARASESTIVEST_BUS, "P_A1_MARASESTIVEST_BUS", TransitionCondition.NotNull);
		Condition T_U2_MARASESTIVEST_BUSCt2 = new Condition(T_U2_MARASESTIVEST_BUS, "P_X3_MARASESTIVEST_BUS", TransitionCondition.CanAddCars);
		T_U2_MARASESTIVEST_BUSCt1.SetNextCondition(LogicConnector.AND, T_U2_MARASESTIVEST_BUSCt2);

		GuardMapping grdT_U2_MARASESTIVEST_BUS = new GuardMapping();
		grdT_U2_MARASESTIVEST_BUS.condition = T_U2_MARASESTIVEST_BUSCt1;
		grdT_U2_MARASESTIVEST_BUS.Activations.add(new Activation(T_U2_MARASESTIVEST_BUS, "P_A1_MARASESTIVEST_BUS", TransitionOperation.AddElement, "P_X3_MARASESTIVEST_BUS"));
		T_U2_MARASESTIVEST_BUS.GuardMappingList.add(grdT_U2_MARASESTIVEST_BUS);

		T_U2_MARASESTIVEST_BUS.Delay = 2;
		pn.Transitions.add(T_U2_MARASESTIVEST_BUS);

		
		
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
