package FinalProject_TeamTrafficLights;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller1 {

    public static void main (String []args) {
        PetriNet pn1 = new PetriNet();
        pn1.PetriNetName = "Controller1";
        pn1.SetName("Controller1");
        pn1.NetworkPort = 1081;

        DataString ini = new DataString();
        //ini.Printable = false;
        ini.SetName("ini");
        ini.SetValue("red");
        pn1.ConstantPlaceList.add(ini);

        DataString red = new DataString();
        //red.Printable = false;
        red.SetName("red");
        red.SetValue("red");
        pn1.ConstantPlaceList.add(red);

        DataString green = new DataString();
        //green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn1.ConstantPlaceList.add(green);

        DataString yellow = new DataString();
        //yellow.Printable = false;
        yellow.SetName("yellow");
        yellow.SetValue("yellow");
        pn1.ConstantPlaceList.add(yellow);

        DataInteger Five = new DataInteger();
        Five.SetName("Five");
        Five.SetValue(5);
        pn1.ConstantPlaceList.add(Five);

        DataInteger Ten = new DataInteger();
        Ten.SetName("Ten");
        Ten.SetValue(10);
        pn1.ConstantPlaceList.add(Ten);

        DataString p1 = new DataString();
        p1.SetName("r1r2r3r4");
        p1.SetValue("signal");
        pn1.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("g1r2r3r4");
        pn1.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("y1r2r3r4");
        pn1.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("r1g2r3r4");
        pn1.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("r1y2r3r4");
        pn1.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("r1r2g3r4");
        pn1.PlaceList.add(p6);

        DataString p7 = new DataString();
        p7.SetName("r1r2y3r4");
        pn1.PlaceList.add(p7);

        DataString p8 = new DataString();
        p8.SetName("r1r2r3g4");
        pn1.PlaceList.add(p8);

        DataString p9 = new DataString();
        p9.SetName("r1r2r3y4");
        pn1.PlaceList.add(p9);

        DataTransfer p10 = new DataTransfer();
        p10.SetName("OP1");
        p10.Value = new TransferOperation("localhost", "1080", "P_TL1");
        pn1.PlaceList.add(p10);

        DataTransfer p11 = new DataTransfer();
        p11.SetName("OP2");
        p11.Value = new TransferOperation("localhost", "1080", "P_TL2i");
        pn1.PlaceList.add(p11);

        DataTransfer p12 = new DataTransfer();
        p12.SetName("OP3");
        p12.Value = new TransferOperation("localhost", "1080", "P_TL3i");
        pn1.PlaceList.add(p12);

        DataTransfer p13 = new DataTransfer();
        p13.SetName("OP4");
        p13.Value = new TransferOperation("localhost", "1080", "P_TL4i");
        pn1.PlaceList.add(p13);

        DataString in1 = new DataString();
        in1.SetName("in1");
        pn1.PlaceList.add(in1);

        DataString in2 = new DataString();
        in2.SetName("in2");
        pn1.PlaceList.add(in2);

        DataString in3 = new DataString();
        in3.SetName("in3");
        pn1.PlaceList.add(in3);

        DataString in4 = new DataString();
        in4.SetName("in4");
        pn1.PlaceList.add(in4);

        DataString p_f1 = new DataString();
        p_f1.SetName("p_f1");
        pn1.PlaceList.add(p_f1);

        DataString p_f2 = new DataString();
        p_f2.SetName("p_f2");
        pn1.PlaceList.add(p_f2);

        DataString p_f3 = new DataString();
        p_f3.SetName("p_f3");
        pn1.PlaceList.add(p_f3);

        DataString p_f4 = new DataString();
        p_f4.SetName("p_f4");
        pn1.PlaceList.add(p_f4);

        // ------------- Transitions ----------------

        //----------------------------iniT------------------------------------
        PetriTransition iniT = new PetriTransition(pn1);
        iniT.TransitionName = "iniT";

        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition= iniTCt1;

        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP1"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP2"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP3"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP4"));
        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));

        iniT.GuardMappingList.add(grdiniT);

        iniT.Delay = 0;
        pn1.Transitions.add(iniT);

        //----------------------------T11------------------------------------
        PetriTransition t_11 = new PetriTransition(pn1);
        t_11.TransitionName = "T_11";
        t_11.InputPlaceName.add("r1r2r3r4");

        Condition T_11Ct1 = new Condition(t_11, "r1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT_11 = new GuardMapping();
        grdT_11.condition = T_11Ct1;
        grdT_11.Activations.add(new Activation(t_11, "r1r2r3r4", TransitionOperation.Move, "g1r2r3r4"));
        grdT_11.Activations.add(new Activation(t_11, "green", TransitionOperation.SendOverNetwork, "OP1"));
       // grdT_11.Activations.add(new Activation(t_11, "red", TransitionOperation.SendOverNetwork, "OP2"));
        grdT_11.Activations.add(new Activation(t_11, "r1r2r3r4", TransitionOperation.Move, "p_f1"));
        t_11.GuardMappingList.add(grdT_11);

        t_11.Delay = 5;
        pn1.Transitions.add(t_11);

        //----------------------------T_12------------------------------------
        PetriTransition t_12 = new PetriTransition(pn1);
        t_12.TransitionName = "T_12";
        t_12.InputPlaceName.add("g1r2r3r4");

        Condition T_12Ct1 = new Condition(t_12, "g1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT_12 = new GuardMapping();
        grdT_12.condition = T_12Ct1;
        grdT_12.Activations.add(new Activation(t_12, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
        grdT_12.Activations.add(new Activation(t_12, "yellow", TransitionOperation.SendOverNetwork, "OP1"));

        t_12.GuardMappingList.add(grdT_12);

        t_12.Delay = 5;
        pn1.Transitions.add(t_12);

        //----------------------------T_13------------------------------------
        PetriTransition t_13 = new PetriTransition(pn1);
        t_13.TransitionName = "T_13";
        t_13.InputPlaceName.add("y1r2r3r4");

        Condition T_13Ct1 = new Condition(t_13, "y1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT_13 = new GuardMapping();
        grdT_13.condition = T_13Ct1;
        grdT_13.Activations.add(new Activation(t_13, "y1r2r3r4", TransitionOperation.Move, "r1g2r3r4"));
        grdT_13.Activations.add(new Activation(t_13, "red", TransitionOperation.SendOverNetwork, "OP1"));
        grdT_13.Activations.add(new Activation(t_13, "green", TransitionOperation.SendOverNetwork, "OP2"));
        grdT_13.Activations.add(new Activation(t_13, "y1r2r3r4", TransitionOperation.Move, "p_f2"));
        t_13.GuardMappingList.add(grdT_13);

        t_13.Delay = 5;
        pn1.Transitions.add(t_13);

        //----------------------------T_14------------------------------------
        PetriTransition t_14 = new PetriTransition(pn1);
        t_14.TransitionName = "T_14";
        t_14.InputPlaceName.add("r1g2r3r4");

        Condition T_14Ct1 = new Condition(t_14, "r1g2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT_14 = new GuardMapping();
        grdT_14.condition = T_14Ct1;
        grdT_14.Activations.add(new Activation(t_14, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
        grdT_14.Activations.add(new Activation(t_14, "yellow", TransitionOperation.SendOverNetwork, "OP2"));

        t_14.GuardMappingList.add(grdT_14);

        t_14.Delay = 5;
        pn1.Transitions.add(t_14);

        //----------------------------T_15------------------------------------
        PetriTransition t_15 = new PetriTransition(pn1);
        t_15.TransitionName = "T_15";
        t_15.InputPlaceName.add("r1y2r3r4");

        Condition T_15Ct1 = new Condition(t_15, "r1y2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT_15 = new GuardMapping();
        grdT_15.condition = T_15Ct1;
        grdT_15.Activations.add(new Activation(t_15, "r1y2r3r4", TransitionOperation.Move, "r1r2g3r4"));
        grdT_15.Activations.add(new Activation(t_15, "red", TransitionOperation.SendOverNetwork, "OP2"));
        grdT_15.Activations.add(new Activation(t_15, "green", TransitionOperation.SendOverNetwork, "OP3"));
        grdT_15.Activations.add(new Activation(t_15, "r1y2r3r4", TransitionOperation.Move, "p_f3"));
        t_15.GuardMappingList.add(grdT_15);

        t_15.Delay = 5;
        pn1.Transitions.add(t_15);

        //----------------------------T_16------------------------------------
        PetriTransition t_16 = new PetriTransition(pn1);
        t_16.TransitionName = "T_16";
        t_16.InputPlaceName.add("r1r2g3r4");

        Condition T_16Ct1 = new Condition(t_16, "r1r2g3r4", TransitionCondition.NotNull);

        GuardMapping grdT_16 = new GuardMapping();
        grdT_16.condition = T_16Ct1;
        grdT_16.Activations.add(new Activation(t_16, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
        grdT_16.Activations.add(new Activation(t_16, "yellow", TransitionOperation.SendOverNetwork, "OP3"));

        t_16.GuardMappingList.add(grdT_16);

        t_16.Delay = 5;
        pn1.Transitions.add(t_16);

        //----------------------------T_17------------------------------------
        PetriTransition t_17 = new PetriTransition(pn1);
        t_17.TransitionName = "T_17";
        t_17.InputPlaceName.add("r1r2y3r4");

        Condition T_17Ct1 = new Condition(t_17, "r1r2y3r4", TransitionCondition.NotNull);

        GuardMapping grdT_17 = new GuardMapping();
        grdT_17.condition = T_17Ct1;
        grdT_17.Activations.add(new Activation(t_17, "r1r2y3r4", TransitionOperation.Move, "r1r2r3g4"));
        grdT_17.Activations.add(new Activation(t_17, "green", TransitionOperation.SendOverNetwork, "OP4"));
        grdT_17.Activations.add(new Activation(t_17, "red", TransitionOperation.SendOverNetwork, "OP3"));
        grdT_17.Activations.add(new Activation(t_17, "r1r2y3r4", TransitionOperation.Move, "p_f4"));
        t_17.GuardMappingList.add(grdT_17);

        t_17.Delay = 5;
        pn1.Transitions.add(t_17);

        //----------------------------T_18------------------------------------
        PetriTransition t_18 = new PetriTransition(pn1);
        t_18.TransitionName = "T_18";
        t_18.InputPlaceName.add("r1r2r3g4");

        Condition T_18Ct1 = new Condition(t_18, "r1r2r3g4", TransitionCondition.NotNull);

        GuardMapping grdT_18 = new GuardMapping();
        grdT_18.condition = T_18Ct1;
        grdT_18.Activations.add(new Activation(t_18, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
        grdT_18.Activations.add(new Activation(t_18, "yellow", TransitionOperation.SendOverNetwork, "OP4"));

        t_18.GuardMappingList.add(grdT_18);

        t_18.Delay = 5;
        pn1.Transitions.add(t_18);

        //----------------------------T_19------------------------------------
        PetriTransition t_19 = new PetriTransition(pn1);
        t_19.TransitionName = "T_19";
        t_19.InputPlaceName.add("r1r2r3y4");

        Condition T_19Ct1 = new Condition(t_19, "r1r2r3y4", TransitionCondition.NotNull);

        GuardMapping grdT_19 = new GuardMapping();
        grdT_19.condition = T_19Ct1;
        grdT_19.Activations.add(new Activation(t_19, "r1r2r3y4", TransitionOperation.Move, "r1r2r3r4"));
        grdT_19.Activations.add(new Activation(t_19, "red", TransitionOperation.SendOverNetwork, "OP4"));

        t_19.GuardMappingList.add(grdT_19);

        t_19.Delay = 5;
        pn1.Transitions.add(t_19);

        // T_f1------------------------------------------------------------
        PetriTransition t_f1 = new PetriTransition(pn1);
        t_f1.TransitionName = "T_f1";
        t_f1.IsAsync = true;
        t_f1.InputPlaceName.add("in1");
        t_f1.InputPlaceName.add("p_f1");

        Condition T_f1Ct1 = new Condition(t_f1, "p_f1", TransitionCondition.NotNull);
        Condition T_f1Ct2 = new Condition(t_f1, "in1", TransitionCondition.IsNull);
        T_f1Ct1.SetNextCondition(LogicConnector.AND, T_f1Ct2);

        GuardMapping grd1T_f1 = new GuardMapping();
        grd1T_f1.condition = T_f1Ct1;
        grd1T_f1.Activations.add(new Activation(t_f1, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f1Ct3 = new Condition(t_f1, "p_f1", TransitionCondition.NotNull);
        Condition T_f1Ct4 = new Condition(t_f1, "in1", TransitionCondition.NotNull);
        T_f1Ct3.SetNextCondition(LogicConnector.AND, T_f1Ct4);

        GuardMapping grd2T_f1 = new GuardMapping();
        grd2T_f1.condition = T_f1Ct3;
        grd2T_f1.Activations.add(new Activation(t_f1, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f1.GuardMappingList.add(grd1T_f1);
        t_f1.GuardMappingList.add(grd2T_f1);

        pn1.Transitions.add(t_f1);

        // T_f2------------------------------------------------------------
        PetriTransition t_f2 = new PetriTransition(pn1);
        t_f2.TransitionName = "T_f2";
        t_f2.IsAsync = true;
        t_f2.InputPlaceName.add("in2");
        t_f2.InputPlaceName.add("p_f2");

        Condition T_f2Ct1 = new Condition(t_f2, "p_f2", TransitionCondition.NotNull);
        Condition T_f2Ct2 = new Condition(t_f2, "in2", TransitionCondition.IsNull);
        T_f2Ct1.SetNextCondition(LogicConnector.AND, T_f2Ct2);

        GuardMapping grd1T_f2 = new GuardMapping();
        grd1T_f2.condition = T_f2Ct1;
        grd1T_f2.Activations.add(new Activation(t_f2, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f2Ct3 = new Condition(t_f2, "p_f2", TransitionCondition.NotNull);
        Condition T_f2Ct4 = new Condition(t_f2, "in2", TransitionCondition.NotNull);
        T_f2Ct3.SetNextCondition(LogicConnector.AND, T_f2Ct4);

        GuardMapping grd2T_f2 = new GuardMapping();
        grd2T_f2.condition = T_f2Ct3;
        grd2T_f2.Activations.add(new Activation(t_f2, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f2.GuardMappingList.add(grd1T_f2);
        t_f2.GuardMappingList.add(grd2T_f2);

        pn1.Transitions.add(t_f2);

        // T_f3------------------------------------------------------------
        PetriTransition t_f3 = new PetriTransition(pn1);
        t_f3.TransitionName = "T_f3";
        t_f3.IsAsync = true;
        t_f3.InputPlaceName.add("in3");
        t_f3.InputPlaceName.add("p_f3");

        Condition T_f3Ct1 = new Condition(t_f3, "p_f3", TransitionCondition.NotNull);
        Condition T_f3Ct2 = new Condition(t_f3, "in3", TransitionCondition.IsNull);
        T_f3Ct1.SetNextCondition(LogicConnector.AND, T_f3Ct2);

        GuardMapping grd1T_f3 = new GuardMapping();
        grd1T_f3.condition = T_f3Ct1;
        grd1T_f3.Activations.add(new Activation(t_f3, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f3Ct3 = new Condition(t_f3, "p_f3", TransitionCondition.NotNull);
        Condition T_f3Ct4 = new Condition(t_f3, "in3", TransitionCondition.NotNull);
        T_f3Ct3.SetNextCondition(LogicConnector.AND, T_f3Ct4);

        GuardMapping grd2T_f3 = new GuardMapping();
        grd2T_f3.condition = T_f3Ct3;
        grd2T_f3.Activations.add(new Activation(t_f3, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f3.GuardMappingList.add(grd1T_f3);
        t_f3.GuardMappingList.add(grd2T_f3);

        pn1.Transitions.add(t_f3);

        // T_f4------------------------------------------------------------
        PetriTransition t_f4 = new PetriTransition(pn1);
        t_f4.TransitionName = "T_f4";
        t_f4.IsAsync = true;
        t_f4.InputPlaceName.add("in4");
        t_f4.InputPlaceName.add("p_f4");

        Condition T_f4Ct1 = new Condition(t_f4, "p_f4", TransitionCondition.NotNull);
        Condition T_f4Ct2 = new Condition(t_f4, "in4", TransitionCondition.IsNull);
        T_f4Ct1.SetNextCondition(LogicConnector.AND, T_f4Ct2);

        GuardMapping grd1T_f4 = new GuardMapping();
        grd1T_f4.condition = T_f4Ct1;
        grd1T_f4.Activations.add(new Activation(t_f4, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f4Ct3 = new Condition(t_f4, "p_f4", TransitionCondition.NotNull);
        Condition T_f4Ct4 = new Condition(t_f4, "in4", TransitionCondition.NotNull);
        T_f4Ct3.SetNextCondition(LogicConnector.AND, T_f4Ct4);

        GuardMapping grd2T_f4 = new GuardMapping();
        grd2T_f4.condition = T_f4Ct3;
        grd2T_f4.Activations.add(new Activation(t_f4, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f4.GuardMappingList.add(grd1T_f4);
        t_f4.GuardMappingList.add(grd2T_f4);

        pn1.Transitions.add(t_f4);

        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Controller1 started \n ------------------------------");
        pn1.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn1;
        frame.setVisible(true);
    }
    }
