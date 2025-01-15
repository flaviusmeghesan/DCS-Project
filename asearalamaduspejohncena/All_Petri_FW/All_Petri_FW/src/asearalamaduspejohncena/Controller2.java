package asearalamaduspejohncena;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;
import PetriDataPackage.Guard;

public class Controller2 {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Controller2";
        pn.SetName("Controller2");
        pn.NetworkPort = 1091;

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

        DataString in1_tram = new DataString();
        in1_tram.SetName("in1_tram");
        pn.PlaceList.add(in1_tram);

        DataString in2_tram = new DataString();
        in2_tram.SetName("in2_tram");
        pn.PlaceList.add(in2_tram);

        DataString p_f_in1 = new DataString();
        p_f_in1.SetName("p_f_in1");
        pn.PlaceList.add(p_f_in1);

        DataString p_f_in2 = new DataString();
        p_f_in2.SetName("p_f_in2");
        pn.PlaceList.add(p_f_in2);

        DataString p_f_in3 = new DataString();
        p_f_in3.SetName("p_f_in3");
        pn.PlaceList.add(p_f_in3);

        DataString p_f_in4 = new DataString();
        p_f_in4.SetName("p_f_in4");
        pn.PlaceList.add(p_f_in4);

        DataString p_f_in1_tram = new DataString();
        p_f_in1_tram.SetName("p_f_in1_tram");
        pn.PlaceList.add(p_f_in1_tram);

        DataString p_f_in3_tram= new DataString();
        p_f_in3_tram.SetName("p_f_in3_tram");
        pn.PlaceList.add(p_f_in3_tram);

        DataTransfer op1 = new DataTransfer();
        op1.SetName("op1");
        op1.Value = new TransferOperation("localhost", "1080","sem11");
        pn.PlaceList.add(op1);

        DataTransfer op2 = new DataTransfer();
        op2.SetName("op2");
        op2.Value = new TransferOperation("localhost", "1080","sem22");
        pn.PlaceList.add(op2);

        DataTransfer op3 = new DataTransfer();
        op3.SetName("op3");
        op3.Value = new TransferOperation("localhost", "1080","sem33");
        pn.PlaceList.add(op3);

        DataTransfer op4 = new DataTransfer();
        op4.SetName("op4");
        op4.Value = new TransferOperation("localhost", "1080","sem44");
        pn.PlaceList.add(op4);

        DataTransfer op_tram1 = new DataTransfer();
        op_tram1.SetName("op_tram1");
        op_tram1.Value = new TransferOperation("localhost", "1080","semtram1");
        pn.PlaceList.add(op_tram1);

        DataTransfer op_tram2 = new DataTransfer();
        op_tram2.SetName("op_tram2");
        op_tram2.Value = new TransferOperation("localhost", "1080","semtram2");
        pn.PlaceList.add(op_tram2);

        // init transaction

        PetriTransition t_init = new PetriTransition(pn);
        t_init.TransitionName = "t_init";

        Condition t_initct1 = new Condition(t_init, "P_ini",TransitionCondition.NotNull);
        GuardMapping grdT_init = new GuardMapping();
        grdT_init.condition = t_initct1;

        grdT_init.Activations.add(new Activation(t_init,"P_ini", TransitionOperation.SendOverNetwork, "op1"));
        grdT_init.Activations.add(new Activation(t_init,"P_ini", TransitionOperation.SendOverNetwork, "op2"));
        grdT_init.Activations.add(new Activation(t_init,"P_ini", TransitionOperation.SendOverNetwork, "op3"));
        grdT_init.Activations.add(new Activation(t_init,"P_ini", TransitionOperation.SendOverNetwork, "op4"));
        grdT_init.Activations.add(new Activation(t_init,"P_ini", TransitionOperation.SendOverNetwork, "op_tram1"));
        grdT_init.Activations.add(new Activation(t_init,"P_ini", TransitionOperation.SendOverNetwork, "op_tram2"));
        grdT_init.Activations.add(new Activation(t_init,"", TransitionOperation.MakeNull, "P_ini"));

        t_init.GuardMappingList.add(grdT_init);

        t_init.Delay = 0;
        pn.Transitions.add(t_init);

