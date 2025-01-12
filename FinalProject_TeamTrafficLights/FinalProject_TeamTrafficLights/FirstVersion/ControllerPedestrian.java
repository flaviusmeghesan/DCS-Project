package FinalProject_TeamTrafficLights.FirstVersion;

import Components.*;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class ControllerPedestrian {
    public static void main (String []args) {
        PetriNet pn1 = new PetriNet();
        pn1.PetriNetName = "ControllerPedestrians";
        pn1.SetName("ControllerPedestrians");
        pn1.NetworkPort = 1083;

        DataString ini = new DataString();
        //ini.Printable = false;
        ini.SetName("ini");
        ini.SetValue("red");
        pn1.ConstantPlaceList.add(ini);


        /// ------ User requests for the predestian traffic lights ------
        DataString UserReq1 = new DataString();
        UserReq1.SetName("UserReq1");
        pn1.ConstantPlaceList.add(UserReq1);

        DataString UserReq2 = new DataString();
        UserReq2.SetName("UserReq2");
        pn1.ConstantPlaceList.add(UserReq2);

        DataString UserReq3 = new DataString();
        UserReq3.SetName("UserReq3");
        pn1.ConstantPlaceList.add(UserReq3);

        DataString UserReq4 = new DataString();
        UserReq4.SetName("UserReq4");
        pn1.ConstantPlaceList.add(UserReq4);

        DataString UserReq5 = new DataString();
        UserReq5.SetName("UserReq5");
        pn1.ConstantPlaceList.add(UserReq5);

        DataString UserReq7 = new DataString();
        UserReq7.SetName("UserReq7");
        pn1.ConstantPlaceList.add(UserReq7);

        DataString UserReq8 = new DataString();
        UserReq8.SetName("UserReq8");
        pn1.ConstantPlaceList.add(UserReq8);
        /// ---------------------------------------

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

        /// ------ Predestians traffic lights states places ------
        DataString p1 = new DataString();
        p1.SetName("yr1");
        pn1.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("rg1");
        pn1.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("ry1");
        pn1.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("gr1");
        pn1.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("yr2");
        pn1.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("rg2");
        pn1.PlaceList.add(p6);

        DataString p7 = new DataString();
        p7.SetName("ry2");
        pn1.PlaceList.add(p7);

        DataString p8 = new DataString();
        p8.SetName("gr2");
        pn1.PlaceList.add(p8);

        DataString p9 = new DataString();
        p9.SetName("yr3");
        pn1.PlaceList.add(p9);

        DataString p10 = new DataString();
        p10.SetName("rg3");
        pn1.PlaceList.add(p10);

        DataString p11 = new DataString();
        p11.SetName("ry3");
        pn1.PlaceList.add(p11);

        DataString p12 = new DataString();
        p12.SetName("gr3");
        pn1.PlaceList.add(p12);

        DataString p13 = new DataString();
        p13.SetName("yr4");
        pn1.PlaceList.add(p13);

        DataString p14 = new DataString();
        p14.SetName("rg4");
        pn1.PlaceList.add(p14);

        DataString p15 = new DataString();
        p15.SetName("ry4");
        pn1.PlaceList.add(p15);

        DataString p16 = new DataString();
        p16.SetName("gr4");
        pn1.PlaceList.add(p16);

        DataString p17 = new DataString();
        p17.SetName("yr5");
        pn1.PlaceList.add(p17);

        DataString p18 = new DataString();
        p18.SetName("rg5");
        pn1.PlaceList.add(p18);

        DataString p19 = new DataString();
        p19.SetName("ry5");
        pn1.PlaceList.add(p19);

        DataString p20 = new DataString();
        p20.SetName("gr7");
        pn1.PlaceList.add(p20);

        DataString p7_1 = new DataString();
        p7_1.SetName("yr7");
        pn1.PlaceList.add(p7_1);

        DataString p7_2 = new DataString();
        p7_2.SetName("rg7");
        pn1.PlaceList.add(p7_2);

        DataString p7_3 = new DataString();
        p7_3.SetName("ry7");
        pn1.PlaceList.add(p7_3);

        DataString p7_4 = new DataString();
        p7_4.SetName("gr7");
        pn1.PlaceList.add(p7_4);

        DataString p21 = new DataString();
        p21.SetName("yr8");
        pn1.PlaceList.add(p21);

        DataString p22 = new DataString();
        p22.SetName("rg8");
        pn1.PlaceList.add(p22);

        DataString p23 = new DataString();
        p23.SetName("ry8");
        pn1.PlaceList.add(p23);

        DataString p24 = new DataString();
        p24.SetName("gr8");
        pn1.PlaceList.add(p24);
        /// ------------------------------------------------------------

        DataString wait1 = new DataString();
        wait1.SetName("wait1");
        pn1.PlaceList.add(wait1);

        DataString wait2 = new DataString();
        wait2.SetName("wait2");
        pn1.PlaceList.add(wait2);

        DataString wait3 = new DataString();
        wait3.SetName("wait3");
        pn1.PlaceList.add(wait3);

        DataString wait4 = new DataString();
        wait4.SetName("wait4");
        pn1.PlaceList.add(wait4);

        DataString wait5 = new DataString();
        wait5.SetName("wait5");
        pn1.PlaceList.add(wait5);

        DataString wait7 = new DataString();
        wait7.SetName("wait7");
        pn1.PlaceList.add(wait7);

        DataString wait8 = new DataString();
        wait8.SetName("wait8");
        pn1.PlaceList.add(wait8);

        /// ----------------------------------------------------------

        DataTransfer P_TL1 = new DataTransfer();
        P_TL1.SetName("P_TL1");
        P_TL1.Value = new TransferOperation("localhost", "1080", "P_TL1");
        pn1.PlaceList.add(P_TL1);

        DataTransfer P_PTL1 = new DataTransfer();
        P_PTL1.SetName("P_PTL1");
        P_PTL1.Value = new TransferOperation("localhost", "1080", "P_PTL1");
        pn1.PlaceList.add(P_PTL1);

        DataTransfer P_TL2 = new DataTransfer();
        P_TL2.SetName("P_TL2");
        P_TL2.Value = new TransferOperation("localhost", "1080", "P_TL2");
        pn1.PlaceList.add(P_TL2);

        DataTransfer P_PTL2 = new DataTransfer();
        P_PTL2.SetName("P_PTL2");
        P_PTL2.Value = new TransferOperation("localhost", "1080", "P_PTL2");
        pn1.PlaceList.add(P_PTL2);

        DataTransfer P_TL3 = new DataTransfer();
        P_TL3.SetName("P_TL3");
        P_TL3.Value = new TransferOperation("localhost", "1080", "P_TL3");
        pn1.PlaceList.add(P_TL3);

        DataTransfer P_PTL3 = new DataTransfer();
        P_PTL3.SetName("P_PTL3");
        P_PTL3.Value = new TransferOperation("localhost", "1080", "P_PTL3");
        pn1.PlaceList.add(P_PTL3);

        DataTransfer P_TL4 = new DataTransfer();
        P_TL4.SetName("P_TL4");
        P_TL4.Value = new TransferOperation("localhost", "1080", "P_TL4");
        pn1.PlaceList.add(P_TL4);

        DataTransfer P_PTL4 = new DataTransfer();
        P_PTL4.SetName("P_PTL4");
        P_PTL4.Value = new TransferOperation("localhost", "1080", "P_PTL4");
        pn1.PlaceList.add(P_PTL4);

        DataTransfer P_TL5 = new DataTransfer();
        P_TL5.SetName("P_TL5");
        P_TL5.Value = new TransferOperation("localhost", "1084", "P_TL5");
        pn1.PlaceList.add(P_TL5);

        DataTransfer P_PTL5 = new DataTransfer();
        P_PTL5.SetName("P_PTL5");
        P_PTL5.Value = new TransferOperation("localhost", "1084", "P_PTL5");
        pn1.PlaceList.add(P_PTL5);

        DataTransfer P_TL7 = new DataTransfer();
        P_TL7.SetName("P_TL7");
        P_TL7.Value = new TransferOperation("localhost", "1084", "P_TL7");
        pn1.PlaceList.add(P_TL7);

        DataTransfer P_PTL7 = new DataTransfer();
        P_PTL7.SetName("P_PTL7");
        P_PTL7.Value = new TransferOperation("localhost", "1084", "P_PTL7");
        pn1.PlaceList.add(P_PTL7);

        DataTransfer P_TL8 = new DataTransfer();
        P_TL8.SetName("P_TL8");
        P_TL8.Value = new TransferOperation("localhost", "1084", "P_TL8");
        pn1.PlaceList.add(P_TL8);

        DataTransfer P_PTL8 = new DataTransfer();
        P_PTL8.SetName("P_PTL8");
        P_PTL8.Value = new TransferOperation("localhost", "1084", "P_PTL8");
        pn1.PlaceList.add(P_PTL8);

        // ----------------------------------------------------------------------------------------
        //                                                                                        |
        // --------------------------    Transitions for pedestrians   ---------------------------
        //                                                                                        |
        // ----------------------------------------------------------------------------------------

        //----------------------------iniT------------------------------------
        PetriTransition iniT = new PetriTransition(pn1);
        iniT.TransitionName = "iniT";

        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition= iniTCt1;

        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL1"));
        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL2"));
        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL3"));
        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL4"));
        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL5"));
        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL7"));
        grdiniT.Activations.add(new Activation(iniT, "red", TransitionOperation.SendOverNetwork, "P_PTL8"));

        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));
        
        iniT.GuardMappingList.add(grdiniT);

        iniT.Delay = 0;
        pn1.Transitions.add(iniT);

        //----------------------------t11------------------------------------
        PetriTransition t11 = new PetriTransition(pn1);
        t11.TransitionName = "t11";
        t11.InputPlaceName.add("UserReq1");
        t11.InputPlaceName.add("wait1");

        Condition t11Ct1 = new Condition(t11, "UserReq1", TransitionCondition.NotNull);
        Condition t11Ct2 = new Condition(t11, "wait1", TransitionCondition.NotNull);
        t11Ct1.SetNextCondition(LogicConnector.AND, t11Ct2);

        GuardMapping grdt11 = new GuardMapping();
        grdt11.condition= t11Ct1;
        grdt11.Activations.add(new Activation(t11, "wait1", TransitionOperation.Move, "yr1"));
        grdt11.Activations.add(new Activation(t11, "yellow", TransitionOperation.SendOverNetwork, "P_TL1"));
        t11.GuardMappingList.add(grdt11);

        t11.Delay = 0;
        pn1.Transitions.add(t11);

        //----------------------------t12------------------------------------
        PetriTransition t12 = new PetriTransition(pn1);
        t12.TransitionName = "t12";
        t12.InputPlaceName.add("yr1");


        Condition t12Ct1 = new Condition(t12, "yr1", TransitionCondition.NotNull);

        GuardMapping grdt12 = new GuardMapping();
        grdt12.condition= t12Ct1;
        grdt12.Activations.add(new Activation(t12, "yr", TransitionOperation.Move, "rg1"));
        grdt12.Activations.add(new Activation(t12, "red", TransitionOperation.SendOverNetwork, "P_TL1"));
        grdt12.Activations.add(new Activation(t12, "green", TransitionOperation.SendOverNetwork, "P_PTL1"));

        t12.GuardMappingList.add(grdt12);

        t12.Delay = 5;
        pn1.Transitions.add(t12);

        //----------------------------t13------------------------------------
        PetriTransition t13 = new PetriTransition(pn1);
        t13.TransitionName = "t13";
        t13.InputPlaceName.add("rg1");



        Condition t13Ct1 = new Condition(t13, "rg1", TransitionCondition.NotNull);

        GuardMapping grdt13 = new GuardMapping();
        grdt13.condition= t13Ct1;
        grdt13.Activations.add(new Activation(t13, "rg1", TransitionOperation.Move, "ry1"));
        grdt13.Activations.add(new Activation(t13, "yellow", TransitionOperation.SendOverNetwork, "P_PTL1"));

        t13.GuardMappingList.add(grdt13);

        t13.Delay = 5;
        pn1.Transitions.add(t13);

        //----------------------------t14------------------------------------
        PetriTransition t14 = new PetriTransition(pn1);
        t14.TransitionName = "t14";
        t14.InputPlaceName.add("ry1");


        Condition t14Ct1 = new Condition(t14, "ry1", TransitionCondition.NotNull);

        GuardMapping grdt14 = new GuardMapping();
        grdt14.condition= t14Ct1;
        grdt14.Activations.add(new Activation(t14, "ry1", TransitionOperation.Move, "gr1"));
        grdt14.Activations.add(new Activation(t14, "green", TransitionOperation.SendOverNetwork, "P_TL1"));
        grdt14.Activations.add(new Activation(t14, "red", TransitionOperation.SendOverNetwork, "P_PTL1"));

        t14.GuardMappingList.add(grdt14);

        t14.Delay = 2;
        pn1.Transitions.add(t14);

        //----------------------------t15------------------------------------
        PetriTransition t15 = new PetriTransition(pn1);
        t15.TransitionName = "t15";
        t15.InputPlaceName.add("gr1");


        Condition t15Ct1 = new Condition(t15, "gr1", TransitionCondition.NotNull);

        GuardMapping grdt15 = new GuardMapping();
        grdt15.condition= t15Ct1;
        grdt15.Activations.add(new Activation(t15, "gr1", TransitionOperation.Move, "wait1"));

        t15.GuardMappingList.add(grdt15);

        t15.Delay = 5;
        pn1.Transitions.add(t15);

        //----------------------------t21------------------------------------
        PetriTransition t21 = new PetriTransition(pn1);
        t21.TransitionName = "t21";
        t21.InputPlaceName.add("UserReq2");
        t21.InputPlaceName.add("wait2");

        Condition t21Ct1 = new Condition(t21, "UserReq2", TransitionCondition.NotNull);
        Condition t21Ct2 = new Condition(t21, "wait2", TransitionCondition.NotNull);
        t21Ct1.SetNextCondition(LogicConnector.AND, t21Ct2);

        GuardMapping grdt21 = new GuardMapping();
        grdt21.condition = t21Ct1;
        grdt21.Activations.add(new Activation(t21, "wait2", TransitionOperation.Move, "yr2"));
        grdt21.Activations.add(new Activation(t21, "yellow", TransitionOperation.SendOverNetwork, "P_TL2"));
        t21.GuardMappingList.add(grdt21);

        t21.Delay = 0;
        pn1.Transitions.add(t21);

