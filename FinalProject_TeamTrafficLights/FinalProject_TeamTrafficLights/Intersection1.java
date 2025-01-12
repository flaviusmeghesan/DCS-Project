package FinalProject_TeamTrafficLights;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection1 {

    public static void main(String[] args) {

        // ------------ Same as in Lanes_Intersection - Project 4 ------------

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Intersection1";
        pn.NetworkPort = 1080;

        DataString green = new DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString full = new DataString();
        full.Printable = false;
        full.SetName("full");
        full.SetValue("full");
        pn.ConstantPlaceList.add(full);

        // ------------------------ Intersection 1 - Pin 1-------------------- //

        // -------------------------------------------------------------------
        // -----------------Intersection 1 Lane 1 - Entry - Bus Line----------
        // -------------------------------------------------------------------

        DataCar p0 = new DataCar();
        p0.SetName("P_a1");
        pn.PlaceList.add(p0);

        DataCar p1 = new DataCar();
        p1.SetName("P_a1b");
        pn.PlaceList.add(p1);

        DataCarQueue p2 = new DataCarQueue();
        p2.Value.Size = 4;
        p2.SetName("P_x1b");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("P_TL1");
        pn.PlaceList.add(p3);

        DataCar p4 = new DataCar();
        p4.SetName("P_b1b");
        pn.PlaceList.add(p4);

        DataCarQueue p50 = new DataCarQueue();
        p50.SetName("P118");
        pn.PlaceList.add(p50);

        DataCar p52 = new DataCar();
        p52.SetName("P116");
        pn.PlaceList.add(p52);

        DataString p51 = new DataString();
        p51.SetName("P_TL1p");
        pn.PlaceList.add(p51);

        // ------------ Same as in Lane - Project 5 - Pedestrian -------------

        DataString UserReq1 = new DataString();
        UserReq1.SetName("UserReq1");
        pn.PlaceList.add(UserReq1);

        DataString P_PTL1 = new DataString();
        P_PTL1.SetName("P_PTL1");
        pn.PlaceList.add(P_PTL1);

        DataTransfer OPReq1 = new DataTransfer();
        OPReq1.SetName("OPReq1");
        OPReq1.Value = new TransferOperation("localhost", "1086" , "UserReq1");
        pn.PlaceList.add(OPReq1);

        DataTransfer op1 = new DataTransfer();
        op1.SetName("OP1");
        op1.Value = new TransferOperation("localhost", "1081" , "in1");
        pn.PlaceList.add(op1);

        // -------------------------------------------------------------------
        // -----------Intersection 1 Lane 2 - Entry - Bus + Car---------------
        // -------------------------------------------------------------------

        DataCar p6 = new DataCar();
        p6.SetName("P_a2");
        pn.PlaceList.add(p6);

        DataCarQueue p7 = new DataCarQueue();
        p7.Value.Size = 4;
        p7.SetName("P_x2");
        pn.PlaceList.add(p7);

        DataString p8 = new DataString();
        p8.SetName("P_TL2i");
        pn.PlaceList.add(p8);

        DataCar p9 = new DataCar();
        p8.SetName("P_b2");
        pn.PlaceList.add(p9);

        DataTransfer op2 = new DataTransfer();
        op2.SetName("OP2");
        op2.Value = new TransferOperation("localhost", "1081" , "in2");
        pn.PlaceList.add(op2);

        // -------------------------------------------------------------------
        // ------------Intersection 1 Lane 3 - Entry - Cars-------------------
        // -------------------------------------------------------------------

        DataCar p53 = new DataCar();
        p53.SetName("P_a3t");
        pn.PlaceList.add(p53);

        DataCarQueue p55 = new DataCarQueue();
        p55.Value.Size = 4;
        p55.SetName("P_x3t");
        pn.PlaceList.add(p55);

        DataCarQueue p54 = new DataCarQueue();
        p54.Value.Size = 4;
        p54.SetName("P_station_taxi");
        pn.PlaceList.add(p54);

        DataString UserReq3 = new DataString();
        UserReq3.SetName("UserReq3");
        pn.PlaceList.add(UserReq3);

        DataCarQueue p56 = new DataCarQueue();
        p56.Value.Size = 4;
        p56.SetName("P_x3t2");
        pn.PlaceList.add(p56);

        DataCar p10 = new DataCar();
        p10.SetName("P_park");
        pn.PlaceList.add(p10);

        DataCar p57 = new DataCar();
        p57.SetName("P_ex3");
        pn.PlaceList.add(p57);

        DataCarQueue p58 = new DataCarQueue();
        p58.Value.Size = 4;
        p58.SetName("P119");
        pn.PlaceList.add(p58);

        DataCar p11 = new DataCar();
        p11.SetName("P_a3");
        pn.PlaceList.add(p11);

        DataCarQueue p12 = new DataCarQueue();
        p12.Value.Size = 3;
        p12.SetName("P_x3");
        pn.PlaceList.add(p12);

        DataString p13 = new DataString();
        p13.SetName("P_TL3i");
        pn.PlaceList.add(p13);

        DataCar p14 = new DataCar(); //p12.Printable = false;
        p14.SetName("P_b3");
        pn.PlaceList.add(p14);

        DataTransfer op3 = new DataTransfer();
        op3.SetName("OP3");
        op3.Value = new TransferOperation("localhost", "1081" , "in3");
        pn.PlaceList.add(op3);

        // -------------------------------------------------------------------
        // ------------- Intersection 1 Lane 4 - Entry - Bus -----------------
        // -------------------------------------------------------------------

        // from another intersection that we did not need to implement X
        DataCar p15 = new DataCar();
        p15.SetName("P_u4");
        pn.PlaceList.add(p15);

        DataCarQueue p16 = new DataCarQueue();
        p16.Value.Size = 4;
        p16.SetName("P40");
        pn.PlaceList.add(p16);

        DataCarQueue p17 = new DataCarQueue();
        p17.Value.Size = 4;
        p17.SetName("P_station4b");
        pn.PlaceList.add(p17);

        // ------ for bus station--------------

        DataString UserReq4b = new DataString();
        UserReq4b.SetName("UserReq4b");
        pn.PlaceList.add(UserReq4b);

        DataCarQueue p18 = new DataCarQueue();
        p18.Value.Size = 4;
        p18.SetName("P41");
        pn.PlaceList.add(p18);

        DataCar p19 = new DataCar();
        p19.SetName("P_a4b");
        pn.PlaceList.add(p19);

        DataCarQueue p20 = new DataCarQueue();
        p20.Value.Size = 4;
        p20.SetName("P_x4b");
        pn.PlaceList.add(p20);

        DataString p21 = new DataString();
        p21.SetName("P_TL4i");
        pn.PlaceList.add(p21);

        DataCar p22 = new DataCar(); //p12.Printable = false;
        p22.SetName("P_b4b");
        pn.PlaceList.add(p22);

        DataTransfer op4 = new DataTransfer();
        op4.SetName("OP4");
        op4.Value = new TransferOperation("localhost", "1081" , "in4");
        pn.PlaceList.add(op4);

        // ----------------------------------------------------------------------------
        // --------------------Intersection 1 Exit lane 1------------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p23 = new DataCarQueue();
        p23.Value.Size = 4;
        p23.SetName("P_o1");
        pn.PlaceList.add(p23);

        DataCar p24 = new DataCar();
        p24.SetName("P_o1e");
        pn.PlaceList.add(p24);

        DataCarQueue p25 = new DataCarQueue();
        p25.Value.Size = 4;
        p25.SetName("P10");
        pn.PlaceList.add(p25);

        DataCarQueue p26 = new DataCarQueue();
        p26.Value.Size = 4;
        p26.SetName("P_station1");
        pn.PlaceList.add(p26);

        DataCarQueue p27 = new DataCarQueue();
        p27.Value.Size = 4;
        p27.SetName("P11");
        pn.PlaceList.add(p27);

        DataCarQueue p28 = new DataCarQueue();
        p28.Value.Size = 4;
        p28.SetName("P12");
        pn.PlaceList.add(p28);

        DataCar p29 = new DataCar();
        p29.SetName("P_en1");
        pn.PlaceList.add(p29);

        DataCar p37 = new DataCar();
        p37.SetName("P_ex1");
        pn.PlaceList.add(p37);

        DataString UserReq1s = new DataString();
        UserReq1s.SetName("UserReq1s");
        pn.PlaceList.add(UserReq1s);

        // ----------------------------------------------------------------------------
        // --------------------Intersection 1 Exit lane 2 - Bus------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p30 = new DataCarQueue();
        p30.Value.Size = 4;
        p30.SetName("P_o2");
        pn.PlaceList.add(p30);

        DataCar p31 = new DataCar();
        p31.SetName("P_o2e");
        pn.PlaceList.add(p31);

        DataCarQueue p32 = new DataCarQueue();
        p32.Value.Size = 4;
        p32.SetName("P20");
        pn.PlaceList.add(p32);

        DataCarQueue p33 = new DataCarQueue();
        p33.Value.Size = 4;
        p33.SetName("P_station2b");
        pn.PlaceList.add(p33);

        DataCarQueue p34 = new DataCarQueue();
        p34.Value.Size = 4;
        p34.SetName("P21");
        pn.PlaceList.add(p34);

        // ---- added for sending to the other intersection -----
        DataTransfer p34s = new DataTransfer();
        p34s.SetName("P22");
        p34s.Value = new TransferOperation("localhost", "1084", "P_a8b");
        pn.PlaceList.add(p34s);
        // ToDo: need to make transition t22 for it and add in the Petri Net - Done

        DataString UserReq2b = new DataString();
        UserReq2b.SetName("UserReq2b");
        pn.PlaceList.add(UserReq2b);

        // ----------------------------------------------------------------------------
        // --------------------Intersection 1 Exit lane 4 - Cars-----------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p35 = new DataCarQueue();
        p35.Value.Size = 4;
        p21.SetName("P_o4");
        pn.PlaceList.add(p35);

        DataCar p36 = new DataCar();
        p36.SetName("P_en4");
        pn.PlaceList.add(p36);

        DataCar p38 = new DataCar();
        p38.SetName("P_ex4");
        pn.PlaceList.add(p38);

        DataCarQueue p39 = new DataCarQueue();
        p39.Value.Size = 4;
        p39.SetName("P_o4e");
        pn.PlaceList.add(p39);

        DataCarQueue p59 = new DataCarQueue();
        p59.Value.Size = 4;
        p59.SetName("P121");
        pn.PlaceList.add(p59);

        DataCar p60 = new DataCar();
        p60.SetName("P_b4");
        pn.PlaceList.add(p60);

        DataString p61 = new DataString();
        p61.SetName("P_TL4");
        pn.PlaceList.add(p61);

        DataString P_PTL4 = new DataString();
        P_PTL4.SetName("P_PTL4");
        pn.PlaceList.add(P_PTL4);

        DataString UserReq4 = new DataString();
        UserReq4.SetName("UserReq4");
        pn.PlaceList.add(UserReq4);

//        DataTransfer OPReq4 = new DataTransfer();
//        OPReq4.SetName("OPReq4");
//        OPReq4.Value = new TransferOperation("localhost", "1086" , "UserReq4");
//        pn.PlaceList.add(OPReq4);


        // ----------------------------------------------------------------------------
        // --------------------Intersection 1 Exit lane 4 - Bus------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p40 = new DataCarQueue();
        p40.Value.Size = 4;
        p40.SetName("P_o4b");
        pn.PlaceList.add(p40);

        DataCar p41 = new DataCar();
        p41.SetName("P_o4be");
        pn.PlaceList.add(p41);

        DataCarQueue p42 = new DataCarQueue();
        p42.Value.Size = 4;
        p42.SetName("P42");
        pn.PlaceList.add(p42);

        DataCarQueue p43 = new DataCarQueue();
        p43.Value.Size = 4;
        p43.SetName("P_station4t");
        pn.PlaceList.add(p43);

        DataCarQueue p44 = new DataCarQueue();
        p44.Value.Size = 4;
        p44.SetName("P43");
        pn.PlaceList.add(p44);

        DataCar p45 = new DataCar();
        p45.SetName("P44");
        pn.PlaceList.add(p45);

        DataString UserReq4t = new DataString();
        UserReq2b.SetName("UserReq4t");
        pn.PlaceList.add(UserReq4t);

        // -------------------------------------------------------------------------------------------
        // --------------------------------Intersection 1---------------------------------------------
        // -------------------------------------------------------------------------------------------

        DataCarQueue p74 = new DataCarQueue();
        p74.Value.Size = 4;
        p74.SetName("P_Is1");
        pn.PlaceList.add(p74);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 1 ENTRY - Bus line
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________


        // t85 -----------------------------

        PetriTransition t85 = new PetriTransition(pn);
        t85.TransitionName = "t85";
        t85.InputPlaceName.add("P_x1b");
        t85.InputPlaceName.add("P_TL1");

        Condition t_85Ct1 = new Condition(t85, "P_TL1", TransitionCondition.Equal, "green");
        Condition t_85Ct2 = new Condition(t85, "P_x1b", TransitionCondition.HaveCar);

        t_85Ct1.SetNextCondition(LogicConnector.AND, t_85Ct2);


        GuardMapping grdt_85 = new GuardMapping();
        grdt_85.condition = t_85Ct1;
        grdt_85.Activations.add(new Activation(t85, "P_x1b", TransitionOperation.AddElement, "P_b1b")); //Street "sends the car"
        //  grdt_e4.Activations.add(new Activation(t_e4, "P_TL4i", TransitionOperation.Move, "P_TL4i"));

        t85.GuardMappingList.add(grdt_85);

        t85.Delay = 0;
        pn.Transitions.add(t85);

        // t_u1 -----------------------------
        PetriTransition t_u1 = new PetriTransition(pn);
        t_u1.TransitionName = "T_u1";
        t_u1.InputPlaceName.add("P_a1"); //DataCar
        t_u1.InputPlaceName.add("P118");

        Condition T_u1Ct1 = new Condition(t_u1, "P_a1", TransitionCondition.NotNull);
        Condition T_u1Ct2 = new Condition(t_u1, "P118", TransitionCondition.CanAddCars);
        T_u1Ct1.SetNextCondition(LogicConnector.AND, T_u1Ct2);

        GuardMapping grdT_u1 = new GuardMapping();
        grdT_u1.condition = T_u1Ct1;

        grdT_u1.Activations.add(new Activation(t_u1, "P_a1", TransitionOperation.AddElement, "P118")); //DataCar->DataCarQueue
        t_u1.GuardMappingList.add(grdT_u1);

        t_u1.Delay = 0;
        pn.Transitions.add(t_u1);

        // t84-----------------------------
        PetriTransition t84 = new PetriTransition(pn);
        t84.TransitionName = "T84";
        t84.InputPlaceName.add("P116"); //DataCar

        Condition T_84Ct1 = new Condition(t84, "P116", TransitionCondition.NotNull);
        Condition T_84Ct2 = new Condition(t84, "P_a1b", TransitionCondition.CanAddCars);
        T_84Ct1.SetNextCondition(LogicConnector.AND, T_84Ct2);

        GuardMapping grdT_84 = new GuardMapping();
        grdT_84.condition = T_84Ct1;

        grdT_84.Activations.add(new Activation(t84, "P116", TransitionOperation.AddElement, "P_a1b"));
        t84.GuardMappingList.add(grdT_84);

        t84.Delay = 0;
        pn.Transitions.add(t84);

        // t_x1b --------------------------------------------------------------------------------------------------------------------------------
        PetriTransition t_x1b = new PetriTransition(pn);
        t_x1b.TransitionName = "T_x1b";
        t_x1b.InputPlaceName.add("P_a1b"); //DataCar
        t_x1b.InputPlaceName.add("P_x1b"); //DataCarQueue

        Condition T_x1bCt1 = new Condition(t_x1b, "P_a1b", TransitionCondition.NotNull);
        Condition T_x1bCt2 = new Condition(t_x1b, "P_x1b", TransitionCondition.CanAddCars);
        T_x1bCt1.SetNextCondition(LogicConnector.AND, T_x1bCt2);
        Condition T_x1bCt3 = new Condition(t_x1b, "P_a1b", TransitionCondition.IsBus);
        T_x1bCt1.SetNextCondition(LogicConnector.OR, T_x1bCt3);
        Condition T_x1bCt4 = new Condition(t_x1b, "P_a1b", TransitionCondition.IsPriorityCar);
        T_x1bCt1.SetNextCondition(LogicConnector.OR, T_x1bCt4);

        GuardMapping grdT_x1b = new GuardMapping();
        grdT_x1b.condition = T_x1bCt1;
        grdT_x1b.Activations.add(new Activation(t_x1b, "P_a1b", TransitionOperation.AddElement, "P_x1b")); //DataCar->DataCarQueue
        t_x1b.GuardMappingList.add(grdT_x1b);

        t_x1b.Delay = 0;
        pn.Transitions.add(t_x1b);

        // T_out1 ------------------------------------------------
        PetriTransition t_out1 = new PetriTransition(pn);
        t_out1.TransitionName = "T_out1";
        t_out1.IsAsync = true;
        t_out1.InputPlaceName.add("P_x1b");
        t_out1.InputPlaceName.add("P_a1b");

        Condition T_out1Ct1 = new Condition(t_out1, "P_a1b", TransitionCondition.NotNull);
        Condition T_out1Ct2 = new Condition(t_out1, "P_x1b", TransitionCondition.CanNotAddCars);
        T_out1Ct1.SetNextCondition(LogicConnector.AND, T_out1Ct2);

        GuardMapping grdT_out1 = new GuardMapping();
        grdT_out1.condition = T_out1Ct1;
        grdT_out1.Activations.add(new Activation(t_out1, "full", TransitionOperation.SendOverNetwork, "OP1"));
        t_out1.GuardMappingList.add(grdT_out1);

        t_out1.Delay = 0;
        pn.Transitions.add(t_out1);

        // T_TL1p  ----------------------------------------------------------------------------------------------------------------------------------------------------------
        PetriTransition t_TL1p = new PetriTransition(pn);
        t_TL1p.TransitionName = "t_TL1p";
        t_TL1p.InputPlaceName.add("P118");
        t_TL1p.InputPlaceName.add("P_TL1p");
        t_TL1p.InputPlaceName.add("P_PTL1");
        t_TL1p.InputPlaceName.add("UserReq1");

        Condition t_TL1pCt1 = new Condition(t_TL1p, "P_TL1p", TransitionCondition.Equal, "green");
        Condition t_TL1pCt2 = new Condition(t_TL1p, "P118", TransitionCondition.HaveCar);
        Condition t_TL1pCt3 = new Condition(t_TL1p, "P_PTL1", TransitionCondition.Equal,"P_PTL1");
        Condition t_TL1pCt4 = new Condition(t_TL1p, "UserReq1", TransitionCondition.NotNull);
        //Condition t_TL1pCt5 = new Condition(t_TL1p, "P_x1b", TransitionCondition.HavePriorityCar);

        t_TL1pCt1.SetNextCondition(LogicConnector.AND, t_TL1pCt2);
        t_TL1pCt1.SetNextCondition(LogicConnector.AND, t_TL1pCt3);
        t_TL1pCt1.SetNextCondition(LogicConnector.AND, t_TL1pCt4);
       // t_TL1pCt1.SetNextCondition(LogicConnector.OR, t_TL1pCt5);

        GuardMapping grdt_TL1p = new GuardMapping();
        grdt_TL1p.condition = t_TL1pCt1;
        grdt_TL1p.Activations.add(new Activation(t_TL1p, "P118", TransitionOperation.AddElement, "P116")); //Street "sends the car"
        grdt_TL1p.Activations.add(new Activation(t_TL1p, "P_TL1p", TransitionOperation.Move, "P_TL1p"));
        grdt_TL1p.Activations.add(new Activation(t_TL1p, "P_PTL1", TransitionOperation.Move, "P_PTL1"));
        grdt_TL1p.Activations.add(new Activation(t_TL1p, "UserReq1", TransitionOperation.SendOverNetwork, "OPReq1"));

        t_TL1p.GuardMappingList.add(grdt_TL1p);

        t_TL1p.Delay = 0;
        pn.Transitions.add(t_TL1p);

        // T_i1b ----------------------------------------------------------------------------------------------------------------------------------------------------------------
        PetriTransition t_i1b = new PetriTransition(pn);
        t_i1b.TransitionName = "T_i1";
        t_i1b.InputPlaceName.add("P_b1b");
        t_i1b.InputPlaceName.add("P_Is1");

        Condition T_i1bCt1 = new Condition(t_i1b, "P_b1b", TransitionCondition.NotNull);
        Condition T_i1bCt2 = new Condition(t_i1b, "P_Is1", TransitionCondition.CanAddCars);
        T_i1bCt1.SetNextCondition(LogicConnector.AND, T_i1bCt2);

        GuardMapping grdT_i1bCt1 = new GuardMapping();
        grdT_i1bCt1.condition = T_i1bCt1;
        grdT_i1bCt1.Activations.add(new Activation(t_i1b, "P_b1b", TransitionOperation.AddElement, "P_Is1")); //DataCar -> Queue
        t_i1b.GuardMappingList.add(grdT_i1bCt1);

        t_i1b.Delay = 0;
        pn.Transitions.add(t_i1b);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 1 EXIT - Bus + Cars
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_o1---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o1 = new PetriTransition(pn);
        t_o1.TransitionName = "T_o1";
        t_o1.InputPlaceName.add("P_Is1");
        t_o1.InputPlaceName.add("P_o1");

        Condition T_o1Ct1 = new Condition(t_o1, "P_Is1", TransitionCondition.HaveCarForMe);
        Condition T_o1Ct2 = new Condition(t_o1, "P_o1", TransitionCondition.CanAddCars);

        T_o1Ct1.SetNextCondition(LogicConnector.AND, T_o1Ct2);

        GuardMapping grdT_o1 = new GuardMapping();
        grdT_o1.condition = T_o1Ct1;
        grdT_o1.Activations.add(new Activation(t_o1, "P_Is1", TransitionOperation.PopElementWithTargetToQueue, "P_o1"));
        t_o1.GuardMappingList.add(grdT_o1);

        t_o1.Delay = 0;
        pn.Transitions.add(t_o1);

        // T_o1e--------------------------------------------------------------------------------------------

        PetriTransition t_o1e = new PetriTransition(pn);
        t_o1e.TransitionName = "T_o1e";
        t_o1e.InputPlaceName.add("P_o1");

        Condition T_o1eCt1 = new Condition(t_o1e, "P_o1", TransitionCondition.HaveCar);

        GuardMapping grdT_o1e = new GuardMapping();
        grdT_o1e.condition = T_o1eCt1;
        grdT_o1e.Activations.add(new Activation(t_o1e, "P_o1", TransitionOperation.AddElement, "P_o1e"));
        t_o1e.GuardMappingList.add(grdT_o1e);

        t_o1e.Delay = 0;
        pn.Transitions.add(t_o1e);

        // T10--------------------------------------------------------------------------------------------

        PetriTransition t10 = new PetriTransition(pn);
        t10.TransitionName = "T10";
        t10.InputPlaceName.add("P_o1e");

        Condition T10Ct1 = new Condition(t_o1e, "P_o1e", TransitionCondition.NotNull);
        Condition T10Ct2 = new Condition(t_o1e, "P_o1e", TransitionCondition.IsBus);
        Condition T10Ct3 = new Condition(t_o1e, "P_o1e", TransitionCondition.IsPriorityCar);
        T10Ct1.SetNextCondition(LogicConnector.AND, T10Ct2);
        T10Ct1.SetNextCondition(LogicConnector.OR, T10Ct3);

        GuardMapping grdT_T10 = new GuardMapping();
        grdT_T10.condition = T10Ct1;
        grdT_T10.Activations.add(new Activation(t10, "P_o1e", TransitionOperation.AddElement, "P10"));

        t10.GuardMappingList.add(grdT_T10);

        t10.Delay = 0;
        pn.Transitions.add(t10);

        // T11 ---------------------------------------------------------------------------------------- Car route
        PetriTransition t11 = new PetriTransition(pn);
        t11.TransitionName = "T11";
        t11.InputPlaceName.add("P10");

        Condition T11Ct1 = new Condition(t11, "P10", TransitionCondition.NotNull);

        GuardMapping grdT11 = new GuardMapping();
        grdT11.condition = T11Ct1;
        grdT11.Activations.add(new Activation(t11, "P10", TransitionOperation.PopElementWithoutTargetToQueue, "P11"));
        t11.GuardMappingList.add(grdT11);

        t11.Delay = 1; // 1 sec delay
        pn.Transitions.add(t11);

        // T_1s ----------------------------------------------------------------------------------- Bus route
        PetriTransition t_1s = new PetriTransition(pn);
        t_1s.TransitionName = "T_1s";
        t_1s.InputPlaceName.add("P10");

        Condition T_1sCt1 = new Condition(t_1s, "P10", TransitionCondition.HaveBus);

        GuardMapping grdT_1s = new GuardMapping();
        grdT_1s.condition = T_1sCt1;
        grdT_1s.Activations.add(new Activation(t_1s, "P10", TransitionOperation.PopElementWithoutTargetToQueue, "P_station1"));
        t_1s.GuardMappingList.add(grdT_1s);

        t_1s.Delay = 0;
        pn.Transitions.add(t_1s);

        // T_1es----------------------------------------------------------------

        PetriTransition t_1es = new PetriTransition(pn);
        t_1es.TransitionName = "T_2esb";
        t_1es.InputPlaceName.add("P_station1");
        t_1es.InputPlaceName.add("UserReq1s");

        Condition T_1esCt1 = new Condition(t_1es, "P_station1", TransitionCondition.HaveCar);
      //  Condition T_1esCt2 = new Condition(t_1es, "UserReq1s", TransitionCondition.NotNull);
        //T_1esCt1.SetNextCondition(LogicConnector.AND, T_1esCt2);

        GuardMapping grdT_1es = new GuardMapping();
        grdT_1es.condition = T_1esCt1;
        grdT_1es.Activations.add(new Activation(t_1es, "P_station1", TransitionOperation.PopElementWithoutTargetToQueue, "P11"));
        t_1es.GuardMappingList.add(grdT_1es);

        t_1es.Delay = 3;
        pn.Transitions.add(t_1es);

        // T12 ----------------------------------------------------------------

        PetriTransition t12 = new PetriTransition(pn);
        t12.TransitionName = "T12";
        t12.InputPlaceName.add("P11");

        Condition T12Ct1 = new Condition(t12, "P11", TransitionCondition.HaveCarForMe);

        GuardMapping grdT12 = new GuardMapping();
        grdT12.condition = T12Ct1;
        grdT12.Activations.add(new Activation(t12, "P11", TransitionOperation.PopElementWithTargetToQueue, "P12"));
        t12.GuardMappingList.add(grdT12);

        t12.Delay = 0;
        pn.Transitions.add(t12);

        // T_en1

        PetriTransition t_en1 = new PetriTransition(pn);
        t_en1.TransitionName = "T_en1";
        t_en1.InputPlaceName.add("P_en1");

        Condition T_en1Ct1 = new Condition(t_en1, "P_en1", TransitionCondition.NotNull);
        Condition T_en1Ct2 = new Condition(t_en1, "P12", TransitionCondition.CanAddCars);
        T_en1Ct1.SetNextCondition(LogicConnector.AND, T_en1Ct2);

        GuardMapping grdT_en1 = new GuardMapping();
        grdT_en1.condition = T_en1Ct1;
        grdT_en1.Activations.add(new Activation(t_en1, "P_en1", TransitionOperation.AddElement, "P12"));
        t_en1.GuardMappingList.add(grdT_en1);

        t_en1.Delay = 0;
        pn.Transitions.add(t_en1);

        // T_ex1

        PetriTransition t_ex1 = new PetriTransition(pn);
        t_ex1.TransitionName = "T_ex1";
        t_ex1.InputPlaceName.add("P12");

        Condition T_ex1Ct1 = new Condition(t_ex1, "P12", TransitionCondition.HaveCar);

        GuardMapping grdT_ex1 = new GuardMapping();
        grdT_ex1.condition = T_ex1Ct1;
        grdT_ex1.Activations.add(new Activation(t_ex1, "P12", TransitionOperation.PopElementWithoutTarget, "P_ex1"));
        t_ex1.GuardMappingList.add(grdT_ex1);

        t_ex1.Delay = 0;
        pn.Transitions.add(t_ex1);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 2 ENTRY - Bus + Cars
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_x2 ------------------------------------------------

        PetriTransition t_x2 = new PetriTransition(pn);
        t_x2.TransitionName = "T_x2";
        t_x2.InputPlaceName.add("P_a2");
        t_x2.InputPlaceName.add("P_x2");

        Condition T_x2Ct1 = new Condition(t_x2, "P_a2", TransitionCondition.NotNull);
        Condition T_x2Ct2 = new Condition(t_x2, "P_x2", TransitionCondition.CanAddCars);
        T_x2Ct1.SetNextCondition(LogicConnector.AND, T_x2Ct2);

        GuardMapping grdT_x2Ct1 = new GuardMapping();
        grdT_x2Ct1.condition = T_x2Ct1;
        grdT_x2Ct1.Activations.add(new Activation(t_x2, "P_a2", TransitionOperation.AddElement, "P_x2"));
        t_x2.GuardMappingList.add(grdT_x2Ct1);

        t_x2.Delay = 0;
        pn.Transitions.add(t_x2);

        // T_out2 ------------------------------------------------

        PetriTransition t_out2 = new PetriTransition(pn);
        t_out2.TransitionName = "T_out2";
        t_out2.IsAsync = true;
        t_out2.InputPlaceName.add("P_x2");
        t_out2.InputPlaceName.add("P_a2");

        Condition T_out2Ct1 = new Condition(t_out2, "P_a2", TransitionCondition.NotNull);
        Condition T_out2Ct2 = new Condition(t_out2, "P_x2", TransitionCondition.CanNotAddCars);
        T_out2Ct1.SetNextCondition(LogicConnector.AND, T_out2Ct2);

        GuardMapping grdT_out2 = new GuardMapping();
        grdT_out2.condition = T_out2Ct1;
        grdT_out2.Activations.add(new Activation(t_out2, "full", TransitionOperation.SendOverNetwork, "OP2"));
        t_out2.GuardMappingList.add(grdT_out2);

        t_out2.Delay = 0;
        pn.Transitions.add(t_out2);

        // T_e2 ------------------------------------------------

        PetriTransition t_e2 = new PetriTransition(pn);
        t_e2.TransitionName = "t_e2";
        t_e2.InputPlaceName.add("P_x2");
        t_e2.InputPlaceName.add("P_TL2i");

        Condition t_e2Ct1 = new Condition(t_e2, "P_TL2i", TransitionCondition.Equal, "green");
        Condition t_e2Ct2 = new Condition(t_e2, "P_x2", TransitionCondition.HaveCar);

        t_e2Ct1.SetNextCondition(LogicConnector.AND, t_e2Ct2);

        GuardMapping grdt_e2 = new GuardMapping();
        grdt_e2.condition = t_e2Ct1;
        grdt_e2.Activations.add(new Activation(t_e2, "P_x2", TransitionOperation.AddElement, "P_b2")); //Street "sends the car"
//     grdt_e2.Activations.add(new Activation(t_e2, "P_TL2i", TransitionOperation.Move, "P_TL2i"));

        t_e2.GuardMappingList.add(grdt_e2);

        t_e2.Delay = 0;
        pn.Transitions.add(t_e2);

        // T_i2 ------------------------------------------------
        PetriTransition t_i2 = new PetriTransition(pn);
        t_i2.TransitionName = "T_i2";
        t_i2.InputPlaceName.add("P_b2");
        t_i2.InputPlaceName.add("P_Is1");

        Condition T_i2Ct1 = new Condition(t_i2, "P_b2", TransitionCondition.NotNull);
        Condition T_i2Ct2 = new Condition(t_i2, "P_Is1", TransitionCondition.CanAddCars);
        T_i2Ct1.SetNextCondition(LogicConnector.AND, T_i2Ct2);

        GuardMapping grdT_i2 = new GuardMapping();
        grdT_i2.condition = T_i2Ct1;
        grdT_i2.Activations.add(new Activation(t_i2, "P_b2", TransitionOperation.AddElement, "P_Is1"));
        t_i2.GuardMappingList.add(grdT_i2);

        t_i2.Delay = 0;
        pn.Transitions.add(t_i2);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 2 EXIT - Bus line
        //_____________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_o2---------------------------------------------------------------------

        PetriTransition t_o2 = new PetriTransition(pn);
        t_o2.TransitionName = "T_o2";
        t_o2.InputPlaceName.add("P_Is1");
        t_o2.InputPlaceName.add("P_o2");

        Condition T_o2Ct1 = new Condition(t_o2, "P_Is1", TransitionCondition.HaveCarForMe);
        Condition T_o2Ct2 = new Condition(t_o2, "P_o2", TransitionCondition.CanAddCars);
        Condition T_o2Ct3 = new Condition(t_o2, "P_Is1", TransitionCondition.IsBus);
        Condition T_o2Ct4 = new Condition(t_o2, "P_Is1", TransitionCondition.IsPriorityCar);
        T_o2Ct1.SetNextCondition(LogicConnector.AND, T_o2Ct2);
        T_o2Ct1.SetNextCondition(LogicConnector.OR, T_o2Ct3);
        T_o2Ct1.SetNextCondition(LogicConnector.OR, T_o2Ct4);

        GuardMapping grdT_o2 = new GuardMapping();
        grdT_o2.condition = T_o2Ct1;
        grdT_o2.Activations.add(new Activation(t_o2, "P_Is1", TransitionOperation.PopElementWithTargetToQueue, "P_o2"));
        t_o2.GuardMappingList.add(grdT_o2);

        t_o2.Delay = 0;
        pn.Transitions.add(t_o2);

        // T_o2e--------------------------------------------------------------------------------------------

        PetriTransition t_o2e = new PetriTransition(pn);
        t_o2e.TransitionName = "T_o2";
        t_o2e.InputPlaceName.add("P_o2");

        Condition T_o2eCt1 = new Condition(t_o2e, "P_o2", TransitionCondition.HaveCar);
        Condition T_o2eCt2 = new Condition(t_o2e, "P_o2e", TransitionCondition.CanAddCars);
        T_o2eCt1.SetNextCondition(LogicConnector.AND, T_o2eCt2);

        GuardMapping grdT_o2e = new GuardMapping();
        grdT_o2e.condition = T_o2eCt1;
        grdT_o2e.Activations.add(new Activation(t_o2e, "P_o2", TransitionOperation.AddElement, "P_o2e"));
        t_o2e.GuardMappingList.add(grdT_o2e);

        t_o2e.Delay = 0;
        pn.Transitions.add(t_o2e);

        // T20-------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t20 = new PetriTransition(pn);
        t20.TransitionName = "T20";
        t20.InputPlaceName.add("P_o2e");

        Condition T20Ct1 = new Condition(t20, "P_02e", TransitionCondition.NotNull);
        Condition T20Ct2 = new Condition(t20, "P20", TransitionCondition.CanAddCars);
        T20Ct1.SetNextCondition(LogicConnector.AND, T20Ct2);

        GuardMapping grdT_T20 = new GuardMapping();
        grdT_T20.condition = T20Ct1;
        grdT_T20.Activations.add(new Activation(t20, "P_o2e", TransitionOperation.AddElement, "P20")); // DataCar->Queue
        t20.GuardMappingList.add(grdT_T20);

        t20.Delay = 0;
        pn.Transitions.add(t20);

        // T21 ---------------------------------------------------------------------------------------- Priority car route

        PetriTransition t21 = new PetriTransition(pn);
        t21.TransitionName = "T21";
        t21.InputPlaceName.add("P20");

        Condition T21Ct1 = new Condition(t21, "P20", TransitionCondition.HavePriorityCar);

        GuardMapping grdT21 = new GuardMapping();
        grdT21.condition = T21Ct1;
        grdT21.Activations.add(new Activation(t21, "P20", TransitionOperation.PopElementWithoutTargetToQueue, "P21"));
        t21.GuardMappingList.add(grdT21);

        t21.Delay = 0;
        pn.Transitions.add(t21);

        // T_2sb ----------------------------------------------------------------------------------- Bus route

        PetriTransition t_2sb = new PetriTransition(pn);
        t_2sb.TransitionName = "T_2sb";
        t_2sb.InputPlaceName.add("P20");

        Condition T_2sbCt1 = new Condition(t_2sb, "P20", TransitionCondition.HaveBus);

        GuardMapping grdT_2sb = new GuardMapping();
        grdT_2sb.condition = T_2sbCt1;
        grdT_2sb.Activations.add(new Activation(t_2sb, "P20", TransitionOperation.PopElementWithoutTargetToQueue, "P_station2b"));
        t_2sb.GuardMappingList.add(grdT_2sb);

        t_2sb.Delay = 0;
        pn.Transitions.add(t_2sb);

        // T_2esb----------------------------------------------------------------

        PetriTransition t_2esb = new PetriTransition(pn);
        t_2esb.TransitionName = "T_2esb";
        t_2esb.InputPlaceName.add("P_station2b");
        t_2esb.InputPlaceName.add("UserReq2b");

        Condition T_2esbCt1 = new Condition(t_2esb, "P_station2b", TransitionCondition.HaveCar);
//        Condition T_2esbCt2 = new Condition(t_2esb, "UserReq2b", TransitionCondition.NotNull);
//        T_2esbCt1.SetNextCondition(LogicConnector.AND, T_2esbCt2);

        GuardMapping grdT_2esb = new GuardMapping();
        grdT_2esb.condition = T_2esbCt1;
        grdT_2esb.Activations.add(new Activation(t_2esb, "P_station2b", TransitionOperation.PopElementWithoutTargetToQueue, "P21"));
        t_2esb.GuardMappingList.add(grdT_2esb);

        t_2esb.Delay = 3;
        pn.Transitions.add(t_2esb);

        // T22 ----------------------------------------------------------------

        PetriTransition t22 = new PetriTransition(pn);
        t22.TransitionName = "T22";
        t22.InputPlaceName.add("P21");

        Condition T22Ct1 = new Condition(t22, "P21", TransitionCondition.HaveCarForMe);

        GuardMapping grdT22 = new GuardMapping();
        grdT22.condition = T22Ct1;
        grdT22.Activations.add(new Activation(t22, "P21", TransitionOperation.SendOverNetwork, "P22"));
        t22.GuardMappingList.add(grdT22);

        t22.Delay = 0;
        pn.Transitions.add(t22);

        //
        //____________________________________________________________________
        // ------------------- INTERSECTION 1 LANE 3 -------------------------
        //____________________________________________________________________

        // t98----------------------------------------------------------------

        PetriTransition t98 = new PetriTransition(pn);
        t98.TransitionName = "t98";
        t98.InputPlaceName.add("P119");

        Condition t98Ct1 = new Condition(t98, "P119", TransitionCondition.HaveCar);

        GuardMapping grdt98 = new GuardMapping();
        grdt98.condition = t98Ct1;
        grdt98.Activations.add(new Activation(t98, "P119", TransitionOperation.AddElement, "P_a3"));
        t98.GuardMappingList.add(grdt98);

        t98.Delay = 0;
        pn.Transitions.add(t98);

        // t_ex3 -------------------------------------------------------------------------------------------------------------

        PetriTransition t_ex3 = new PetriTransition(pn);
        t_ex3.TransitionName = "t_ex3";
        t_ex3.InputPlaceName.add("P119");

        Condition t_ex3Ct1 = new Condition(t_ex3, "P119", TransitionCondition.HaveCar);

        GuardMapping grdt_ex3 = new GuardMapping();
        grdt_ex3.condition = t_ex3Ct1;
        grdt_ex3.Activations.add(new Activation(t_ex3, "P119", TransitionOperation.PopElementWithoutTarget, "P_ex3"));
        t_ex3.GuardMappingList.add(grdt_ex3);

        t_ex3.Delay = 0;
        pn.Transitions.add(t_ex3);

        // t94 ----------------------------------------------------------------

        PetriTransition t94 = new PetriTransition(pn);
        t94.TransitionName = "t94";
        t94.InputPlaceName.add("P_x3t2");

        Condition t94Ct1 = new Condition(t94, "P_x3t2", TransitionCondition.HaveCarForMe);

        GuardMapping grdt94 = new GuardMapping();
        grdt94.condition = t94Ct1;
        grdt94.Activations.add(new Activation(t94, "P_x3t2", TransitionOperation.PopElementWithTargetToQueue, "P119"));
        t94.GuardMappingList.add(grdt94);

        t94.Delay = 0;
        pn.Transitions.add(t94);

        // T_u3 -------------------------------------------------------

        PetriTransition t_u3 = new PetriTransition(pn);
        t_u3.TransitionName = "T20";
        t_u3.InputPlaceName.add("P_a3t");

        Condition t_u3Ct1 = new Condition(t_u3, "P_a3t", TransitionCondition.NotNull);
        Condition t_u3Ct2 = new Condition(t_u3, "P_x37", TransitionCondition.CanAddCars);
        t_u3Ct1.SetNextCondition(LogicConnector.AND, t_u3Ct2);

        GuardMapping grdT_t_u3 = new GuardMapping();
        grdT_t_u3.condition = t_u3Ct1;
        grdT_t_u3.Activations.add(new Activation(t_u3, "P_a3t", TransitionOperation.AddElement, "P_x3t"));
        t_u3.GuardMappingList.add(grdT_t_u3);

        t_u3.Delay = 0;
        pn.Transitions.add(t_u3);

        // t_t3 ---------------------------------------------------------------------------------------- Priority car route
        PetriTransition t_t3 = new PetriTransition(pn);
        t_t3.TransitionName = "t_t3";
        t_t3.InputPlaceName.add("P_x3t");

        Condition t_t3Ct1 = new Condition(t_t3, "P_x3t", TransitionCondition.HavePriorityCar);

        GuardMapping grdt_t3 = new GuardMapping();
        grdt_t3.condition = t_t3Ct1;
        grdt_t3.Activations.add(new Activation(t_t3, "P80", TransitionOperation.PopElementWithoutTargetToQueue, "P_x3t2"));
        t_t3.GuardMappingList.add(grdt_t3);

        t_t3.Delay = 0;
        pn.Transitions.add(t_t3);

        //t_es3
        PetriTransition t_es3 = new PetriTransition(pn);
        t_es3.TransitionName = "t_es3";
        t_es3.InputPlaceName.add("P_x3t");

        Condition t_es3Ct1 = new Condition(t_es3, "P_x3t", TransitionCondition.HaveBus);

        GuardMapping grdt_es3 = new GuardMapping();
        grdt_es3.condition = t_es3Ct1;
        grdt_es3.Activations.add(new Activation(t_es3, "P_x3t", TransitionOperation.PopElementWithoutTargetToQueue, "P_station_taxi"));
        t_es3.GuardMappingList.add(grdt_es3);

        t_es3.Delay = 0;
        pn.Transitions.add(t_es3);

        // t_est3
        PetriTransition t_est3 = new PetriTransition(pn);
        t_est3.TransitionName = "t_est3";
        t_est3.InputPlaceName.add("P_station_taxi");
        t_est3.InputPlaceName.add("UserReq3");

        Condition t_est3Ct1 = new Condition(t_est3, "P_station_taxi", TransitionCondition.HaveCar);
        Condition t_est3Ct2 = new Condition(t_est3, "UserReq3", TransitionCondition.NotNull);
        t_est3Ct1.SetNextCondition(LogicConnector.AND, t_est3Ct2);

        GuardMapping grdt_est3 = new GuardMapping();
        grdt_est3.condition = t_est3Ct1;
        grdt_est3.Activations.add(new Activation(t_est3, "P_station_taxi", TransitionOperation.PopElementWithoutTargetToQueue, "P_x3t2"));
        t_est3.GuardMappingList.add(grdt_est3);

        t_est3.Delay = 3;
        pn.Transitions.add(t_est3);

        // T_park -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_park = new PetriTransition(pn);
        t_park.TransitionName = "T_park";
        t_park.InputPlaceName.add("P119");

        Condition T_parkCt1 = new Condition(t_park, "P119", TransitionCondition.NotNull);
        Condition T_parkCt2 = new Condition(t_park, "P_park", TransitionCondition.CanAddCars);
        T_parkCt1.SetNextCondition(LogicConnector.AND, T_parkCt2);

        GuardMapping grdT_parkCt1 = new GuardMapping();
        grdT_parkCt1.condition = T_parkCt1;
        grdT_parkCt1.Activations.add(new Activation(t_park, "P119", TransitionOperation.PopElementWithTarget, "P_park"));
        t_park.GuardMappingList.add(grdT_parkCt1);

        t_park.Delay = 0;
        pn.Transitions.add(t_park);

        // T_x3 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_x3 = new PetriTransition(pn);
        t_x3.TransitionName = "T_x3";
        t_x3.InputPlaceName.add("P_a3");
        t_park.InputPlaceName.add("P_x3");

        Condition T_x3Ct1 = new Condition(t_x3, "P_a3", TransitionCondition.NotNull);
        Condition T_x3Ct2 = new Condition(t_x3, "P_x3", TransitionCondition.CanAddCars);
        T_x3Ct1.SetNextCondition(LogicConnector.AND, T_x3Ct2);

        GuardMapping grdT_x3Ct1 = new GuardMapping();
        grdT_x3Ct1.condition = T_x3Ct1;
        grdT_x3Ct1.Activations.add(new Activation(t_x3, "P_a3", TransitionOperation.AddElement, "P_x3"));
        t_x3.GuardMappingList.add(grdT_x3Ct1);

        t_x3.Delay = 0;
        pn.Transitions.add(t_x3);

        // T_out3 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_out3 = new PetriTransition(pn);
        t_out3.TransitionName = "T_out3";
        t_out3.IsAsync = true;
        t_out3.InputPlaceName.add("P_x3");
        t_out3.InputPlaceName.add("P_a3");

        Condition T_out3Ct1 = new Condition(t_out3, "P_a3", TransitionCondition.NotNull);
        Condition T_out3Ct2 = new Condition(t_out3, "P_x3", TransitionCondition.CanNotAddCars);
        T_out3Ct1.SetNextCondition(LogicConnector.AND, T_out3Ct2);

        GuardMapping grdT_out3 = new GuardMapping();
        grdT_out3.condition = T_out3Ct1;
        grdT_out3.Activations.add(new Activation(t_out3, "full", TransitionOperation.SendOverNetwork, "OP3"));
        t_out3.GuardMappingList.add(grdT_out3);

        t_out3.Delay = 0;
        pn.Transitions.add(t_out3);

        // t_e3 --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_e3 = new PetriTransition(pn);
        t_e3.TransitionName = "t_e3";
        t_e3.InputPlaceName.add("P_x3");
        t_e3.InputPlaceName.add("P_TL3i");


        Condition t_e3Ct1 = new Condition(t_e3, "P_TL3i", TransitionCondition.Equal, "green");
        Condition t_e3Ct2 = new Condition(t_e3, "P_x3", TransitionCondition.HaveCar);

        t_e3Ct1.SetNextCondition(LogicConnector.AND, t_e3Ct2);

        GuardMapping grdt_e3 = new GuardMapping();
        grdt_e3.condition = t_e3Ct1;
        grdt_e3.Activations.add(new Activation(t_e3, "P_x3", TransitionOperation.AddElement, "P_b3")); //Street "sends the car"
       // grdt_e3.Activations.add(new Activation(t_e3, "P_TL3i", TransitionOperation.Move, "P_TL3i"));

        t_e3.GuardMappingList.add(grdt_e3);

        t_e3.Delay = 0;
        pn.Transitions.add(t_e3);

        // T_i3 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_i3 = new PetriTransition(pn);
        t_i3.TransitionName = "T_i3";
        t_i3.InputPlaceName.add("P_b3");
        t_i3.InputPlaceName.add("P_Is1");

        Condition T_i3Ct1 = new Condition(t_i3, "P_b3", TransitionCondition.NotNull);
        Condition T_i3Ct2 = new Condition(t_i3, "P_Is1", TransitionCondition.CanAddCars);
        T_i3Ct1.SetNextCondition(LogicConnector.AND, T_i3Ct2);

        GuardMapping grdT_i3 = new GuardMapping();
        grdT_i3.condition = T_i3Ct1;
        grdT_i3.Activations.add(new Activation(t_i3, "P_b3", TransitionOperation.AddElement, "P_Is1"));
        t_i3.GuardMappingList.add(grdT_i3);

        t_i3.Delay = 0;
        pn.Transitions.add(t_i3);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 4 ENTRY - BUS line
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T40 --------------------------------------------------------------------

        PetriTransition t40 = new PetriTransition(pn);
        t40.TransitionName = "T40";
        t40.InputPlaceName.add("P_u4");

        Condition T40Ct1 = new Condition(t40, "P_u4", TransitionCondition.IsBus);
        Condition T40Ct3 = new Condition(t40, "P_u4", TransitionCondition.IsPriorityCar);
        Condition T40Ct2 = new Condition(t40, "P40", TransitionCondition.CanAddCars);
        T40Ct1.SetNextCondition(LogicConnector.AND, T40Ct2);
        T40Ct1.SetNextCondition(LogicConnector.OR, T40Ct3);

        GuardMapping grdT_T40 = new GuardMapping();
        grdT_T40.condition = T40Ct1;
        grdT_T40.Activations.add(new Activation(t40, "P_u4", TransitionOperation.AddElement, "P40"));
        t40.GuardMappingList.add(grdT_T40);

        t40.Delay = 0;
        pn.Transitions.add(t40);

        // T41 ---------------------------------------------------------------------------------------- Priority car route

        PetriTransition t41 = new PetriTransition(pn);
        t41.TransitionName = "T41";
        t41.InputPlaceName.add("P40");

        Condition T41Ct1 = new Condition(t40, "P40", TransitionCondition.HavePriorityCar);

        GuardMapping grdT41 = new GuardMapping();
        grdT41.condition = T41Ct1;
        grdT41.Activations.add(new Activation(t41, "P40", TransitionOperation.PopElementWithoutTargetToQueue, "P41"));
        t41.GuardMappingList.add(grdT41);

        t41.Delay = 0;
        pn.Transitions.add(t41);

        // T_4sb ----------------------------------------------------------------------------------- Bus route
        PetriTransition t_4sb = new PetriTransition(pn);
        t_4sb.TransitionName = "T_4sb";
        t_4sb.InputPlaceName.add("P40");

        Condition T_4sbCt1 = new Condition(t_4sb, "P40", TransitionCondition.HaveBus);

        GuardMapping grdT_4sb = new GuardMapping();
        grdT_4sb.condition = T_4sbCt1;
        grdT_4sb.Activations.add(new Activation(t_4sb, "P40", TransitionOperation.PopElementWithoutTargetToQueue, "P_station4b"));
        t_4sb.GuardMappingList.add(grdT_4sb);

        t_4sb.Delay = 2;
        pn.Transitions.add(t_4sb);

        // T_4esb----------------------------------------------------------------

        PetriTransition t_4esb = new PetriTransition(pn);
        t_4esb.TransitionName = "T_4esb";
        t_4esb.InputPlaceName.add("P_station4b");
        t_4esb.InputPlaceName.add("UserReq4b");

        Condition T_4esbCt1 = new Condition(t_4esb, "P_station4b", TransitionCondition.HaveCar);
//        Condition T_4esbCt2 = new Condition(t_4esb, "UserReq4b", TransitionCondition.NotNull);
//        T_4esbCt1.SetNextCondition(LogicConnector.AND, T_4esbCt2);

        GuardMapping grdT_4esb = new GuardMapping();
        grdT_4esb.condition = T_4esbCt1;
        grdT_4esb.Activations.add(new Activation(t_4esb, "P_station4b", TransitionOperation.PopElementWithoutTargetToQueue, "P41"));
        t_4esb.GuardMappingList.add(grdT_4esb);

        t_4esb.Delay = 3;
        pn.Transitions.add(t_4esb);

        // T_a4b----------------------------------------------------------------

        PetriTransition t_a4b = new PetriTransition(pn);
        t_a4b.TransitionName = "T_a4b";
        t_a4b.InputPlaceName.add("P41");

        Condition T_a4bCt1 = new Condition(t_a4b, "P41", TransitionCondition.HaveCar);

        GuardMapping grdT_a4b = new GuardMapping();
        grdT_a4b.condition = T_a4bCt1;
        grdT_a4b.Activations.add(new Activation(t_a4b, "P41", TransitionOperation.PopElementWithoutTargetToQueue, "P_a4b"));
        t_a4b.GuardMappingList.add(grdT_a4b);

        t_a4b.Delay = 0;
        pn.Transitions.add(t_a4b);

        // T_x4 ------------------------------------------------
        PetriTransition t_x4 = new PetriTransition(pn);
        t_x4.TransitionName = "T_x4";
        t_x4.InputPlaceName.add("P_a4b");
        t_x4.InputPlaceName.add("P_x4b");

        Condition T_x4Ct1 = new Condition(t_x4, "P_a4b", TransitionCondition.NotNull);
        Condition T_x4Ct2 = new Condition(t_x4, "P_x4b", TransitionCondition.CanAddCars);
        T_x4Ct1.SetNextCondition(LogicConnector.AND, T_x4Ct2);

        GuardMapping grdT_x4Ct1 = new GuardMapping();
        grdT_x4Ct1.condition = T_x4Ct1;
        grdT_x4Ct1.Activations.add(new Activation(t_x4, "P_a4b", TransitionOperation.AddElement, "P_x4b"));
        t_x4.GuardMappingList.add(grdT_x4Ct1);

        t_x4.Delay = 0;
        pn.Transitions.add(t_x4);

        // T_out4 ------------------------------------------------
        PetriTransition t_out4 = new PetriTransition(pn);
        t_out4.TransitionName = "T_out4";
        t_out4.IsAsync = true;
        t_out4.InputPlaceName.add("P_x4b");
        t_out4.InputPlaceName.add("P_a4b");

        Condition T_out4Ct1 = new Condition(t_out4, "P_x4b", TransitionCondition.NotNull);
        Condition T_out4Ct2 = new Condition(t_out4, "P_a4b", TransitionCondition.CanNotAddCars);
        T_out4Ct1.SetNextCondition(LogicConnector.AND, T_out4Ct2);

        GuardMapping grdT_out4 = new GuardMapping();
        grdT_out4.condition = T_out4Ct1;
        grdT_out4.Activations.add(new Activation(t_out4, "full", TransitionOperation.SendOverNetwork, "OP4"));
        t_out4.GuardMappingList.add(grdT_out4);

        t_out4.Delay = 0;
        pn.Transitions.add(t_out4);

        // t_e4 ------------------------------------------------

        PetriTransition t_e4 = new PetriTransition(pn);
        t_e4.TransitionName = "t_e4";
        t_e4.InputPlaceName.add("P_x4b");
        t_e4.InputPlaceName.add("P_TL4i");

        Condition t_e4Ct1 = new Condition(t_e4, "P_TL4i", TransitionCondition.Equal, "green");
        Condition t_e4Ct2 = new Condition(t_e4, "P_x4b", TransitionCondition.HaveCar);

        t_e4Ct1.SetNextCondition(LogicConnector.AND, t_e4Ct2);


        GuardMapping grdt_e4 = new GuardMapping();
        grdt_e4.condition = t_e4Ct1;
        grdt_e4.Activations.add(new Activation(t_e4, "P_x4b", TransitionOperation.AddElement, "P_b4b")); //Street "sends the car"
      //  grdt_e4.Activations.add(new Activation(t_e4, "P_TL4i", TransitionOperation.Move, "P_TL4i"));

        t_e4.GuardMappingList.add(grdt_e4);

        t_e4.Delay = 0;
        pn.Transitions.add(t_e4);

        // T_i4b -------------------------------------------------------------------
        PetriTransition t_i4b = new PetriTransition(pn);
        t_i4b.TransitionName = "T_i4b";
        t_i4b.InputPlaceName.add("P_b4b");
        t_i4b.InputPlaceName.add("P_Is1");

        Condition T_i4Ct1 = new Condition(t_i4b, "P_b4b", TransitionCondition.NotNull);
        Condition T_i4Ct2 = new Condition(t_i4b, "P_Is1", TransitionCondition.CanAddCars);
        T_i4Ct1.SetNextCondition(LogicConnector.AND, T_i4Ct2);

        GuardMapping grdT_i4b = new GuardMapping();
        grdT_i4b.condition = T_i4Ct1;
        grdT_i4b.Activations.add(new Activation(t_i4b, "P_b4b", TransitionOperation.AddElement, "P_Is1"));
        t_i4b.GuardMappingList.add(grdT_i4b);

        t_i4b.Delay = 0;
        pn.Transitions.add(t_i4b);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 4 EXIT - Cars
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        //ToDo: t87, t_tl4 - another pedestrian crossing - not added

        // t_o4-----------------------------------------------------------

        PetriTransition t_o4 = new PetriTransition(pn);
        t_o4.TransitionName = "T_o4";
        t_o4.InputPlaceName.add("P_Is1");
        t_o4.InputPlaceName.add("P_o4");

        Condition T_o4Ct1 = new Condition(t_o4, "P_Is1", TransitionCondition.HaveCarForMe);
        Condition T_o4Ct2 = new Condition(t_o4, "P_o4", TransitionCondition.CanAddCars);
        T_o4Ct1.SetNextCondition(LogicConnector.AND, T_o4Ct2);

        GuardMapping grdT_o4 = new GuardMapping();
        grdT_o4.condition = T_o4Ct1;
        grdT_o4.Activations.add(new Activation(t_o4, "P_Is1", TransitionOperation.PopElementWithTargetToQueue, "P_o4"));
        t_o4.GuardMappingList.add(grdT_o4);

        t_o4.Delay = 0;
        pn.Transitions.add(t_o4);

        // T_o4e--------------------------------------------------------------------------------------------

        PetriTransition t_o4e = new PetriTransition(pn);
        t_o4e.TransitionName = "T_o4e";
        t_o4e.InputPlaceName.add("P_o4");

        Condition T_o4eCt1 = new Condition(t_o4e, "P_o4", TransitionCondition.HaveCar);

        GuardMapping grdT_o4e = new GuardMapping();
        grdT_o4e.condition = T_o4eCt1;
        grdT_o4e.Activations.add(new Activation(t_o4e, "P_o4", TransitionOperation.AddElement, "P_o4e"));
        t_o4e.GuardMappingList.add(grdT_o4e);

        t_o4e.Delay = 0;
        pn.Transitions.add(t_o4e);

        // T_en4 ---------------------------------------------------------------------------------------------------
        PetriTransition t_en4 = new PetriTransition(pn);
        t_en4.TransitionName = "T_en4";
        t_en4.InputPlaceName.add("P_en4");

        Condition T_en4Ct1 = new Condition(t_en4, "P_en4", TransitionCondition.NotNull);
        Condition T_en4Ct2 = new Condition(t_en4, "P_04e", TransitionCondition.CanAddCars);
        T_en1Ct1.SetNextCondition(LogicConnector.AND, T_en4Ct2);

        GuardMapping grdT_en4 = new GuardMapping();
        grdT_en4.condition = T_en4Ct1;
        grdT_en4.Activations.add(new Activation(t_en4, "P_en4", TransitionOperation.AddElement, "P_o4e"));
        t_en4.GuardMappingList.add(grdT_en4);

        t_en4.Delay = 0;
        pn.Transitions.add(t_en4);

        // T_ex4 -------------------------------------------------------------------------------------------------------------

        PetriTransition t_ex4 = new PetriTransition(pn);
        t_ex4.TransitionName = "T_ex4";
        t_ex4.InputPlaceName.add("P_o4e");

        Condition T_ex4Ct1 = new Condition(t_ex4, "P_o4e", TransitionCondition.HaveCar);

        GuardMapping grdT_ex4 = new GuardMapping();
        grdT_ex4.condition = T_ex4Ct1;
        grdT_ex4.Activations.add(new Activation(t_ex4, "P_o4e", TransitionOperation.PopElementWithoutTarget, "P_ex4"));
        t_ex4.GuardMappingList.add(grdT_ex4);

        t_ex4.Delay = 0;
        pn.Transitions.add(t_ex4);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 1 LANE 4 EXIT - BUS
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // t_04b -----------------------------------------
        PetriTransition t_o4b = new PetriTransition(pn);
        t_o4b.TransitionName = "T_o4b";
        t_o4b.InputPlaceName.add("P_Is1");
        t_o4b.InputPlaceName.add("P_o4b");

        Condition T_o4bCt1 = new Condition(t_o4b, "P_Is1", TransitionCondition.HaveCarForMe);
        Condition T_o4bCt2 = new Condition(t_o4b, "P_o4b", TransitionCondition.CanAddCars);
        Condition T_o4bCt3 = new Condition(t_o4b, "P_Is1", TransitionCondition.IsBus);
        Condition T_o4bCt4 = new Condition(t_o4b, "P_Is1", TransitionCondition.IsPriorityCar);
        T_o4bCt1.SetNextCondition(LogicConnector.AND, T_o4bCt2);
        T_o4bCt1.SetNextCondition(LogicConnector.OR, T_o4bCt3);
        T_o4bCt1.SetNextCondition(LogicConnector.OR, T_o4bCt4);

        GuardMapping grdT_o4b = new GuardMapping();
        grdT_o4b.condition = T_o4bCt1;
        grdT_o4b.Activations.add(new Activation(t_o4b, "P_Is1", TransitionOperation.PopElementWithTargetToQueue, "P_o4b"));
        t_o4b.GuardMappingList.add(grdT_o4b);

        t_o4b.Delay = 0;
        pn.Transitions.add(t_o4b);

        // T_o4be--------------------------------------------------------------------------------------------

        PetriTransition t_o4be = new PetriTransition(pn);
        t_o4be.TransitionName = "T_o4be";
        t_o4be.InputPlaceName.add("P_o4b");

        Condition T_o4beCt1 = new Condition(t_o4be, "P_o4b", TransitionCondition.HaveCar);

        GuardMapping grdT_o4be = new GuardMapping();
        grdT_o4be.condition = T_o4beCt1;
        grdT_o4be.Activations.add(new Activation(t_o4be, "P_o4b", TransitionOperation.AddElement, "P_o4be"));
        t_o4be.GuardMappingList.add(grdT_o4be);

        t_o4be.Delay = 0;
        pn.Transitions.add(t_o4be);

        // T42--------------------------------------------------------------------------------------------

        PetriTransition t42 = new PetriTransition(pn);
        t42.TransitionName = "T42";
        t42.InputPlaceName.add("P_o4be");

        Condition T42Ct1 = new Condition(t_o4be, "P_o4be", TransitionCondition.HaveCar);

        GuardMapping grdT_T42 = new GuardMapping();
        grdT_T42.condition = T42Ct1;
        grdT_T42.Activations.add(new Activation(t42, "P_o4be", TransitionOperation.PopElementWithTargetToQueue, "P42"));

        t42.GuardMappingList.add(grdT_T42);

        t42.Delay = 0;
        pn.Transitions.add(t42);

        // T43 ---------------------------------------------------------------------------------------- Priority car route

        PetriTransition t43 = new PetriTransition(pn);
        t43.TransitionName = "T43";
        t43.InputPlaceName.add("P42");

        Condition T43Ct1 = new Condition(t43, "P42", TransitionCondition.HavePriorityCar);

        GuardMapping grdT43 = new GuardMapping();
        grdT43.condition = T43Ct1;
        grdT43.Activations.add(new Activation(t43, "P42", TransitionOperation.PopElementWithoutTargetToQueue, "P43"));
        t43.GuardMappingList.add(grdT43);

        t43.Delay = 0;
        pn.Transitions.add(t43);

        // T_4st ----------------------------------------------------------------------------------- Bus route
        PetriTransition t_4st = new PetriTransition(pn);
        t_4st.TransitionName = "T_4st";
        t_4st.InputPlaceName.add("P42");

        Condition T_4stCt1 = new Condition(t_4st, "P42", TransitionCondition.HaveBus);

        GuardMapping grdT_4st = new GuardMapping();
        grdT_4st.condition = T_4stCt1;
        grdT_4st.Activations.add(new Activation(t_4st, "P42", TransitionOperation.PopElementWithoutTargetToQueue, "P_station4t"));
        t_4st.GuardMappingList.add(grdT_4st);

        t_4st.Delay = 0;
        pn.Transitions.add(t_4st);

        // T_4est----------------------------------------------------------------

        PetriTransition t_4est = new PetriTransition(pn);
        t_4est.TransitionName = "T_4est";
        t_4est.InputPlaceName.add("P_station4t");
        t_4est.InputPlaceName.add("UserReq4t");

        Condition T_4estCt1 = new Condition(t_4est, "P_station4t", TransitionCondition.HaveCar);
//        Condition T_4estCt2 = new Condition(t_4est, "UserReq4t", TransitionCondition.NotNull);
//        T_4estCt1.SetNextCondition(LogicConnector.AND, T_4estCt2);

        GuardMapping grdT_4est = new GuardMapping();
        grdT_4est.condition = T_4estCt1;
        grdT_4est.Activations.add(new Activation(t_4est, "P_station4t", TransitionOperation.PopElementWithoutTargetToQueue, "P43"));
        t_4est.GuardMappingList.add(grdT_4est);

        t_4est.Delay = 3;
        pn.Transitions.add(t_4est);

        // T44 --------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t44 = new PetriTransition(pn);
        t44.TransitionName = "T44";
        t44.InputPlaceName.add("P43");

        Condition T44Ct1 = new Condition(t44, "P43", TransitionCondition.HaveCar);

        GuardMapping grdT44 = new GuardMapping();
        grdT44.condition = T44Ct1;
        grdT44.Activations.add(new Activation(t44, "P43", TransitionOperation.PopElementWithoutTarget, "P44"));
        t44.GuardMappingList.add(grdT44);

        t44.Delay = 0;
        pn.Transitions.add(t44);

        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Lanes_Intersection started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);

    }
}
