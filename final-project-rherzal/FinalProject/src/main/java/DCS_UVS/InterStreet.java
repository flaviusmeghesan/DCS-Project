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

public class InterStreet {
	public static void main(String[] args) {
		
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "Main Petri";
		pn.NetworkPort = 1080;

		DataTransfer OP_REQ_CANTEMIR_1 = new DataTransfer();
		OP_REQ_CANTEMIR_1.SetName("OP_REQ_CANTEMIR_1");
		OP_REQ_CANTEMIR_1.Value = new TransferOperation("localhost", "1081" , "IN_REQ_CANTEMIR_1");
		pn.PlaceList.add(OP_REQ_CANTEMIR_1);

		DataTransfer OP_REQ_CANTEMIR_2 = new DataTransfer();
		OP_REQ_CANTEMIR_2.SetName("OP_REQ_CANTEMIR_2");
		OP_REQ_CANTEMIR_2.Value = new TransferOperation("localhost", "1081" , "IN_REQ_CANTEMIR_2");
		pn.PlaceList.add(OP_REQ_CANTEMIR_2);

		DataString USERREQ_TAXI_CANTEMIR_0 = new DataString();
		USERREQ_TAXI_CANTEMIR_0.SetName("USERREQ_TAXI_CANTEMIR_0");
		pn.PlaceList.add(USERREQ_TAXI_CANTEMIR_0);

		DataString USERREQ_TAXI_CANTEMIR_1 = new DataString();
		USERREQ_TAXI_CANTEMIR_1.SetName("USERREQ_TAXI_CANTEMIR_1");
		pn.PlaceList.add(USERREQ_TAXI_CANTEMIR_1);

		DataString USERREQ_CANTEMIR_0 = new DataString();
		USERREQ_CANTEMIR_0.SetName("USERREQ_CANTEMIR_0");
		pn.PlaceList.add(USERREQ_CANTEMIR_0);

		DataString USERREQ_CANTEMIR_1 = new DataString();
		USERREQ_CANTEMIR_1.SetName("USERREQ_CANTEMIR_1");
		pn.PlaceList.add(USERREQ_CANTEMIR_1);

		DataString P_CANTEMIR_PTL_1 = new DataString();
		P_CANTEMIR_PTL_1.SetName("P_CANTEMIR_PTL_1");
		P_CANTEMIR_PTL_1.SetValue("red");
		pn.PlaceList.add(P_CANTEMIR_PTL_1);

		DataString P_CANTEMIR_PTL_2 = new DataString();
		P_CANTEMIR_PTL_2.SetName("P_CANTEMIR_PTL_2");
		P_CANTEMIR_PTL_2.SetValue("red");
		pn.PlaceList.add(P_CANTEMIR_PTL_2);

		DataString P_CANTEMIR_TL_1 = new DataString();
		P_CANTEMIR_TL_1.SetName("P_CANTEMIR_TL_1");
		P_CANTEMIR_TL_1.SetValue("green");
		pn.PlaceList.add(P_CANTEMIR_TL_1);

		DataString P_CANTEMIR_TL_2 = new DataString();
		P_CANTEMIR_TL_2.SetName("P_CANTEMIR_TL_2");
		P_CANTEMIR_TL_2.SetValue("green");
		pn.PlaceList.add(P_CANTEMIR_TL_2);


		DataCar P_A_CANTEMIR = new DataCar();
		P_A_CANTEMIR.SetName("P_A_CANTEMIR");
		pn.PlaceList.add(P_A_CANTEMIR);

		DataCar P_A_CANTEMIRSUD = new DataCar();
		P_A_CANTEMIRSUD.SetName("P_A_CANTEMIRSUD");
		pn.PlaceList.add(P_A_CANTEMIRSUD);

		DataCar P_A_LANARIEI = new DataCar();
		P_A_LANARIEI.SetName("P_A_LANARIEI");
		pn.PlaceList.add(P_A_LANARIEI);

		DataCar P_A_PARKING = new DataCar();
		P_A_PARKING.SetName("P_A_PARKING");
		pn.PlaceList.add(P_A_PARKING);

		DataCar P_A_POTERASI = new DataCar();
		P_A_POTERASI.SetName("P_A_POTERASI");
		pn.PlaceList.add(P_A_POTERASI);

		DataCar P_A_RADULESCU = new DataCar();
		P_A_RADULESCU.SetName("P_A_RADULESCU");
		pn.PlaceList.add(P_A_RADULESCU);

		DataCar P_A00_CANTEMIR = new DataCar();
		P_A00_CANTEMIR.SetName("P_A00_CANTEMIR");
		pn.PlaceList.add(P_A00_CANTEMIR);

		DataCar P_A01_CANTEMIR = new DataCar();
		P_A01_CANTEMIR.SetName("P_A01_CANTEMIR");
		pn.PlaceList.add(P_A01_CANTEMIR);

		DataCar P_A02_CANTEMIR = new DataCar();
		P_A02_CANTEMIR.SetName("P_A02_CANTEMIR");
		pn.PlaceList.add(P_A02_CANTEMIR);

		DataCar P_A03_CANTEMIR = new DataCar();
		P_A03_CANTEMIR.SetName("P_A03_CANTEMIR");
		pn.PlaceList.add(P_A03_CANTEMIR);

		DataCar P_A04_CANTEMIR = new DataCar();
		P_A04_CANTEMIR.SetName("P_A04_CANTEMIR");
		pn.PlaceList.add(P_A04_CANTEMIR);

		DataCar P_A1_LANARIEI = new DataCar();
		P_A1_LANARIEI.SetName("P_A1_LANARIEI");
		pn.PlaceList.add(P_A1_LANARIEI);

		DataCar P_A1_POTERASI = new DataCar();
		P_A1_POTERASI.SetName("P_A1_POTERASI");
		pn.PlaceList.add(P_A1_POTERASI);

		DataCar P_A1_RADULESCU = new DataCar();
		P_A1_RADULESCU.SetName("P_A1_RADULESCU");
		pn.PlaceList.add(P_A1_RADULESCU);

		DataCar P_A10_CANTEMIR = new DataCar();
		P_A10_CANTEMIR.SetName("P_A10_CANTEMIR");
		pn.PlaceList.add(P_A10_CANTEMIR);

		DataCar P_A11_CANTEMIR = new DataCar();
		P_A11_CANTEMIR.SetName("P_A11_CANTEMIR");
		pn.PlaceList.add(P_A11_CANTEMIR);

		DataCar P_A12_CANTEMIR = new DataCar();
		P_A12_CANTEMIR.SetName("P_A12_CANTEMIR");
		pn.PlaceList.add(P_A12_CANTEMIR);

		DataCar P_A13_CANTEMIR = new DataCar();
		P_A13_CANTEMIR.SetName("P_A13_CANTEMIR");
		pn.PlaceList.add(P_A13_CANTEMIR);

		DataCar P_OE_CANTEMIR = new DataCar();
		P_OE_CANTEMIR.SetName("P_OE_CANTEMIR");
		pn.PlaceList.add(P_OE_CANTEMIR);

		DataCar P_OE_CANTEMIRSUD = new DataCar();
		P_OE_CANTEMIRSUD.SetName("P_OE_CANTEMIRSUD");
		pn.PlaceList.add(P_OE_CANTEMIRSUD);

		DataCar P_OE_PARKING = new DataCar();
		P_OE_PARKING.SetName("P_OE_PARKING");
		pn.PlaceList.add(P_OE_PARKING);

		DataCar P_OE_POTERASI = new DataCar();
		P_OE_POTERASI.SetName("P_OE_POTERASI");
		pn.PlaceList.add(P_OE_POTERASI);

		DataCar P_OE_RADULESCU = new DataCar();
		P_OE_RADULESCU.SetName("P_OE_RADULESCU");
		pn.PlaceList.add(P_OE_RADULESCU);


		DataCarQueue P_STATION0_CANTEMIR = new DataCarQueue();
		P_STATION0_CANTEMIR.Value.Size = 3;
		P_STATION0_CANTEMIR.SetName("P_STATION0_CANTEMIR");
		pn.PlaceList.add(P_STATION0_CANTEMIR);

		DataCarQueue P_STATION1_CANTEMIR = new DataCarQueue();
		P_STATION1_CANTEMIR.Value.Size = 3;
		P_STATION1_CANTEMIR.SetName("P_STATION1_CANTEMIR");
		pn.PlaceList.add(P_STATION1_CANTEMIR);

		DataCarQueue P_X00_CANTEMIR = new DataCarQueue();
		P_X00_CANTEMIR.Value.Size = 3;
		P_X00_CANTEMIR.SetName("P_X00_CANTEMIR");
		pn.PlaceList.add(P_X00_CANTEMIR);

		DataCarQueue P_X01_CANTEMIR = new DataCarQueue();
		P_X01_CANTEMIR.Value.Size = 3;
		P_X01_CANTEMIR.SetName("P_X01_CANTEMIR");
		pn.PlaceList.add(P_X01_CANTEMIR);

		DataCarQueue P_X02_CANTEMIR = new DataCarQueue();
		P_X02_CANTEMIR.Value.Size = 3;
		P_X02_CANTEMIR.SetName("P_X02_CANTEMIR");
		pn.PlaceList.add(P_X02_CANTEMIR);

		DataCarQueue P_X03_CANTEMIR = new DataCarQueue();
		P_X03_CANTEMIR.Value.Size = 3;
		P_X03_CANTEMIR.SetName("P_X03_CANTEMIR");
		pn.PlaceList.add(P_X03_CANTEMIR);

		DataCarQueue P_X04_CANTEMIR = new DataCarQueue();
		P_X04_CANTEMIR.Value.Size = 3;
		P_X04_CANTEMIR.SetName("P_X04_CANTEMIR");
		pn.PlaceList.add(P_X04_CANTEMIR);

		DataCarQueue P_X05_CANTEMIR = new DataCarQueue();
		P_X05_CANTEMIR.Value.Size = 3;
		P_X05_CANTEMIR.SetName("P_X05_CANTEMIR");
		pn.PlaceList.add(P_X05_CANTEMIR);

		DataCarQueue P_X06_CANTEMIR = new DataCarQueue();
		P_X06_CANTEMIR.Value.Size = 3;
		P_X06_CANTEMIR.SetName("P_X06_CANTEMIR");
		pn.PlaceList.add(P_X06_CANTEMIR);

		DataCarQueue P_X10_CANTEMIR = new DataCarQueue();
		P_X10_CANTEMIR.Value.Size = 3;
		P_X10_CANTEMIR.SetName("P_X10_CANTEMIR");
		pn.PlaceList.add(P_X10_CANTEMIR);

		DataCarQueue P_X11_CANTEMIR = new DataCarQueue();
		P_X11_CANTEMIR.Value.Size = 3;
		P_X11_CANTEMIR.SetName("P_X11_CANTEMIR");
		pn.PlaceList.add(P_X11_CANTEMIR);

		DataCarQueue P_X12_CANTEMIR = new DataCarQueue();
		P_X12_CANTEMIR.Value.Size = 3;
		P_X12_CANTEMIR.SetName("P_X12_CANTEMIR");
		pn.PlaceList.add(P_X12_CANTEMIR);

		DataCarQueue P_X13_CANTEMIR = new DataCarQueue();
		P_X13_CANTEMIR.Value.Size = 3;
		P_X13_CANTEMIR.SetName("P_X13_CANTEMIR");
		pn.PlaceList.add(P_X13_CANTEMIR);

		DataCarQueue P_X14_CANTEMIR = new DataCarQueue();
		P_X14_CANTEMIR.Value.Size = 3;
		P_X14_CANTEMIR.SetName("P_X14_CANTEMIR");
		pn.PlaceList.add(P_X14_CANTEMIR);

		DataCarQueue P_X15_CANTEMIR = new DataCarQueue();
		P_X15_CANTEMIR.Value.Size = 3;
		P_X15_CANTEMIR.SetName("P_X15_CANTEMIR");
		pn.PlaceList.add(P_X15_CANTEMIR);


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


		// BEGIN TRANSITIONS

		PetriTransition T_C0_CANTEMIR = new PetriTransition(pn);
		T_C0_CANTEMIR.TransitionName = "T_C0_CANTEMIR";
		T_C0_CANTEMIR.InputPlaceName.add("P_X01_CANTEMIR");
		T_C0_CANTEMIR.InputPlaceName.add("P_X02_CANTEMIR");

		Condition T_C0_CANTEMIRCt1 = new Condition(T_C0_CANTEMIR, "P_X01_CANTEMIR", TransitionCondition.HaveCarForMe);
		Condition T_C0_CANTEMIRCt2 = new Condition(T_C0_CANTEMIR, "P_X02_CANTEMIR", TransitionCondition.CanAddCars);
		T_C0_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_C0_CANTEMIRCt2);

