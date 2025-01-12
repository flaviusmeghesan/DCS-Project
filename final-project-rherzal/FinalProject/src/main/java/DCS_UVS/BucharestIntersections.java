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

public class BucharestIntersections {
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

		// BEGIN INTER INTERSECTION

		DataTransfer OP_REQ_CANTEMIR_1 = new DataTransfer();
		OP_REQ_CANTEMIR_1.SetName("OP_REQ_CANTEMIR_1");
		OP_REQ_CANTEMIR_1.Value = new TransferOperation("localhost", "1083" , "USREQ_CANTEMIR_1");
		pn.PlaceList.add(OP_REQ_CANTEMIR_1);

		DataTransfer OP_REQ_CANTEMIR_2 = new DataTransfer();
		OP_REQ_CANTEMIR_2.SetName("OP_REQ_CANTEMIR_2");
		OP_REQ_CANTEMIR_2.Value = new TransferOperation("localhost", "1084", "USREQ_CANTEMIR_2");
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

//		DataCar P_A_CANTEMIRSUD = new DataCar();
//		P_A_CANTEMIRSUD.SetName("P_A_CANTEMIRSUD");
//		pn.PlaceList.add(P_A_CANTEMIRSUD);

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

//		DataCar P_OE_CANTEMIRSUD = new DataCar();
//		P_OE_CANTEMIRSUD.SetName("P_OE_CANTEMIRSUD");
//		pn.PlaceList.add(P_OE_CANTEMIRSUD);

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


//		DataString full = new DataString();
//		full.SetName("full");
//		full.SetValue("full");
//		pn.ConstantPlaceList.add(full);
//
//		DataString red = new DataString();
//		//red.Printable = false;
//		red.SetName("red");
//		red.SetValue("red");
//		pn.ConstantPlaceList.add(red);
//
//		DataString green = new DataString();
//		//green.Printable = false;
//		green.SetName("green");
//		green.SetValue("green");
//		pn.ConstantPlaceList.add(green);
//
//		DataString yellow = new DataString();
//		//yellow.Printable = false;
//		yellow.SetName("yellow");
//		yellow.SetValue("yellow");
//		pn.ConstantPlaceList.add(yellow);

		// BEGIN INTERSECTION 2

		DataTransfer OP_CANTEMIR = new DataTransfer();
		OP_CANTEMIR.SetName("OP_CANTEMIR");
		OP_CANTEMIR.Value = new TransferOperation("localhost", "1082" , "IN_CANTEMIR");
		pn.PlaceList.add(OP_CANTEMIR);

		DataTransfer OP_SERBANVODA = new DataTransfer();
		OP_SERBANVODA.SetName("OP_SERBANVODA");
		OP_SERBANVODA.Value = new TransferOperation("localhost", "1082" , "IN_SERBANVODA");
		pn.PlaceList.add(OP_SERBANVODA);

		DataTransfer OP_SERBANVODA_BUS = new DataTransfer();
		OP_SERBANVODA_BUS.SetName("OP_SERBANVODA_BUS");
		OP_SERBANVODA_BUS.Value = new TransferOperation("localhost", "1082" , "IN_SERBANVODA_BUS");
		pn.PlaceList.add(OP_SERBANVODA_BUS);

		DataTransfer OP_SINCAI = new DataTransfer();
		OP_SINCAI.SetName("OP_SINCAI");
		OP_SINCAI.Value = new TransferOperation("localhost", "1082" , "IN_SINCAI");
		pn.PlaceList.add(OP_SINCAI);

		DataTransfer OP_SINCAINORD_BUS = new DataTransfer();
		OP_SINCAINORD_BUS.SetName("OP_SINCAINORD_BUS");
		OP_SINCAINORD_BUS.Value = new TransferOperation("localhost", "1082" , "IN_SINCAINORD_BUS");
		pn.PlaceList.add(OP_SINCAINORD_BUS);

		DataTransfer OP_TINERETULUI = new DataTransfer();
		OP_TINERETULUI.SetName("OP_TINERETULUI");
		OP_TINERETULUI.Value = new TransferOperation("localhost", "1082" , "IN_TINERETULUI");
		pn.PlaceList.add(OP_TINERETULUI);

//		DataCar P_A_CANTEMIR = new DataCar();
//		P_A_CANTEMIR.SetName("P_A_CANTEMIR");
//		pn.PlaceList.add(P_A_CANTEMIR);

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


//		DataCar P_OE_CANTEMIR = new DataCar();
//		P_OE_CANTEMIR.SetName("P_OE_CANTEMIR");
//		pn.PlaceList.add(P_OE_CANTEMIR);

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

		// BEGIN INTER INTERSECTION

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
		grd2T_PED_0_CANTEMIR.Activations.add(new Activation(T_PED_0_CANTEMIR, "USERREQ_CANTEMIR_0", TransitionOperation.SendOverNetwork, "OP_REQ_CANTEMIR_1"));
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


		// BEGIN INTERSECTION 2

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
