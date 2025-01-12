package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;

public class Controller2 {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Controller2";
        pn.SetName("Controller2");
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

        // PLACES STATES

        DataString R1R2R3R4 = new DataString();
        R1R2R3R4.SetName("R1R2R3R4");
        R1R2R3R4.SetValue("signal");
        pn.PlaceList.add(R1R2R3R4);

        DataString G1R2R3R4 = new DataString();
        G1R2R3R4.SetName("G1R2R3R4");
        pn.PlaceList.add(G1R2R3R4);

        DataString Y1R2R3R4 = new DataString();
        Y1R2R3R4.SetName("Y1R2R3R4");
        pn.PlaceList.add(Y1R2R3R4);

        DataString R1G2R3R4 = new DataString();
        R1G2R3R4.SetName("R1G2R3R4");
        pn.PlaceList.add(R1G2R3R4);

        DataString R1Y2R3R4 = new DataString();
        R1Y2R3R4.SetName("R1Y2R3R4");
        pn.PlaceList.add(R1Y2R3R4);

        DataString R1R2G3R4 = new DataString();
        R1R2G3R4.SetName("R1R2G3R4");
        pn.PlaceList.add(R1R2G3R4);

        DataString R1R2Y3R4 = new DataString();
        R1R2Y3R4.SetName("R1R2Y3R4");
        pn.PlaceList.add(R1R2Y3R4);

        DataString R1R2R3G4 = new DataString();
        R1R2R3G4.SetName("R1R2R3G4");
        pn.PlaceList.add(R1R2R3G4);

        DataString R1R2R3Y4 = new DataString();
        R1R2R3Y4.SetName("R1R2R3Y4");
        pn.PlaceList.add(R1R2R3Y4);
    }
}
