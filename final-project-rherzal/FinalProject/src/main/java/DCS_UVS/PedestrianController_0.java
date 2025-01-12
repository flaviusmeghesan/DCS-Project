package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class PedestrianController_0 {

    public static void main (String []args) {

        PetriNet pn  = new PetriNet();
        pn.PetriNetName = "PED_CROSSING_CONTROLLER_1";
        pn.SetName("PED_CROSSING_CONTROLLER_1");
        pn.NetworkPort = 1083;

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

        DataString USREQ_CANTEMIR_1 = new DataString();
        USREQ_CANTEMIR_1.SetName("USREQ_CANTEMIR_1");
        pn.PlaceList.add(USREQ_CANTEMIR_1);

        DataString GR = new DataString();
        GR.SetName("GR");
        GR.SetValue("signal");
        pn.PlaceList.add(GR);

        DataString YR = new DataString();
        YR.SetName("YR");
        pn.PlaceList.add(YR);

        DataString RG = new DataString();
        RG.SetName("RG");
        pn.PlaceList.add(RG);

        DataString RY = new DataString();
        RY.SetName("RY");
        pn.PlaceList.add(RY);

        DataString P_INI = new DataString();
        P_INI.SetName("P_INI");
        pn.PlaceList.add(P_INI);

        DataString WAIT = new DataString();
        WAIT.SetName("WAIT");
        pn.PlaceList.add(WAIT);

        DataTransfer P_CANTEMIR_TL_1 = new DataTransfer();
        P_CANTEMIR_TL_1.SetName("P_CANTEMIR_TL_1");
        P_CANTEMIR_TL_1.Value = new TransferOperation("localhost", "1080" , "P_CANTEMIR_TL_1");
        pn.PlaceList.add(P_CANTEMIR_TL_1);

        DataTransfer P_CANTEMIR_PTL_1 = new DataTransfer();
        P_CANTEMIR_PTL_1.SetName("P_CANTEMIR_PTL_1");
        P_CANTEMIR_PTL_1.Value = new TransferOperation("localhost", "1080" , "P_CANTEMIR_PTL_1");
        pn.PlaceList.add(P_CANTEMIR_PTL_1);

        //-------------------Transitions-----------------------
        PetriTransition T_INI = new PetriTransition(pn);
        T_INI.SetName("T_INI");
        T_INI.InputPlaceName.add("P_INI");
        Condition T_INIC = new Condition(T_INI,"P_INI", TransitionCondition.NotNull);

        GuardMapping T_INIGrd = new GuardMapping();
        T_INIGrd.condition = T_INIC;

        T_INIGrd.Activations.add(new Activation(T_INI,"green", TransitionOperation.SendOverNetwork,"P_CANTEMIR_TL_1"));
        T_INIGrd.Activations.add(new Activation(T_INI,"red", TransitionOperation.SendOverNetwork,"P_CANTEMIR_PTL_1"));

        T_INI.GuardMappingList.add(T_INIGrd);

        T_INI.Delay = 0;

        pn.Transitions.add(T_INI);

        PetriTransition T1 = new PetriTransition(pn);
        T1.SetName("T1");
        T1.InputPlaceName.add("USREQ_CANTEMIR_1");
        T1.InputPlaceName.add("WAIT");

        Condition T1C1 = new Condition(T1, "USREQ_CANTEMIR_1", TransitionCondition.NotNull);
        Condition T1C2 = new Condition(T1, "WAIT", TransitionCondition.NotNull);

        T1C1.SetNextCondition(LogicConnector.AND,T1C2);

        GuardMapping T1Grd = new GuardMapping();
        T1Grd.condition = T1C1;
        T1Grd.Activations.add(new Activation(T1,"WAIT", TransitionOperation.Move,"YR"));
        T1Grd.Activations.add(new Activation(T1,"yellow", TransitionOperation.SendOverNetwork,"P_CANTEMIR_TL_1"));

        T1.GuardMappingList.add(T1Grd);

        T1.Delay = 0;
        pn.Transitions.add(T1);

        PetriTransition T2 = new PetriTransition(pn);
        T2.SetName("T2");
        T2.InputPlaceName.add("YR");

        Condition T2C1 = new Condition(T2, "YR", TransitionCondition.NotNull);

        GuardMapping T2Grd = new GuardMapping();
        T2Grd.condition = T2C1;
        T2Grd.Activations.add(new Activation(T2, "YR", TransitionOperation.Move,"RG"));
        T2Grd.Activations.add(new Activation(T2,"red", TransitionOperation.SendOverNetwork,"P_CANTEMIR_TL_1"));
        T2Grd.Activations.add(new Activation(T2,"green", TransitionOperation.SendOverNetwork,"P_CANTEMIR_PTL_1"));

        T2.GuardMappingList.add(T2Grd);
        T2.Delay = 5;
        pn.Transitions.add(T2);

        PetriTransition T3 = new PetriTransition(pn);
        T3.SetName("T3");
        T3.InputPlaceName.add("RG");
        Condition T3C1 = new Condition(T3, "RG", TransitionCondition.NotNull);

        GuardMapping T3Grd = new GuardMapping();
        T3Grd.condition = T3C1;
        T3Grd.Activations.add(new Activation(T3,"RG", TransitionOperation.Move,"RY"));
        T3Grd.Activations.add(new Activation(T3,"yellow", TransitionOperation.SendOverNetwork,"P_CANTEMIR_PTL_1"));

        T3.GuardMappingList.add(T3Grd);
        T3.Delay = 5;
        pn.Transitions.add(T3);

        PetriTransition T4 = new PetriTransition(pn);
        T4.SetName("T4");
        T4.InputPlaceName.add("RY");
        Condition T4C1 = new Condition(T4, "RY", TransitionCondition.NotNull);

        GuardMapping T4Grd = new GuardMapping();
        T4Grd.condition = T4C1;
        T4Grd.Activations.add(new Activation(T4,"RY", TransitionOperation.Move,"GR"));
        T4Grd.Activations.add(new Activation(T4,"green", TransitionOperation.SendOverNetwork,"P_CANTEMIR_TL_1"));
        T4Grd.Activations.add(new Activation(T4,"red", TransitionOperation.SendOverNetwork,"P_CANTEMIR_PTL_1"));

        T4.GuardMappingList.add(T4Grd);
        T4.Delay = 2;
        pn.Transitions.add(T4);

        PetriTransition T5 = new PetriTransition(pn);
        T5.SetName("T5");
        T5.InputPlaceName.add("GR");
        Condition T5C1 = new Condition(T5, "GR", TransitionCondition.NotNull);

        GuardMapping T5Grd = new GuardMapping();
        T5Grd.condition = T5C1;
        T5Grd.Activations.add(new Activation(T5,"GR", TransitionOperation.Move,"WAIT"));

        T5.GuardMappingList.add(T5Grd);
        T5.Delay = 5;
        pn.Transitions.add(T5);

        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Controller started \n ------------------------------");
        pn.Delay = 1000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);








    }
}