        PetriTransition T1 = new PetriTransition(pn);
        T1.TransitionName = "T1";
        T1.InputPlaceName.add("R1R2R3R4");
        Condition T1CT1 = new Condition(T1,"R1R2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1CT1;

        grdT1.Activations.add(new Activation(T1, "R1R2R3R4", TransitionOperation.Move, "G1R2R3R4"));
        grdT1.Activations.add(new Activation(T1, "R1R2R3R4", TransitionOperation.Move, "p_f_in1"));
        grdT1.Activations.add(new Activation(T1, "R1R2R3R4", TransitionOperation.Move, "p_f_in1_tram"));
        grdT1.Activations.add(new Activation(T1, "green", TransitionOperation.SendOverNetwork, "op1"));
        grdT1.Activations.add(new Activation(T1, "green", TransitionOperation.SendOverNetwork, "op_tram1"));
        T1.GuardMappingList.add(grdT1);

        T1.Delay = 5;
        pn.Transitions.add(T1);

        PetriTransition T2 = new PetriTransition(pn);
        T2.TransitionName = "T2";
        T2.InputPlaceName.add("G1R2R3R4");

        Condition T2CT1 = new Condition(T2,"G1R2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2CT1;
        grdT2.Activations.add(new Activation(T2, "G1R2R3R4", TransitionOperation.Move, "Y1R2R3R4"));
        grdT2.Activations.add(new Activation(T2, "yellow", TransitionOperation.SendOverNetwork, "op1"));

        T2.GuardMappingList.add(grdT2);

        T2.Delay = 5;
        pn.Transitions.add(T2);

        PetriTransition T3 = new PetriTransition(pn);
        T3.TransitionName = "T3";
        T3.InputPlaceName.add("Y1R2R3R4");

        Condition T3CT1 = new Condition(T3,"Y1R2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT3 = new GuardMapping();

        grdT3.condition = T3CT1;
        grdT3.Activations.add(new Activation(T3,"Y1R2R3R4", TransitionOperation.Move, "R1G2R3R4"));
        grdT3.Activations.add(new Activation(T3, "Y1R2R3R4", TransitionOperation.Move, "p_f_in2"));
        grdT3.Activations.add(new Activation(T3, "red", TransitionOperation.Move, "op1"));
        grdT3.Activations.add(new Activation(T3, "red", TransitionOperation.Move, "op_tram1"));
        grdT3.Activations.add(new Activation(T3, "green", TransitionOperation.Move, "op2"));

        T3.GuardMappingList.add(grdT3);

        T3.Delay = 5;
        pn.Transitions.add(T3);

        PetriTransition T4 = new PetriTransition(pn);
        T4.TransitionName = "T4";
        T4.InputPlaceName.add("R1G2R3R4");

        Condition T4CT1 = new Condition(T4,"R1G2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition = T4CT1;
        grdT4.Activations.add(new Activation(T4, "R1G2R3R4", TransitionOperation.Move, "R1Y2R3R4"));
        grdT4.Activations.add(new Activation(T4, "yellow", TransitionOperation.Move, "op2"));

        T4.GuardMappingList.add(grdT4);

        T4.Delay = 5;
        pn.Transitions.add(T4);

        PetriTransition T5 = new PetriTransition(pn);
        T5.TransitionName = "T5";
        T5.InputPlaceName.add("R1Y2R3R4");

        Condition T5CT1 = new Condition(T5, "R1Y2R3R4", TransitionCondition.NotNull);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition = T5CT1;
        grdT5.Activations.add(new Activation(T5, "R1Y2R3R4", TransitionOperation.Move, "R1R2G3R4"));
        grdT5.Activations.add(new Activation(T5, "R1Y2R3R4", TransitionOperation.Move, "p_f_in3"));
        grdT5.Activations.add(new Activation(T5, "R1Y2R3R4", TransitionOperation.Move, "p_f_in3_tram"));
        grdT5.Activations.add(new Activation(T5, "red", TransitionOperation.SendOverNetwork, "op2"));
        grdT5.Activations.add(new Activation(T5, "green", TransitionOperation.SendOverNetwork, "op3"));
        grdT5.Activations.add(new Activation(T5, "green", TransitionOperation.SendOverNetwork, "op_tram2"));

        T5.GuardMappingList.add(grdT5);

        T5.Delay = 5;
        pn.Transitions.add(T5);

        PetriTransition T6 = new PetriTransition(pn);
        T6.TransitionName = "T6";
        T6.InputPlaceName.add("R1R2G3R4");

        Condition T6CT1 = new Condition(T6,"R1R2G3R4", TransitionCondition.NotNull);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition = T6CT1;
        grdT6.Activations.add(new Activation(T6, "R1R2G3R4", TransitionOperation.Move, "R1R2Y3R4"));
        grdT6.Activations.add(new Activation(T6, "yellow", TransitionOperation.SendOverNetwork, "op3"));
        grdT6.Activations.add(new Activation(T6, "yellow", TransitionOperation.SendOverNetwork, "op_tram2"));

        T6.GuardMappingList.add(grdT6);
        T6.Delay = 5;
        pn.Transitions.add(T6);

        PetriTransition T7 = new PetriTransition(pn);
        T7.TransitionName = "T7";
        T7.InputPlaceName.add("R1R2Y3R4");

        Condition T7CT1 = new Condition(T7,"R1R2Y3R4", TransitionCondition.NotNull);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition = T7CT1;
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "R1R2R3G4"));
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.Move, "op4"));
        grdT7.Activations.add(new Activation(T7, "R1R2Y3R4", TransitionOperation.SendOverNetwork, "p_f_in4"));
        grdT7.Activations.add(new Activation(T7, "red", TransitionOperation.SendOverNetwork, "op3"));
        grdT7.Activations.add(new Activation(T7, "red", TransitionOperation.SendOverNetwork, "op_tram2"));