//----------------------------t22------------------------------------
        PetriTransition t22 = new PetriTransition(pn1);
        t22.TransitionName = "t22";
        t22.InputPlaceName.add("yr2");

        Condition t22Ct1 = new Condition(t22, "yr2", TransitionCondition.NotNull);

        GuardMapping grdt22 = new GuardMapping();
        grdt22.condition = t22Ct1;
        grdt22.Activations.add(new Activation(t22, "yr2", TransitionOperation.Move, "rg2"));
        grdt22.Activations.add(new Activation(t22, "red", TransitionOperation.SendOverNetwork, "P_TL2"));
        grdt22.Activations.add(new Activation(t22, "green", TransitionOperation.SendOverNetwork, "P_PTL2"));

        t22.GuardMappingList.add(grdt22);

        t22.Delay = 5;
        pn1.Transitions.add(t22);

//----------------------------t23------------------------------------
        PetriTransition t23 = new PetriTransition(pn1);
        t23.TransitionName = "t23";
        t23.InputPlaceName.add("rg2");

        Condition t23Ct1 = new Condition(t23, "rg2", TransitionCondition.NotNull);

        GuardMapping grdt23 = new GuardMapping();
        grdt23.condition = t23Ct1;
        grdt23.Activations.add(new Activation(t23, "rg2", TransitionOperation.Move, "ry2"));
        grdt23.Activations.add(new Activation(t23, "yellow", TransitionOperation.SendOverNetwork, "P_PTL2"));

        t23.GuardMappingList.add(grdt23);

        t23.Delay = 5;
        pn1.Transitions.add(t23);

