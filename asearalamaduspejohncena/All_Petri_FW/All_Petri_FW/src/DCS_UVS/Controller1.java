package DCS_UVS;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

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

        // transactions

        //init
        PetriTransition iniT = new PetriTransition(pn);
        iniT.TransitionName = "iniT";

        Condition iniTCT1 = new Condition(iniT, "P_ini", TransitionCondition.NotNull);
        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition = iniTCT1;

        grdiniT.Activations.add(new Activation(iniT, "P_ini", TransitionOperation.SendOverNetwork, "OP1"));
        grdiniT.Activations.add(new Activation(iniT, "P_ini", TransitionOperation.SendOverNetwork, "OP2"));
        grdiniT.Activations.add(new Activation(iniT, "P_ini", TransitionOperation.SendOverNetwork, "OP3"));
        grdiniT.Activations.add(new Activation(iniT,"", TransitionOperation.MakeNull, "P_ini"));

        iniT.GuardMappingList.add(grdiniT);

        iniT.Delay = 0;
        pn.Transitions.add(iniT);

        // t1
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("r1r2r3");

        Condition T1CT1 = new Condition(t1, "r1r2r3", TransitionCondition.NotNull);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition= T1CT1;

        grdT1.Activations.add(new Activation(t1, "r1r2r3", TransitionOperation.Move, "g1r2r3"));
        grdT1.Activations.add(new Activation(t1,"green", TransitionOperation.SendOverNetwork, "OP1"));
        grdT1.Activations.add(new Activation(t1,"r1r2r3", TransitionOperation.Move, "p_f1"));
        t1.GuardMappingList.add(grdT1);

        t1.Delay = 5;
        pn.Transitions.add(t1);

        // t2
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "t2";
        t2.InputPlaceName.add("g1r2r3");

        Condition T2CT1 = new Condition(t2, "g1r2r3", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2CT1;

        grdT2.Activations.add(new Activation(t2, "g1r2r3", TransitionOperation.Move, "y1r2r3"));
        grdT2.Activations.add(new Activation(t2,"yellow", TransitionOperation.SendOverNetwork, "OP1"));

        t2.GuardMappingList.add(grdT2);

        t2.Delay = 5;
        pn.Transitions.add(t2);

        // t3
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "t3";
        t3.InputPlaceName.add("y1r2r3");

        Condition T3CT1 = new Condition(t3, "y1r2r3", TransitionCondition.NotNull);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3CT1;

        grdT3.Activations.add(new Activation(t3, "y1r2r3", TransitionOperation.Move, "r1g2r3"));
        grdT3.Activations.add(new Activation(t3,"red", TransitionOperation.SendOverNetwork, "OP1"));
        grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "OP2"));
        grdT3.Activations.add(new Activation(t3, "y1r2r3", TransitionOperation.SendOverNetwork, "p_f2"));
        t3.GuardMappingList.add(grdT3);

        t3.Delay = 5;
        pn.Transitions.add(t3);

        // t4
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "t4";
        t4.InputPlaceName.add("r1g2r3");

        Condition T4CT1 = new Condition(t4, "r1g2r3", TransitionCondition.NotNull);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition = T4CT1;

        grdT4.Activations.add(new Activation(t4, "r1g2r3", TransitionOperation.Move, "r1y2r3"));
        grdT4.Activations.add(new Activation(t4,"yellow", TransitionOperation.SendOverNetwork, "OP2"));

        t4.GuardMappingList.add(grdT4);

        t4.Delay = 5;
        pn.Transitions.add(t4);

        // t5
        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "t5";
        t5.InputPlaceName.add("r1y2r3");

        Condition T5CT1 = new Condition(t5, "r1y2r3", TransitionCondition.NotNull);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition = T5CT1;

        grdT5.Activations.add(new Activation(t5, "r1y2r3", TransitionOperation.Move, "r1r2g3"));
        grdT5.Activations.add(new Activation(t5,"red", TransitionOperation.SendOverNetwork, "OP2"));
        grdT5.Activations.add(new Activation(t5, "green", TransitionOperation.SendOverNetwork, "OP3"));
        grdT5.Activations.add(new Activation(t5, "r1y2r3", TransitionOperation.Move, "p_f3"));

        t5.GuardMappingList.add(grdT5);

        t5.Delay = 5;
        pn.Transitions.add(t5);

        // t6
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "t6";
        t6.InputPlaceName.add("r1r2g3");

        Condition T6CT1 = new Condition(t6, "r1r2g3", TransitionCondition.NotNull);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition = T6CT1;

        grdT6.Activations.add(new Activation(t6, "r1r2g3", TransitionOperation.Move, "r1r2y3"));
        grdT6.Activations.add(new Activation(t6,"yellow", TransitionOperation.SendOverNetwork, "OP3"));

        t6.GuardMappingList.add(grdT6);

        t6.Delay = 5;
        pn.Transitions.add(t6);

        // t7
        PetriTransition t7 = new PetriTransition(pn);
        t7.TransitionName = "t7";
        t7.InputPlaceName.add("r1r2y3");

        Condition T7CT1 = new Condition(t7, "r1r2y3", TransitionCondition.NotNull);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition = T7CT1;

        grdT7.Activations.add(new Activation(t7, "r1r2y3", TransitionOperation.Move, "r1r2r3"));
        grdT7.Activations.add(new Activation(t7,"red", TransitionOperation.SendOverNetwork, "OP3"));

        t7.GuardMappingList.add(grdT7);

        t7.Delay = 5;
        pn.Transitions.add(t7);

        // t_f1
        PetriTransition t_f1 = new PetriTransition(pn);
        t_f1.TransitionName = "t_f1";
        t_f1.InputPlaceName.add("p_f1");
        t_f1.InputPlaceName.add("in1");

        Condition T_f1CT1 = new Condition(t_f1, "p_f1", TransitionCondition.NotNull);
        Condition T_f1CT2 = new Condition(t_f1, "in1", TransitionCondition.NotNull);
        T_f1CT1.SetNextCondition(LogicConnector.AND, T_f1CT2);

        GuardMapping grdT_f1 = new GuardMapping();
        grdT_f1.condition = T_f1CT1;

        grdT_f1.Activations.add(new Activation(t_f1, "FIVE",TransitionOperation.DynamicDelay, ""));

        Condition T_f1CT3 = new Condition(t_f1, "p_f1", TransitionCondition.NotNull);
        Condition T_f1CT4 = new Condition(t_f1, "in1", TransitionCondition.NotNull);
        T_f1CT3.SetNextCondition(LogicConnector.AND, T_f1CT4);

        GuardMapping grdT_f1_2 = new GuardMapping();
        grdT_f1_2.condition = T_f1CT3;
        grdT_f1_2.Activations.add(new Activation(t_f1, "TEN", TransitionOperation.DynamicDelay, ""));

        t_f1.GuardMappingList.add(grdT_f1);
        t_f1.GuardMappingList.add(grdT_f1_2);

        pn.Transitions.add(t_f1);

        // t_f2
        PetriTransition t_f2 = new PetriTransition(pn);
        t_f2.TransitionName = "t_f2";
        t_f2.InputPlaceName.add("p_f2");
        t_f2.InputPlaceName.add("in2");

        Condition T_f2CT1 = new Condition(t_f2, "p_f2", TransitionCondition.NotNull);
        Condition T_f2CT2 = new Condition(t_f2, "in2", TransitionCondition.NotNull);
        T_f2CT1.SetNextCondition(LogicConnector.AND, T_f2CT2);

        GuardMapping grdT_f2 = new GuardMapping();
        grdT_f2.condition = T_f2CT1;

        grdT_f2.Activations.add(new Activation(t_f2, "FIVE",TransitionOperation.DynamicDelay, ""));

        Condition T_f2CT3 = new Condition(t_f2, "p_f2", TransitionCondition.NotNull);
        Condition T_f2CT4 = new Condition(t_f2, "in2", TransitionCondition.NotNull);
        T_f2CT3.SetNextCondition(LogicConnector.AND, T_f2CT4);

        GuardMapping grdT_f2_2 = new GuardMapping();
        grdT_f2_2.condition = T_f2CT3;
        grdT_f2_2.Activations.add(new Activation(t_f2, "TEN", TransitionOperation.DynamicDelay, ""));

        t_f2.GuardMappingList.add(grdT_f2);
        t_f2.GuardMappingList.add(grdT_f2_2);

        pn.Transitions.add(t_f2);


        // t_f3
        PetriTransition t_f3 = new PetriTransition(pn);
        t_f3.TransitionName = "t_f3";
        t_f3.InputPlaceName.add("p_f3");
        t_f3.InputPlaceName.add("in3");

        Condition T_f3CT1 = new Condition(t_f3, "p_f3", TransitionCondition.NotNull);
        Condition T_f3CT2 = new Condition(t_f3, "in3", TransitionCondition.NotNull);
        T_f3CT1.SetNextCondition(LogicConnector.AND, T_f3CT2);

        GuardMapping grdT_f3 = new GuardMapping();
        grdT_f3.condition = T_f3CT1;

        grdT_f3.Activations.add(new Activation(t_f3, "FIVE",TransitionOperation.DynamicDelay, ""));

        Condition T_f3CT3 = new Condition(t_f3, "p_f3", TransitionCondition.NotNull);
        Condition T_f3CT4 = new Condition(t_f3, "in3", TransitionCondition.NotNull);
        T_f3CT3.SetNextCondition(LogicConnector.AND, T_f3CT4);

        GuardMapping grdT_f3_2 = new GuardMapping();
        grdT_f3_2.condition = T_f3CT3;
        grdT_f3_2.Activations.add(new Activation(t_f3, "TEN", TransitionOperation.DynamicDelay, ""));

        t_f3.GuardMappingList.add(grdT_f3);
        t_f3.GuardMappingList.add(grdT_f3_2);

        pn.Transitions.add(t_f3);

        System.out.println("Controller1 started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);

    }
}