        T7.GuardMappingList.add(grdT7);
        T7.Delay = 5;

        pn.Transitions.add(T7);

        PetriTransition T8 = new PetriTransition(pn);
        T8.TransitionName = "T8";
        T8.InputPlaceName.add("R1R2R3G4");

        Condition T8C1T1 = new Condition(T8, "R1R2R3G4", TransitionCondition.NotNull);
        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition = T8C1T1;
        grdT8.Activations.add(new Activation(T8,"R1R2R3G4", TransitionOperation.Move, "R1R2R3Y4"));
        grdT8.Activations.add(new Activation(T8, "yellow", TransitionOperation.SendOverNetwork, "op4"));

        T8.GuardMappingList.add(grdT8);

        T8.Delay = 5;
        pn.Transitions.add(T8);

        PetriTransition T9 = new PetriTransition(pn);
        T9.TransitionName = "T9";
        T9.InputPlaceName.add("R1R2R3Y4");

        Condition T9CT1 = new Condition(T9,"R1R2R3Y4", TransitionCondition.NotNull);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition = T9CT1;
        grdT9.Activations.add(new Activation(T9, "R1R2R3Y4", TransitionOperation.Move, "R1R2R3R4"));
//        grdT9.Activations.add(new Activation(T9, "red", TransitionOperation.SendOverNetwork, "op4"));
        T9.GuardMappingList.add(grdT9);

        T9.Delay = 5;
        pn.Transitions.add(T9);


        PetriTransition T_f_in1 = new PetriTransition(pn);
        T_f_in1.TransitionName = "T_f_in1";
        T_f_in1.InputPlaceName.add("p_f_in1");
        T_f_in1.InputPlaceName.add("in1");
        T_f_in1.IsAsync = true;

        Condition T_f_in1_1CT1 = new Condition(T_f_in1, "p_f_in1", TransitionCondition.NotNull);
        Condition T_f_in1_1CT2 = new Condition(T_f_in1, "in1", TransitionCondition.NotNull);
        T_f_in1_1CT1.SetNextCondition(LogicConnector.AND, T_f_in1_1CT2);

        GuardMapping grdTf_in1_1 = new GuardMapping();
        grdTf_in1_1.condition = T_f_in1_1CT1;
        grdTf_in1_1.Activations.add(new Activation(T2, "FIVE", TransitionOperation.DynamicDelay,""));

        T_f_in1.GuardMappingList.add(grdTf_in1_1);

        Condition T_f_in1_2CT1 = new Condition(T_f_in1, "p_f_in1", TransitionCondition.NotNull);
        Condition T_f_in1_2CT2 = new Condition(T_f_in1, "in1", TransitionCondition.NotNull);
        T_f_in1_2CT1.SetNextCondition(LogicConnector.AND, T_f_in1_2CT2);

        GuardMapping grdTf_in1_2 = new GuardMapping();
        grdTf_in1_2.condition = T_f_in1_2CT1;
        grdTf_in1_2.Activations.add(new Activation(T2, "TEN", TransitionOperation.DynamicDelay,""));

        T_f_in1.GuardMappingList.add(grdTf_in1_2);

        T_f_in1.Delay = 5;
        pn.Transitions.add(T_f_in1);


        PetriTransition T_f_in1_tram = new PetriTransition(pn);
        T_f_in1_tram.TransitionName = "T_f_in1_tram";
        T_f_in1_tram.InputPlaceName.add("p_f_in1_tram");
        T_f_in1_tram.InputPlaceName.add("in1_tram");
        T_f_in1_tram.IsAsync = true;