//----------------------------t24------------------------------------
        PetriTransition t24 = new PetriTransition(pn1);
        t24.TransitionName = "t24";
        t24.InputPlaceName.add("ry2");

        Condition t24Ct1 = new Condition(t24, "ry2", TransitionCondition.NotNull);

        GuardMapping grdt24 = new GuardMapping();
        grdt24.condition = t24Ct1;
        grdt24.Activations.add(new Activation(t24, "ry2", TransitionOperation.Move, "gr2"));
        grdt24.Activations.add(new Activation(t24, "green", TransitionOperation.SendOverNetwork, "P_TL2"));
        grdt24.Activations.add(new Activation(t24, "red", TransitionOperation.SendOverNetwork, "P_PTL2"));

        t24.GuardMappingList.add(grdt24);

        t24.Delay = 2;
        pn1.Transitions.add(t24);

//----------------------------t25------------------------------------
        PetriTransition t25 = new PetriTransition(pn1);
        t25.TransitionName = "t25";
        t25.InputPlaceName.add("gr2");

        Condition t25Ct1 = new Condition(t25, "gr2", TransitionCondition.NotNull);

        GuardMapping grdt25 = new GuardMapping();
        grdt25.condition = t25Ct1;
        grdt25.Activations.add(new Activation(t25, "gr2", TransitionOperation.Move, "wait2"));

        t25.GuardMappingList.add(grdt25);

        t25.Delay = 5;
        pn1.Transitions.add(t25);

