package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;

public class Controller1 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Controller1";
        pn.SetName("Controller1");
        pn.NetworkPort = 1081;

        DataString ini = new DataString();
        ini.SetName("P_ini");
        ini.SetValue("red");
        pn.ConstantPlaceList.add(ini);

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

        DataInteger Five = new DataInteger();
        Five.SetName("FIVE");
        Five.SetValue(5);
        pn.ConstantPlaceList.add(Five);

        DataInteger Ten = new DataInteger();
        Ten.SetName("TEN");
        Ten.SetValue(10);
        pn.ConstantPlaceList.add(Ten);

        // CONTROLLER STATES
        DataString p1 = new DataString();
        p1.SetName("r1r2r3");
        p1.SetValue("signal");
        pn.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("g1r2r3");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("y1r2r3");
        pn.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("r1g2r3");
        pn.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("r1y2r3");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("r1r2g3");
        pn.PlaceList.add(p6);

        DataString p7 = new DataString();
        p7.SetName("r1r2y3");
        pn.PlaceList.add(p7);

        DataTransfer p8 = new DataTransfer();
        p8.SetName("OP1");
        p8.Value = new TransferOperation("localhost", "1080", "P_TL1");
        pn.PlaceList.add(p8);

        DataTransfer p9 = new DataTransfer();
        p9.SetName("OP2");
        p9.Value = new TransferOperation("localhost", "1080", "P_TL2i");
        pn.PlaceList.add(p9);

        DataTransfer p10 = new DataTransfer();
        p10.SetName("OP3");
        p10.Value = new TransferOperation("localhost", "1080", "P_TL3i");
        pn.PlaceList.add(p10);

        DataString in1 = new DataString();
        in1.SetName("in1");
        pn.PlaceList.add(in1);

        DataString in2 = new DataString();
        in2.SetName("in2");
        pn.PlaceList.add(in2);

        DataString in3 = new DataString();
        in3.SetName("in3");
        pn.PlaceList.add(in3);

        DataString p_f1 = new DataString();
        p_f1.SetName("p_f1");
        pn.PlaceList.add(p_f1);

        DataString p_f2 = new DataString();
        p_f2.SetName("p_f2");
        pn.PlaceList.add(p_f2);

        DataString p_f3 = new DataString();
        p_f3.SetName("p_f3");
        pn.PlaceList.add(p_f3);
    }
}
