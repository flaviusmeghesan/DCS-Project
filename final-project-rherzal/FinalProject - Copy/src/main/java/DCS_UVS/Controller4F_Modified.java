package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller4F_Modified {

    public static void main (String []args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Controller4F";
        pn.NetworkPort = 1081;

        //--------------------Constant Places--------------------

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

        DataString ini = new DataString();
        ini.SetName("ini");
        ini.SetValue("red");
        pn.ConstantPlaceList.add(ini);

        DataInteger Five = new DataInteger();
        Five.SetName("Five");
        Five.SetValue(5);
        pn.ConstantPlaceList.add(Five);

        DataInteger Ten = new DataInteger();
        Ten.SetName("Ten");
        Ten.SetValue(10);
        pn.ConstantPlaceList.add(Ten);

        //--------------------Places--------------------

        // Define dynamic places for each phase and state transition
        DataString p1 = new DataString();  // All red state
        p1.SetName("r1r2r3r4");
        p1.SetValue("signal");
        pn.PlaceList.add(p1);

        DataString p2 = new DataString();  // Phase 1 - Green on OP1, Red on others
        p2.SetName("g1r2r3r4");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();  // Phase 1 - Yellow on OP1, Red on others
        p3.SetName("y1r2r3r4");
        pn.PlaceList.add(p3);

        DataString p4 = new DataString();  // Phase 2 - Green on OP2, Red on others
        p4.SetName("r1g2r3r4");
        pn.PlaceList.add(p4);

        DataString p5 = new DataString();  // Phase 2 - Yellow on OP2, Red on others
        p5.SetName("r1y2r3r4");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString();  // Phase 3 - Green on OP3, Red on others
        p6.SetName("r1r2g3r4");
        pn.PlaceList.add(p6);

        DataString p7 = new DataString();  // Phase 3 - Yellow on OP3, Red on others
        p7.SetName("r1r2y3r4");
        pn.PlaceList.add(p7);

        DataString p8 = new DataString();  // Phase 4 - Green on OP4, Red on others
        p8.SetName("r1r2r3g4");
        pn.PlaceList.add(p8);

        DataString p9 = new DataString();  // Phase 4 - Yellow on OP4, Red on others
        p9.SetName("r1r2r3y4");
        pn.PlaceList.add(p9);

        // Define outputs for each phase
        DataTransfer OP1 = new DataTransfer();
        OP1.SetName("OP1");
        OP1.Value = new TransferOperation("localhost", "1080", "P_TL_Ferdinand");
        pn.PlaceList.add(OP1);

        DataTransfer OP2 = new DataTransfer();
        OP2.SetName("OP2");
        OP2.Value = new TransferOperation("localhost", "1080", "P_TL_Dragalina");
        pn.PlaceList.add(OP2);

        DataTransfer OP3 = new DataTransfer();
        OP3.SetName("OP3");
        OP3.Value = new TransferOperation("localhost", "1080", "P_TL_Horea");
        pn.PlaceList.add(OP3);

        DataTransfer OP4 = new DataTransfer();
        OP4.SetName("OP4");
        OP4.Value = new TransferOperation("localhost", "1080", "P_TL_Dacia");
        pn.PlaceList.add(OP4);


        // Define inputs for each phase
        DataString P_F1 = new DataString();
        P_F1.SetName("P_F1");
        pn.PlaceList.add(P_F1);

        DataString P_F2 = new DataString();
        P_F2.SetName("P_F2");
        pn.PlaceList.add(P_F2);

        DataString P_F3 = new DataString();
        P_F3.SetName("P_F3");
        pn.PlaceList.add(P_F3);

        DataString P_F4 = new DataString();
        P_F4.SetName("P_F4");
        pn.PlaceList.add(P_F4);

        DataString in1 = new DataString();
        in1.SetName("in1");
        pn.PlaceList.add(in1);

        DataString in2 = new DataString();
        in2.SetName("in2");
        pn.PlaceList.add(in2);

        DataString in3 = new DataString();
        in3.SetName("in3");
        pn.PlaceList.add(in3);

        DataString in4 = new DataString();
        in4.SetName("in4");
        pn.PlaceList.add(in4);


        //--------------------Transitions--------------------
        // iniT
        PetriTransition iniT = new PetriTransition(pn);
        iniT.TransitionName = "iniT";
        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition = iniTCt1;
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP1"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP2"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP3"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP4"));
        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini")); // Set ini to null after use
        iniT.GuardMappingList.add(grdiniT);

        iniT.Delay = 0;
        pn.Transitions.add(iniT);

        // ---------------------------- T1 - Phase 1 Green (OP1 green, others red) ------------------------------------
        PetriTransition T1 = new PetriTransition(pn);
        T1.TransitionName = "T1";
        T1.InputPlaceName.add("r1r2r3r4");

        Condition T1Ct1 = new Condition(T1, "r1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;
        grdT1.Activations.add(new Activation(T1, "r1r2r3r4", TransitionOperation.Move,"g1r2r3r4"));
        grdT1.Activations.add(new Activation(T1, "r1r2r3r4", TransitionOperation.Move, "P_F1"));
        grdT1.Activations.add(new Activation(T1, "green", TransitionOperation.SendOverNetwork, "OP1"));
        T1.GuardMappingList.add(grdT1);

        T1.Delay = 2;
        pn.Transitions.add(T1);

        // ---------------------------- T2 - Phase 1 Yellow (OP1 yellow, others red) ------------------------------------
        PetriTransition T2 = new PetriTransition(pn);
        T2.TransitionName = "T2";
        T2.InputPlaceName.add("g1r2r3r4");

        Condition T2Ct1 = new Condition(T2, "g1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;
        grdT2.Activations.add(new Activation(T2, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
        grdT2.Activations.add(new Activation(T2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));
        T2.GuardMappingList.add(grdT2);

        T2.Delay = 2;
        pn.Transitions.add(T2);

        // ---------------------------- T3 - Phase 2 Green (OP2 green, OP1 red) ------------------------------------
        PetriTransition T3 = new PetriTransition(pn);
        T3.TransitionName = "T3";
        T3.InputPlaceName.add("y1r2r3r4");

        Condition T3Ct1 = new Condition(T3, "y1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3Ct1;
        grdT3.Activations.add(new Activation(T3, "y1r2r3r4", TransitionOperation.Move, "r1g2r3r4"));
        grdT3.Activations.add(new Activation(T3, "y1r2r3r4", TransitionOperation.Move, "P_F2"));
        grdT3.Activations.add(new Activation(T3, "green", TransitionOperation.SendOverNetwork, "OP2"));
        grdT3.Activations.add(new Activation(T3, "red", TransitionOperation.SendOverNetwork, "OP1"));
        T3.GuardMappingList.add(grdT3);

        T3.Delay = 2;
        pn.Transitions.add(T3);


        // ---------------------------- T4 - Phase 2 Yellow (OP2 yellow, others red) ------------------------------------
        PetriTransition T4 = new PetriTransition(pn);
        T4.TransitionName = "T4";
        T4.InputPlaceName.add("r1g2r3r4");

        Condition T4Ct1 = new Condition(T4, "r1g2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition = T4Ct1;
        grdT4.Activations.add(new Activation(T4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
        grdT4.Activations.add(new Activation(T4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));

        T4.GuardMappingList.add(grdT4);

        T4.Delay = 2;
        pn.Transitions.add(T4);

        // ---------------------------- T5 - Phase 3 Green (OP3 green, OP2 red) ------------------------------------
        PetriTransition T5 = new PetriTransition(pn);
        T5.TransitionName = "T5";
        T5.InputPlaceName.add("r1y2r3r4");

        Condition T5Ct1 = new Condition(T5, "r1y2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition = T5Ct1;
        grdT5.Activations.add(new Activation(T5, "r1y2r3r4", TransitionOperation.Move, "r1r2g3r4"));
        grdT5.Activations.add(new Activation(T5, "r1y2r3r4", TransitionOperation.Move, "P_F3"));
        grdT5.Activations.add(new Activation(T5, "green", TransitionOperation.SendOverNetwork, "OP3"));
        grdT5.Activations.add(new Activation(T5, "red", TransitionOperation.SendOverNetwork, "OP2"));
        T5.GuardMappingList.add(grdT5);

        T5.Delay = 2;
        pn.Transitions.add(T5);

        // ---------------------------- T6 - Phase 3 Yellow (OP3 yellow, others red) ------------------------------------
        PetriTransition T6 = new PetriTransition(pn);
        T6.TransitionName = "T6";
        T6.InputPlaceName.add("r1r2g3r4");

        Condition T6Ct1 = new Condition(T6, "r1r2g3r4", TransitionCondition.NotNull);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition = T6Ct1;
        grdT6.Activations.add(new Activation(T6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
        grdT6.Activations.add(new Activation(T6, "yellow", TransitionOperation.SendOverNetwork, "OP3"));

        T6.GuardMappingList.add(grdT6);

        T6.Delay = 2;
        pn.Transitions.add(T6);

        // ---------------------------- T7 - Phase 4 Green (OP4 green, OP3 red) ------------------------------------
        PetriTransition T7 = new PetriTransition(pn);
        T7.TransitionName = "T7";
        T7.InputPlaceName.add("r1r2y3r4");

        Condition T7Ct1 = new Condition(T7, "r1r2y3r4", TransitionCondition.NotNull);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition = T7Ct1;
        grdT7.Activations.add(new Activation(T7, "r1r2y3r4", TransitionOperation.Move, "r1r2r3g4"));
        grdT7.Activations.add(new Activation(T7, "r1r2y3r4", TransitionOperation.Move, "P_F4"));
        grdT7.Activations.add(new Activation(T7, "green", TransitionOperation.SendOverNetwork, "OP4"));
        grdT7.Activations.add(new Activation(T7, "red", TransitionOperation.SendOverNetwork, "OP3"));
        T7.GuardMappingList.add(grdT7);

        T7.Delay = 2;
        pn.Transitions.add(T7);

        // ---------------------------- T8 - Phase 4 Yellow (OP4 yellow, others red) ------------------------------------
        PetriTransition T8 = new PetriTransition(pn);
        T8.TransitionName = "T8";
        T8.InputPlaceName.add("r1r2r3g4");

        Condition T8Ct1 = new Condition(T8, "r1r2r3g4", TransitionCondition.NotNull);

        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition = T8Ct1;
        grdT8.Activations.add(new Activation(T8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
        grdT8.Activations.add(new Activation(T8, "yellow", TransitionOperation.SendOverNetwork, "OP4"));
        T8.GuardMappingList.add(grdT8);

        T8.Delay = 2;
        pn.Transitions.add(T8);

        // ---------------------------- T9 - Return to All Red ------------------------------------
        PetriTransition T9 = new PetriTransition(pn);
        T9.TransitionName = "T9";
        T9.InputPlaceName.add("r1r2r3y4");

        Condition T9Ct1 = new Condition(T9, "r1r2r3y4", TransitionCondition.NotNull);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition = T9Ct1;
        grdT9.Activations.add(new Activation(T9, "r1r2r3y4", TransitionOperation.Move, "r1r2r3r4"));
        grdT9.Activations.add(new Activation(T9, "red", TransitionOperation.SendOverNetwork, "OP4"));
        T9.GuardMappingList.add(grdT9);

        T9.Delay = 2;
        pn.Transitions.add(T9);


        // dynamic delay transitions
        //t_f1
        PetriTransition t_f1 = new PetriTransition(pn);
        t_f1.TransitionName = "T_f1";
        t_f1.InputPlaceName.add("P_F1");
        t_f1.InputPlaceName.add("in1");
        t_f1.IsAsync = true;

        Condition T_f1Ct1 = new Condition(t_f1, "P_F1", TransitionCondition.NotNull);
        Condition T_f1Ct2 = new Condition(t_f1, "in1", TransitionCondition.IsNull);

        T_f1Ct1.SetNextCondition(LogicConnector.AND,T_f1Ct2);

        // guard mapping 1 t2 dynamic Delay = 2
        GuardMapping grdT_f1_1 = new GuardMapping();
        grdT_f1_1.condition = T_f1Ct1;
        grdT_f1_1.Activations.add(new Activation(T2, "Five", TransitionOperation.DynamicDelay, ""));
        t_f1.GuardMappingList.add(grdT_f1_1);

        Condition T_f1Ct3 = new Condition(t_f1, "in1", TransitionCondition.NotNull);
        Condition T_f1Ct4 = new Condition(t_f1, "P_F1", TransitionCondition.NotNull);

        T_f1Ct3.SetNextCondition(LogicConnector.AND,T_f1Ct4);

        // guard mapping 2 t2 dynamic delay = 10
        GuardMapping grdT_f1_2 = new GuardMapping();
        grdT_f1_2.condition = T_f1Ct3;
        grdT_f1_2.Activations.add(new Activation(T2, "Ten", TransitionOperation.DynamicDelay, ""));
        t_f1.GuardMappingList.add(grdT_f1_2);

        pn.Transitions.add(t_f1);


        //t_f2
        PetriTransition t_f2 = new PetriTransition(pn);
        t_f2.TransitionName = "T_f2";
        t_f2.InputPlaceName.add("P_F2");
        t_f2.InputPlaceName.add("in2");
        t_f2.IsAsync = true;

        // guard mapping 1 t4 dynamic Delay = 2
        Condition T_f2Ct1 = new Condition(t_f2, "P_F2", TransitionCondition.NotNull);
        Condition T_f2Ct2 = new Condition(t_f2, "in2", TransitionCondition.IsNull);

        T_f2Ct1.SetNextCondition(LogicConnector.AND,T_f2Ct2);

        GuardMapping grdT_f2_1 = new GuardMapping();
        grdT_f2_1.condition = T_f2Ct1;
        grdT_f2_1.Activations.add(new Activation(T4, "Five", TransitionOperation.DynamicDelay, ""));
        t_f2.GuardMappingList.add(grdT_f2_1);

        // guard mapping 2 t4 dynamic delay = 10
        Condition T_f2Ct3 = new Condition(t_f2, "in2", TransitionCondition.NotNull);
        Condition T_f2Ct4 = new Condition(t_f2, "P_F2", TransitionCondition.NotNull);

        T_f2Ct3.SetNextCondition(LogicConnector.AND,T_f2Ct4);

        GuardMapping grdT_f2_2 = new GuardMapping();
        grdT_f2_2.condition = T_f2Ct3;
        grdT_f2_2.Activations.add(new Activation(T4, "Ten", TransitionOperation.DynamicDelay, ""));
        t_f2.GuardMappingList.add(grdT_f2_2);

        pn.Transitions.add(t_f2);

        //t_f3
        PetriTransition t_f3 = new PetriTransition(pn);
        t_f3.TransitionName = "T_f3";
        t_f3.InputPlaceName.add("P_F3");
        t_f3.InputPlaceName.add("in3");
        t_f3.IsAsync = true;

        // guard mapping 1 t6 dynamic Delay = 2
        Condition T_f3Ct1 = new Condition(t_f3, "P_F3", TransitionCondition.NotNull);
        Condition T_f3Ct2 = new Condition(t_f3, "in3", TransitionCondition.IsNull);

        T_f3Ct1.SetNextCondition(LogicConnector.AND,T_f3Ct2);

        GuardMapping grdT_f3_1 = new GuardMapping();
        grdT_f3_1.condition = T_f3Ct1;

        grdT_f3_1.Activations.add(new Activation(T6, "Five", TransitionOperation.DynamicDelay, ""));
        t_f3.GuardMappingList.add(grdT_f3_1);

        // guard mapping 2 t6 dynamic delay = 10
        Condition T_f3Ct3 = new Condition(t_f3, "in3", TransitionCondition.NotNull);
        Condition T_f3Ct4 = new Condition(t_f3, "P_F3", TransitionCondition.NotNull);

        T_f3Ct3.SetNextCondition(LogicConnector.AND,T_f3Ct4);

        GuardMapping grdT_f3_2 = new GuardMapping();
        grdT_f3_2.condition = T_f3Ct3;
        grdT_f3_2.Activations.add(new Activation(T6, "Ten", TransitionOperation.DynamicDelay, ""));
        t_f3.GuardMappingList.add(grdT_f3_2);

        pn.Transitions.add(t_f3);


        //t_f4
        PetriTransition t_f4 = new PetriTransition(pn);
        t_f4.TransitionName = "T_f4";
        t_f4.InputPlaceName.add("P_F4");
        t_f4.InputPlaceName.add("in4");
        t_f4.IsAsync = true;

        // guard mapping 1 t8 dynamic Delay = 2
        Condition T_f4Ct1 = new Condition(t_f4, "P_F4", TransitionCondition.NotNull);
        Condition T_f4Ct2 = new Condition(t_f4, "in4", TransitionCondition.IsNull);

        T_f4Ct1.SetNextCondition(LogicConnector.AND,T_f4Ct2);

        GuardMapping grdT_f4_1 = new GuardMapping();

        grdT_f4_1.condition = T_f4Ct1;
        grdT_f4_1.Activations.add(new Activation(T8, "Five", TransitionOperation.DynamicDelay, ""));
        t_f4.GuardMappingList.add(grdT_f4_1);

        // guard mapping 2 t8 dynamic delay = 10


        Condition T_f4Ct3 = new Condition(t_f4, "in4", TransitionCondition.NotNull);
        Condition T_f4Ct4 = new Condition(t_f4, "P_F4", TransitionCondition.NotNull);

        T_f4Ct3.SetNextCondition(LogicConnector.AND,T_f4Ct4);

        GuardMapping grdT_f4_2 = new GuardMapping();

        grdT_f4_2.condition = T_f4Ct3;
        grdT_f4_2.Activations.add(new Activation(T8, "Ten", TransitionOperation.DynamicDelay, ""));
        t_f4.GuardMappingList.add(grdT_f4_2);

        pn.Transitions.add(t_f4);

        // -------------------------------------------------------------------------------------
        // ---------------------------- PN Start ------------------------------------------------
        System.out.println("4-Phase Controller started\n------------------------------");
        pn.Delay = 2000;

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);


    }
}