//----------------------------t31------------------------------------
        PetriTransition t31 = new PetriTransition(pn1);
        t31.TransitionName = "t31";
        t31.InputPlaceName.add("UserReq3");
        t31.InputPlaceName.add("wait3");

        Condition t31Ct1 = new Condition(t31, "UserReq3", TransitionCondition.NotNull);
        Condition t31Ct2 = new Condition(t31, "wait3", TransitionCondition.NotNull);
        t31Ct1.SetNextCondition(LogicConnector.AND, t31Ct2);

        GuardMapping grdt31 = new GuardMapping();
        grdt31.condition = t31Ct1;
        grdt31.Activations.add(new Activation(t31, "wait3", TransitionOperation.Move, "yr3"));
        grdt31.Activations.add(new Activation(t31, "yellow", TransitionOperation.SendOverNetwork, "P_TL3"));
        t31.GuardMappingList.add(grdt31);

        t31.Delay = 0;
        pn1.Transitions.add(t31);

//----------------------------t32------------------------------------
        PetriTransition t32 = new PetriTransition(pn1);
        t32.TransitionName = "t32";
        t32.InputPlaceName.add("yr3");

        Condition t32Ct1 = new Condition(t32, "yr3", TransitionCondition.NotNull);

        GuardMapping grdt32 = new GuardMapping();
        grdt32.condition = t32Ct1;
        grdt32.Activations.add(new Activation(t32, "yr3", TransitionOperation.Move, "rg3"));
        grdt32.Activations.add(new Activation(t32, "red", TransitionOperation.SendOverNetwork, "P_TL3"));
        grdt32.Activations.add(new Activation(t32, "green", TransitionOperation.SendOverNetwork, "P_PTL3"));

        t32.GuardMappingList.add(grdt32);

        t32.Delay = 5;
        pn1.Transitions.add(t32);

