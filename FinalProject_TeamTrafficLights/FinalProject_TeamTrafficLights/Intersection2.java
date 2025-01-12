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

public class Intersection2 {
    public static void main(String[] args) {

        // ------------ Same as in Lanes_Intersection - Project 4 ------------

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Intersection2";
        pn.NetworkPort = 1084;

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


        // ------------------------ Intersection 2 - Pin 2-------------------- //

        // -------------------------------------------------------------------
        // ---------- Intersection 2 Lane 5 - Entry - Cars + Bus -------------
        // -------------------------------------------------------------------

        DataCar p46 = new DataCar();
        p46.SetName("P_en5");
        pn.PlaceList.add(p46);

        DataCar p47 = new DataCar();
        p47.SetName("P_a5");
        pn.PlaceList.add(p47);

        DataCarQueue p48 = new DataCarQueue();
        p48.Value.Size = 4;
        p48.SetName("P_x5");
        pn.PlaceList.add(p48);

        DataString p49 = new DataString();
        p49.SetName("P_TL5i");
        pn.PlaceList.add(p49);

        DataCar p50 = new DataCar();
        p50.SetName("P_b5");
        pn.PlaceList.add(p50);

        DataTransfer op5 = new DataTransfer();
        op5.SetName("OP5");
        op5.Value = new TransferOperation("localhost", "1082" , "in5");
        pn.PlaceList.add(op5);

        // -------------------------------------------------------------------
        // --------------- Intersection 2 Lane 6 Entry - bus -----------------
        // -------------------------------------------------------------------

        DataCar p51 = new DataCar();
        p51.SetName("P_a6b");
        pn.PlaceList.add(p51);

        DataCarQueue p52 = new DataCarQueue();
        p52.Value.Size = 4;
        p52.SetName("P_x6b");
        pn.PlaceList.add(p52);

        DataString p53 = new DataString();
        p53.SetName("P_TL6b");
        pn.PlaceList.add(p53);

        DataCar p54 = new DataCar();
        p54.SetName("P_b6b");
        pn.PlaceList.add(p54);

        DataTransfer op6b = new DataTransfer();
        op6b.SetName("OP6b");
        op6b.Value = new TransferOperation("localhost", "1082" , "in6b");
        pn.PlaceList.add(op6b);

        // -------------------------------------------------------------------
        // --------------- Intersection 2 Lane 6 Entry - Cars ----------------
        // -------------------------------------------------------------------

        DataCar p55 = new DataCar();
        p55.SetName("P_a6");
        pn.PlaceList.add(p55);

        DataCarQueue p56 = new DataCarQueue();
        p56.Value.Size = 4;
        p56.SetName("P_x6");
        pn.PlaceList.add(p56);

        DataString P_TL6 = new DataString();
        P_TL6.SetName("P_TL6");
        pn.PlaceList.add(P_TL6);

        DataCar p57 = new DataCar();
        p57.SetName("P_b6");
        pn.PlaceList.add(p57);

        DataTransfer op6 = new DataTransfer();
        op6.SetName("OP6");
        op6.Value = new TransferOperation("localhost", "1082" , "in6");
        pn.PlaceList.add(op6);

        // -------------------------------------------------------------------
        // -------------- Intersection 2 Entry Lane 8 - Bus ------------------
        // -------------------------------------------------------------------

        DataCar p58 = new DataCar();
        p58.SetName("P_a8b");
        pn.PlaceList.add(p58);

        DataCarQueue p59 = new DataCarQueue();
        p59.Value.Size = 4;
        p59.SetName("P_x8b");
        pn.PlaceList.add(p59);

        DataString p60 = new DataString();
        p60.SetName("P_TL8i");
        pn.PlaceList.add(p60);

        DataCar p61 = new DataCar();
        p61.SetName("P_b8b");
        pn.PlaceList.add(p61);

        DataTransfer op8 = new DataTransfer();
        op8.SetName("OP8");
        op8.Value = new TransferOperation("localhost", "1082" , "in8");
        pn.PlaceList.add(op8);

        // ----------------------------------------------------------------------------
        // ------------ Intersection 2 Exit lane 5 - Cars + Bus -----------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p62 = new DataCarQueue();
        p62.Value.Size = 4;
        p62.SetName("P_o5");
        pn.PlaceList.add(p62);

        DataCar p63 = new DataCar();
        p63.SetName("P_o5e");
        pn.PlaceList.add(p63);

        // ----------------------------------------------------------------------------
        // ------------------Intersection 2 Exit lane 6 - Bus -------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p64 = new DataCarQueue();
        p64.Value.Size = 4;
        p64.SetName("P_o6");
        pn.PlaceList.add(p64);

        DataCar p65 = new DataCar();
        p65.SetName("P_o6e");
        pn.PlaceList.add(p65);

        // ----------------------------------------------------------------------------
        // ---------------Intersection 2 Exit lane 7 - Cars + bus----------------------
        // ----------------------------------------------------------------------------

        DataCar p66 = new DataCar();
        p66.SetName("P_o7");
        pn.PlaceList.add(p66);

        DataCarQueue p67 = new DataCarQueue();
        p67.Value.Size = 4;
        p67.SetName("P_o7e");
        pn.PlaceList.add(p67);

        DataCar p68 = new DataCar();
        p68.SetName("P_en7");
        pn.PlaceList.add(p68);

        // ----------------------------------------------------------------------------
        // -----------------Intersection 2 Exit lane 8 bus-----------------------------
        // ----------------------------------------------------------------------------
        DataCarQueue p69 = new DataCarQueue();
        p69.Value.Size = 4;
        p69.SetName("P_o8b");
        pn.PlaceList.add(p69);

        DataCar p70 = new DataCar();
        p70.SetName("P_o8be");
        pn.PlaceList.add(p70);

        DataCarQueue p80 = new DataCarQueue();
        p80.Value.Size = 4;
        p80.SetName("P80");
        pn.PlaceList.add(p80);

        DataCarQueue p76 = new DataCarQueue();
        p76.Value.Size = 4;
        p76.SetName("P_station8t");
        pn.PlaceList.add(p76);

        DataString UserReq8t = new DataString();
        UserReq8t.SetName("UserReq8t");
        pn.PlaceList.add(UserReq8t);

        DataCarQueue p81 = new DataCarQueue();
        p81.Value.Size = 4;
        p81.SetName("P81");
        pn.PlaceList.add(p81);

        // ----------------------------------------------------------------------------
        // -----------------Intersection 2 Exit lane 8 cars ----------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p71 = new DataCarQueue();
        p71.Value.Size = 4;
        p71.SetName("P_o8");
        pn.PlaceList.add(p71);

        DataCarQueue p72 = new DataCarQueue();
        p72.Value.Size = 4;
        p72.SetName("P_o8e");
        pn.PlaceList.add(p72);

        DataCar p73 = new DataCar();
        p73.SetName("P_en8");
        pn.PlaceList.add(p73);

        DataCar p1 = new DataCar();
        p1.SetName("P_a8p");
        pn.PlaceList.add(p1);

        DataString UserReq8 = new DataString();
        UserReq8.SetName("UserReq8");
        pn.PlaceList.add(UserReq8);

        DataString P_PTL8 = new DataString();
        P_PTL8.SetName("P_PTL8");
        pn.PlaceList.add(P_PTL8);

        DataCar p3 = new DataCar();
        p3.SetName("P_b8");
        pn.PlaceList.add(p3);

        DataCarQueue p2 = new DataCarQueue();
        p2.Value.Size = 4;
        p2.SetName("P_x8");
        pn.PlaceList.add(p2);

        DataTransfer OPReq8 = new DataTransfer();
        OPReq8.SetName("OPReq8");
        OPReq8.Value = new TransferOperation("localhost", "1083" , "UserReq8");
        pn.PlaceList.add(OPReq8);

        // ---------- Combine lines -----------------
        DataTransfer p82 = new DataTransfer();
        p82.SetName("P82");
        p82.Value = new TransferOperation("localhost", "1080", "P_a2");
        pn.PlaceList.add(p82);

        // -------------------------------------------------------------------------------------------
        // --------------------------------Intersection 2---------------------------------------------
        // -------------------------------------------------------------------------------------------

        DataCarQueue p75 = new DataCarQueue();
        p75.Value.Size = 4;
        p75.SetName("P_Is2");
        pn.PlaceList.add(p75);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 5 ENTRY Cars + Bus
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_en5 ---------------------------------------------
        PetriTransition t_en5 = new PetriTransition(pn);
        t_en5.TransitionName = "T_en5";
        t_en5.InputPlaceName.add("P_en5");

        Condition T_en5Ct1 = new Condition(t_en5, "P_en5", TransitionCondition.NotNull);

        GuardMapping grdT_en5 = new GuardMapping();
        grdT_en5.condition = T_en5Ct1;

        grdT_en5.Activations.add(new Activation(t_en5, "P_en5", TransitionOperation.AddElement, "P_a5"));
        t_en5.GuardMappingList.add(grdT_en5);

        t_en5.Delay = 0;
        pn.Transitions.add(t_en5);

        // T_x5 -------------------------------------------------------------

        PetriTransition t_x5 = new PetriTransition(pn);
        t_x5.TransitionName = "T_x5";
        t_x5.InputPlaceName.add("P_a5");
        t_x5.InputPlaceName.add("P_x5");

        Condition T_x5Ct1 = new Condition(t_x5, "P_a5", TransitionCondition.NotNull);
        Condition T_x5Ct2 = new Condition(t_x5, "P_x5", TransitionCondition.CanAddCars);
        T_x5Ct1.SetNextCondition(LogicConnector.AND, T_x5Ct2);

        GuardMapping grdT_x5 = new GuardMapping();
        grdT_x5.condition = T_x5Ct1;
        grdT_x5.Activations.add(new Activation(t_x5, "P_a5", TransitionOperation.AddElement, "P_x5"));
        t_x5.GuardMappingList.add(grdT_x5);

        t_x5.Delay = 0;
        pn.Transitions.add(t_x5);

        // T_out5 ------------------------------------------------------------------------------------------------
        PetriTransition t_out5 = new PetriTransition(pn);
        t_out5.TransitionName = "T_out5";
        t_out5.IsAsync = true;
        t_out5.InputPlaceName.add("P_x5");
        t_out5.InputPlaceName.add("P_a5");

        Condition T_out5Ct1 = new Condition(t_out5, "P_a5", TransitionCondition.NotNull);
        Condition T_out5Ct2 = new Condition(t_out5, "P_x5", TransitionCondition.CanNotAddCars);
        T_out5Ct1.SetNextCondition(LogicConnector.AND, T_out5Ct2);

        GuardMapping grdT_out5 = new GuardMapping();
        grdT_out5.condition = T_out5Ct1;
        grdT_out5.Activations.add(new Activation(t_out5, "full", TransitionOperation.SendOverNetwork, "OP5"));
        t_out5.GuardMappingList.add(grdT_out5);

        t_out5.Delay = 0;
        pn.Transitions.add(t_out5);

        // T_88----------------------------------------------------------------------------------------------------------
        PetriTransition t_88 = new PetriTransition(pn);
        t_88.TransitionName = "t_88";
        t_88.InputPlaceName.add("P_x5");
        t_88.InputPlaceName.add("P_TL5i");

        Condition t_88Ct1 = new Condition(t_88, "P_TL5i", TransitionCondition.Equal, "green");
        Condition t_88Ct2 = new Condition(t_88, "P_x5", TransitionCondition.HaveCar);

        t_88Ct1.SetNextCondition(LogicConnector.AND, t_88Ct2);

        GuardMapping grdt_88 = new GuardMapping();
        grdt_88.condition = t_88Ct1;

        grdt_88.Activations.add(new Activation(t_88, "P_x5", TransitionOperation.PopElementWithoutTarget, "P_b5")); //Street "sends the car"
        grdt_88.Activations.add(new Activation(t_88, "P_TL5i", TransitionOperation.Move, "P_TL5i"));

        t_88.GuardMappingList.add(grdt_88);

        t_88.Delay = 0;
        pn.Transitions.add(t_88);

        // T_i5 ------------------------------------------------------------------------------------------------------------------
        PetriTransition t_i5 = new PetriTransition(pn);
        t_i5.TransitionName = "T_i5";
        t_i5.InputPlaceName.add("P_b5");
        t_i5.InputPlaceName.add("P_Is2");

        Condition T_i5Ct1 = new Condition(t_i5, "P_b5", TransitionCondition.NotNull);
        Condition T_i5Ct2 = new Condition(t_i5, "P_Is2", TransitionCondition.CanAddCars);
        T_i5Ct1.SetNextCondition(LogicConnector.AND, T_i5Ct2);

        GuardMapping grdT_i5 = new GuardMapping();
        grdT_i5.condition = T_i5Ct1;
        grdT_i5.Activations.add(new Activation(t_i5, "P_b5", TransitionOperation.AddElement, "P_Is2"));
        t_i5.GuardMappingList.add(grdT_i5);

        t_i5.Delay = 2;
        pn.Transitions.add(t_i5);


        //____________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 5 EXIT - Cars + Bus
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_o5 ------------------------------------------------------------------
        PetriTransition t_o5 = new PetriTransition(pn);
        t_o5.TransitionName = "T_o5";
        t_o5.InputPlaceName.add("P_Is2");
        t_o5.InputPlaceName.add("P_o5");

        Condition T_o5Ct1 = new Condition(t_o5, "P_Is2", TransitionCondition.HaveCarForMe);
        Condition T_o5Ct2 = new Condition(t_o5, "P_o5", TransitionCondition.CanAddCars);
        T_o5Ct1.SetNextCondition(LogicConnector.AND, T_o5Ct2);

        GuardMapping grdT_o5 = new GuardMapping();
        grdT_o5.condition = T_o5Ct1;
        grdT_o5.Activations.add(new Activation(t_o5, "P_Is2", TransitionOperation.PopElementWithTargetToQueue, "P_o5"));
        t_o5.GuardMappingList.add(grdT_o5);

        t_o5.Delay = 0;
        pn.Transitions.add(t_o5);

        //T_o5e-------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o5e = new PetriTransition(pn);
        t_o5e.TransitionName = "T_o5e";
        t_o5e.InputPlaceName.add("P_o5");

        Condition T_o5eCt1 = new Condition(t_o5e, "P_o5", TransitionCondition.HaveCar);

        GuardMapping grdT_o5e = new GuardMapping();
        grdT_o5e.condition = T_o5eCt1;
        grdT_o5e.Activations.add(new Activation(t_o5e, "P_o5", TransitionOperation.PopElementWithoutTarget, "P_o5e"));
        t_o5e.GuardMappingList.add(grdT_o5e);

        t_o5e.Delay = 0;
        pn.Transitions.add(t_o5e);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 6 ENTRY - Cars
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________


        // T_x6 -----------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_x6 = new PetriTransition(pn);
        t_x6.TransitionName = "T_x6";
        t_x6.InputPlaceName.add("P_a6");
        t_x6.InputPlaceName.add("P_x6");

        Condition T_x6Ct1 = new Condition(t_x6, "P_a6", TransitionCondition.NotNull);
        Condition T_x6Ct2 = new Condition(t_x6, "P_x6", TransitionCondition.CanAddCars);
        T_x6Ct1.SetNextCondition(LogicConnector.AND, T_x6Ct2);

        GuardMapping grdT_x6Ct1 = new GuardMapping();
        grdT_x6Ct1.condition = T_x6Ct1;
        grdT_x6Ct1.Activations.add(new Activation(t_x6, "P_a6", TransitionOperation.AddElement, "P_x6"));
        t_x6.GuardMappingList.add(grdT_x6Ct1);

        t_x6.Delay = 0;
        pn.Transitions.add(t_x6);

        // T_out6 -------------------------------------------------------------------------------------------------------------------------------------------
        PetriTransition t_out6 = new PetriTransition(pn);
        t_out6.TransitionName = "T_out6";
        t_out6.IsAsync = true;
        t_out6.InputPlaceName.add("P_x6");
        t_out6.InputPlaceName.add("P_a6");

        Condition T_out6Ct1 = new Condition(t_out6, "P_a6", TransitionCondition.NotNull);
        Condition T_out6Ct2 = new Condition(t_out6, "P_x6", TransitionCondition.CanNotAddCars);
        T_out6Ct1.SetNextCondition(LogicConnector.AND, T_out6Ct2);

        GuardMapping grdT_out6 = new GuardMapping();
        grdT_out6.condition = T_out6Ct1;
        grdT_out6.Activations.add(new Activation(t_out6, "full", TransitionOperation.SendOverNetwork, "OP6"));
        t_out6.GuardMappingList.add(grdT_out6);

        t_out6.Delay = 0;
        pn.Transitions.add(t_out6);

        // T_TL6----------------------------------------------------------------------------------------------------------
        PetriTransition t_TL6 = new PetriTransition(pn);
        t_TL6.TransitionName = "T_TL6";
        t_TL6.InputPlaceName.add("P_x6");
        t_TL6.InputPlaceName.add("P_TL6");

        Condition T_TL6Ct1 = new Condition(t_TL6, "P_TL6", TransitionCondition.Equal, "green");
        Condition T_TL6Ct2 = new Condition(t_TL6, "P_x6", TransitionCondition.HaveCar);
        T_TL6Ct1.SetNextCondition(LogicConnector.AND, T_TL6Ct2);

        GuardMapping grdT_TL6 = new GuardMapping();
        grdT_TL6.condition = T_TL6Ct1;
        grdT_TL6.Activations.add(new Activation(t_TL6, "P_x6", TransitionOperation.PopElementWithoutTarget, "P_b6"));
        grdT_TL6.Activations.add(new Activation(t_TL6, "P_TL6", TransitionOperation.Move, "P_TL6"));
        t_TL6.GuardMappingList.add(grdT_TL6);

        t_TL6.Delay = 0;
        pn.Transitions.add(t_TL6);

        // T_i6 ------------------------------------------------
        PetriTransition t_i6 = new PetriTransition(pn);
        t_i6.TransitionName = "T_i6";
        t_i6.InputPlaceName.add("P_b6");
        t_i6.InputPlaceName.add("P_Is2");

        Condition T_i6Ct1 = new Condition(t_i6, "P_b6", TransitionCondition.NotNull);
        Condition T_i6Ct2 = new Condition(t_i6, "P_Is2", TransitionCondition.CanAddCars);
        T_i6Ct1.SetNextCondition(LogicConnector.AND, T_i6Ct2);

        GuardMapping grdT_i6 = new GuardMapping();
        grdT_i6.condition = T_i6Ct1;
        grdT_i6.Activations.add(new Activation(t_i6, "P_b6", TransitionOperation.AddElement, "P_Is2"));
        t_i6.GuardMappingList.add(grdT_i6);

        t_i6.Delay = 0;
        pn.Transitions.add(t_i6);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 6 Entry - Bus
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        //

        // T_x6b -----------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_x6b = new PetriTransition(pn);
        t_x6b.TransitionName = "T_x6b";
        t_x6b.InputPlaceName.add("P_a6b");
        t_x6b.InputPlaceName.add("P_x6b");

        Condition T_x6bCt1 = new Condition(t_x6b, "P_a6b", TransitionCondition.NotNull);
        Condition T_x6bCt2 = new Condition(t_x6b, "P_x6b", TransitionCondition.CanAddCars);
        T_x6bCt1.SetNextCondition(LogicConnector.AND, T_x6bCt2);
        Condition T_x6bCt3 = new Condition(t_x6b, "P_a6b", TransitionCondition.IsPriorityCar);
        T_x6bCt1.SetNextCondition(LogicConnector.OR, T_x6bCt3);
        Condition T_x6bCt4 = new Condition(t_x6b, "P_a6b", TransitionCondition.IsBus);
        T_x6bCt1.SetNextCondition(LogicConnector.OR, T_x6bCt4);

        GuardMapping grdT_x6bCt1 = new GuardMapping();
        grdT_x6bCt1.condition = T_x6bCt1;
        grdT_x6bCt1.Activations.add(new Activation(t_x6b, "P_a6b", TransitionOperation.AddElement, "P_x6b"));
        t_x6b.GuardMappingList.add(grdT_x6bCt1);

        t_x6b.Delay = 0;
        pn.Transitions.add(t_x6b);

        // T_out6b -------------------------------------------------------------------------------------------------------------------------------------------
        PetriTransition t_out6b = new PetriTransition(pn);
        t_out6b.TransitionName = "T_out6b";
        t_out6b.IsAsync = true;
        t_out6b.InputPlaceName.add("P_x6b");
        t_out6b.InputPlaceName.add("P_a6b");

        Condition T_out6bCt1 = new Condition(t_out6b, "P_a6b", TransitionCondition.NotNull);
        Condition T_out6bCt2 = new Condition(t_out6b, "P_x6b", TransitionCondition.CanNotAddCars);
        T_out6bCt1.SetNextCondition(LogicConnector.AND, T_out6bCt2);

        GuardMapping grdT_out6b = new GuardMapping();
        grdT_out6b.condition = T_out6bCt1;
        grdT_out6b.Activations.add(new Activation(t_out6b, "full", TransitionOperation.SendOverNetwork, "OP6b"));
        t_out6b.GuardMappingList.add(grdT_out6b);

        t_out6b.Delay = 0;
        pn.Transitions.add(t_out6b);

        // T_TL6b----------------------------------------------------------------------------------------------------------
        PetriTransition t_TL6b = new PetriTransition(pn);
        t_TL6b.TransitionName = "T_TL6b";
        t_TL6b.InputPlaceName.add("P_x6b");
        t_TL6b.InputPlaceName.add("P_TL6b");

        Condition T_TL6bCt1 = new Condition(t_TL6b, "P_TL6b", TransitionCondition.Equal, "green");
        Condition T_TL6bCt2 = new Condition(t_TL6b, "P_x6b", TransitionCondition.HaveCar);
        T_TL6bCt1.SetNextCondition(LogicConnector.AND, T_TL6bCt2);

        GuardMapping grdT_TL6b = new GuardMapping();
        grdT_TL6b.condition = T_TL6bCt1;
        grdT_TL6b.Activations.add(new Activation(t_TL6b, "P_x6b", TransitionOperation.PopElementWithoutTarget, "P_b6b"));
        grdT_TL6b.Activations.add(new Activation(t_TL6b, "P_TL6b", TransitionOperation.Move, "P_TL6b"));
        t_TL6b.GuardMappingList.add(grdT_TL6b);

        t_TL6b.Delay = 0;
        pn.Transitions.add(t_TL6b);

        // T_i6b ------------------------------------------------
        PetriTransition t_i6b = new PetriTransition(pn);
        t_i6b.TransitionName = "T_i6b";
        t_i6b.InputPlaceName.add("P_b6b");
        t_i6b.InputPlaceName.add("P_Is2");

        Condition T_i6bCt1 = new Condition(t_i6b, "P_b6b", TransitionCondition.NotNull);
        Condition T_i6bCt2 = new Condition(t_i6b, "P_Is2", TransitionCondition.CanAddCars);
        T_i6bCt1.SetNextCondition(LogicConnector.AND, T_i6bCt2);

        GuardMapping grdT_i6b = new GuardMapping();
        grdT_i6b.condition = T_i6bCt1;
        grdT_i6b.Activations.add(new Activation(t_i6b, "P_b6b", TransitionOperation.AddElement, "P_Is2"));
        t_i6b.GuardMappingList.add(grdT_i6b);

        t_i6b.Delay = 0;
        pn.Transitions.add(t_i6b);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 6 EXIT Bus
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_o6 ----------------------------------------------------------

        PetriTransition t_o6 = new PetriTransition(pn);
        t_o6.TransitionName = "T_o6";
        t_o6.InputPlaceName.add("P_Is2");
        t_o6.InputPlaceName.add("P_o6");

        Condition T_o6Ct1 = new Condition(t_o6, "P_Is2", TransitionCondition.HaveCarForMe);
        Condition T_o6Ct2 = new Condition(t_o6, "P_o6", TransitionCondition.CanAddCars);
        Condition T_o6Ct3 = new Condition(t_o6, "P_Is2", TransitionCondition.HaveBus);
        Condition T_o6Ct4 = new Condition(t_o6, "P_Is2", TransitionCondition.HavePriorityCar);
        T_o6Ct1.SetNextCondition(LogicConnector.AND, T_o6Ct2);
        T_o6Ct1.SetNextCondition(LogicConnector.OR, T_o6Ct3);
        T_o6Ct1.SetNextCondition(LogicConnector.OR, T_o6Ct4);

        GuardMapping grdT_o6 = new GuardMapping();
        grdT_o6.condition = T_o6Ct1;
        grdT_o6.Activations.add(new Activation(t_o6, "P_Is2", TransitionOperation.PopElementWithTargetToQueue, "P_o6"));
        t_o6.GuardMappingList.add(grdT_o6);

        t_o6.Delay = 0;
        pn.Transitions.add(t_o6);

        //T_o6e-------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o6e = new PetriTransition(pn);
        t_o6e.TransitionName = "T_o6e";
        t_o6e.InputPlaceName.add("P_o6");

        Condition T_o6eCt1 = new Condition(t_o6e, "P_o6", TransitionCondition.HaveCar);

        GuardMapping grdT_o6e = new GuardMapping();
        grdT_o6e.condition = T_o6eCt1;
        grdT_o6e.Activations.add(new Activation(t_o6e, "P_o6", TransitionOperation.PopElementWithoutTarget, "P_o6e"));
        t_o6e.GuardMappingList.add(grdT_o6e);

        t_o6e.Delay = 0;
        pn.Transitions.add(t_o6e);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 7 EXIT
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        //T_o7------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o7 = new PetriTransition(pn);
        t_o7.TransitionName = "T_o7";
        t_o7.InputPlaceName.add("P_Is2");

        Condition T_o7Ct1 = new Condition(t_o7, "P_Is2", TransitionCondition.HaveCarForMe);

        GuardMapping grdT_o7 = new GuardMapping();
        grdT_o7.condition = T_o7Ct1;
        grdT_o7.Activations.add(new Activation(t_o7, "P_Is2", TransitionOperation.PopElementWithTargetToQueue, "P_o7"));
        t_o7.GuardMappingList.add(grdT_o7);

        t_o7.Delay = 0;
        pn.Transitions.add(t_o7);

        //T_o7e------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o7e = new PetriTransition(pn);
        t_o7e.TransitionName = "T_o7e";
        t_o7e.InputPlaceName.add("P_o7");

        Condition T_o7eCt1 = new Condition(t_o7e, "P_o7", TransitionCondition.HaveCar);

        GuardMapping grdT_o7e = new GuardMapping();
        grdT_o7e.condition = T_o7eCt1;
        grdT_o7e.Activations.add(new Activation(t_o7e, "P_o7", TransitionOperation.PopElementWithoutTarget, "P_o7e"));
        t_o7e.GuardMappingList.add(grdT_o7e);

        t_o6e.Delay = 0;
        pn.Transitions.add(t_o7e);

        //T_en7------------------------------------------------------------------------------------------------------------------

        PetriTransition t_en7 = new PetriTransition(pn);
        t_en7.TransitionName = "T_en7";
        t_en7.InputPlaceName.add("P_en7");

        Condition T_en7Ct1 = new Condition(t_en7, "P_en7", TransitionCondition.HaveCar);

        GuardMapping grdT_en7 = new GuardMapping();
        grdT_en7.condition = T_en7Ct1;
        grdT_en7.Activations.add(new Activation(t_en7, "P_en7", TransitionOperation.AddElement, "P_o7e"));
        t_en7.GuardMappingList.add(grdT_en7);

        t_en7.Delay = 0;
        pn.Transitions.add(t_en7);


        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 8 ENTRY - Bus
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        //T_x8b----------------------------------------------------------------

        PetriTransition t_x8b = new PetriTransition(pn);
        t_x8b.TransitionName = "T_x8b";
        t_x8b.InputPlaceName.add("P_a8b");
        t_x8b.InputPlaceName.add("P_x8b");

        Condition T_x8bCt1 = new Condition(t_x8b, "P_a8b", TransitionCondition.NotNull);
        Condition T_x8bCt2 = new Condition(t_x8b, "P_x8b", TransitionCondition.CanAddCars);
        T_x8bCt1.SetNextCondition(LogicConnector.AND, T_x8bCt2);

        GuardMapping grdT_x8b = new GuardMapping();
        grdT_x8b.condition = T_x8bCt1;
        grdT_x8b.Activations.add(new Activation(t_x8b, "P_a8b", TransitionOperation.AddElement, "P_x8b"));
        t_x8b.GuardMappingList.add(grdT_x8b);

        t_x8b.Delay = 0;
        pn.Transitions.add(t_x8b);

        // T_out8 ------------------------------------------------
        PetriTransition t_out8 = new PetriTransition(pn);
        t_out8.TransitionName = "T_out8";
        t_out8.IsAsync = true;
        t_out8.InputPlaceName.add("P_x8b");
        t_out8.InputPlaceName.add("P_a8b");

        Condition T_out8Ct1 = new Condition(t_out8, "P_x8b", TransitionCondition.NotNull);
        Condition T_out8Ct2 = new Condition(t_out8, "P_a8b", TransitionCondition.CanNotAddCars);
        T_out8Ct1.SetNextCondition(LogicConnector.AND, T_out8Ct2);

        GuardMapping grdT_out8 = new GuardMapping();
        grdT_out8.condition = T_out8Ct1;
        grdT_out8.Activations.add(new Activation(t_out8, "full", TransitionOperation.SendOverNetwork, "OP8"));
        t_out8.GuardMappingList.add(grdT_out8);

        t_out8.Delay = 0;
        pn.Transitions.add(t_out8);

        // T_89----------------------------------------------------------------------------------------------------------
        PetriTransition t_89 = new PetriTransition(pn);
        t_89.TransitionName = "T_89";
        t_89.InputPlaceName.add("P_x8b");
        t_89.InputPlaceName.add("P_TL8i");

        Condition T_89Ct1 = new Condition(t_89, "P_TL8i", TransitionCondition.Equal, "green");
        Condition T_89Ct2 = new Condition(t_89, "P_x8b", TransitionCondition.HaveCar);

        T_89Ct1.SetNextCondition(LogicConnector.AND, T_89Ct2);

        GuardMapping grdT_89 = new GuardMapping();
        grdT_89.condition = T_89Ct1;

        grdT_89.Activations.add(new Activation(t_89, "P_x8b", TransitionOperation.PopElementWithoutTarget, "P_b8b")); //Street "sends the car"
        grdT_89.Activations.add(new Activation(t_89, "P_TL8i", TransitionOperation.Move, "P_TL8i"));

        t_89.GuardMappingList.add(grdT_89);

        t_89.Delay = 0;
        pn.Transitions.add(t_89);

        // T_i8b -------------------------------------------------------------------
        PetriTransition t_i8b = new PetriTransition(pn);
        t_i8b.TransitionName = "T_i8b";
        t_i8b.InputPlaceName.add("P_b8b");
        t_i8b.InputPlaceName.add("P_Is2");

        Condition T_i8bCt1 = new Condition(t_i8b, "P_b8b", TransitionCondition.NotNull);
        Condition T_i8bCt2 = new Condition(t_i8b, "P_Is2", TransitionCondition.CanAddCars);
        T_i8bCt1.SetNextCondition(LogicConnector.AND, T_i8bCt2);

        GuardMapping grdT_i8b = new GuardMapping();
        grdT_i8b.condition = T_i8bCt1;
        grdT_i8b.Activations.add(new Activation(t_i8b, "P_b8b", TransitionOperation.AddElement, "P_Is2"));
        t_i8b.GuardMappingList.add(grdT_i8b);

        t_i8b.Delay = 0;
        pn.Transitions.add(t_i8b);


        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 8 EXIT - cars
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // t91 ----------------------------------------------------------------

        PetriTransition t91 = new PetriTransition(pn);
        t91.TransitionName = "t91";
        t91.InputPlaceName.add("P_b8");

        Condition t91Ct1 = new Condition(t91, "P_b8", TransitionCondition.HaveCarForMe);

        GuardMapping grdt91 = new GuardMapping();
        grdt91.condition = t91Ct1;
        grdt91.Activations.add(new Activation(t91, "P_b8", TransitionOperation.PopElementWithTargetToQueue, "P_o8e"));
        t91.GuardMappingList.add(grdt91);

        t91.Delay = 0;
        pn.Transitions.add(t91);

        // t90 -----------------------------
        PetriTransition t90 = new PetriTransition(pn);
        t90.TransitionName = "t90";
        t90.InputPlaceName.add("P_a8p"); //DataCar
        t90.InputPlaceName.add("P_x8");

        Condition t90Ct1 = new Condition(t90, "P_a8p", TransitionCondition.NotNull);
        Condition t90Ct2 = new Condition(t90, "P_x8", TransitionCondition.CanAddCars);
        t90Ct1.SetNextCondition(LogicConnector.AND, t90Ct2);

        GuardMapping grdt90 = new GuardMapping();
        grdt90.condition = t90Ct1;

        grdt90.Activations.add(new Activation(t90, "P_a8p", TransitionOperation.AddElement, "P_x8")); //DataCar->DataCarQueue
        t90.GuardMappingList.add(grdt90);

        t90.Delay = 0;
        pn.Transitions.add(t90);

        // T_TL8  ----------------------------------------------------------------------------------------------------------------------------------------------------------
        PetriTransition t_tl8 = new PetriTransition(pn);
        t_tl8.TransitionName = "t_tl8";
        t_tl8.InputPlaceName.add("P_x8");
        t_tl8.InputPlaceName.add("P_TL8");
        t_tl8.InputPlaceName.add("P_PTL8");
        t_tl8.InputPlaceName.add("UserReq8");

        Condition t_tl8Ct1 = new Condition(t_tl8, "P_TL8", TransitionCondition.Equal, "green");
        Condition t_tl8Ct2 = new Condition(t_tl8, "P_x8", TransitionCondition.HaveCar);
        Condition t_tl8Ct3 = new Condition(t_tl8, "P_PTL8", TransitionCondition.Equal,"P_PTL8");
        Condition t_tl8Ct4 = new Condition(t_tl8, "UserReq8", TransitionCondition.NotNull);
        //Condition t_tl8Ct5 = new Condition(t_tl8, "P_x1b", TransitionCondition.HavePriorityCar);

        t_tl8Ct1.SetNextCondition(LogicConnector.AND, t_tl8Ct2);
        t_tl8Ct1.SetNextCondition(LogicConnector.AND, t_tl8Ct3);
        t_tl8Ct1.SetNextCondition(LogicConnector.AND, t_tl8Ct4);
        // t_tl8Ct1.SetNextCondition(LogicConnector.OR, t_tl8Ct5);

        GuardMapping grdt_tl8 = new GuardMapping();
        grdt_tl8.condition = t_tl8Ct1;
        grdt_tl8.Activations.add(new Activation(t_tl8, "P_x8", TransitionOperation.AddElement, "P_b8")); //Street "sends the car"
        grdt_tl8.Activations.add(new Activation(t_tl8, "P_TL8", TransitionOperation.Move, "P_TL8"));
        grdt_tl8.Activations.add(new Activation(t_tl8, "P_PTL8", TransitionOperation.Move, "P_PTL8"));
        grdt_tl8.Activations.add(new Activation(t_tl8, "UserReq8", TransitionOperation.SendOverNetwork, "OPReq8"));

        t_tl8.GuardMappingList.add(grdt_tl8);

        t_tl8.Delay = 0;
        pn.Transitions.add(t_tl8);

        // T_o8------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o8 = new PetriTransition(pn);
        t_o8.TransitionName = "T_o8";
        t_o8.InputPlaceName.add("P_Is2");
        t_o8.InputPlaceName.add("P_o8");

        Condition T_o8Ct1 = new Condition(t_o8, "P_Is2", TransitionCondition.HaveCarForMe);
        Condition T_o8Ct2 = new Condition(t_o8, "P_o8", TransitionCondition.CanAddCars);
        T_o8Ct1.SetNextCondition(LogicConnector.AND, T_o8Ct2);

        GuardMapping grdT_o8 = new GuardMapping();
        grdT_o8.condition = T_o8Ct1;
        grdT_o8.Activations.add(new Activation(t_o8, "P_Is2", TransitionOperation.PopElementWithTargetToQueue, "P_o8"));
        t_o8.GuardMappingList.add(grdT_o8);

        t_o8.Delay = 0;
        pn.Transitions.add(t_o8);

        //T_o8e------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o8e = new PetriTransition(pn);
        t_o8e.TransitionName = "T_o8e";
        t_o8e.InputPlaceName.add("P_o8");

        Condition T_o8eCt1 = new Condition(t_o8e, "P_o8", TransitionCondition.HaveCar);

        GuardMapping grdT_o8e = new GuardMapping();
        grdT_o8e.condition = T_o8eCt1;
        grdT_o8e.Activations.add(new Activation(t_o8e, "P_o8", TransitionOperation.PopElementWithoutTarget, "P_a8p"));
        t_o8e.GuardMappingList.add(grdT_o8e);

        t_o8e.Delay = 0;
        pn.Transitions.add(t_o8e);

        // T_en8
        PetriTransition t_en8 = new PetriTransition(pn);
        t_en8.TransitionName = "T_en8";
        t_en8.InputPlaceName.add("P_en8");

        Condition T_en8Ct1 = new Condition(t_en8, "P_o8e", TransitionCondition.CanAddCars);
        Condition T_en8Ct2 = new Condition(t_en8, "P_en8", TransitionCondition.HaveCar);

        T_en8Ct1.SetNextCondition(LogicConnector.AND, T_en8Ct2);

        GuardMapping grdT_en8_1 = new GuardMapping();
        grdT_en8_1.condition = T_en8Ct1;
        grdT_en8_1.Activations.add(new Activation(t_en8, "P_en8", TransitionOperation.AddElement, "P_o8e"));
        t_o8e.GuardMappingList.add(grdT_en8_1);

        t_o8e.Delay = 0;
        pn.Transitions.add(t_o8e);

        //______________________________________________________________________________________________________________________________________________________________________________________________________________________
        // INTERSECTION 2 LANE 8 EXIT Bus
        //______________________________________________________________________________________________________________________________________________________________________________________________________________________

        // T_o8b------------------------------------------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o8b = new PetriTransition(pn);
        t_o8b.TransitionName = "T_o8b";
        t_o8b.InputPlaceName.add("P_Is2");
        t_o8b.InputPlaceName.add("P_o8b");

        Condition T_o8bCt1 = new Condition(t_o8b, "P_Is2", TransitionCondition.HaveCarForMe);
        Condition T_o8bCt2 = new Condition(t_o8b, "P_o8b", TransitionCondition.CanAddCars);
        Condition T_o8bCt3 = new Condition(t_o8b, "P_Is2", TransitionCondition.HavePriorityCar);
        Condition T_o8bCt4 = new Condition(t_o8b, "P_Is2", TransitionCondition.HaveBus);

        T_o8bCt1.SetNextCondition(LogicConnector.AND, T_o8bCt2);
        T_o8bCt1.SetNextCondition(LogicConnector.OR, T_o8bCt3);
        T_o8bCt1.SetNextCondition(LogicConnector.OR, T_o8bCt4);

        GuardMapping grdT_o8b = new GuardMapping();
        grdT_o8b.condition = T_o8bCt1;
        grdT_o8b.Activations.add(new Activation( t_o8b, "P_Is2", TransitionOperation.PopElementWithTargetToQueue, "P_o8b"));
        t_o8b.GuardMappingList.add(grdT_o8b);

        t_o8b.Delay = 0;
        pn.Transitions.add(t_o8b);

        //T_o8be------------------------------------------------------------------------------------------------------------------

        PetriTransition t_o8be = new PetriTransition(pn);
        t_o8e.TransitionName = "T_o8be";
        t_o8e.InputPlaceName.add("P_o8b");

        Condition T_o8beCt1 = new Condition(t_o8be, "P_o8b", TransitionCondition.HaveCar);

        GuardMapping grdT_o8be = new GuardMapping();
        grdT_o8be.condition = T_o8beCt1;
        grdT_o8be.Activations.add(new Activation(t_o8be, "P_o8b", TransitionOperation.PopElementWithoutTarget, "P_o8be"));
        t_o8be.GuardMappingList.add(grdT_o8be);

        t_o8be.Delay = 0;
        pn.Transitions.add(t_o8be);

        // T80
        PetriTransition t80 = new PetriTransition(pn);
        t80.TransitionName = "T20";
        t80.InputPlaceName.add("P_o8be");

        Condition T80Ct1 = new Condition(t80, "P_o8be", TransitionCondition.NotNull);
        Condition T80Ct2 = new Condition(t80, "P80", TransitionCondition.CanAddCars);
        T80Ct1.SetNextCondition(LogicConnector.AND, T80Ct2);

        GuardMapping grdT_T80 = new GuardMapping();
        grdT_T80.condition = T80Ct1;
        grdT_T80.Activations.add(new Activation(t80, "P_o8be", TransitionOperation.AddElement, "P80"));
        t80.GuardMappingList.add(grdT_T80);

        t80.Delay = 0;
        pn.Transitions.add(t80);

        // T81 ---------------------------------------------------------------------------------------- Priority car route
        PetriTransition t81 = new PetriTransition(pn);
        t81.TransitionName = "T81";
        t81.InputPlaceName.add("P80");

        Condition T81Ct1 = new Condition(t81, "P80", TransitionCondition.HavePriorityCar);

        GuardMapping grdT81 = new GuardMapping();
        grdT81.condition = T81Ct1;
        grdT81.Activations.add(new Activation(t81, "P80", TransitionOperation.PopElementWithoutTargetToQueue, "P81"));
        t81.GuardMappingList.add(grdT81);

        t81.Delay = 0;
        pn.Transitions.add(t81);

        //T_8st
        PetriTransition t_8st = new PetriTransition(pn);
        t_8st.TransitionName = "T_8st";
        t_8st.InputPlaceName.add("P80");

        Condition T_8stCt1 = new Condition(t_8st, "P80", TransitionCondition.HaveBus);

        GuardMapping grdT_8st = new GuardMapping();
        grdT_8st.condition = T_8stCt1;
        grdT_8st.Activations.add(new Activation(t_8st, "P80", TransitionOperation.PopElementWithoutTargetToQueue, "P_station8t"));
        t_8st.GuardMappingList.add(grdT_8st);

        t_8st.Delay = 0;
        pn.Transitions.add(t_8st);

        // T_8est
        PetriTransition t_8est = new PetriTransition(pn);
        t_8est.TransitionName = "T_8est";
        t_8est.InputPlaceName.add("P_station8t");
        t_8est.InputPlaceName.add("UserReq8t");

        Condition T_8estCt1 = new Condition(t_8est, "P_station8t", TransitionCondition.HaveCar);
        Condition T_8estCt2 = new Condition(t_8est, "UserReq8t", TransitionCondition.NotNull);
        T_8estCt1.SetNextCondition(LogicConnector.AND, T_8estCt2);

        GuardMapping grdT_8est = new GuardMapping();
        grdT_8est.condition = T_8estCt1;
        grdT_8est.Activations.add(new Activation(t_8est, "P_station8t", TransitionOperation.PopElementWithoutTargetToQueue, "P81"));
        t_8est.GuardMappingList.add(grdT_8est);

        t_8est.Delay = 3;
        pn.Transitions.add(t_8est);

        // T_82 - combined

        PetriTransition t_82 = new PetriTransition(pn);
        t_82.TransitionName = "t_82";
        t_82.InputPlaceName.add("P81");
        t_82.InputPlaceName.add("P_o8e");

        Condition t_82Ct1 = new Condition(t_82, "P82", TransitionCondition.CanAddCars);
        Condition t_82Ct2 = new Condition(t_82, "P81", TransitionCondition.HaveCar); // if we have a bus
        Condition t_82Ct3 = new Condition(t_82, "P_o8e", TransitionCondition.HaveCar); // if we have car

        t_82Ct1.SetNextCondition(LogicConnector.AND, t_82Ct2);
        t_82Ct1.SetNextCondition(LogicConnector.OR, t_82Ct3);

        GuardMapping grdt_82 = new GuardMapping();

        grdt_82.condition = t_82Ct1;
        grdt_82.Activations.add(new Activation(t_82, "P81", TransitionOperation.SendOverNetwork, "P82"));
        grdt_82.Activations.add(new Activation(t_82, "P_o8e", TransitionOperation.SendOverNetwork, "P82"));
        t_82.GuardMappingList.add(grdt_82);

        t_82.Delay = 0;
        pn.Transitions.add(t_82);



        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Intersection 2 started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}