        Condition T_f_in1_tram_1CT1 = new Condition(T_f_in1_tram, "p_f_in1_tram", TransitionCondition.NotNull);
        Condition T_f_in1_tram_1CT2  = new Condition(T_f_in1_tram, "in1_tram", TransitionCondition.NotNull);
        T_f_in1_tram_1CT1.SetNextCondition(LogicConnector.AND, T_f_in1_tram_1CT2);

        GuardMapping grdTf_in1_tram_1 = new GuardMapping();
        grdTf_in1_tram_1.condition = T_f_in1_tram_1CT1;
        grdTf_in1_tram_1.Activations.add(new Activation(T2, "FIVE", TransitionOperation.DynamicDelay,""));

        T_f_in1_tram.GuardMappingList.add(grdTf_in1_tram_1);

        Condition T_f_in1_tram_2CT1 = new Condition(T_f_in1, "p_f_in1_tram", TransitionCondition.NotNull);
        Condition T_f_in1_tram_2CT2 = new Condition(T_f_in1, "in1_tram", TransitionCondition.NotNull);
        T_f_in1_tram_2CT1.SetNextCondition(LogicConnector.AND, T_f_in1_tram_2CT2);

        GuardMapping grdTf_in1_tram_2 = new GuardMapping();
        grdTf_in1_tram_2.condition = T_f_in1_tram_2CT1;
        grdTf_in1_tram_2.Activations.add(new Activation(T2, "TEN", TransitionOperation.DynamicDelay,""));

        T_f_in1_tram.GuardMappingList.add(grdTf_in1_tram_2);

        T_f_in1_tram.Delay = 5;
        pn.Transitions.add(T_f_in1_tram);


        PetriTransition T_f_in2 = new PetriTransition(pn);
        T_f_in2.TransitionName = "T_f_in2";
        T_f_in2.InputPlaceName.add("p_f_in2");
        T_f_in2.InputPlaceName.add("in1");
        T_f_in2.IsAsync = true;

        Condition T_f_in2_1CT1 = new Condition(T_f_in2, "p_f_in2", TransitionCondition.NotNull);
        Condition T_f_in2_1CT2 = new Condition(T_f_in2, "in2", TransitionCondition.NotNull);
        T_f_in2_1CT1.SetNextCondition(LogicConnector.AND, T_f_in2_1CT2);

        GuardMapping grdTf_in2_1 = new GuardMapping();
        grdTf_in2_1.condition = T_f_in2_1CT1;
        grdTf_in2_1.Activations.add(new Activation(T4, "FIVE", TransitionOperation.DynamicDelay,""));

        T_f_in2.GuardMappingList.add(grdTf_in2_1);

        Condition T_f_in2_2CT1 = new Condition(T_f_in2, "p_f_in2", TransitionCondition.NotNull);
        Condition T_f_in2_2CT2 = new Condition(T_f_in2, "in2", TransitionCondition.NotNull);
        T_f_in2_2CT1.SetNextCondition(LogicConnector.AND, T_f_in2_2CT2);

        GuardMapping grdTf_in2_2 = new GuardMapping();
        grdTf_in2_2.condition = T_f_in2_2CT1;
        grdTf_in2_2.Activations.add(new Activation(T4, "TEN", TransitionOperation.DynamicDelay,""));

        T_f_in2.GuardMappingList.add(grdTf_in2_2);

        T_f_in2.Delay = 5;
        pn.Transitions.add(T_f_in2);

        PetriTransition T_f_in3 = new PetriTransition(pn);
        T_f_in3.TransitionName = "T_f_in3";
        T_f_in3.InputPlaceName.add("p_f_in3");
        T_f_in3.InputPlaceName.add("in3");
        T_f_in3.IsAsync = true;

        Condition T_f_in3_1CT1 = new Condition(T_f_in3, "p_f_in3", TransitionCondition.NotNull);
        Condition T_f_in3_1CT2 = new Condition(T_f_in3, "in3", TransitionCondition.NotNull);
        T_f_in3_1CT1.SetNextCondition(LogicConnector.AND, T_f_in3_1CT2);

        GuardMapping grdTf_in3_1 = new GuardMapping();
        grdTf_in3_1.condition = T_f_in3_1CT1;
        grdTf_in3_1.Activations.add(new Activation(T6, "FIVE", TransitionOperation.DynamicDelay,""));

        T_f_in3.GuardMappingList.add(grdTf_in3_1);