//----------------------------t33------------------------------------
        PetriTransition t33 = new PetriTransition(pn1);
        t33.TransitionName = "t33";
        t33.InputPlaceName.add("rg3");

        Condition t33Ct1 = new Condition(t33, "rg3", TransitionCondition.NotNull);

        GuardMapping grdt33 = new GuardMapping();
        grdt33.condition = t33Ct1;
        grdt33.Activations.add(new Activation(t33, "rg3", TransitionOperation.Move, "ry3"));
        grdt33.Activations.add(new Activation(t33, "yellow", TransitionOperation.SendOverNetwork, "P_PTL3"));

        t33.GuardMappingList.add(grdt33);

        t33.Delay = 5;
        pn1.Transitions.add(t33);

//----------------------------t34------------------------------------
        PetriTransition t34 = new PetriTransition(pn1);
        t34.TransitionName = "t34";
        t34.InputPlaceName.add("ry3");

        Condition t34Ct1 = new Condition(t34, "ry3", TransitionCondition.NotNull);

        GuardMapping grdt34 = new GuardMapping();
        grdt34.condition = t34Ct1;
        grdt34.Activations.add(new Activation(t34, "ry3", TransitionOperation.Move, "gr3"));
        grdt34.Activations.add(new Activation(t34, "green", TransitionOperation.SendOverNetwork, "P_TL3"));
        grdt34.Activations.add(new Activation(t34, "red", TransitionOperation.SendOverNetwork, "P_PTL3"));

        t34.GuardMappingList.add(grdt34);

        t34.Delay = 2;
        pn1.Transitions.add(t34);

//----------------------------t35------------------------------------
        PetriTransition t35 = new PetriTransition(pn1);
        t35.TransitionName = "t35";
        t35.InputPlaceName.add("gr3");

        Condition t35Ct1 = new Condition(t35, "gr3", TransitionCondition.NotNull);

        GuardMapping grdt35 = new GuardMapping();
        grdt35.condition = t35Ct1;
        grdt35.Activations.add(new Activation(t35, "gr3", TransitionOperation.Move, "wait3"));

        t35.GuardMappingList.add(grdt35);

        t35.Delay = 5;
        pn1.Transitions.add(t35);

//----------------------------t41------------------------------------
        PetriTransition t41 = new PetriTransition(pn1);
        t41.TransitionName = "t41";
        t41.InputPlaceName.add("UserReq4");
        t41.InputPlaceName.add("wait4");

        Condition t41Ct1 = new Condition(t41, "UserReq4", TransitionCondition.NotNull);
        Condition t41Ct2 = new Condition(t41, "wait4", TransitionCondition.NotNull);
        t41Ct1.SetNextCondition(LogicConnector.AND, t41Ct2);

        GuardMapping grdt41 = new GuardMapping();
        grdt41.condition = t41Ct1;
        grdt41.Activations.add(new Activation(t41, "wait4", TransitionOperation.Move, "yr4"));
        grdt41.Activations.add(new Activation(t41, "yellow", TransitionOperation.SendOverNetwork, "P_TL4"));
        t41.GuardMappingList.add(grdt41);

        t41.Delay = 0;
        pn1.Transitions.add(t41);

//----------------------------t42------------------------------------
        PetriTransition t42 = new PetriTransition(pn1);
        t42.TransitionName = "t42";
        t42.InputPlaceName.add("yr4");

        Condition t42Ct1 = new Condition(t42, "yr4", TransitionCondition.NotNull);

        GuardMapping grdt42 = new GuardMapping();
        grdt42.condition = t42Ct1;
        grdt42.Activations.add(new Activation(t42, "yr4", TransitionOperation.Move, "rg4"));
        grdt42.Activations.add(new Activation(t42, "red", TransitionOperation.SendOverNetwork, "P_TL4"));
        grdt42.Activations.add(new Activation(t42, "green", TransitionOperation.SendOverNetwork, "P_PTL4"));

        t42.GuardMappingList.add(grdt42);

        t42.Delay = 5;
        pn1.Transitions.add(t42);

