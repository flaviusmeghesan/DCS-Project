package DCS_UVS;

import Components.PetriNet;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;

public class Intersection4 {
    public static void main(String[] args) {
            PetriNet pn = new PetriNet();
            pn.PetriNetName = "Main Petri";
            pn.NetworkPort = 1080;

            DataTransfer OP1 = new DataTransfer();
            OP1.SetName("OP1");
            OP1.Value = new TransferOperation("localhost","1081","in1");
            pn.PlaceList.add(OP1);

            DataTransfer OP2 = new DataTransfer();
            OP2.SetName("OP2");
            OP2.Value = new TransferOperation("localhost","1082","in2");
            pn.PlaceList.add(OP2);

            DataTransfer OP3 = new DataTransfer();
            OP3.SetName("OP3");
            OP3.Value = new TransferOperation("localhost","1083","in3");
            pn.PlaceList.add(OP3);

            DataTransfer OP4 = new DataTransfer();
            OP4.SetName("OP4");
            OP4.Value = new TransferOperation("localhost","1084","in4");
            pn.PlaceList.add(OP4);

            DataTransfer OP_tram1 = new DataTransfer();
            OP_tram1.SetName("Op_tram1");
            OP_tram1.Value = new TransferOperation("localhost","1085","tram1");
            pn.PlaceList.add(OP_tram1);

            DataTransfer OP_tram2 = new DataTransfer();
            OP_tram2.SetName("Op_tram1");
            OP_tram2.Value = new TransferOperation("localhost","1086","tram2");
            pn.PlaceList.add(OP_tram2);

            DataCar Pa_1 = new DataCar();
            Pa_1.SetName("Pa_1");
            pn.PlaceList.add(Pa_1);

            DataCar Pa_2 = new DataCar();
            Pa_2.SetName("Pa_2");
            pn.PlaceList.add(Pa_2);

            DataCar Pa_3 = new DataCar();
            Pa_3.SetName("Pa_3");
            pn.PlaceList.add(Pa_3);

            DataCar Pa_4 = new DataCar();
            Pa_4.SetName("Pa_4");
            pn.PlaceList.add(Pa_4);

            DataCar Pa_5 = new DataCar();
            Pa_5.SetName("Pa_5");
            pn.PlaceList.add(Pa_5);

            DataCar Pa_6 = new DataCar();
            Pa_6.SetName("Pa_6");
            pn.PlaceList.add(Pa_6);

            DataCar Pb_1 = new DataCar();
            Pb_1.SetName("Pb_1");
            pn.PlaceList.add(Pb_1);

            DataCar Pb_2 = new DataCar();
            Pb_2.SetName("Pb_2");
            pn.PlaceList.add(Pb_2);

            DataCar Pb_3 = new DataCar();
            Pb_3.SetName("Pb_3");
            pn.PlaceList.add(Pb_3);

            DataCar Pb_4 = new DataCar();
            Pb_4.SetName("Pb_4");
            pn.PlaceList.add(Pb_4);

            DataCar Pb_5 = new DataCar();
            Pb_5.SetName("Pb_5");
            pn.PlaceList.add(Pb_5);

            DataCar Pb_6 = new DataCar();
            Pb_6.SetName("Pb_6");
            pn.PlaceList.add(Pb_6);

            DataCarQueue PO_1 = new DataCarQueue();
            PO_1.Value.Size = 3;
            PO_1.SetName("PO_1");
            pn.PlaceList.add(PO_1);

            DataCarQueue PO_2 = new DataCarQueue();
            PO_2.Value.Size = 3;
            PO_2.SetName("PO_2");
            pn.PlaceList.add(PO_2);

            DataCarQueue PO_3 = new DataCarQueue();
            PO_3.Value.Size = 3;
            PO_3.SetName("PO_3");
            pn.PlaceList.add(PO_3);

            DataCarQueue PO_4 = new DataCarQueue();
            PO_4.Value.Size = 3;
            PO_4.SetName("PO_4");
            pn.PlaceList.add(PO_4);

            DataCar P_OE_1 = new DataCar();
            P_OE_1.SetName("P_OE_1");
            pn.PlaceList.add(P_OE_1);

            DataCar P_OE_2 = new DataCar();
            P_OE_2.SetName("P_OE_2");
            pn.PlaceList.add(P_OE_2);

            DataCar P_OE_3 = new DataCar();
            P_OE_3.SetName("P_OE_3");
            pn.PlaceList.add(P_OE_3);

            DataString P_TL_1 = new DataString();
            P_TL_1.SetName("P_TL_1");
            P_TL_1.SetValue("red");
            pn.PlaceList.add(P_TL_1);

            DataString P_TL_2 = new DataString();
            P_TL_2.SetName("P_TL_2");
            P_TL_2.SetValue("red");
            pn.PlaceList.add(P_TL_2);

            DataString P_TL_3 = new DataString();
            P_TL_3.SetName("P_TL_3");
            P_TL_3.SetValue("red");
            pn.PlaceList.add(P_TL_3);

            DataCarQueue P_X_1 = new DataCarQueue();
            P_X_1.Value.Size = 3;
            P_X_1.SetName("P_X_1");
            pn.PlaceList.add(P_X_1);

            DataCarQueue P_X_2 = new DataCarQueue();
            P_X_2.Value.Size = 3;
            P_X_2.SetName("P_X_2");
            pn.PlaceList.add(P_X_2);

            DataCarQueue P_X_3 = new DataCarQueue();
            P_X_3.Value.Size = 3;
            P_X_3.SetName("P_X_3");
            pn.PlaceList.add(P_X_3);

            DataCarQueue P_INT_1 = new DataCarQueue();
            P_INT_1.Value.Size = 20;
            P_INT_1.SetName("P_INT_1");
            pn.PlaceList.add(P_INT_1);

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

    }
}