        Condition T_f_in3_2CT1 = new Condition(T_f_in3, "p_f_in3", TransitionCondition.NotNull);
        Condition T_f_in3_2CT2 = new Condition(T_f_in3, "in3", TransitionCondition.NotNull);
        T_f_in3_2CT1.SetNextCondition(LogicConnector.AND, T_f_in3_2CT2);

        GuardMapping grdTf_in3_2 = new GuardMapping();
        grdTf_in3_2.condition = T_f_in3_2CT1;
        grdTf_in3_2.Activations.add(new Activation(T6, "TEN", TransitionOperation.DynamicDelay,""));

        T_f_in3.GuardMappingList.add(grdTf_in3_2);

        T_f_in3.Delay = 5;
        pn.Transitions.add(T_f_in3);

        PetriTransition T_f_in3_tram = new PetriTransition(pn);
        T_f_in3_tram.TransitionName = "T_f_in3_tram";
        T_f_in3_tram.InputPlaceName.add("p_f_in3_tram");
        T_f_in3_tram.InputPlaceName.add("in3_tram");
        T_f_in3_tram.IsAsync = true;

        Condition T_f_in3_tram_1CT1 = new Condition(T_f_in3_tram, "p_f_in3_tram", TransitionCondition.NotNull);
        Condition T_f_in3_tram_1CT2  = new Condition(T_f_in3_tram, "in3_tram", TransitionCondition.NotNull);
        T_f_in3_tram_1CT1.SetNextCondition(LogicConnector.AND, T_f_in3_tram_1CT2);

        GuardMapping grdTf_in3_tram_1 = new GuardMapping();
        grdTf_in3_tram_1.condition = T_f_in3_tram_1CT1;
        grdTf_in3_tram_1.Activations.add(new Activation(T6, "FIVE", TransitionOperation.DynamicDelay,""));

        T_f_in3_tram.GuardMappingList.add(grdTf_in3_tram_1);

        Condition T_f_in3_tram_2CT1 = new Condition(T_f_in3, "p_f_in3_tram", TransitionCondition.NotNull);
        Condition T_f_in3_tram_2CT2 = new Condition(T_f_in3, "in3_tram", TransitionCondition.NotNull);
        T_f_in3_tram_2CT1.SetNextCondition(LogicConnector.AND, T_f_in3_tram_2CT2);

        GuardMapping grdTf_in3_tram_2 = new GuardMapping();
        grdTf_in3_tram_2.condition = T_f_in3_tram_2CT1;
        grdTf_in3_tram_2.Activations.add(new Activation(T6, "TEN", TransitionOperation.DynamicDelay,""));

        T_f_in3_tram.GuardMappingList.add(grdTf_in3_tram_2);

        T_f_in3_tram.Delay = 5;
        pn.Transitions.add(T_f_in3_tram);

        PetriTransition T_f_in4 = new PetriTransition(pn);
        T_f_in4.TransitionName = "T_f_in4";
        T_f_in4.InputPlaceName.add("T_f_in4");
        T_f_in4.InputPlaceName.add("in4");
        T_f_in4.IsAsync = true;

        Condition T_f_in4_1CT1 = new Condition(T_f_in4, "p_f_in4", TransitionCondition.NotNull);
        Condition T_f_in4_1CT2 = new Condition(T_f_in4, "in4", TransitionCondition.NotNull);
        T_f_in4_1CT1.SetNextCondition(LogicConnector.AND, T_f_in4_1CT2);

        GuardMapping grdTf_in4_1 = new GuardMapping();
        grdTf_in4_1.condition = T_f_in4_1CT1;
        grdTf_in4_1.Activations.add(new Activation(T8, "FIVE", TransitionOperation.DynamicDelay,""));

        T_f_in4.GuardMappingList.add(grdTf_in4_1);

        Condition T_f_in4_2CT1 = new Condition(T_f_in4, "p_f_in4", TransitionCondition.NotNull);
        Condition T_f_in4_2CT2 = new Condition(T_f_in4, "in4", TransitionCondition.NotNull);
        T_f_in4_2CT1.SetNextCondition(LogicConnector.AND, T_f_in4_2CT2);

        GuardMapping grdTf_in4_2 = new GuardMapping();
        grdTf_in4_2.condition = T_f_in4_2CT1;
        grdTf_in4_2.Activations.add(new Activation(T8, "TEN", TransitionOperation.DynamicDelay,""));

        T_f_in4.GuardMappingList.add(grdTf_in4_2);

        T_f_in4.Delay = 5;
        pn.Transitions.add(T_f_in4);


        System.out.println("Controller started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