//----------------------------t43------------------------------------
        PetriTransition t43 = new PetriTransition(pn1);
        t43.TransitionName = "t43";
        t43.InputPlaceName.add("rg4");

        Condition t43Ct1 = new Condition(t43, "rg4", TransitionCondition.NotNull);

        GuardMapping grdt43 = new GuardMapping();
        grdt43.condition = t43Ct1;
        grdt43.Activations.add(new Activation(t43, "rg4", TransitionOperation.Move, "ry4"));
        grdt43.Activations.add(new Activation(t43, "yellow", TransitionOperation.SendOverNetwork, "P_PTL4"));

        t43.GuardMappingList.add(grdt43);

        t43.Delay = 5;
        pn1.Transitions.add(t43);

//----------------------------t44------------------------------------
        PetriTransition t44 = new PetriTransition(pn1);
        t44.TransitionName = "t44";
        t44.InputPlaceName.add("ry4");

        Condition t44Ct1 = new Condition(t44, "ry4", TransitionCondition.NotNull);

        GuardMapping grdt44 = new GuardMapping();
        grdt44.condition = t44Ct1;
        grdt44.Activations.add(new Activation(t44, "ry4", TransitionOperation.Move, "gr4"));
        grdt44.Activations.add(new Activation(t44, "green", TransitionOperation.SendOverNetwork, "P_TL4"));
        grdt44.Activations.add(new Activation(t44, "red", TransitionOperation.SendOverNetwork, "P_PTL4"));

        t44.GuardMappingList.add(grdt44);

        t44.Delay = 2;
        pn1.Transitions.add(t44);

        //----------------------------t45------------------------------------
        PetriTransition t45 = new PetriTransition(pn1);
        t45.TransitionName = "t45";
        t45.InputPlaceName.add("gr4");

        Condition t45Ct1 = new Condition(t45, "gr4", TransitionCondition.NotNull);

        GuardMapping grdt45 = new GuardMapping();
        grdt45.condition = t45Ct1;
        grdt45.Activations.add(new Activation(t45, "gr4", TransitionOperation.Move, "wait4"));

        t45.GuardMappingList.add(grdt45);

        t45.Delay = 5;
        pn1.Transitions.add(t45);

        //----------------------------t51------------------------------------
        PetriTransition t51 = new PetriTransition(pn1);
        t51.TransitionName = "t51";
        t51.InputPlaceName.add("UserReq5");
        t51.InputPlaceName.add("wait5");

        Condition t51Ct1 = new Condition(t51, "UserReq5", TransitionCondition.NotNull);
        Condition t51Ct2 = new Condition(t51, "wait5", TransitionCondition.NotNull);
        t51Ct1.SetNextCondition(LogicConnector.AND, t51Ct2);

        GuardMapping grdt51 = new GuardMapping();
        grdt51.condition = t51Ct1;
        grdt51.Activations.add(new Activation(t51, "wait5", TransitionOperation.Move, "yr5"));
        grdt51.Activations.add(new Activation(t51, "yellow", TransitionOperation.SendOverNetwork, "P_TL5"));
        t51.GuardMappingList.add(grdt51);

        t51.Delay = 0;
        pn1.Transitions.add(t51);

//----------------------------t52------------------------------------
        PetriTransition t52 = new PetriTransition(pn1);
        t52.TransitionName = "t52";
        t52.InputPlaceName.add("yr5");

        Condition t52Ct1 = new Condition(t52, "yr5", TransitionCondition.NotNull);

        GuardMapping grdt52 = new GuardMapping();
        grdt52.condition = t52Ct1;
        grdt52.Activations.add(new Activation(t52, "yr5", TransitionOperation.Move, "rg5"));
        grdt52.Activations.add(new Activation(t52, "red", TransitionOperation.SendOverNetwork, "P_TL5"));
        grdt52.Activations.add(new Activation(t52, "green", TransitionOperation.SendOverNetwork, "P_PTL5"));

        t52.GuardMappingList.add(grdt52);

        t52.Delay = 5;
        pn1.Transitions.add(t52);

//----------------------------t53------------------------------------
        PetriTransition t53 = new PetriTransition(pn1);
        t53.TransitionName = "t53";
        t53.InputPlaceName.add("rg5");

        Condition t53Ct1 = new Condition(t53, "rg5", TransitionCondition.NotNull);

        GuardMapping grdt53 = new GuardMapping();
        grdt53.condition = t53Ct1;
        grdt53.Activations.add(new Activation(t53, "rg5", TransitionOperation.Move, "ry5"));
        grdt53.Activations.add(new Activation(t53, "yellow", TransitionOperation.SendOverNetwork, "P_PTL5"));

        t53.GuardMappingList.add(grdt53);

        t53.Delay = 5;
        pn1.Transitions.add(t53);