		GuardMapping grdT_C0_CANTEMIR = new GuardMapping();

		grdT_C0_CANTEMIR.condition = T_C0_CANTEMIRCt1;
		grdT_C0_CANTEMIR.Activations.add(new Activation(T_C0_CANTEMIR, "P_X01_CANTEMIR", TransitionOperation.PopElementWithTargetToQueue, "P_X02_CANTEMIR"));

		T_C0_CANTEMIR.GuardMappingList.add(grdT_C0_CANTEMIR);

		T_C0_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_C0_CANTEMIR);

		PetriTransition T_C1_CANTEMIR = new PetriTransition(pn);
		T_C1_CANTEMIR.TransitionName = "T_C1_CANTEMIR";
		T_C1_CANTEMIR.InputPlaceName.add("P_X12_CANTEMIR");
		T_C1_CANTEMIR.InputPlaceName.add("P_X11_CANTEMIR");

		Condition T_C1_CANTEMIRCt1 = new Condition(T_C1_CANTEMIR, "P_X12_CANTEMIR", TransitionCondition.HaveCarForMe);
		Condition T_C1_CANTEMIRCt2 = new Condition(T_C1_CANTEMIR, "P_X11_CANTEMIR", TransitionCondition.CanAddCars);
		T_C1_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_C1_CANTEMIRCt2);

		GuardMapping grdT_C1_CANTEMIR = new GuardMapping();

		grdT_C1_CANTEMIR.condition = T_C1_CANTEMIRCt1;
		grdT_C1_CANTEMIR.Activations.add(new Activation(T_C1_CANTEMIR, "P_X12_CANTEMIR", TransitionOperation.PopElementWithTargetToQueue, "P_X11_CANTEMIR"));

		T_C1_CANTEMIR.GuardMappingList.add(grdT_C1_CANTEMIR);

		T_C1_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_C1_CANTEMIR);


		PetriTransition T_E00_CANTEMIR = new PetriTransition(pn);
		T_E00_CANTEMIR.TransitionName = "T_E00_CANTEMIR";
		T_E00_CANTEMIR.InputPlaceName.add("P_X00_CANTEMIR");

		Condition T_E00_CANTEMIRCt1 = new Condition(T_E00_CANTEMIR, "P_X00_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E00_CANTEMIR = new GuardMapping();
		grdT_E00_CANTEMIR.condition= T_E00_CANTEMIRCt1;
		grdT_E00_CANTEMIR.Activations.add(new Activation(T_E00_CANTEMIR, "P_X00_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A00_CANTEMIR"));
		T_E00_CANTEMIR.GuardMappingList.add(grdT_E00_CANTEMIR);

		T_E00_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E00_CANTEMIR);


		PetriTransition T_E01_CANTEMIR = new PetriTransition(pn);
		T_E01_CANTEMIR.TransitionName = "T_E01_CANTEMIR";
		T_E01_CANTEMIR.InputPlaceName.add("P_X02_CANTEMIR");

		Condition T_E01_CANTEMIRCt1 = new Condition(T_E01_CANTEMIR, "P_X02_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E01_CANTEMIR = new GuardMapping();
		grdT_E01_CANTEMIR.condition= T_E01_CANTEMIRCt1;
		grdT_E01_CANTEMIR.Activations.add(new Activation(T_E01_CANTEMIR, "P_X02_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A01_CANTEMIR"));
		T_E01_CANTEMIR.GuardMappingList.add(grdT_E01_CANTEMIR);

		T_E01_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E01_CANTEMIR);




		PetriTransition T_E02_CANTEMIR = new PetriTransition(pn);
		T_E02_CANTEMIR.TransitionName = "T_E02_CANTEMIR";
		T_E02_CANTEMIR.InputPlaceName.add("P_X03_CANTEMIR");

		Condition T_E02_CANTEMIRCt1 = new Condition(T_E02_CANTEMIR, "P_X03_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E02_CANTEMIR = new GuardMapping();
		grdT_E02_CANTEMIR.condition= T_E02_CANTEMIRCt1;
		grdT_E02_CANTEMIR.Activations.add(new Activation(T_E02_CANTEMIR, "P_X03_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A02_CANTEMIR"));
		T_E02_CANTEMIR.GuardMappingList.add(grdT_E02_CANTEMIR);

		T_E02_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E02_CANTEMIR);




		PetriTransition T_E03_CANTEMIR = new PetriTransition(pn);
		T_E03_CANTEMIR.TransitionName = "T_E03_CANTEMIR";
		T_E03_CANTEMIR.InputPlaceName.add("P_X05_CANTEMIR");

		Condition T_E03_CANTEMIRCt1 = new Condition(T_E03_CANTEMIR, "P_X05_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E03_CANTEMIR = new GuardMapping();
		grdT_E03_CANTEMIR.condition= T_E03_CANTEMIRCt1;
		grdT_E03_CANTEMIR.Activations.add(new Activation(T_E03_CANTEMIR, "P_X05_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A04_CANTEMIR"));
		T_E03_CANTEMIR.GuardMappingList.add(grdT_E03_CANTEMIR);

		T_E03_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E03_CANTEMIR);


		PetriTransition T_E04_CANTEMIR = new PetriTransition(pn);
		T_E04_CANTEMIR.TransitionName = "T_E04_CANTEMIR";
		T_E04_CANTEMIR.InputPlaceName.add("P_X06_CANTEMIR");

		Condition T_E04_CANTEMIRCt1 = new Condition(T_E04_CANTEMIR, "P_X06_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E04_CANTEMIR = new GuardMapping();
		grdT_E04_CANTEMIR.condition= T_E04_CANTEMIRCt1;
		grdT_E04_CANTEMIR.Activations.add(new Activation(T_E04_CANTEMIR, "P_X06_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A_CANTEMIR"));
		T_E04_CANTEMIR.GuardMappingList.add(grdT_E04_CANTEMIR);

		T_E04_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E04_CANTEMIR);


		PetriTransition T_E10_CANTEMIR = new PetriTransition(pn);
		T_E10_CANTEMIR.TransitionName = "T_E10_CANTEMIR";
		T_E10_CANTEMIR.InputPlaceName.add("P_X10_CANTEMIR");

		Condition T_E10_CANTEMIRCt1 = new Condition(T_E10_CANTEMIR, "P_X10_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E10_CANTEMIR = new GuardMapping();
		grdT_E10_CANTEMIR.condition= T_E10_CANTEMIRCt1;
		grdT_E10_CANTEMIR.Activations.add(new Activation(T_E10_CANTEMIR, "P_X10_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A_CANTEMIRSUD"));
		T_E10_CANTEMIR.GuardMappingList.add(grdT_E10_CANTEMIR);

		T_E10_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E10_CANTEMIR);


		PetriTransition T_E11_CANTEMIR = new PetriTransition(pn);
		T_E11_CANTEMIR.TransitionName = "T_E11_CANTEMIR";
		T_E11_CANTEMIR.InputPlaceName.add("P_X11_CANTEMIR");

		Condition T_E11_CANTEMIRCt1 = new Condition(T_E11_CANTEMIR, "P_X11_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E11_CANTEMIR = new GuardMapping();
		grdT_E11_CANTEMIR.condition= T_E11_CANTEMIRCt1;
		grdT_E11_CANTEMIR.Activations.add(new Activation(T_E11_CANTEMIR, "P_X11_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A10_CANTEMIR"));
		T_E11_CANTEMIR.GuardMappingList.add(grdT_E11_CANTEMIR);

		T_E11_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E11_CANTEMIR);



		PetriTransition T_E12_CANTEMIR = new PetriTransition(pn);
		T_E12_CANTEMIR.TransitionName = "T_E12_CANTEMIR";
		T_E12_CANTEMIR.InputPlaceName.add("P_X13_CANTEMIR");

		Condition T_E12_CANTEMIRCt1 = new Condition(T_E12_CANTEMIR, "P_X13_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E12_CANTEMIR = new GuardMapping();
		grdT_E12_CANTEMIR.condition= T_E12_CANTEMIRCt1;
		grdT_E12_CANTEMIR.Activations.add(new Activation(T_E12_CANTEMIR, "P_X13_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A11_CANTEMIR"));
		T_E12_CANTEMIR.GuardMappingList.add(grdT_E12_CANTEMIR);

		T_E12_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E12_CANTEMIR);


		PetriTransition T_E13_CANTEMIR = new PetriTransition(pn);
		T_E13_CANTEMIR.TransitionName = "T_E13_CANTEMIR";
		T_E13_CANTEMIR.InputPlaceName.add("P_X15_CANTEMIR");

		Condition T_E13_CANTEMIRCt1 = new Condition(T_E13_CANTEMIR, "P_X15_CANTEMIR", TransitionCondition.HaveCar);

		GuardMapping grdT_E13_CANTEMIR = new GuardMapping();
		grdT_E13_CANTEMIR.condition= T_E13_CANTEMIRCt1;
		grdT_E13_CANTEMIR.Activations.add(new Activation(T_E13_CANTEMIR, "P_X15_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A13_CANTEMIR"));
		T_E13_CANTEMIR.GuardMappingList.add(grdT_E13_CANTEMIR);

		T_E13_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_E13_CANTEMIR);


		PetriTransition T_ES0_CANTEMIR = new PetriTransition(pn);
		T_ES0_CANTEMIR.TransitionName = "T_ES0_CANTEMIR";
		T_ES0_CANTEMIR.InputPlaceName.add("P_STATION0_CANTEMIR");
		T_ES0_CANTEMIR.InputPlaceName.add("USERREQ_TAXI_CANTEMIR_0");

		Condition T_ES0_CANTEMIRCt1 = new Condition(T_ES0_CANTEMIR, "P_STATION0_CANTEMIR", TransitionCondition.HaveCar);
		Condition T_ES0_CANTEMIRCt2 = new Condition(T_ES0_CANTEMIR, "USERREQ_TAXI_CANTEMIR_0", TransitionCondition.NotNull);
		T_ES0_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_ES0_CANTEMIRCt2);

		ArrayList<String> input = new ArrayList<>();
		input.add("P_STATION0_CANTEMIR");
		input.add("USERREQ_TAXI_CANTEMIR_0");

		GuardMapping grdT_ES0_CANTEMIR = new GuardMapping();
		grdT_ES0_CANTEMIR.condition = T_ES0_CANTEMIRCt1;
		grdT_ES0_CANTEMIR.Activations.add(new Activation(T_ES0_CANTEMIR, input, TransitionOperation.PopTaxiToQueue, "P_X02_CANTEMIR"));

		T_ES0_CANTEMIR.GuardMappingList.add(grdT_ES0_CANTEMIR);

		T_ES0_CANTEMIR.Delay = 0;
		pn.Transitions.add(T_ES0_CANTEMIR);




		PetriTransition T_ES1_CANTEMIR = new PetriTransition(pn);
		T_ES1_CANTEMIR.TransitionName = "T_ES1_CANTEMIR";
		T_ES1_CANTEMIR.InputPlaceName.add("P_STATION1_CANTEMIR");
		T_ES1_CANTEMIR.InputPlaceName.add("USERREQ_TAXI_CANTEMIR_1");

		Condition T_ES1_CANTEMIRCt1 = new Condition(T_ES1_CANTEMIR, "P_STATION1_CANTEMIR", TransitionCondition.HaveCar);
		Condition T_ES1_CANTEMIRCt2 = new Condition(T_ES1_CANTEMIR, "USERREQ_TAXI_CANTEMIR_1", TransitionCondition.NotNull);
		T_ES1_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_ES1_CANTEMIRCt2);

		ArrayList<String> input2 = new ArrayList<>();
		input2.add("P_STATION1_CANTEMIR");
		input2.add("USERREQ_TAXI_CANTEMIR_1");

		GuardMapping grdT_ES1_CANTEMIR = new GuardMapping();
		grdT_ES1_CANTEMIR.condition = T_ES1_CANTEMIRCt1;
		grdT_ES1_CANTEMIR.Activations.add(new Activation(T_ES1_CANTEMIR, input2, TransitionOperation.PopTaxiToQueue, "P_X11_CANTEMIR"));

		T_ES1_CANTEMIR.GuardMappingList.add(grdT_ES1_CANTEMIR);

		T_ES1_CANTEMIR.Delay = 0;
		pn.Transitions.add(T_ES1_CANTEMIR);



		PetriTransition T_OE_PARKING = new PetriTransition(pn);

		T_OE_PARKING.TransitionName = "T_OE_PARKING";
		T_OE_PARKING.InputPlaceName.add("P_X05_CANTEMIR");
		Condition T_OE_PARKINGCt1 = new Condition(T_OE_PARKING, "P_X05_CANTEMIR", TransitionCondition.HaveCarForMe);

		GuardMapping grdT_OE_PARKING = new GuardMapping();
		grdT_OE_PARKING.condition = T_OE_PARKINGCt1;
		grdT_OE_PARKING.Activations.add(new Activation(T_OE_PARKING, "P_X05_CANTEMIR", TransitionOperation.PopElementWithTarget, "P_OE_PARKING"));

		T_OE_PARKING.GuardMappingList.add(grdT_OE_PARKING);
		T_OE_PARKING.Delay = 2;

		pn.Transitions.add(T_OE_PARKING);




		PetriTransition T_OE_POTERASI = new PetriTransition(pn);

		T_OE_POTERASI.TransitionName = "T_OE_POTERASI";
		T_OE_POTERASI.InputPlaceName.add("P_X10_CANTEMIR");
		Condition T_OE_POTERASICt1 = new Condition(T_OE_POTERASI, "P_X10_CANTEMIR", TransitionCondition.HaveCarForMe);

		GuardMapping grdT_OE_POTERASI = new GuardMapping();
		grdT_OE_POTERASI.condition = T_OE_POTERASICt1;
		grdT_OE_POTERASI.Activations.add(new Activation(T_OE_POTERASI, "P_X10_CANTEMIR", TransitionOperation.PopElementWithTarget, "P_OE_POTERASI"));

		T_OE_POTERASI.GuardMappingList.add(grdT_OE_POTERASI);
		T_OE_POTERASI.Delay = 2;

		pn.Transitions.add(T_OE_POTERASI);


		PetriTransition T_OE_RADULESCU = new PetriTransition(pn);

		T_OE_RADULESCU.TransitionName = "T_OE_RADULESCU";
		T_OE_RADULESCU.InputPlaceName.add("P_X13_CANTEMIR");
		Condition T_OE_RADULESCUCt1 = new Condition(T_OE_RADULESCU, "P_X13_CANTEMIR", TransitionCondition.HaveCarForMe);

		GuardMapping grdT_OE_RADULESCU = new GuardMapping();
		grdT_OE_RADULESCU.condition = T_OE_RADULESCUCt1;
		grdT_OE_RADULESCU.Activations.add(new Activation(T_OE_RADULESCU, "P_X13_CANTEMIR", TransitionOperation.PopElementWithTarget, "P_OE_RADULESCU"));

		T_OE_RADULESCU.GuardMappingList.add(grdT_OE_RADULESCU);
		T_OE_RADULESCU.Delay = 2;

		pn.Transitions.add(T_OE_RADULESCU);

		PetriTransition T_PED_0_CANTEMIR = new PetriTransition(pn);
		T_PED_0_CANTEMIR.TransitionName = "T_PED_0_CANTEMIR";
		T_PED_0_CANTEMIR.InputPlaceName.add("P_X04_CANTEMIR");
		T_PED_0_CANTEMIR.InputPlaceName.add("P_CANTEMIR_TL_1");
		T_PED_0_CANTEMIR.InputPlaceName.add("USERREQ_CANTEMIR_0");
		T_PED_0_CANTEMIR.InputPlaceName.add("P_CANTEMIR_PTL_1");

		Condition T_PED_0_CANTEMIRGrd1Ct1 = new Condition(T_PED_0_CANTEMIR, "P_CANTEMIR_TL_1", TransitionCondition.Equal,"green");
		Condition T_PED_0_CANTEMIRGrd1CT_PED_0_CANTEMIR = new Condition(T_PED_0_CANTEMIR, "P_X04_CANTEMIR", TransitionCondition.HaveCar);
		T_PED_0_CANTEMIRGrd1Ct1.SetNextCondition(LogicConnector.AND, T_PED_0_CANTEMIRGrd1CT_PED_0_CANTEMIR);

		GuardMapping grd1T_PED_0_CANTEMIR = new GuardMapping();
		grd1T_PED_0_CANTEMIR.condition= T_PED_0_CANTEMIRGrd1Ct1;
		grd1T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_X04_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A03_CANTEMIR"));
		grd1T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_CANTEMIR_TL_1", TransitionOperation.Move, "P_CANTEMIR_TL_1"));
		grd1T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_CANTEMIR_PTL_1", TransitionOperation.Move, "P_CANTEMIR_PTL_1"));
		T_PED_0_CANTEMIR.GuardMappingList.add(grd1T_PED_0_CANTEMIR);


		Condition T_PED_0_CANTEMIRGrd2Ct1 = new Condition(T_PED_0_CANTEMIR, "USERREQ_CANTEMIR_0", TransitionCondition.NotNull);
		GuardMapping grd2T_PED_0_CANTEMIR = new GuardMapping();
		grd2T_PED_0_CANTEMIR.condition= T_PED_0_CANTEMIRGrd2Ct1;
		grd2T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_CANTEMIR_TL_1", TransitionOperation.Move, "P_CANTEMIR_TL_1"));
		grd2T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_CANTEMIR_PTL_1", TransitionOperation.Move, "P_CANTEMIR_PTL_1"));
		grd2T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "USERREQ_CANTEMIR_0", TransitionOperation.SendOverNetwork, "OPReq"));
		T_PED_0_CANTEMIR.GuardMappingList.add(grd2T_PED_0_CANTEMIR);

		Condition T_PED_0_CANTEMIRGrd3Ct1 = new Condition(T_PED_0_CANTEMIR, "P_X04_CANTEMIR", TransitionCondition.HavePriorityCar);
		GuardMapping grd3T_PED_0_CANTEMIR = new GuardMapping();
		grd3T_PED_0_CANTEMIR.condition = T_PED_0_CANTEMIRGrd3Ct1;
		grd3T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_X04_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A03_CANTEMIR"));
		grd3T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_CANTEMIR_TL_1", TransitionOperation.Move, "P_CANTEMIR_TL_1"));
		grd3T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "P_CANTEMIR_PTL_1", TransitionOperation.Move, "P_CANTEMIR_PTL_1"));
		T_PED_0_CANTEMIR.GuardMappingList.add(grd3T_PED_0_CANTEMIR);

		T_PED_0_CANTEMIR.Delay = 1;
		pn.Transitions.add(T_PED_0_CANTEMIR);


		PetriTransition T_PED_1_CANTEMIR = new PetriTransition(pn);
		T_PED_1_CANTEMIR.TransitionName = "T_PED_1_CANTEMIR";
		T_PED_1_CANTEMIR.InputPlaceName.add("P_X14_CANTEMIR");
		T_PED_1_CANTEMIR.InputPlaceName.add("P_CANTEMIR_TL_2");
		T_PED_1_CANTEMIR.InputPlaceName.add("USERREQ_CANTEMIR_1");
		T_PED_1_CANTEMIR.InputPlaceName.add("P_CANTEMIR_PTL_2");

		Condition T_PED_1_CANTEMIR1Ct1 = new Condition(T_PED_1_CANTEMIR, "P_CANTEMIR_TL_2", TransitionCondition.Equal,"green");
		Condition T_PED_1_CANTEMIR1Ct2 = new Condition(T_PED_1_CANTEMIR, "P_X14_CANTEMIR", TransitionCondition.HaveCar);
		T_PED_1_CANTEMIR1Ct1.SetNextCondition(LogicConnector.AND, T_PED_1_CANTEMIR1Ct2);

		GuardMapping grdT_PED_1_CANTEMIR1 = new GuardMapping();
		grdT_PED_1_CANTEMIR1.condition= T_PED_1_CANTEMIR1Ct1;
		grdT_PED_1_CANTEMIR1.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_X14_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A12_CANTEMIR"));
		grdT_PED_1_CANTEMIR1.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_CANTEMIR_TL_2", TransitionOperation.Move, "P_CANTEMIR_TL_2"));
		grdT_PED_1_CANTEMIR1.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_CANTEMIR_PTL_2", TransitionOperation.Move, "P_CANTEMIR_PTL_2"));
		T_PED_1_CANTEMIR.GuardMappingList.add(grdT_PED_1_CANTEMIR1);


		Condition T_PED_1_CANTEMIR2Ct1 = new Condition(T_PED_1_CANTEMIR, "USERREQ_CANTEMIR_1", TransitionCondition.NotNull);
		GuardMapping grdT_PED_1_CANTEMIR2 = new GuardMapping();
		grdT_PED_1_CANTEMIR2.condition= T_PED_1_CANTEMIR2Ct1;
		grdT_PED_1_CANTEMIR2.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_CANTEMIR_TL_2", TransitionOperation.Move, "P_CANTEMIR_TL_2"));
		grdT_PED_1_CANTEMIR2.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_CANTEMIR_PTL_2", TransitionOperation.Move, "P_CANTEMIR_PTL_2"));
		grdT_PED_1_CANTEMIR2.Activations.add(new Activation(T_PED_1_CANTEMIR, "USERREQ_CANTEMIR_1", TransitionOperation.SendOverNetwork, "OP_REQ_CANTEMIR_2"));
		T_PED_1_CANTEMIR.GuardMappingList.add(grdT_PED_1_CANTEMIR2);

		Condition T_PED_1_CANTEMIR3Ct1 = new Condition(T_PED_1_CANTEMIR, "P_X14_CANTEMIR", TransitionCondition.HavePriorityCar);
		GuardMapping grdT_PED_1_CANTEMIR3 = new GuardMapping();
		grdT_PED_1_CANTEMIR3.condition = T_PED_1_CANTEMIR3Ct1;
		grdT_PED_1_CANTEMIR3.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_X14_CANTEMIR", TransitionOperation.PopElementWithoutTarget, "P_A12_CANTEMIR"));
		grdT_PED_1_CANTEMIR3.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_CANTEMIR_TL_2", TransitionOperation.Move, "P_CANTEMIR_TL_2"));
		grdT_PED_1_CANTEMIR3.Activations.add(new Activation(T_PED_1_CANTEMIR, "P_CANTEMIR_PTL_2", TransitionOperation.Move, "P_CANTEMIR_PTL_2"));
		T_PED_1_CANTEMIR.GuardMappingList.add(grdT_PED_1_CANTEMIR3);

		T_PED_1_CANTEMIR.Delay = 1;
		pn.Transitions.add(T_PED_1_CANTEMIR);



		PetriTransition T_S0_CANTEMIR = new PetriTransition(pn);
		T_S0_CANTEMIR.TransitionName = "T_S0_CANTEMIR";
		T_S0_CANTEMIR.InputPlaceName.add("P_X01_CANTEMIR");


		Condition T_S0_CANTEMIRCt1 = new Condition(T_S0_CANTEMIR, "P_X01_CANTEMIR", TransitionCondition.HaveCarForMe);
		Condition T_S0_CANTEMIRCT_S0_CANTEMIR = new Condition(T_S0_CANTEMIR, "P_X01_CANTEMIR", TransitionCondition.HaveTaxi);
		T_S0_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_S0_CANTEMIRCT_S0_CANTEMIR);

		GuardMapping grdT_S0_CANTEMIR = new GuardMapping();
		grdT_S0_CANTEMIR.condition = T_S0_CANTEMIRCt1;
		grdT_S0_CANTEMIR.Activations.add(new Activation(T_S0_CANTEMIR, "P_X01_CANTEMIR", TransitionOperation.PopElementWithoutTargetToQueue, "P_STATION0_CANTEMIR"));
		T_S0_CANTEMIR.GuardMappingList.add(grdT_S0_CANTEMIR);

		T_S0_CANTEMIR.Delay = 0;
		pn.Transitions.add(T_S0_CANTEMIR);




		PetriTransition T_S1_CANTEMIR = new PetriTransition(pn);
		T_S1_CANTEMIR.TransitionName = "T_S1_CANTEMIR";
		T_S1_CANTEMIR.InputPlaceName.add("P_X12_CANTEMIR");


		Condition T_S1_CANTEMIRCt1 = new Condition(T_S1_CANTEMIR, "P_X12_CANTEMIR", TransitionCondition.HaveCarForMe);
		Condition T_S1_CANTEMIRCT_S1_CANTEMIR = new Condition(T_S1_CANTEMIR, "P_X12_CANTEMIR", TransitionCondition.HaveTaxi);
		T_S1_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_S1_CANTEMIRCT_S1_CANTEMIR);

		GuardMapping grdT_S1_CANTEMIR = new GuardMapping();
		grdT_S1_CANTEMIR.condition = T_S1_CANTEMIRCt1;
		grdT_S1_CANTEMIR.Activations.add(new Activation(T_S1_CANTEMIR, "P_X12_CANTEMIR", TransitionOperation.PopElementWithoutTargetToQueue, "P_STATION1_CANTEMIR"));
		T_S1_CANTEMIR.GuardMappingList.add(grdT_S1_CANTEMIR);

		T_S1_CANTEMIR.Delay = 0;
		pn.Transitions.add(T_S1_CANTEMIR);



		PetriTransition T_U_LANARIEI = new PetriTransition(pn);
		T_U_LANARIEI.TransitionName = "T_U_LANARIEI";
		T_U_LANARIEI.InputPlaceName.add("P_A_LANARIEI");
		T_U_LANARIEI.InputPlaceName.add("P_X15_CANTEMIR");

		Condition T_U_LANARIEICt1 = new Condition(T_U_LANARIEI, "P_A_LANARIEI", TransitionCondition.NotNull);
		Condition T_U_LANARIEICt2 = new Condition(T_U_LANARIEI, "P_X15_CANTEMIR", TransitionCondition.CanAddCars);
		T_U_LANARIEICt1.SetNextCondition(LogicConnector.AND, T_U_LANARIEICt2);

		GuardMapping grdT_U_LANARIEI = new GuardMapping();
		grdT_U_LANARIEI.condition = T_U_LANARIEICt1;
		grdT_U_LANARIEI.Activations.add(new Activation(T_U_LANARIEI, "P_A_LANARIEI", TransitionOperation.AddElement, "P_X15_CANTEMIR"));
		T_U_LANARIEI.GuardMappingList.add(grdT_U_LANARIEI);

		T_U_LANARIEI.Delay = 2;
		pn.Transitions.add(T_U_LANARIEI);

		PetriTransition T_U_POTERASI = new PetriTransition(pn);
		T_U_POTERASI.TransitionName = "T_U_POTERASI";
		T_U_POTERASI.InputPlaceName.add("P_A_POTERASI");
		T_U_POTERASI.InputPlaceName.add("P_X10_CANTEMIR");

		Condition T_U_POTERASICt1 = new Condition(T_U_POTERASI, "P_A_POTERASI", TransitionCondition.NotNull);
		Condition T_U_POTERASICt2 = new Condition(T_U_POTERASI, "P_X10_CANTEMIR", TransitionCondition.CanAddCars);
		T_U_POTERASICt1.SetNextCondition(LogicConnector.AND, T_U_POTERASICt2);

		GuardMapping grdT_U_POTERASI = new GuardMapping();
		grdT_U_POTERASI.condition = T_U_POTERASICt1;
		grdT_U_POTERASI.Activations.add(new Activation(T_U_POTERASI, "P_A_POTERASI", TransitionOperation.AddElement, "P_X10_CANTEMIR"));
		T_U_POTERASI.GuardMappingList.add(grdT_U_POTERASI);

		T_U_POTERASI.Delay = 2;
		pn.Transitions.add(T_U_POTERASI);



		PetriTransition T_U_RADULESCU = new PetriTransition(pn);
		T_U_RADULESCU.TransitionName = "T_U_RADULESCU";
		T_U_RADULESCU.InputPlaceName.add("P_A_RADULESCU");
		T_U_RADULESCU.InputPlaceName.add("P_X13_CANTEMIR");

		Condition T_U_RADULESCUCt1 = new Condition(T_U_RADULESCU, "P_A_RADULESCU", TransitionCondition.NotNull);
		Condition T_U_RADULESCUCt2 = new Condition(T_U_RADULESCU, "P_X13_CANTEMIR", TransitionCondition.CanAddCars);
		T_U_RADULESCUCt1.SetNextCondition(LogicConnector.AND, T_U_RADULESCUCt2);

		GuardMapping grdT_U_RADULESCU = new GuardMapping();
		grdT_U_RADULESCU.condition = T_U_RADULESCUCt1;
		grdT_U_RADULESCU.Activations.add(new Activation(T_U_RADULESCU, "P_A_RADULESCU", TransitionOperation.AddElement, "P_X13_CANTEMIR"));
		T_U_RADULESCU.GuardMappingList.add(grdT_U_RADULESCU);

		T_U_RADULESCU.Delay = 2;
		pn.Transitions.add(T_U_RADULESCU);



		PetriTransition T_U00_CANTEMIR = new PetriTransition(pn);
		T_U00_CANTEMIR.TransitionName = "T_U00_CANTEMIR";
		T_U00_CANTEMIR.InputPlaceName.add("P_OE_CANTEMIRSUD");
		T_U00_CANTEMIR.InputPlaceName.add("P_X00_CANTEMIR");

		Condition T_U00_CANTEMIRCt1 = new Condition(T_U00_CANTEMIR, "P_OE_CANTEMIRSUD", TransitionCondition.NotNull);
		Condition T_U00_CANTEMIRCt2 = new Condition(T_U00_CANTEMIR, "P_X00_CANTEMIR", TransitionCondition.CanAddCars);
		T_U00_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U00_CANTEMIRCt2);

		GuardMapping grdT_U00_CANTEMIR = new GuardMapping();
		grdT_U00_CANTEMIR.condition = T_U00_CANTEMIRCt1;
		grdT_U00_CANTEMIR.Activations.add(new Activation(T_U00_CANTEMIR, "P_OE_CANTEMIRSUD", TransitionOperation.AddElement, "P_X00_CANTEMIR"));
		T_U00_CANTEMIR.GuardMappingList.add(grdT_U00_CANTEMIR);

		T_U00_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U00_CANTEMIR);



		PetriTransition T_U01_CANTEMIR = new PetriTransition(pn);
		T_U01_CANTEMIR.TransitionName = "T_U01_CANTEMIR";
		T_U01_CANTEMIR.InputPlaceName.add("P_A00_CANTEMIR");
		T_U01_CANTEMIR.InputPlaceName.add("P_X01_CANTEMIR");

		Condition T_U01_CANTEMIRCt1 = new Condition(T_U01_CANTEMIR, "P_A00_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U01_CANTEMIRCt2 = new Condition(T_U01_CANTEMIR, "P_X01_CANTEMIR", TransitionCondition.CanAddCars);
		T_U01_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U01_CANTEMIRCt2);

		GuardMapping grdT_U01_CANTEMIR = new GuardMapping();
		grdT_U01_CANTEMIR.condition = T_U01_CANTEMIRCt1;
		grdT_U01_CANTEMIR.Activations.add(new Activation(T_U01_CANTEMIR, "P_A00_CANTEMIR", TransitionOperation.AddElement, "P_X01_CANTEMIR"));
		T_U01_CANTEMIR.GuardMappingList.add(grdT_U01_CANTEMIR);

		T_U01_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U01_CANTEMIR);



		PetriTransition T_U02_CANTEMIR = new PetriTransition(pn);
		T_U02_CANTEMIR.TransitionName = "T_U02_CANTEMIR";
		T_U02_CANTEMIR.InputPlaceName.add("P_A01_CANTEMIR");
		T_U02_CANTEMIR.InputPlaceName.add("P_X03_CANTEMIR");

		Condition T_U02_CANTEMIRCt1 = new Condition(T_U02_CANTEMIR, "P_A01_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U02_CANTEMIRCt2 = new Condition(T_U02_CANTEMIR, "P_X03_CANTEMIR", TransitionCondition.CanAddCars);
		T_U02_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U02_CANTEMIRCt2);

		GuardMapping grdT_U02_CANTEMIR = new GuardMapping();
		grdT_U02_CANTEMIR.condition = T_U02_CANTEMIRCt1;
		grdT_U02_CANTEMIR.Activations.add(new Activation(T_U02_CANTEMIR, "P_A01_CANTEMIR", TransitionOperation.AddElement, "P_X03_CANTEMIR"));
		T_U02_CANTEMIR.GuardMappingList.add(grdT_U02_CANTEMIR);

		T_U02_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U02_CANTEMIR);


		PetriTransition T_U03_CANTEMIR = new PetriTransition(pn);
		T_U03_CANTEMIR.TransitionName = "T_U03_CANTEMIR";
		T_U03_CANTEMIR.InputPlaceName.add("P_A02_CANTEMIR");
		T_U03_CANTEMIR.InputPlaceName.add("P_X04_CANTEMIR");

		Condition T_U03_CANTEMIRCt1 = new Condition(T_U03_CANTEMIR, "P_A02_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U03_CANTEMIRCt2 = new Condition(T_U03_CANTEMIR, "P_X04_CANTEMIR", TransitionCondition.CanAddCars);
		T_U03_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U03_CANTEMIRCt2);

		GuardMapping grdT_U03_CANTEMIR = new GuardMapping();
		grdT_U03_CANTEMIR.condition = T_U03_CANTEMIRCt1;
		grdT_U03_CANTEMIR.Activations.add(new Activation(T_U03_CANTEMIR, "P_A02_CANTEMIR", TransitionOperation.AddElement, "P_X04_CANTEMIR"));
		T_U03_CANTEMIR.GuardMappingList.add(grdT_U03_CANTEMIR);

		T_U03_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U03_CANTEMIR);


		PetriTransition T_U04_CANTEMIR = new PetriTransition(pn);
		T_U04_CANTEMIR.TransitionName = "T_U04_CANTEMIR";
		T_U04_CANTEMIR.InputPlaceName.add("P_A03_CANTEMIR");
		T_U04_CANTEMIR.InputPlaceName.add("P_X05_CANTEMIR");

		Condition T_U04_CANTEMIRCt1 = new Condition(T_U04_CANTEMIR, "P_A03_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U04_CANTEMIRCt2 = new Condition(T_U04_CANTEMIR, "P_X05_CANTEMIR", TransitionCondition.CanAddCars);
		T_U04_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U04_CANTEMIRCt2);

		GuardMapping grdT_U04_CANTEMIR = new GuardMapping();
		grdT_U04_CANTEMIR.condition = T_U04_CANTEMIRCt1;
		grdT_U04_CANTEMIR.Activations.add(new Activation(T_U04_CANTEMIR, "P_A03_CANTEMIR", TransitionOperation.AddElement, "P_X05_CANTEMIR"));
		T_U04_CANTEMIR.GuardMappingList.add(grdT_U04_CANTEMIR);

		T_U04_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U04_CANTEMIR);


		PetriTransition T_U05_CANTEMIR = new PetriTransition(pn);
		T_U05_CANTEMIR.TransitionName = "T_U05_CANTEMIR";
		T_U05_CANTEMIR.InputPlaceName.add("P_A04_CANTEMIR");
		T_U05_CANTEMIR.InputPlaceName.add("P_X06_CANTEMIR");

		Condition T_U05_CANTEMIRCt1 = new Condition(T_U05_CANTEMIR, "P_A04_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U05_CANTEMIRCt2 = new Condition(T_U05_CANTEMIR, "P_X06_CANTEMIR", TransitionCondition.CanAddCars);
		T_U05_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U05_CANTEMIRCt2);

		GuardMapping grdT_U05_CANTEMIR = new GuardMapping();
		grdT_U05_CANTEMIR.condition = T_U05_CANTEMIRCt1;
		grdT_U05_CANTEMIR.Activations.add(new Activation(T_U05_CANTEMIR, "P_A04_CANTEMIR", TransitionOperation.AddElement, "P_X06_CANTEMIR"));
		T_U05_CANTEMIR.GuardMappingList.add(grdT_U05_CANTEMIR);

		T_U05_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U05_CANTEMIR);


		PetriTransition T_U10_CANTEMIR = new PetriTransition(pn);
		T_U10_CANTEMIR.TransitionName = "T_U10_CANTEMIR";
		T_U10_CANTEMIR.InputPlaceName.add("P_A10_CANTEMIR");
		T_U10_CANTEMIR.InputPlaceName.add("P_X10_CANTEMIR");

		Condition T_U10_CANTEMIRCt1 = new Condition(T_U10_CANTEMIR, "P_A10_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U10_CANTEMIRCt2 = new Condition(T_U10_CANTEMIR, "P_X10_CANTEMIR", TransitionCondition.CanAddCars);
		T_U10_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U10_CANTEMIRCt2);

		GuardMapping grdT_U10_CANTEMIR = new GuardMapping();
		grdT_U10_CANTEMIR.condition = T_U10_CANTEMIRCt1;
		grdT_U10_CANTEMIR.Activations.add(new Activation(T_U10_CANTEMIR, "P_A10_CANTEMIR", TransitionOperation.AddElement, "P_X10_CANTEMIR"));
		T_U10_CANTEMIR.GuardMappingList.add(grdT_U10_CANTEMIR);

		T_U10_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U10_CANTEMIR);



		PetriTransition T_U11_CANTEMIR = new PetriTransition(pn);
		T_U11_CANTEMIR.TransitionName = "T_U11_CANTEMIR";
		T_U11_CANTEMIR.InputPlaceName.add("P_A11_CANTEMIR");
		T_U11_CANTEMIR.InputPlaceName.add("P_X12_CANTEMIR");

		Condition T_U11_CANTEMIRCt1 = new Condition(T_U11_CANTEMIR, "P_A11_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U11_CANTEMIRCt2 = new Condition(T_U11_CANTEMIR, "P_X12_CANTEMIR", TransitionCondition.CanAddCars);
		T_U11_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U11_CANTEMIRCt2);

		GuardMapping grdT_U11_CANTEMIR = new GuardMapping();
		grdT_U11_CANTEMIR.condition = T_U11_CANTEMIRCt1;
		grdT_U11_CANTEMIR.Activations.add(new Activation(T_U11_CANTEMIR, "P_A11_CANTEMIR", TransitionOperation.AddElement, "P_X12_CANTEMIR"));
		T_U11_CANTEMIR.GuardMappingList.add(grdT_U11_CANTEMIR);

		T_U11_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U11_CANTEMIR);


		PetriTransition T_U12_CANTEMIR = new PetriTransition(pn);
		T_U12_CANTEMIR.TransitionName = "T_U12_CANTEMIR";
		T_U12_CANTEMIR.InputPlaceName.add("P_A12_CANTEMIR");
		T_U12_CANTEMIR.InputPlaceName.add("P_X13_CANTEMIR");

		Condition T_U12_CANTEMIRCt1 = new Condition(T_U12_CANTEMIR, "P_A12_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U12_CANTEMIRCt2 = new Condition(T_U12_CANTEMIR, "P_X13_CANTEMIR", TransitionCondition.CanAddCars);
		T_U12_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U12_CANTEMIRCt2);

		GuardMapping grdT_U12_CANTEMIR = new GuardMapping();
		grdT_U12_CANTEMIR.condition = T_U12_CANTEMIRCt1;
		grdT_U12_CANTEMIR.Activations.add(new Activation(T_U12_CANTEMIR, "P_A12_CANTEMIR", TransitionOperation.AddElement, "P_X13_CANTEMIR"));
		T_U12_CANTEMIR.GuardMappingList.add(grdT_U12_CANTEMIR);

		T_U12_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U12_CANTEMIR);


		PetriTransition T_U13_CANTEMIR = new PetriTransition(pn);
		T_U13_CANTEMIR.TransitionName = "T_U13_CANTEMIR";
		T_U13_CANTEMIR.InputPlaceName.add("P_A13_CANTEMIR");
		T_U13_CANTEMIR.InputPlaceName.add("P_X14_CANTEMIR");

		Condition T_U13_CANTEMIRCt1 = new Condition(T_U13_CANTEMIR, "P_A13_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U13_CANTEMIRCt2 = new Condition(T_U13_CANTEMIR, "P_X14_CANTEMIR", TransitionCondition.CanAddCars);
		T_U13_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U13_CANTEMIRCt2);

		GuardMapping grdT_U13_CANTEMIR = new GuardMapping();
		grdT_U13_CANTEMIR.condition = T_U13_CANTEMIRCt1;
		grdT_U13_CANTEMIR.Activations.add(new Activation(T_U13_CANTEMIR, "P_A13_CANTEMIR", TransitionOperation.AddElement, "P_X14_CANTEMIR"));
		T_U13_CANTEMIR.GuardMappingList.add(grdT_U13_CANTEMIR);

		T_U13_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U13_CANTEMIR);





		PetriTransition T_U1_LANARIEI = new PetriTransition(pn);
		T_U1_LANARIEI.TransitionName = "T_U1_LANARIEI";
		T_U1_LANARIEI.InputPlaceName.add("P_A1_LANARIEI");
		T_U1_LANARIEI.InputPlaceName.add("P_X06_CANTEMIR");

		Condition T_U1_LANARIEICt1 = new Condition(T_U1_LANARIEI, "P_A1_LANARIEI", TransitionCondition.NotNull);
		Condition T_U1_LANARIEICt2 = new Condition(T_U1_LANARIEI, "P_X06_CANTEMIR", TransitionCondition.CanAddCars);
		T_U1_LANARIEICt1.SetNextCondition(LogicConnector.AND, T_U1_LANARIEICt2);

		GuardMapping grdT_U1_LANARIEI = new GuardMapping();
		grdT_U1_LANARIEI.condition = T_U1_LANARIEICt1;
		grdT_U1_LANARIEI.Activations.add(new Activation(T_U1_LANARIEI, "P_A1_LANARIEI", TransitionOperation.AddElement, "P_X06_CANTEMIR"));
		T_U1_LANARIEI.GuardMappingList.add(grdT_U1_LANARIEI);

		T_U1_LANARIEI.Delay = 2;
		pn.Transitions.add(T_U1_LANARIEI);


		PetriTransition T_U1_POTERASI = new PetriTransition(pn);
		T_U1_POTERASI.TransitionName = "T_U1_POTERASI";
		T_U1_POTERASI.InputPlaceName.add("P_A1_POTERASI");
		T_U1_POTERASI.InputPlaceName.add("P_X00_CANTEMIR");

		Condition T_U1_POTERASICt1 = new Condition(T_U1_POTERASI, "P_A1_POTERASI", TransitionCondition.NotNull);
		Condition T_U1_POTERASICt2 = new Condition(T_U1_POTERASI, "P_X00_CANTEMIR", TransitionCondition.CanAddCars);
		T_U1_POTERASICt1.SetNextCondition(LogicConnector.AND, T_U1_POTERASICt2);

		GuardMapping grdT_U1_POTERASI = new GuardMapping();
		grdT_U1_POTERASI.condition = T_U1_POTERASICt1;
		grdT_U1_POTERASI.Activations.add(new Activation(T_U1_POTERASI, "P_A1_POTERASI", TransitionOperation.AddElement, "P_X00_CANTEMIR"));
		T_U1_POTERASI.GuardMappingList.add(grdT_U1_POTERASI);

		T_U1_POTERASI.Delay = 2;
		pn.Transitions.add(T_U1_POTERASI);


		PetriTransition T_U1_RADULESCU = new PetriTransition(pn);
		T_U1_RADULESCU.TransitionName = "T_U1_RADULESCU";
		T_U1_RADULESCU.InputPlaceName.add("P_A1_RADULESCU");
		T_U1_RADULESCU.InputPlaceName.add("P_X03_CANTEMIR");

		Condition T_U1_RADULESCUCt1 = new Condition(T_U1_RADULESCU, "P_A1_RADULESCU", TransitionCondition.NotNull);
		Condition T_U1_RADULESCUCt2 = new Condition(T_U1_RADULESCU, "P_X03_CANTEMIR", TransitionCondition.CanAddCars);
		T_U1_RADULESCUCt1.SetNextCondition(LogicConnector.AND, T_U1_RADULESCUCt2);

		GuardMapping grdT_U1_RADULESCU = new GuardMapping();
		grdT_U1_RADULESCU.condition = T_U1_RADULESCUCt1;
		grdT_U1_RADULESCU.Activations.add(new Activation(T_U1_RADULESCU, "P_A1_RADULESCU", TransitionOperation.AddElement, "P_X03_CANTEMIR"));
		T_U1_RADULESCU.GuardMappingList.add(grdT_U1_RADULESCU);

		T_U1_RADULESCU.Delay = 2;
		pn.Transitions.add(T_U1_RADULESCU);


		PetriTransition T_U14_CANTEMIR = new PetriTransition(pn);
		T_U14_CANTEMIR.TransitionName = "T_U14_CANTEMIR";
		T_U14_CANTEMIR.InputPlaceName.add("P_OE_CANTEMIR");
		T_U14_CANTEMIR.InputPlaceName.add("P_X15_CANTEMIR");

		Condition T_U14_CANTEMIRCt1 = new Condition(T_U14_CANTEMIR, "P_OE_CANTEMIR", TransitionCondition.NotNull);
		Condition T_U14_CANTEMIRCt2 = new Condition(T_U14_CANTEMIR, "P_X15_CANTEMIR", TransitionCondition.CanAddCars);
		T_U14_CANTEMIRCt1.SetNextCondition(LogicConnector.AND, T_U14_CANTEMIRCt2);

		GuardMapping grdT_U14_CANTEMIR = new GuardMapping();
		grdT_U14_CANTEMIR.condition = T_U14_CANTEMIRCt1;
		grdT_U14_CANTEMIR.Activations.add(new Activation(T_U14_CANTEMIR, "P_OE_CANTEMIR", TransitionOperation.AddElement, "P_X15_CANTEMIR"));
		T_U14_CANTEMIR.GuardMappingList.add(grdT_U14_CANTEMIR);

		T_U14_CANTEMIR.Delay = 2;
		pn.Transitions.add(T_U14_CANTEMIR);

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
