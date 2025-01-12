package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller_Intersection_2 {

    public static void main (String []args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "INTERSECTION_2_CONTROLLER";
        pn.SetName("INTERSECTION_2_CONTROLLER");
        pn.NetworkPort = 1082;

        DataString P_INI = new DataString();
        //P_INI.Printable = false;
        P_INI.SetName("P_INI");
        P_INI.SetValue("red");
        pn.ConstantPlaceList.add(P_INI);

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

        DataString IN_CANTEMIR = new DataString();
        IN_CANTEMIR.SetName("IN_CANTEMIR");
        pn.PlaceList.add(IN_CANTEMIR);

        DataString IN_SINCAINORD = new DataString();
        IN_SINCAINORD.SetName("IN_SINCAINORD");
        pn.PlaceList.add(IN_SINCAINORD);

        DataString IN_TINERETULUI = new DataString();
        IN_TINERETULUI.SetName("IN_TINERETULUI");
        pn.PlaceList.add(IN_TINERETULUI);

        DataString IN_SERBANVODA = new DataString();
        IN_SERBANVODA.SetName("IN_SERBANVODA");
        pn.PlaceList.add(IN_SERBANVODA);

        DataString IN_SINCAINORD_BUS = new DataString();
        IN_SINCAINORD_BUS.SetName("IN_SINCAINORD_BUS");
        pn.PlaceList.add(IN_SINCAINORD_BUS);

        DataString IN_SERBANVODA_BUS = new DataString();
        IN_SERBANVODA_BUS.SetName("IN_SERBANVODA_BUS");
        pn.PlaceList.add(IN_SERBANVODA_BUS);

        DataString P_F_CANTEMIR = new DataString();
        P_F_CANTEMIR.SetName("P_F_CANTEMIR");
        pn.PlaceList.add(P_F_CANTEMIR);

        DataString P_F_SINCAINORD = new DataString();
        P_F_SINCAINORD.SetName("P_F_SINCAINORD");
        pn.PlaceList.add(P_F_SINCAINORD);

        DataString P_F_TINERETULUI = new DataString();
        P_F_TINERETULUI.SetName("P_F_TINERETULUI");
        pn.PlaceList.add(P_F_TINERETULUI);

        DataString P_F_SERBANVODA = new DataString();
        P_F_SERBANVODA.SetName("P_F_SERBANVODA");
        pn.PlaceList.add(P_F_SERBANVODA);

        DataString P_F_SINCAINORD_BUS = new DataString();
        P_F_SINCAINORD_BUS.SetName("P_F_SINCAINORD_BUS");
        pn.PlaceList.add(P_F_SINCAINORD_BUS);

        DataString P_F_SERBANVODA_BUS = new DataString();
        P_F_SERBANVODA_BUS.SetName("P_F_SERBANVODA_BUS");
        pn.PlaceList.add(P_F_SERBANVODA_BUS);

        DataTransfer OP_CANTEMIR = new DataTransfer();
        OP_CANTEMIR.SetName("OP_CANTEMIR");
        OP_CANTEMIR.Value = new TransferOperation("localhost", "1080" , "P_CANTEMIR_TL");
        pn.PlaceList.add(OP_CANTEMIR);



        DataTransfer OP_TINERETULUI = new DataTransfer();
        OP_TINERETULUI.SetName("OP_TINERETULUI");
        OP_TINERETULUI.Value = new TransferOperation("localhost", "1080" , "P_TINERETULUI_TL");
        pn.PlaceList.add(OP_TINERETULUI);

        DataTransfer OP_SERBANVODA = new DataTransfer();
        OP_SERBANVODA.SetName("OP_SERBANVODA");
        OP_SERBANVODA.Value = new TransferOperation("localhost", "1080" , "P_SERBANVODA_TL");
        pn.PlaceList.add(OP_SERBANVODA);

        DataTransfer OP_SINCAINORD_BUS = new DataTransfer();
        OP_SINCAINORD_BUS.SetName("OP_SINCAINORD_BUS");
        OP_SINCAINORD_BUS.Value = new TransferOperation("localhost", "1080" , "P_SINCAINORD_BUS_TL");
        pn.PlaceList.add(OP_SINCAINORD_BUS);

        DataTransfer OP_SINCAI = new DataTransfer();
        OP_SINCAI.SetName("OP_SINCAI");
        OP_SINCAI.Value = new TransferOperation("localhost", "1080" , "P_SINCAI_TL");
        pn.PlaceList.add(OP_SINCAI);

        DataTransfer OP_SERBANVODA_BUS = new DataTransfer();
        OP_SERBANVODA_BUS.SetName("OP_SERBANVODA_BUS");
        OP_SERBANVODA_BUS.Value = new TransferOperation("localhost", "1080" , "P_SERBANVODA_BUS_TL");
        pn.PlaceList.add(OP_SERBANVODA_BUS);


        //----------------------------T_INI------------------------------------
        PetriTransition T_INI = new PetriTransition(pn);
        T_INI.TransitionName = "T_INI";

        Condition T_INICT1 = new Condition(T_INI, "P_INI", TransitionCondition.NotNull);

        GuardMapping grdT_INI = new GuardMapping();
        grdT_INI.condition= T_INICT1;

        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_CANTEMIR"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_TINERETULUI"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_SERBANVODA"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_SINCAI"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_SINCAINORD_BUS"));
        grdT_INI.Activations.add(new Activation(T_INI, "P_INI", TransitionOperation.SendOverNetwork, "OP_SERBANVODA_BUS"));
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
        grdT1.Activations.add(new Activation(T1, "R1R2R3R4", TransitionOperation.Move, "P_F_CANTEMIR"));
        grdT1.Activations.add(new Activation(T1, "green", TransitionOperation.SendOverNetwork, "OP_CANTEMIR"));

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
        grdT2.Activations.add(new Activation(T2, "yellow", TransitionOperation.SendOverNetwork, "OP_CANTEMIR"));

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
        grdT3.Activations.add(new Activation(T3, "Y1R2R3R4", TransitionOperation.Move, "P_F_SINCAINORD"));
        grdT3.Activations.add(new Activation(T3, "Y1R2R3R4", TransitionOperation.Move, "P_F_SINCAINORD_BUS"));
        grdT3.Activations.add(new Activation(T3, "red", TransitionOperation.SendOverNetwork, "OP_CANTEMIR"));
        grdT3.Activations.add(new Activation(T3, "green", TransitionOperation.SendOverNetwork, "OP_SINCAI"));
        grdT3.Activations.add(new Activation(T3, "green", TransitionOperation.SendOverNetwork, "OP_SINCAINORD_BUS"));


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
        grdT4.Activations.add(new Activation(T4, "yellow", TransitionOperation.SendOverNetwork, "OP_SINCAI"));
        grdT4.Activations.add(new Activation(T4, "yellow", TransitionOperation.SendOverNetwork, "OP_SINCAINORD_BUS"));

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
        grdT5.Activations.add(new Activation(T5, "R1Y2R3R4", TransitionOperation.Move, "P_F_TINERETULUI"));

        grdT5.Activations.add(new Activation(T5, "red", TransitionOperation.SendOverNetwork, "OP_SINCAINORD_BUS"));
        grdT5.Activations.add(new Activation(T5, "red", TransitionOperation.SendOverNetwork, "OP_SINCAI"));
        grdT5.Activations.add(new Activation(T5, "green", TransitionOperation.SendOverNetwork, "OP_TINERETULUI"));



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
        grdT6.Activations.add(new Activation(T6, "yellow", TransitionOperation.SendOverNetwork, "OP_TINERETULUI"));


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
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "P_F_SERBANVODA"));
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "P_F_SERBANVODA_BUS"));
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "R1R2R3G4"));
        grdT7.Activations.add(new Activation(T7, "green", TransitionOperation.SendOverNetwork, "OP_SERBANVODA"));
        grdT7.Activations.add(new Activation(T7, "green", TransitionOperation.SendOverNetwork, "OP_SERBANVODA_BUS"));
        grdT7.Activations.add(new Activation(T7, "red", TransitionOperation.SendOverNetwork, "OP_TINERETULUI"));

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
        grdT8.Activations.add(new Activation(T8, "yellow", TransitionOperation.SendOverNetwork, "OP_SERBANVODA"));
        grdT8.Activations.add(new Activation(T8, "yellow", TransitionOperation.SendOverNetwork, "OP_SERBANVODA_BUS"));


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
        grdT9.Activations.add(new Activation(T9, "red", TransitionOperation.SendOverNetwork, "OP_SERBANVODA_BUS"));


        T9.GuardMappingList.add(grdT9);

        T9.Delay = 5;
        pn.Transitions.add(T9);

        //----------------------------T_F_CANTEMIR------------------------------------
        PetriTransition T_F_CANTEMIR = new PetriTransition(pn);
        T_F_CANTEMIR.TransitionName = "T_F_CANTEMIR";
        T_F_CANTEMIR.InputPlaceName.add("P_F_CANTEMIR");
        T_F_CANTEMIR.InputPlaceName.add("IN_CANTEMIR");
        T_F_CANTEMIR.IsAsync = true;

        Condition T_F_CANTEMIR_1_CT1 = new Condition(T_F_CANTEMIR, "P_F_CANTEMIR", TransitionCondition.NotNull);
        Condition T_F_CANTEMIR_1_CT2 = new Condition(T_F_CANTEMIR, "IN_CANTEMIR", TransitionCondition.IsNull);
        T_F_CANTEMIR_1_CT1.SetNextCondition(LogicConnector.AND, T_F_CANTEMIR_1_CT2);

        GuardMapping grdT_F_CANTEMIR_1 = new GuardMapping();
        grdT_F_CANTEMIR_1.condition= T_F_CANTEMIR_1_CT1;
        grdT_F_CANTEMIR_1.Activations.add(new Activation(T2, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_CANTEMIR.GuardMappingList.add(grdT_F_CANTEMIR_1);

        Condition T_F_CANTEMIR_2_CT1 = new Condition(T_F_CANTEMIR, "P_F_CANTEMIR", TransitionCondition.NotNull);
        Condition T_F_CANTEMIR_2_CT2 = new Condition(T_F_CANTEMIR, "IN_CANTEMIR", TransitionCondition.NotNull);
        T_F_CANTEMIR_2_CT1.SetNextCondition(LogicConnector.AND, T_F_CANTEMIR_2_CT2);

        GuardMapping grdT_F_CANTEMIR_2 = new GuardMapping();
        grdT_F_CANTEMIR_2.condition= T_F_CANTEMIR_2_CT1;
        grdT_F_CANTEMIR_2.Activations.add(new Activation(T2, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_CANTEMIR.GuardMappingList.add(grdT_F_CANTEMIR_2);

        T_F_CANTEMIR.Delay = 0;
        pn.Transitions.add(T_F_CANTEMIR);

        //----------------------------T_F_SINCAINORD------------------------------------
        PetriTransition T_F_SINCAINORD = new PetriTransition(pn);
        T_F_SINCAINORD.TransitionName = "T_F_SINCAINORD";
        T_F_SINCAINORD.InputPlaceName.add("P_F_SINCAINORD");
        T_F_SINCAINORD.InputPlaceName.add("IN_SINCAINORD");
        T_F_SINCAINORD.IsAsync = true;

        Condition T_F_SINCAINORD_1_CT1 = new Condition(T_F_SINCAINORD, "P_F_SINCAINORD", TransitionCondition.NotNull);
        Condition T_F_SINCAINORD_1_CT2 = new Condition(T_F_SINCAINORD, "IN_SINCAINORD", TransitionCondition.IsNull);
        T_F_SINCAINORD_1_CT1.SetNextCondition(LogicConnector.AND, T_F_SINCAINORD_1_CT2);

        GuardMapping grdT_F_SINCAINORD_1 = new GuardMapping();
        grdT_F_SINCAINORD_1.condition= T_F_SINCAINORD_1_CT1;
        grdT_F_SINCAINORD_1.Activations.add(new Activation(T4, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_SINCAINORD.GuardMappingList.add(grdT_F_SINCAINORD_1);

        Condition T_F_SINCAINORD_2_CT1 = new Condition(T_F_SINCAINORD, "P_F_SINCAINORD", TransitionCondition.NotNull);
        Condition T_F_SINCAINORD_2_CT2 = new Condition(T_F_SINCAINORD, "IN_SINCAINORD", TransitionCondition.NotNull);
        T_F_SINCAINORD_2_CT1.SetNextCondition(LogicConnector.AND, T_F_SINCAINORD_2_CT2);

        GuardMapping grdT_F_SINCAINORD_2 = new GuardMapping();
        grdT_F_SINCAINORD_2.condition= T_F_SINCAINORD_2_CT1;
        grdT_F_SINCAINORD_2.Activations.add(new Activation(T4, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_SINCAINORD.GuardMappingList.add(grdT_F_SINCAINORD_2);

        T_F_SINCAINORD.Delay = 0;
        pn.Transitions.add(T_F_SINCAINORD);

        //----------------------------T_F_SINCAINORD_BUS------------------------------------
        PetriTransition T_F_SINCAINORD_BUS = new PetriTransition(pn);
        T_F_SINCAINORD_BUS.TransitionName = "T_F_SINCAINORD_BUS";
        T_F_SINCAINORD_BUS.InputPlaceName.add("P_F_SINCAINORD_BUS");
        T_F_SINCAINORD_BUS.InputPlaceName.add("IN_SINCAINORD_BUS");
        T_F_SINCAINORD_BUS.IsAsync = true;

        Condition T_F_SINCAINORD_BUS_1_CT1 = new Condition(T_F_SINCAINORD_BUS, "P_F_SINCAINORD_BUS", TransitionCondition.NotNull);
        Condition T_F_SINCAINORD_BUS_1_CT2 = new Condition(T_F_SINCAINORD_BUS, "IN_SINCAINORD_BUS", TransitionCondition.IsNull);
        T_F_SINCAINORD_BUS_1_CT1.SetNextCondition(LogicConnector.AND, T_F_SINCAINORD_BUS_1_CT2);

        GuardMapping grdT_F_SINCAINORD_BUS_1 = new GuardMapping();
        grdT_F_SINCAINORD_BUS_1.condition= T_F_SINCAINORD_BUS_1_CT1;
        grdT_F_SINCAINORD_BUS_1.Activations.add(new Activation(T4, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_SINCAINORD_BUS.GuardMappingList.add(grdT_F_SINCAINORD_BUS_1);

        Condition T_F_SINCAINORD_BUS_2_CT1 = new Condition(T_F_SINCAINORD_BUS, "P_F_SINCAINORD_BUS", TransitionCondition.NotNull);
        Condition T_F_SINCAINORD_BUS_2_CT2 = new Condition(T_F_SINCAINORD_BUS, "IN_SINCAINORD_BUS", TransitionCondition.NotNull);
        T_F_SINCAINORD_BUS_2_CT1.SetNextCondition(LogicConnector.AND, T_F_SINCAINORD_BUS_2_CT2);

        GuardMapping grdT_F_SINCAINORD_BUS_2 = new GuardMapping();
        grdT_F_SINCAINORD_BUS_2.condition= T_F_SINCAINORD_BUS_2_CT1;
        grdT_F_SINCAINORD_BUS_2.Activations.add(new Activation(T4, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_SINCAINORD_BUS.GuardMappingList.add(grdT_F_SINCAINORD_BUS_2);

        T_F_SINCAINORD_BUS.Delay = 0;
        pn.Transitions.add(T_F_SINCAINORD_BUS);

        //----------------------------T_F_TINERETULUI------------------------------------
        PetriTransition T_F_TINERETULUI = new PetriTransition(pn);
        T_F_TINERETULUI.TransitionName = "T_F_TINERETULUI";
        T_F_TINERETULUI.InputPlaceName.add("P_F_TINERETULUI");
        T_F_TINERETULUI.InputPlaceName.add("IN_TINERETULUI");
        T_F_TINERETULUI.IsAsync = true;

        Condition T_F_TINERETULUI_1_CT1 = new Condition(T_F_TINERETULUI, "P_F_TINERETULUI", TransitionCondition.NotNull);
        Condition T_F_TINERETULUI_1_CT2 = new Condition(T_F_TINERETULUI, "IN_TINERETULUI", TransitionCondition.IsNull);
        T_F_TINERETULUI_1_CT1.SetNextCondition(LogicConnector.AND, T_F_TINERETULUI_1_CT2);

        GuardMapping grdT_F_TINERETULUI_1 = new GuardMapping();
        grdT_F_TINERETULUI_1.condition= T_F_TINERETULUI_1_CT1;
        grdT_F_TINERETULUI_1.Activations.add(new Activation(T6, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_TINERETULUI.GuardMappingList.add(grdT_F_TINERETULUI_1);

        Condition T_F_TINERETULUI_2_CT1 = new Condition(T_F_TINERETULUI, "P_F_TINERETULUI", TransitionCondition.NotNull);
        Condition T_F_TINERETULUI_2_CT2 = new Condition(T_F_TINERETULUI, "IN_TINERETULUI", TransitionCondition.NotNull);
        T_F_TINERETULUI_2_CT1.SetNextCondition(LogicConnector.AND, T_F_TINERETULUI_2_CT2);

        GuardMapping grdT_F_TINERETULUI_2 = new GuardMapping();
        grdT_F_TINERETULUI_2.condition= T_F_TINERETULUI_2_CT1;
        grdT_F_TINERETULUI_2.Activations.add(new Activation(T6, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_TINERETULUI.GuardMappingList.add(grdT_F_TINERETULUI_2);

        //----------------------------T_F_SERBANVODA------------------------------------
        PetriTransition T_F_SERBANVODA = new PetriTransition(pn);
        T_F_SERBANVODA.TransitionName = "T_F_SERBANVODA";
        T_F_SERBANVODA.InputPlaceName.add("P_F_SERBANVODA");
        T_F_SERBANVODA.InputPlaceName.add("IN_SERBANVODA");
        T_F_SERBANVODA.IsAsync = true;

        Condition T_F_SERBANVODA_1_CT1 = new Condition(T_F_SERBANVODA, "P_F_SERBANVODA", TransitionCondition.NotNull);
        Condition T_F_SERBANVODA_1_CT2 = new Condition(T_F_SERBANVODA, "IN_SERBANVODA", TransitionCondition.IsNull);
        T_F_SERBANVODA_1_CT1.SetNextCondition(LogicConnector.AND, T_F_SERBANVODA_1_CT2);

        GuardMapping grdT_F_SERBANVODA_1 = new GuardMapping();
        grdT_F_SERBANVODA_1.condition= T_F_SERBANVODA_1_CT1;
        grdT_F_SERBANVODA_1.Activations.add(new Activation(T8, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_SERBANVODA.GuardMappingList.add(grdT_F_SERBANVODA_1);

        Condition T_F_SERBANVODA_2_CT1 = new Condition(T_F_SERBANVODA, "P_F_SERBANVODA", TransitionCondition.NotNull);
        Condition T_F_SERBANVODA_2_CT2 = new Condition(T_F_SERBANVODA, "IN_SERBANVODA", TransitionCondition.NotNull);
        T_F_SERBANVODA_2_CT1.SetNextCondition(LogicConnector.AND, T_F_SERBANVODA_2_CT2);

        GuardMapping grdT_F_SERBANVODA_2 = new GuardMapping();
        grdT_F_SERBANVODA_2.condition= T_F_SERBANVODA_2_CT1;
        grdT_F_SERBANVODA_2.Activations.add(new Activation(T8, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_SERBANVODA.GuardMappingList.add(grdT_F_SERBANVODA_2);

        T_F_SERBANVODA.Delay = 0;
        pn.Transitions.add(T_F_SERBANVODA);

        //----------------------------T_F_SERBANVODA_BUS------------------------------------
        PetriTransition T_F_SERBANVODA_BUS = new PetriTransition(pn);
        T_F_SERBANVODA_BUS.TransitionName = "T_F_SERBANVODA_BUS";
        T_F_SERBANVODA_BUS.InputPlaceName.add("P_F_SERBANVODA_BUS");
        T_F_SERBANVODA_BUS.InputPlaceName.add("IN_SERBANVODA_BUS");
        T_F_SERBANVODA_BUS.IsAsync = true;

        Condition T_F_SERBANVODA_BUS_1_CT1 = new Condition(T_F_SERBANVODA_BUS, "P_F_SERBANVODA_BUS", TransitionCondition.NotNull);
        Condition T_F_SERBANVODA_BUS_1_CT2 = new Condition(T_F_SERBANVODA_BUS, "IN_SERBANVODA_BUS", TransitionCondition.IsNull);
        T_F_SERBANVODA_BUS_1_CT1.SetNextCondition(LogicConnector.AND, T_F_SERBANVODA_BUS_1_CT2);

        GuardMapping grdT_F_SERBANVODA_BUS_1 = new GuardMapping();
        grdT_F_SERBANVODA_BUS_1.condition= T_F_SERBANVODA_BUS_1_CT1;
        grdT_F_SERBANVODA_BUS_1.Activations.add(new Activation(T8, "FIVE", TransitionOperation.DynamicDelay,""));

        T_F_SERBANVODA_BUS.GuardMappingList.add(grdT_F_SERBANVODA_BUS_1);

        Condition T_F_SERBANVODA_BUS_2_CT1 = new Condition(T_F_SERBANVODA_BUS, "P_F_SERBANVODA_BUS", TransitionCondition.NotNull);
        Condition T_F_SERBANVODA_BUS_2_CT2 = new Condition(T_F_SERBANVODA_BUS, "IN_SERBANVODA_BUS", TransitionCondition.NotNull);
        T_F_SERBANVODA_BUS_2_CT1.SetNextCondition(LogicConnector.AND, T_F_SERBANVODA_BUS_2_CT2);

        GuardMapping grdT_F_SERBANVODA_BUS_2 = new GuardMapping();
        grdT_F_SERBANVODA_BUS_2.condition= T_F_SERBANVODA_BUS_2_CT1;
        grdT_F_SERBANVODA_BUS_2.Activations.add(new Activation(T8, "TEN", TransitionOperation.DynamicDelay,""));

        T_F_SERBANVODA_BUS.GuardMappingList.add(grdT_F_SERBANVODA_BUS_2);

        T_F_SERBANVODA_BUS.Delay = 0;
        pn.Transitions.add(T_F_SERBANVODA_BUS);

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