//----------------------------t54------------------------------------
        PetriTransition t54 = new PetriTransition(pn1);
        t54.TransitionName = "t54";
        t54.InputPlaceName.add("ry5");

        Condition t54Ct1 = new Condition(t54, "ry5", TransitionCondition.NotNull);

        GuardMapping grdt54 = new GuardMapping();
        grdt54.condition = t54Ct1;
        grdt54.Activations.add(new Activation(t54, "ry5", TransitionOperation.Move, "gr5"));
        grdt54.Activations.add(new Activation(t54, "green", TransitionOperation.SendOverNetwork, "P_TL5"));
        grdt54.Activations.add(new Activation(t54, "red", TransitionOperation.SendOverNetwork, "P_PTL5"));

        t54.GuardMappingList.add(grdt54);

        t54.Delay = 2;
        pn1.Transitions.add(t54);

//----------------------------t55------------------------------------
        PetriTransition t55 = new PetriTransition(pn1);
        t55.TransitionName = "t55";
        t55.InputPlaceName.add("gr5");

        Condition t55Ct1 = new Condition(t55, "gr5", TransitionCondition.NotNull);

        GuardMapping grdt55 = new GuardMapping();
        grdt55.condition = t55Ct1;
        grdt55.Activations.add(new Activation(t55, "gr5", TransitionOperation.Move, "wait5"));

        t55.GuardMappingList.add(grdt55);

        t55.Delay = 5;
        pn1.Transitions.add(t55);

//----------------------------t71------------------------------------
        PetriTransition t71 = new PetriTransition(pn1);
        t71.TransitionName = "t71";
        t71.InputPlaceName.add("UserReq7");
        t71.InputPlaceName.add("wait7");

        Condition t71Ct1 = new Condition(t71, "UserReq7", TransitionCondition.NotNull);
        Condition t71Ct2 = new Condition(t71, "wait7", TransitionCondition.NotNull);
        t71Ct1.SetNextCondition(LogicConnector.AND, t71Ct2);

        GuardMapping grdt71 = new GuardMapping();
        grdt71.condition = t71Ct1;
        grdt71.Activations.add(new Activation(t71, "wait7", TransitionOperation.Move, "yr7"));
        grdt71.Activations.add(new Activation(t71, "yellow", TransitionOperation.SendOverNetwork, "P_TL7"));
        t71.GuardMappingList.add(grdt71);

        t71.Delay = 0;
        pn1.Transitions.add(t71);

//----------------------------t72------------------------------------
        PetriTransition t72 = new PetriTransition(pn1);
        t72.TransitionName = "t72";
        t72.InputPlaceName.add("yr7");

        Condition t72Ct1 = new Condition(t72, "yr7", TransitionCondition.NotNull);

        GuardMapping grdt72 = new GuardMapping();
        grdt72.condition = t72Ct1;
        grdt72.Activations.add(new Activation(t72, "yr7", TransitionOperation.Move, "rg7"));
        grdt72.Activations.add(new Activation(t72, "red", TransitionOperation.SendOverNetwork, "P_TL7"));
        grdt72.Activations.add(new Activation(t72, "green", TransitionOperation.SendOverNetwork, "P_PTL7"));

        t72.GuardMappingList.add(grdt72);

        t72.Delay = 5;
        pn1.Transitions.add(t72);

//----------------------------t73------------------------------------
        PetriTransition t73 = new PetriTransition(pn1);
        t73.TransitionName = "t73";
        t73.InputPlaceName.add("rg7");

        Condition t73Ct1 = new Condition(t73, "rg7", TransitionCondition.NotNull);

        GuardMapping grdt73 = new GuardMapping();
        grdt73.condition = t73Ct1;
        grdt73.Activations.add(new Activation(t73, "rg7", TransitionOperation.Move, "ry7"));
        grdt73.Activations.add(new Activation(t73, "yellow", TransitionOperation.SendOverNetwork, "P_PTL7"));

        t73.GuardMappingList.add(grdt73);

        t73.Delay = 5;
        pn1.Transitions.add(t73);

//----------------------------t74------------------------------------
        PetriTransition t74 = new PetriTransition(pn1);
        t74.TransitionName = "t74";
        t74.InputPlaceName.add("ry7");

        Condition t74Ct1 = new Condition(t74, "ry7", TransitionCondition.NotNull);

        GuardMapping grdt74 = new GuardMapping();
        grdt74.condition = t74Ct1;
        grdt74.Activations.add(new Activation(t74, "ry7", TransitionOperation.Move, "gr7"));
        grdt74.Activations.add(new Activation(t74, "green", TransitionOperation.SendOverNetwork, "P_TL7"));
        grdt74.Activations.add(new Activation(t74, "red", TransitionOperation.SendOverNetwork, "P_PTL7"));

        t74.GuardMappingList.add(grdt74);

        t74.Delay = 2;
        pn1.Transitions.add(t74);

