package FinalProject_TeamTrafficLights;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Controller2 {

    public static void main (String []args) {
        PetriNet pn2 = new PetriNet();
        pn2.PetriNetName = "Controller2";
        pn2.SetName("Controller2");
        pn2.NetworkPort = 1082;

        DataString ini = new DataString();
        //ini.Printable = false;
        ini.SetName("ini");
        ini.SetValue("red");
        pn2.ConstantPlaceList.add(ini);

        DataString red = new DataString();
        //red.Printable = false;
        red.SetName("red");
        red.SetValue("red");
        pn2.ConstantPlaceList.add(red);

        DataString green = new DataString();
        //green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn2.ConstantPlaceList.add(green);

        DataString yellow = new DataString();
        //yellow.Printable = false;
        yellow.SetName("yellow");
        yellow.SetValue("yellow");
        pn2.ConstantPlaceList.add(yellow);

        DataInteger Five = new DataInteger();
        Five.SetName("Five");
        Five.SetValue(5);
        pn2.ConstantPlaceList.add(Five);

        DataInteger Ten = new DataInteger();
        Ten.SetName("Ten");
        Ten.SetValue(10);
        pn2.ConstantPlaceList.add(Ten);

        DataString p1 = new DataString();
        p1.SetName("r5r6r6br8");
        p1.SetValue("signal");
        pn2.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("g5r6r6br8");
        pn2.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("y5r6r6br8");
        pn2.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("r5g6r6br8");
        pn2.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("r5y6r6br8");
        pn2.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("r5r6g6br8");
        pn2.PlaceList.add(p6);

        DataString p7 = new DataString();
        p7.SetName("r5r6y6br8");
        pn2.PlaceList.add(p7);

        DataString p8 = new DataString();
        p8.SetName("r5r6r6bg8");
        pn2.PlaceList.add(p8);

        DataString p9 = new DataString();
        p9.SetName("r5r6r6by8");
        pn2.PlaceList.add(p9);

        DataTransfer p10 = new DataTransfer();
        p10.SetName("OP5");
        p10.Value = new TransferOperation("localhost", "1084", "P_TL5i");
        pn2.PlaceList.add(p10);

        DataTransfer p11 = new DataTransfer();
        p11.SetName("OP6b");
        p11.Value = new TransferOperation("localhost", "1084", "P_TL6b");
        pn2.PlaceList.add(p11);

        DataTransfer p12 = new DataTransfer();
        p12.SetName("OP6");
        p12.Value = new TransferOperation("localhost", "1084", "P_TL6");
        pn2.PlaceList.add(p12);

        DataTransfer p13 = new DataTransfer();
        p13.SetName("OP8");
        p13.Value = new TransferOperation("localhost", "1084", "P_TL8i");
        pn2.PlaceList.add(p13);

        // ------------------------------------------------------------------
        DataString p_f5 = new DataString();
        p_f5.SetName("p_f5");
        pn2.PlaceList.add(p_f5);

        DataString p_f6 = new DataString();
        p_f6.SetName("p_f6");
        pn2.PlaceList.add(p_f6);

        DataString p_f6b = new DataString();
        p_f6b.SetName("p_f6b");
        pn2.PlaceList.add(p_f6b);

        DataString p_f8 = new DataString();
        p_f8.SetName("p_f8");
        pn2.PlaceList.add(p_f8);

        DataString in5 = new DataString();
        in5.SetName("in5");
        pn2.PlaceList.add(in5);

        DataString in6 = new DataString();
        in6.SetName("in6");
        pn2.PlaceList.add(in6);

        DataString in6b = new DataString();
        in6b.SetName("in6b");
        pn2.PlaceList.add(in6b);

        DataString in8 = new DataString();
        in8.SetName("in8");
        pn2.PlaceList.add(in8);
        
        // -------------Transitions ---------------------- 

        //----------------------------iniT------------------------------------
        PetriTransition iniT = new PetriTransition(pn2);
        iniT.TransitionName = "iniT";

        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition= iniTCt1;

        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP5"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP6b"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP6"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP8"));
        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));

        iniT.GuardMappingList.add(grdiniT);

        iniT.Delay = 0;
        pn2.Transitions.add(iniT);

        //----------------------------T_21------------------------------------
        PetriTransition t_21 = new PetriTransition(pn2);
        t_21.TransitionName = "T_21";
        t_21.InputPlaceName.add("r5r6r6br8");

        Condition T_21Ct1 = new Condition(t_21, "r5r6r6br8", TransitionCondition.NotNull);

        GuardMapping grdT_21 = new GuardMapping();
        grdT_21.condition = T_21Ct1;
        grdT_21.Activations.add(new Activation(t_21, "r5r6r6br8", TransitionOperation.Move, "g5r6r6br8"));
        grdT_21.Activations.add(new Activation(t_21, "green", TransitionOperation.SendOverNetwork, "OP5"));
       // grdT_21.Activations.add(new Activation(t_21, "red", TransitionOperation.SendOverNetwork, "OP6"));
        grdT_21.Activations.add(new Activation(t_21, "r5r6r6br8", TransitionOperation.Move, "p_f5"));
        t_21.GuardMappingList.add(grdT_21);

        t_21.Delay = 5;
        pn2.Transitions.add(t_21);

        //----------------------------T_22------------------------------------
        PetriTransition t_22 = new PetriTransition(pn2);
        t_22.TransitionName = "T_22";
        t_22.InputPlaceName.add("g5r6r6br8");

        Condition T_22Ct1 = new Condition(t_22, "g5r6r6br8", TransitionCondition.NotNull);

        GuardMapping grdT_22 = new GuardMapping();
        grdT_22.condition = T_22Ct1;
        grdT_22.Activations.add(new Activation(t_22, "g5r6r6br8", TransitionOperation.Move, "y5r6r6br8"));
        grdT_22.Activations.add(new Activation(t_22, "yellow", TransitionOperation.SendOverNetwork, "OP5"));

        t_22.GuardMappingList.add(grdT_22);

        t_22.Delay = 5;
        pn2.Transitions.add(t_22);

        //----------------------------T_23------------------------------------
        PetriTransition t_23 = new PetriTransition(pn2);
        t_23.TransitionName = "T_23";
        t_23.InputPlaceName.add("y5r6r6br8");

        Condition T_23Ct1 = new Condition(t_23, "y5r6r6br8", TransitionCondition.NotNull);

        GuardMapping grdT_23 = new GuardMapping();
        grdT_23.condition = T_23Ct1;
        grdT_23.Activations.add(new Activation(t_23, "y5r6r6br8", TransitionOperation.Move, "r5g6r6br8"));
        grdT_23.Activations.add(new Activation(t_23, "red", TransitionOperation.SendOverNetwork, "OP5"));
        grdT_23.Activations.add(new Activation(t_23, "green", TransitionOperation.SendOverNetwork, "OP6"));
        grdT_23.Activations.add(new Activation(t_23, "y5r6r6br8", TransitionOperation.Move, "p_f6"));

        t_23.GuardMappingList.add(grdT_23);

        t_23.Delay = 5;
        pn2.Transitions.add(t_23);

        //----------------------------T_24------------------------------------
        PetriTransition t_24 = new PetriTransition(pn2);
        t_24.TransitionName = "T_24";
        t_24.InputPlaceName.add("r5g6r6br48");

        Condition t_24Ct1 = new Condition(t_24, "r5g6r6br8", TransitionCondition.NotNull);

        GuardMapping grdt_24 = new GuardMapping();
        grdt_24.condition = t_24Ct1;
        grdt_24.Activations.add(new Activation(t_24, "r5g6r6br8", TransitionOperation.Move, "r5y6r6br8"));
        grdt_24.Activations.add(new Activation(t_24, "yellow", TransitionOperation.SendOverNetwork, "OP6"));

        t_24.GuardMappingList.add(grdt_24);

        t_24.Delay = 5;
        pn2.Transitions.add(t_24);

        //----------------------------t_25------------------------------------
        PetriTransition t_25 = new PetriTransition(pn2);
        t_25.TransitionName = "t_25";
        t_25.InputPlaceName.add("r5y6r6br8");

        Condition t_25Ct1 = new Condition(t_25, "r5y6r6br8", TransitionCondition.NotNull);

        GuardMapping grdt_25 = new GuardMapping();
        grdt_25.condition = t_25Ct1;
        grdt_25.Activations.add(new Activation(t_25, "r5y6r6br8", TransitionOperation.Move, "r5r6g6br8"));
        grdt_25.Activations.add(new Activation(t_25, "red", TransitionOperation.SendOverNetwork, "OP6"));
        grdt_25.Activations.add(new Activation(t_25, "green", TransitionOperation.SendOverNetwork, "OP6b"));
        grdt_25.Activations.add(new Activation(t_25, "r5y6r6br8", TransitionOperation.Move, "p_f6b"));
        t_25.GuardMappingList.add(grdt_25);

        t_25.Delay = 5;
        pn2.Transitions.add(t_25);

        //----------------------------t_26------------------------------------
        PetriTransition t_26 = new PetriTransition(pn2);
        t_26.TransitionName = "t_26";
        t_26.InputPlaceName.add("r5rbg6br8");

        Condition t_26Ct1 = new Condition(t_26, "r5r6g6br8", TransitionCondition.NotNull);

        GuardMapping grdt_26 = new GuardMapping();
        grdt_26.condition = t_26Ct1;
        grdt_26.Activations.add(new Activation(t_26, "r5r6g6br8", TransitionOperation.Move, "r5r6y6br8"));
        grdt_26.Activations.add(new Activation(t_26, "yellow", TransitionOperation.SendOverNetwork, "OP6b"));

        t_26.GuardMappingList.add(grdt_26);

        t_26.Delay = 5;
        pn2.Transitions.add(t_26);

        //----------------------------t_27------------------------------------
        PetriTransition t_27 = new PetriTransition(pn2);
        t_27.TransitionName = "t_27";
        t_27.InputPlaceName.add("r5r6y6br8");

        Condition t_27Ct1 = new Condition(t_27, "r5r6y6br8", TransitionCondition.NotNull);

        GuardMapping grdt_27 = new GuardMapping();
        grdt_27.condition = t_27Ct1;
        grdt_27.Activations.add(new Activation(t_27, "r5r6y6br8", TransitionOperation.Move, "r5r6r6bg8"));
        grdt_27.Activations.add(new Activation(t_27, "green", TransitionOperation.SendOverNetwork, "OP8"));
        grdt_27.Activations.add(new Activation(t_27, "red", TransitionOperation.SendOverNetwork, "OP6b"));
        grdt_27.Activations.add(new Activation(t_27, "r5r6y6br8", TransitionOperation.Move, "p_f8"));
        t_27.GuardMappingList.add(grdt_27);

        t_27.Delay = 5;
        pn2.Transitions.add(t_27);

        //----------------------------t_28------------------------------------
        PetriTransition t_28 = new PetriTransition(pn2);
        t_28.TransitionName = "t_28";
        t_28.InputPlaceName.add("r5r6r6bg8");

        Condition t_28Ct1 = new Condition(t_28, "r5r6r6bg8", TransitionCondition.NotNull);

        GuardMapping grdt_28 = new GuardMapping();
        grdt_28.condition = t_28Ct1;
        grdt_28.Activations.add(new Activation(t_28, "r5r6r6bg8", TransitionOperation.Move, "r5r6r6by8"));
        grdt_28.Activations.add(new Activation(t_28, "yellow", TransitionOperation.SendOverNetwork, "OP8"));

        t_28.GuardMappingList.add(grdt_28);

        t_28.Delay = 5;
        pn2.Transitions.add(t_28);

        //----------------------------t_29------------------------------------
        PetriTransition t_29 = new PetriTransition(pn2);
        t_29.TransitionName = "t_29";
        t_29.InputPlaceName.add("r5r6r6by8");

        Condition t_29Ct1 = new Condition(t_29, "r5r6r6by8", TransitionCondition.NotNull);

        GuardMapping grdt_29 = new GuardMapping();
        grdt_29.condition = t_29Ct1;
        grdt_29.Activations.add(new Activation(t_29, "r5r6r6by8", TransitionOperation.Move, "r5r6r6br8"));
        grdt_29.Activations.add(new Activation(t_29, "red", TransitionOperation.SendOverNetwork, "OP8"));
        grdt_29.Activations.add(new Activation(t_29, "green", TransitionOperation.SendOverNetwork, "OP5"));

        t_29.GuardMappingList.add(grdt_29);

        t_29.Delay = 5;
        pn2.Transitions.add(t_29);

        
        // T_f5------------------------------------------------------------
        PetriTransition t_f5 = new PetriTransition(pn2);
        t_f5.TransitionName = "T_f5";
        t_f5.IsAsync = true;
        t_f5.InputPlaceName.add("in5");
        t_f5.InputPlaceName.add("p_f5");

        Condition T_f5Ct1 = new Condition(t_f5, "p_f5", TransitionCondition.NotNull);
        Condition T_f5Ct2 = new Condition(t_f5, "in5", TransitionCondition.IsNull);
        T_f5Ct1.SetNextCondition(LogicConnector.AND, T_f5Ct2);

        GuardMapping grd1T_f5 = new GuardMapping();
        grd1T_f5.condition = T_f5Ct1;
        grd1T_f5.Activations.add(new Activation(t_f5, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f5Ct3 = new Condition(t_f5, "p_f5", TransitionCondition.NotNull);
        Condition T_f5Ct4 = new Condition(t_f5, "in5", TransitionCondition.NotNull);
        T_f5Ct3.SetNextCondition(LogicConnector.AND, T_f5Ct4);

        GuardMapping grd2T_f5 = new GuardMapping();
        grd2T_f5.condition = T_f5Ct3;
        grd2T_f5.Activations.add(new Activation(t_f5, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f5.GuardMappingList.add(grd1T_f5);
        t_f5.GuardMappingList.add(grd2T_f5);

        pn2.Transitions.add(t_f5);

        // T_f6------------------------------------------------------------
        PetriTransition t_f6 = new PetriTransition(pn2);
        t_f6.TransitionName = "T_f6";
        t_f6.IsAsync = true;
        t_f6.InputPlaceName.add("in6");
        t_f6.InputPlaceName.add("p_f6");

        Condition T_f6Ct1 = new Condition(t_f6, "p_f6", TransitionCondition.NotNull);
        Condition T_f6Ct2 = new Condition(t_f6, "in6", TransitionCondition.IsNull);
        T_f6Ct1.SetNextCondition(LogicConnector.AND, T_f6Ct2);

        GuardMapping grd1T_f6 = new GuardMapping();
        grd1T_f6.condition = T_f6Ct1;
        grd1T_f6.Activations.add(new Activation(t_f6, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f6Ct3 = new Condition(t_f6, "p_f6", TransitionCondition.NotNull);
        Condition T_f6Ct4 = new Condition(t_f6, "in6", TransitionCondition.NotNull);
        T_f6Ct3.SetNextCondition(LogicConnector.AND, T_f6Ct4);

        GuardMapping grd2T_f6 = new GuardMapping();
        grd2T_f6.condition = T_f6Ct3;
        grd2T_f6.Activations.add(new Activation(t_f6, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f6.GuardMappingList.add(grd1T_f6);
        t_f6.GuardMappingList.add(grd2T_f6);

        pn2.Transitions.add(t_f6);

        // T_f6b------------------------------------------------------------
        PetriTransition t_f6b = new PetriTransition(pn2);
        t_f6b.TransitionName = "T_f6b";
        t_f6b.IsAsync = true;
        t_f6b.InputPlaceName.add("in6b");
        t_f6b.InputPlaceName.add("p_f6b");

        Condition T_f6bCt1 = new Condition(t_f6b, "p_f6b", TransitionCondition.NotNull);
        Condition T_f6bCt2 = new Condition(t_f6b, "in6b", TransitionCondition.IsNull);
        T_f6bCt1.SetNextCondition(LogicConnector.AND, T_f6bCt2);

        GuardMapping grd1T_f6b = new GuardMapping();
        grd1T_f6b.condition = T_f6bCt1;
        grd1T_f6b.Activations.add(new Activation(t_f6b, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f6bCt3 = new Condition(t_f6b, "p_f6b", TransitionCondition.NotNull);
        Condition T_f6bCt4 = new Condition(t_f6b, "in6b", TransitionCondition.NotNull);
        T_f6bCt3.SetNextCondition(LogicConnector.AND, T_f6bCt4);

        GuardMapping grd2T_f6b = new GuardMapping();
        grd2T_f6b.condition = T_f6bCt3;
        grd2T_f6b.Activations.add(new Activation(t_f6b, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f6b.GuardMappingList.add(grd1T_f6b);
        t_f6b.GuardMappingList.add(grd2T_f6b);

        pn2.Transitions.add(t_f6b);

        // T_f8------------------------------------------------------------
        PetriTransition t_f8 = new PetriTransition(pn2);
        t_f8.TransitionName = "T_f8";
        t_f8.IsAsync = true;
        t_f8.InputPlaceName.add("in8");
        t_f8.InputPlaceName.add("p_f8");

        Condition T_f8Ct1 = new Condition(t_f8, "p_f8", TransitionCondition.NotNull);
        Condition T_f8Ct2 = new Condition(t_f8, "in8", TransitionCondition.IsNull);
        T_f8Ct1.SetNextCondition(LogicConnector.AND, T_f8Ct2);

        GuardMapping grd1T_f8 = new GuardMapping();
        grd1T_f8.condition = T_f8Ct1;
        grd1T_f8.Activations.add(new Activation(t_f8, "Five", TransitionOperation.DynamicDelay, ""));

        Condition T_f8Ct3 = new Condition(t_f8, "p_f8", TransitionCondition.NotNull);
        Condition T_f8Ct4 = new Condition(t_f8, "in8", TransitionCondition.NotNull);
        T_f8Ct3.SetNextCondition(LogicConnector.AND, T_f8Ct4);

        GuardMapping grd2T_f8 = new GuardMapping();
        grd2T_f8.condition = T_f8Ct3;
        grd2T_f8.Activations.add(new Activation(t_f8, "Ten", TransitionOperation.DynamicDelay, ""));

        t_f8.GuardMappingList.add(grd1T_f8);
        t_f8.GuardMappingList.add(grd2T_f8);

        pn2.Transitions.add(t_f8);

        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Controller2 started \n ------------------------------");
        pn2.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn2;
        frame.setVisible(true);
        

    }
    }
