package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller_Intersection_1 {

    public static void main (String []args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "INTERSECTION_1_CONTROLLER";
        pn.SetName("INTERSECTION_1_CONTROLLER");
        pn.NetworkPort = 1081;

        DataString ini = new DataString();
        //ini.Printable = false;
        ini.SetName("P_INI");
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

        // State Places for the controller

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

        DataString IN_CANTEMIRNORD = new DataString();
        IN_CANTEMIRNORD.SetName("IN_CANTEMIRNORD");
        pn.PlaceList.add(IN_CANTEMIRNORD);

        DataString IN_MARASESTIEST = new DataString();
        IN_MARASESTIEST.SetName("IN_MARASESTIEST");
        pn.PlaceList.add(IN_MARASESTIEST);

        DataString IN_CANTEMIRSUD = new DataString();
        IN_CANTEMIRSUD.SetName("IN_CANTEMIRSUD");
        pn.PlaceList.add(IN_CANTEMIRSUD);

        DataString IN_MARASESTIVEST = new DataString();
        IN_MARASESTIVEST.SetName("IN_MARASESTIVEST");
        pn.PlaceList.add(IN_MARASESTIVEST);

        DataString IN_MARASESTIEST_BUS = new DataString();
        IN_MARASESTIEST_BUS.SetName("IN_MARASESTIEST_BUS");
        pn.PlaceList.add(IN_MARASESTIEST_BUS);

        DataString IN_MARASESTIVEST_BUS = new DataString();
        IN_MARASESTIVEST_BUS.SetName("IN_MARASESTIVEST_BUS");
        pn.PlaceList.add(IN_MARASESTIVEST_BUS);

        DataString P_F_CANTEMIRNORD = new DataString();
        P_F_CANTEMIRNORD.SetName("P_F_CANTEMIRNORD");
        pn.PlaceList.add(P_F_CANTEMIRNORD);

        DataString P_F_MARASESTIEST = new DataString();
        P_F_MARASESTIEST.SetName("P_F_MARASESTIEST");
        pn.PlaceList.add(P_F_MARASESTIEST);

        DataString P_F_CANTEMIRSUD = new DataString();
        P_F_CANTEMIRSUD.SetName("P_F_CANTEMIRSUD");
        pn.PlaceList.add(P_F_CANTEMIRSUD);

        DataString P_F_MARASESTIVEST = new DataString();
        P_F_MARASESTIVEST.SetName("P_F_MARASESTIVEST");
        pn.PlaceList.add(P_F_MARASESTIVEST);

        DataString P_F_MARASESTIEST_BUS = new DataString();
        P_F_MARASESTIEST_BUS.SetName("P_F_MARASESTIEST_BUS");
        pn.PlaceList.add(P_F_MARASESTIEST_BUS);

        DataString P_F_MARASESTIVEST_BUS = new DataString();
        P_F_MARASESTIVEST_BUS.SetName("P_F_MARASESTIVEST_BUS");
        pn.PlaceList.add(P_F_MARASESTIVEST_BUS);

        DataTransfer OP_CANTEMIRNORD = new DataTransfer();
        OP_CANTEMIRNORD.SetName("OP_CANTEMIRNORD");
        OP_CANTEMIRNORD.Value = new TransferOperation("localhost", "1080" , "P_CANTEMIRNORD_TL");
        pn.PlaceList.add(OP_CANTEMIRNORD);

        DataTransfer OP_MARASESTIEST = new DataTransfer();
        OP_MARASESTIEST.SetName("OP_MARASESTIEST");
        OP_MARASESTIEST.Value = new TransferOperation("localhost", "1080" , "P_MARASESTIEST_TL");
        pn.PlaceList.add(OP_MARASESTIEST);

        DataTransfer OP_CANTEMIRSUD = new DataTransfer();
        OP_CANTEMIRSUD.SetName("OP_CANTEMIRSUD");
        OP_CANTEMIRSUD.Value = new TransferOperation("localhost", "1080" , "P_CANTEMIRSUD_TL");
        pn.PlaceList.add(OP_CANTEMIRSUD);

        DataTransfer OP_MARASESTIVEST = new DataTransfer();
        OP_MARASESTIVEST.SetName("OP_MARASESTIVEST");
        OP_MARASESTIVEST.Value = new TransferOperation("localhost", "1080" , "P_MARASESTIVEST_TL");
        pn.PlaceList.add(OP_MARASESTIVEST);

        DataTransfer OP_MARASESTIEST_BUS = new DataTransfer();
        OP_MARASESTIEST_BUS.SetName("OP_MARASESTIEST_BUS");
        OP_MARASESTIEST_BUS.Value = new TransferOperation("localhost", "1080" , "P_MARASESTIEST_BUS_TL");
        pn.PlaceList.add(OP_MARASESTIEST_BUS);

        DataTransfer OP_MARASESTIVEST_BUS = new DataTransfer();
        OP_MARASESTIVEST_BUS.SetName("OP_MARASESTIVEST_BUS");
        OP_MARASESTIVEST_BUS.Value = new TransferOperation("localhost", "1080" , "P_MARASESTIVEST_BUS_TL");
        pn.PlaceList.add(OP_MARASESTIVEST_BUS);


        //----------------------------T_INI------------------------------------
        PetriTransition T_INI = new PetriTransition(pn);
        T_INI.TransitionName = "T_INI";

        Condition T_INICT1 = new Condition(T_INI, "P_INI", TransitionCondition.NotNull);

        GuardMapping grdT_INI = new GuardMapping();
        grdT_INI.condition= T_INICT1;

        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_CANTEMIRNORD"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_CANTEMIRSUD"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST_BUS"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST_BUS"));
        grdT_INI.Activations.add(new Activation(T_INI, "", TransitionOperation.MakeNull, "P_INI"));

        T_INI.GuardMappingList.add(grdT_INI);

        T_INI.Delay = 0;
        pn.Transitions.add(T_INI);



        //----------------------------T1------------------------------------
        PetriTransition T1 = new PetriTransition(pn);
        T1.TransitionName = "T1";
        T1.InputPlaceName.add("R1R2R3R4");


        Condition T1CT1 = new Condition(T1, "R1R2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition= T1CT1;

        grdT1.Activations.add(new Activation(T1, "R1R2R3R4", TransitionOperation.Move, "G1R2R3R4"));
        grdT1.Activations.add(new Activation(T1, "red", TransitionOperation.Move, "P_F_CANTEMIRNORD"));
        grdT1.Activations.add(new Activation(T1, "green", TransitionOperation.SendOverNetwork, "OP_CANTEMIRNORD"));
        T1.GuardMappingList.add(grdT1);

        T1.Delay = 5;
        pn.Transitions.add(T1);

        //----------------------------T2------------------------------------
        PetriTransition T2 = new PetriTransition(pn);
        T2.TransitionName = "T2";
        T2.InputPlaceName.add("G1R2R3R4");


        Condition T2CT1 = new Condition(T2, "G1R2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2CT1;
        grdT2.Activations.add(new Activation(T2, "G1R2R3R4", TransitionOperation.Move, "Y1R2R3R4"));
        grdT2.Activations.add(new Activation(T2, "yellow", TransitionOperation.SendOverNetwork, "OP_CANTEMIRNORD"));

        T2.GuardMappingList.add(grdT2);

        T2.Delay = 5;
        pn.Transitions.add(T2);


        //----------------------------T3------------------------------------
        PetriTransition T3 = new PetriTransition(pn);
        T3.TransitionName = "T3";
        T3.InputPlaceName.add("Y1R2R3R4");



        Condition T3CT1 = new Condition(T3, "Y1R2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3CT1;
        grdT3.Activations.add(new Activation(T3, "Y1R2R3R4", TransitionOperation.Move, "R1G2R3R4"));
        grdT3.Activations.add(new Activation(T3, "Y1R2R3R4", TransitionOperation.Move, "P_F_MARASESTIEST"));
        grdT3.Activations.add(new Activation(T3, "Y1R2R3R4", TransitionOperation.Move, "P_F_MARASESTIEST_BUS"));
        grdT3.Activations.add(new Activation(T3, "red", TransitionOperation.SendOverNetwork, "OP_CANTEMIRNORD"));
        grdT3.Activations.add(new Activation(T3, "green", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST"));
        grdT3.Activations.add(new Activation(T3, "green", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST_BUS"));

        T3.GuardMappingList.add(grdT3);

        T3.Delay = 5;
        pn.Transitions.add(T3);


        //----------------------------T4------------------------------------
        PetriTransition T4 = new PetriTransition(pn);
        T4.TransitionName = "T4";
        T4.InputPlaceName.add("R1G2R3R4");


        Condition T4CT1 = new Condition(T4, "R1G2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition= T4CT1;
        grdT4.Activations.add(new Activation(T4, "R1G2R3R4", TransitionOperation.Move, "R1Y2R3R4"));
        grdT4.Activations.add(new Activation(T4, "yellow", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST"));
        grdT4.Activations.add(new Activation(T4, "yellow", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST_BUS"));

        T4.GuardMappingList.add(grdT4);

        T4.Delay = 5;
        pn.Transitions.add(T4);


        //----------------------------T5------------------------------------
        PetriTransition T5 = new PetriTransition(pn);
        T5.TransitionName = "T5";
        T5.InputPlaceName.add("R1Y2R3R4");


        Condition T5CT1 = new Condition(T5, "R1Y2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition= T5CT1;
        grdT5.Activations.add(new Activation(T5, "R1Y2R3R4", TransitionOperation.Move, "R1R2G3R4"));
        grdT5.Activations.add(new Activation(T5, "R1Y2R3R4", TransitionOperation.Move, "P_F_CANTEMIRSUD"));
        grdT5.Activations.add(new Activation(T5, "red", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST"));
        grdT5.Activations.add(new Activation(T5, "red", TransitionOperation.SendOverNetwork, "OP_MARASESTIEST_BUS"));
        grdT5.Activations.add(new Activation(T5, "green", TransitionOperation.SendOverNetwork, "OP_CANTEMIRSUD"));


        T5.GuardMappingList.add(grdT5);

        T5.Delay = 5;
        pn.Transitions.add(T5);

        //----------------------------T6------------------------------------
        PetriTransition T6 = new PetriTransition(pn);
        T6.TransitionName = "T6";
        T6.InputPlaceName.add("R1R2G3R4");


        Condition T6CT1 = new Condition(T6, "R1R2G3R4", TransitionCondition.NotNull);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition= T6CT1;
        grdT6.Activations.add(new Activation(T6, "R1R2G3R4", TransitionOperation.Move, "R1R2Y3R4"));
        grdT6.Activations.add(new Activation(T6, "yellow", TransitionOperation.SendOverNetwork, "OP_CANTEMIRSUD"));


        T6.GuardMappingList.add(grdT6);

        T6.Delay = 5;
        pn.Transitions.add(T6);

        //----------------------------T7------------------------------------
        PetriTransition T7 = new PetriTransition(pn);
        T7.TransitionName = "T7";
        T7.InputPlaceName.add("R1R2Y3R4");


        Condition T7CT1 = new Condition(T7, "R1R2Y3R4", TransitionCondition.NotNull);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition= T7CT1;
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "R1R2R3G4"));
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "P_F_MARASESTIVEST"));
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "P_F_MARASESTIVEST_BUS"));
        grdT7.Activations.add(new Activation(T7, "green", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST"));
        grdT7.Activations.add(new Activation(T7, "green", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST_BUS"));
        grdT7.Activations.add(new Activation(T7, "red", TransitionOperation.SendOverNetwork, "OP_CANTEMIRSUD"));


        T7.GuardMappingList.add(grdT7);

        T7.Delay = 5;
        pn.Transitions.add(T7);

        //----------------------------T8------------------------------------
        PetriTransition T8 = new PetriTransition(pn);
        T8.TransitionName = "T8";
        T8.InputPlaceName.add("R1R2R3G4");


        Condition T8CT1 = new Condition(T8, "R1R2R3G4", TransitionCondition.NotNull);

        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition= T8CT1;
        grdT8.Activations.add(new Activation(T8, "R1R2R3G4", TransitionOperation.Move, "R1R2R3Y4"));
        grdT8.Activations.add(new Activation(T8, "yellow", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST"));
        grdT8.Activations.add(new Activation(T8, "yellow", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST_BUS"));


        T8.GuardMappingList.add(grdT8);

        T8.Delay = 5;
        pn.Transitions.add(T8);

        //----------------------------T9------------------------------------
        PetriTransition T9 = new PetriTransition(pn);
        T9.TransitionName = "T9";
        T9.InputPlaceName.add("R1R2R3Y4");


        Condition T9CT1 = new Condition(T9, "R1R2R3Y4", TransitionCondition.NotNull);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition= T9CT1;
        grdT9.Activations.add(new Activation(T9, "R1R2R3Y4", TransitionOperation.Move, "R1R2R3R4"));
        grdT9.Activations.add(new Activation(T9, "red", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST"));
        grdT9.Activations.add(new Activation(T9, "red", TransitionOperation.SendOverNetwork, "OP_MARASESTIVEST_BUS"));


        T9.GuardMappingList.add(grdT9);

        T9.Delay = 5;
        pn.Transitions.add(T9);

        //----------------------------T_F_CANTEMIRNORD------------------------------------
        PetriTransition T_F_CANTEMIRNORD = new PetriTransition(pn);
        T_F_CANTEMIRNORD.TransitionName = "T_F_CANTEMIRNORD";
        T_F_CANTEMIRNORD.InputPlaceName.add("P_F_CANTEMIRNORD");
        T_F_CANTEMIRNORD.InputPlaceName.add("IN_CANTEMIRNORD");
        T_F_CANTEMIRNORD.IsAsync = true;

        Condition T_F_CANTEMIRNORD_1_CT1 = new Condition(T_F_CANTEMIRNORD, "P_F_CANTEMIRNORD", TransitionCondition.NotNull);
        Condition T_F_CANTEMIRNORD_1_CT2 = new Condition(T_F_CANTEMIRNORD, "IN_CANTEMIRNORD", TransitionCondition.IsNull);
        T_F_CANTEMIRNORD_1_CT1.SetNextCondition(LogicConnector.AND, T_F_CANTEMIRNORD_1_CT2);

        GuardMapping grdT_F_CANTEMIRNORD_1 = new GuardMapping();
        grdT_F_CANTEMIRNORD_1.condition= T_F_CANTEMIRNORD_1_CT1;
        grdT_F_CANTEMIRNORD_1.Activations.add(new Activation(T2, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_CANTEMIRNORD.GuardMappingList.add(grdT_F_CANTEMIRNORD_1);

        Condition T_F_CANTEMIRNORD_2_CT1 = new Condition(T_F_CANTEMIRNORD, "P_F_CANTEMIRNORD", TransitionCondition.NotNull);
        Condition T_F_CANTEMIRNORD_2_CT2 = new Condition(T_F_CANTEMIRNORD, "IN_CANTEMIRNORD", TransitionCondition.NotNull);
        T_F_CANTEMIRNORD_2_CT1.SetNextCondition(LogicConnector.AND, T_F_CANTEMIRNORD_2_CT2);

        GuardMapping grdT_F_CANTEMIRNORD_2 = new GuardMapping();
        grdT_F_CANTEMIRNORD_2.condition= T_F_CANTEMIRNORD_2_CT1;
        grdT_F_CANTEMIRNORD_2.Activations.add(new Activation(T2, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_CANTEMIRNORD.GuardMappingList.add(grdT_F_CANTEMIRNORD_2);

        T_F_CANTEMIRNORD.Delay = 0;
        pn.Transitions.add(T_F_CANTEMIRNORD);

        //----------------------------T_F_MARASESTIEST------------------------------------
        PetriTransition T_F_MARASESTIEST = new PetriTransition(pn);
        T_F_MARASESTIEST.TransitionName = "T_F_MARASESTIEST";
        T_F_MARASESTIEST.InputPlaceName.add("P_F_MARASESTIEST");
        T_F_MARASESTIEST.InputPlaceName.add("IN_MARASESTIEST");
        T_F_MARASESTIEST.IsAsync = true;

        Condition T_F_MARASESTIEST_1_CT1 = new Condition(T_F_MARASESTIEST, "P_F_MARASESTIEST", TransitionCondition.NotNull);
        Condition T_F_MARASESTIEST_1_CT2 = new Condition(T_F_MARASESTIEST, "IN_MARASESTIEST", TransitionCondition.IsNull);
        T_F_MARASESTIEST_1_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIEST_1_CT2);

        GuardMapping grdT_F_MARASESTIEST_1 = new GuardMapping();
        grdT_F_MARASESTIEST_1.condition= T_F_MARASESTIEST_1_CT1;
        grdT_F_MARASESTIEST_1.Activations.add(new Activation(T4, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIEST.GuardMappingList.add(grdT_F_MARASESTIEST_1);

        Condition T_F_MARASESTIEST_2_CT1 = new Condition(T_F_MARASESTIEST, "P_F_MARASESTIEST", TransitionCondition.NotNull);
        Condition T_F_MARASESTIEST_2_CT2 = new Condition(T_F_MARASESTIEST, "IN_MARASESTIEST", TransitionCondition.NotNull);
        T_F_MARASESTIEST_2_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIEST_2_CT2);

        GuardMapping grdT_F_MARASESTIEST_2 = new GuardMapping();
        grdT_F_MARASESTIEST_2.condition= T_F_MARASESTIEST_2_CT1;
        grdT_F_MARASESTIEST_2.Activations.add(new Activation(T4, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIEST.GuardMappingList.add(grdT_F_MARASESTIEST_2);

        T_F_MARASESTIEST.Delay = 0;
        pn.Transitions.add(T_F_MARASESTIEST);

        //----------------------------T_F_MARASESTIEST_BUS------------------------------------
        PetriTransition T_F_MARASESTIEST_BUS = new PetriTransition(pn);
        T_F_MARASESTIEST_BUS.TransitionName = "T_F_MARASESTIEST_BUS";
        T_F_MARASESTIEST_BUS.InputPlaceName.add("P_F_MARASESTIEST_BUS");
        T_F_MARASESTIEST_BUS.InputPlaceName.add("IN_MARASESTIEST_BUS");
        T_F_MARASESTIEST_BUS.IsAsync = true;

        Condition T_F_MARASESTIEST_BUS_1_CT1 = new Condition(T_F_MARASESTIEST_BUS, "P_F_MARASESTIEST_BUS", TransitionCondition.NotNull);
        Condition T_F_MARASESTIEST_BUS_1_CT2 = new Condition(T_F_MARASESTIEST_BUS, "IN_MARASESTIEST_BUS", TransitionCondition.IsNull);
        T_F_MARASESTIEST_BUS_1_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIEST_BUS_1_CT2);

        GuardMapping grdT_F_MARASESTIEST_BUS_1 = new GuardMapping();
        grdT_F_MARASESTIEST_BUS_1.condition= T_F_MARASESTIEST_BUS_1_CT1;
        grdT_F_MARASESTIEST_BUS_1.Activations.add(new Activation(T4, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIEST_BUS.GuardMappingList.add(grdT_F_MARASESTIEST_BUS_1);

        Condition T_F_MARASESTIEST_BUS_2_CT1 = new Condition(T_F_MARASESTIEST_BUS, "P_F_MARASESTIEST_BUS", TransitionCondition.NotNull);
        Condition T_F_MARASESTIEST_BUS_2_CT2 = new Condition(T_F_MARASESTIEST_BUS, "IN_MARASESTIEST_BUS", TransitionCondition.NotNull);
        T_F_MARASESTIEST_BUS_2_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIEST_BUS_2_CT2);

        GuardMapping grdT_F_MARASESTIEST_BUS_2 = new GuardMapping();
        grdT_F_MARASESTIEST_BUS_2.condition= T_F_MARASESTIEST_BUS_2_CT1;
        grdT_F_MARASESTIEST_BUS_2.Activations.add(new Activation(T4, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIEST_BUS.GuardMappingList.add(grdT_F_MARASESTIEST_BUS_2);

        T_F_MARASESTIEST_BUS.Delay = 0;
        pn.Transitions.add(T_F_MARASESTIEST_BUS);

        //----------------------------T_F_CANTEMIRSUD------------------------------------
        PetriTransition T_F_CANTEMIRSUD = new PetriTransition(pn);
        T_F_CANTEMIRSUD.TransitionName = "T_F_CANTEMIRSUD";
        T_F_CANTEMIRSUD.InputPlaceName.add("P_F_CANTEMIRSUD");
        T_F_CANTEMIRSUD.InputPlaceName.add("IN_CANTEMIRSUD");
        T_F_CANTEMIRSUD.IsAsync = true;

        Condition T_F_CANTEMIRSUD_1_CT1 = new Condition(T_F_CANTEMIRSUD, "P_F_CANTEMIRSUD", TransitionCondition.NotNull);
        Condition T_F_CANTEMIRSUD_1_CT2 = new Condition(T_F_CANTEMIRSUD, "IN_CANTEMIRSUD", TransitionCondition.IsNull);
        T_F_CANTEMIRSUD_1_CT1.SetNextCondition(LogicConnector.AND, T_F_CANTEMIRSUD_1_CT2);

        GuardMapping grdT_F_CANTEMIRSUD_1 = new GuardMapping();
        grdT_F_CANTEMIRSUD_1.condition= T_F_CANTEMIRSUD_1_CT1;
        grdT_F_CANTEMIRSUD_1.Activations.add(new Activation(T6, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_CANTEMIRSUD.GuardMappingList.add(grdT_F_CANTEMIRSUD_1);

        Condition T_F_CANTEMIRSUD_2_CT1 = new Condition(T_F_CANTEMIRSUD, "P_F_CANTEMIRSUD", TransitionCondition.NotNull);
        Condition T_F_CANTEMIRSUD_2_CT2 = new Condition(T_F_CANTEMIRSUD, "IN_CANTEMIRSUD", TransitionCondition.NotNull);
        T_F_CANTEMIRSUD_2_CT1.SetNextCondition(LogicConnector.AND, T_F_CANTEMIRSUD_2_CT2);

        GuardMapping grdT_F_CANTEMIRSUD_2 = new GuardMapping();
        grdT_F_CANTEMIRSUD_2.condition= T_F_CANTEMIRSUD_2_CT1;
        grdT_F_CANTEMIRSUD_2.Activations.add(new Activation(T6, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_CANTEMIRSUD.GuardMappingList.add(grdT_F_CANTEMIRSUD_2);

        //----------------------------T_F_MARASESTIVEST------------------------------------
        PetriTransition T_F_MARASESTIVEST = new PetriTransition(pn);
        T_F_MARASESTIVEST.TransitionName = "T_F_MARASESTIVEST";
        T_F_MARASESTIVEST.InputPlaceName.add("P_F_MARASESTIVEST");
        T_F_MARASESTIVEST.InputPlaceName.add("IN_MARASESTIVEST");
        T_F_MARASESTIVEST.IsAsync = true;

        Condition T_F_MARASESTIVEST_1_CT1 = new Condition(T_F_MARASESTIVEST, "P_F_MARASESTIVEST", TransitionCondition.NotNull);
        Condition T_F_MARASESTIVEST_1_CT2 = new Condition(T_F_MARASESTIVEST, "IN_MARASESTIVEST", TransitionCondition.IsNull);
        T_F_MARASESTIVEST_1_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIVEST_1_CT2);

        GuardMapping grdT_F_MARASESTIVEST_1 = new GuardMapping();
        grdT_F_MARASESTIVEST_1.condition= T_F_MARASESTIVEST_1_CT1;
        grdT_F_MARASESTIVEST_1.Activations.add(new Activation(T8, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIVEST.GuardMappingList.add(grdT_F_MARASESTIVEST_1);

        Condition T_F_MARASESTIVEST_2_CT1 = new Condition(T_F_MARASESTIVEST, "P_F_MARASESTIVEST", TransitionCondition.NotNull);
        Condition T_F_MARASESTIVEST_2_CT2 = new Condition(T_F_MARASESTIVEST, "IN_MARASESTIVEST", TransitionCondition.NotNull);
        T_F_MARASESTIVEST_2_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIVEST_2_CT2);

        GuardMapping grdT_F_MARASESTIVEST_2 = new GuardMapping();
        grdT_F_MARASESTIVEST_2.condition= T_F_MARASESTIVEST_2_CT1;
        grdT_F_MARASESTIVEST_2.Activations.add(new Activation(T8, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIVEST.GuardMappingList.add(grdT_F_MARASESTIVEST_2);

        T_F_MARASESTIVEST.Delay = 0;
        pn.Transitions.add(T_F_MARASESTIVEST);

        //----------------------------T_F_MARASESTIVEST_BUS------------------------------------
        PetriTransition T_F_MARASESTIVEST_BUS = new PetriTransition(pn);
        T_F_MARASESTIVEST_BUS.TransitionName = "T_F_MARASESTIVEST_BUS";
        T_F_MARASESTIVEST_BUS.InputPlaceName.add("P_F_MARASESTIVEST_BUS");
        T_F_MARASESTIVEST_BUS.InputPlaceName.add("IN_MARASESTIVEST_BUS");
        T_F_MARASESTIVEST_BUS.IsAsync = true;

        Condition T_F_MARASESTIVEST_BUS_1_CT1 = new Condition(T_F_MARASESTIVEST_BUS, "P_F_MARASESTIVEST_BUS", TransitionCondition.NotNull);
        Condition T_F_MARASESTIVEST_BUS_1_CT2 = new Condition(T_F_MARASESTIVEST_BUS, "IN_MARASESTIVEST_BUS", TransitionCondition.IsNull);
        T_F_MARASESTIVEST_BUS_1_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIVEST_BUS_1_CT2);

        GuardMapping grdT_F_MARASESTIVEST_BUS_1 = new GuardMapping();
        grdT_F_MARASESTIVEST_BUS_1.condition= T_F_MARASESTIVEST_BUS_1_CT1;
        grdT_F_MARASESTIVEST_BUS_1.Activations.add(new Activation(T8, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIVEST_BUS.GuardMappingList.add(grdT_F_MARASESTIVEST_BUS_1);

        Condition T_F_MARASESTIVEST_BUS_2_CT1 = new Condition(T_F_MARASESTIVEST_BUS, "P_F_MARASESTIVEST_BUS", TransitionCondition.NotNull);
        Condition T_F_MARASESTIVEST_BUS_2_CT2 = new Condition(T_F_MARASESTIVEST_BUS, "IN_MARASESTIVEST_BUS", TransitionCondition.NotNull);
        T_F_MARASESTIVEST_BUS_2_CT1.SetNextCondition(LogicConnector.AND, T_F_MARASESTIVEST_BUS_2_CT2);

        GuardMapping grdT_F_MARASESTIVEST_BUS_2 = new GuardMapping();
        grdT_F_MARASESTIVEST_BUS_2.condition= T_F_MARASESTIVEST_BUS_2_CT1;
        grdT_F_MARASESTIVEST_BUS_2.Activations.add(new Activation(T8, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_MARASESTIVEST_BUS.GuardMappingList.add(grdT_F_MARASESTIVEST_BUS_2);

        T_F_MARASESTIVEST_BUS.Delay = 0;
        pn.Transitions.add(T_F_MARASESTIVEST_BUS);

        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Controller started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);








    }
}