//----------------------------t75------------------------------------
        PetriTransition t75 = new PetriTransition(pn1);
        t75.TransitionName = "t75";
        t75.InputPlaceName.add("gr7");

        Condition t75Ct1 = new Condition(t75, "gr7", TransitionCondition.NotNull);

        GuardMapping grdt75 = new GuardMapping();
        grdt75.condition = t75Ct1;
        grdt75.Activations.add(new Activation(t75, "gr7", TransitionOperation.Move, "wait7"));

        t75.GuardMappingList.add(grdt75);

        t75.Delay = 5;
        pn1.Transitions.add(t75);

//----------------------------t81------------------------------------
        PetriTransition t81 = new PetriTransition(pn1);
        t81.TransitionName = "t81";
        t81.InputPlaceName.add("UserReq8");
        t81.InputPlaceName.add("wait8");

        Condition t81Ct1 = new Condition(t81, "UserReq8", TransitionCondition.NotNull);
        Condition t81Ct2 = new Condition(t81, "wait8", TransitionCondition.NotNull);
        t81Ct1.SetNextCondition(LogicConnector.AND, t81Ct2);

        GuardMapping grdt81 = new GuardMapping();
        grdt81.condition = t81Ct1;
        grdt81.Activations.add(new Activation(t81, "wait8", TransitionOperation.Move, "yr8"));
        grdt81.Activations.add(new Activation(t81, "yellow", TransitionOperation.SendOverNetwork, "P_TL8"));
        t81.GuardMappingList.add(grdt81);

        t81.Delay = 0;
        pn1.Transitions.add(t81);

//----------------------------t82------------------------------------
        PetriTransition t82 = new PetriTransition(pn1);
        t82.TransitionName = "t82";
        t82.InputPlaceName.add("yr8");

        Condition t82Ct1 = new Condition(t82, "yr8", TransitionCondition.NotNull);

        GuardMapping grdt82 = new GuardMapping();
        grdt82.condition = t82Ct1;
        grdt82.Activations.add(new Activation(t82, "yr8", TransitionOperation.Move, "rg8"));
        grdt82.Activations.add(new Activation(t82, "red", TransitionOperation.SendOverNetwork, "P_TL8"));
        grdt82.Activations.add(new Activation(t82, "green", TransitionOperation.SendOverNetwork, "P_PTL8"));

        t82.GuardMappingList.add(grdt82);

        t82.Delay = 5;
        pn1.Transitions.add(t82);

//----------------------------t83------------------------------------
        PetriTransition t83 = new PetriTransition(pn1);
        t83.TransitionName = "t83";
        t83.InputPlaceName.add("rg8");

        Condition t83Ct1 = new Condition(t83, "rg8", TransitionCondition.NotNull);

        GuardMapping grdt83 = new GuardMapping();
        grdt83.condition = t83Ct1;
        grdt83.Activations.add(new Activation(t83, "rg8", TransitionOperation.Move, "ry8"));
        grdt83.Activations.add(new Activation(t83, "yellow", TransitionOperation.SendOverNetwork, "P_PTL8"));

        t83.GuardMappingList.add(grdt83);

        t83.Delay = 5;
        pn1.Transitions.add(t83);

//----------------------------t84------------------------------------
        PetriTransition t84 = new PetriTransition(pn1);
        t84.TransitionName = "t84";
        t84.InputPlaceName.add("ry8");

        Condition t84Ct1 = new Condition(t84, "ry8", TransitionCondition.NotNull);

        GuardMapping grdt84 = new GuardMapping();
        grdt84.condition = t84Ct1;
        grdt84.Activations.add(new Activation(t84, "ry8", TransitionOperation.Move, "gr8"));
        grdt84.Activations.add(new Activation(t84, "green", TransitionOperation.SendOverNetwork, "P_TL8"));
        grdt84.Activations.add(new Activation(t84, "red", TransitionOperation.SendOverNetwork, "P_PTL8"));

        t84.GuardMappingList.add(grdt84);

        t84.Delay = 2;
        pn1.Transitions.add(t84);

//----------------------------t85------------------------------------
        PetriTransition t85 = new PetriTransition(pn1);
        t85.TransitionName = "t85";
        t85.InputPlaceName.add("gr8");

        Condition t85Ct1 = new Condition(t85, "gr8", TransitionCondition.NotNull);

        GuardMapping grdt85 = new GuardMapping();
        grdt85.condition = t85Ct1;
        grdt85.Activations.add(new Activation(t85, "gr8", TransitionOperation.Move, "wait8"));

        t85.GuardMappingList.add(grdt85);

        t85.Delay = 5;
        pn1.Transitions.add(t85);


        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Controller for pedestrians started \n ------------------------------");
        pn1.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn1;
        frame.setVisible(true);



    }

}
