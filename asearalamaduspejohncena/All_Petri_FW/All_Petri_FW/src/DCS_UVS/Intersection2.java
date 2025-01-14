package DCS_UVS;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection2 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Main Petri";
        pn.NetworkPort = 1080;

        DataCar P_A_10 = new DataCar();
        P_A_10.SetName("P_A_10");
        pn.PlaceList.add(P_A_10);

        DataCar P_A_11 = new DataCar();
        P_A_11.SetName("P_A_11");
        pn.PlaceList.add(P_A_11);

        DataCar P_A_12 = new DataCar();
        P_A_12.SetName("P_A_12");
        pn.PlaceList.add(P_A_12);

        DataCar P_A_13 = new DataCar();
        P_A_13.SetName("P_A_13");
        pn.PlaceList.add(P_A_13);

        DataCar P_OE_10 = new DataCar();
        P_OE_10.SetName("P_OE_10");
        pn.PlaceList.add(P_OE_10);

        DataCar P_OE_11 = new DataCar();
        P_OE_11.SetName("P_OE_11");
        pn.PlaceList.add(P_OE_11);

        DataCar P_OE_12 = new DataCar();
        P_OE_12.SetName("P_OE_12");
        pn.PlaceList.add(P_OE_12);

        DataCar P_OE_13 = new DataCar();
        P_OE_13.SetName("P_OE_13");
        pn.PlaceList.add(P_OE_13);

        DataCarQueue P_X_10 = new DataCarQueue();
        P_X_10.Value.Size = 3;
        P_X_10.SetName("P_X_10");
        pn.PlaceList.add(P_X_10);

        DataCarQueue P_X_11 = new DataCarQueue();
        P_X_11.Value.Size = 3;
        P_X_11.SetName("P_X_11");
        pn.PlaceList.add(P_X_11);

        DataCarQueue P_X_12 = new DataCarQueue();
        P_X_12.Value.Size = 3;
        P_X_12.SetName("P_X_12");
        pn.PlaceList.add(P_X_12);

        DataCarQueue P_X_13 = new DataCarQueue();
        P_X_13.Value.Size = 3;
        P_X_13.SetName("P_X_13");
        pn.PlaceList.add(P_X_13);

        DataCar P_B_10 = new DataCar();
        P_B_10.SetName("P_B_10");
        pn.PlaceList.add(P_B_10);

        DataCar P_B_11 = new DataCar();
        P_B_11.SetName("P_B_11");
        pn.PlaceList.add(P_B_11);

        DataCar P_B_12 = new DataCar();
        P_B_12.SetName("P_B_12");
        pn.PlaceList.add(P_B_12);

        DataCar P_B_13 = new DataCar();
        P_B_13.SetName("P_B_13");
        pn.PlaceList.add(P_B_13);

        DataCarQueue P_O_10 = new DataCarQueue();
        P_O_10.Value.Size = 3;
        P_O_10.SetName("P_O_10");
        pn.PlaceList.add(P_O_10);

        DataCarQueue P_O_11 = new DataCarQueue();
        P_O_11.Value.Size = 3;
        P_O_11.SetName("P_O_11");
        pn.PlaceList.add(P_O_11);

        DataCarQueue P_O_12 = new DataCarQueue();
        P_O_12.Value.Size = 3;
        P_O_12.SetName("P_O_12");
        pn.PlaceList.add(P_O_12);

        DataCarQueue P_O_13 = new DataCarQueue();
        P_O_13.Value.Size = 3;
        P_O_13.SetName("P_O_13");
        pn.PlaceList.add(P_O_13);

        DataCarQueue P_INT_2 = new DataCarQueue();
        P_INT_2.Value.Size = 20;
        P_INT_2.SetName("P_INT_2");
        pn.PlaceList.add(P_INT_2);

        // LANE 1 INPUT
        PetriTransition T_U_10 = new PetriTransition(pn);
        T_U_10.TransitionName = "T_U_10";
        T_U_10.InputPlaceName.add("P_A_10");
        T_U_10.InputPlaceName.add("P_X_10");

        Condition T_U_10_CT1 = new Condition(T_U_10, "P_A_10", TransitionCondition.NotNull);
        Condition T_U_10_CT2 = new Condition(T_U_10, "P_X_10", TransitionCondition.CanAddCars);
        T_U_10_CT1.SetNextCondition(LogicConnector.AND, T_U_10_CT2);

        GuardMapping grdT_U_10 = new GuardMapping();
        grdT_U_10.condition = T_U_10_CT1;
        grdT_U_10.Activations.add(new Activation(T_U_10, "P_A_10", TransitionOperation.AddElement, "P_X_10"));
        T_U_10.GuardMappingList.add(grdT_U_10);

        T_U_10.Delay = 2;
        pn.Transitions.add(T_U_10);

        PetriTransition T_E_10 = new PetriTransition(pn);
        T_E_10.TransitionName = "T_E_10";
        T_E_10.InputPlaceName.add("P_X_10");

        Condition T_E_10_CT1 = new Condition(T_E_10, "P_X_10", TransitionCondition.HaveCar);

        GuardMapping grdT_E_10 = new GuardMapping();
        grdT_E_10.condition = T_E_10_CT1;
        grdT_E_10.Activations.add(new Activation(T_E_10, "P_X_10", TransitionOperation.PopElementWithoutTarget, "P_B_10"));
        T_E_10.GuardMappingList.add(grdT_E_10);

        Condition T_E_10_CT2 = new Condition(T_E_10, "P_X_10", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_10_1 = new GuardMapping();
        grdT_E_10_1.condition = T_E_10_CT2;
        grdT_E_10_1.Activations.add(new Activation(T_E_10, "P_X_10", TransitionOperation.PopElementWithoutTarget, "P_B_10"));
        T_E_10.GuardMappingList.add(grdT_E_10_1);

        T_E_10.Delay = 2;
        pn.Transitions.add(T_E_10);


        PetriTransition T_I_10 = new PetriTransition(pn);
        T_I_10.TransitionName = "T_I_10";
        T_I_10.InputPlaceName.add("P_B_10");
        T_I_10.InputPlaceName.add("P_INT_2");

        Condition T_I_10_CT1 = new Condition(T_I_10, "P_B_10", TransitionCondition.NotNull);
        Condition T_I_10_CT2 = new Condition(T_I_10, "P_INT_2", TransitionCondition.CanAddCars);
        T_I_10_CT1.SetNextCondition(LogicConnector.AND, T_I_10_CT2);

        GuardMapping grdT_I_10 = new GuardMapping();
        grdT_I_10.condition = T_I_10_CT1;
        grdT_I_10.Activations.add(new Activation(T_I_10, "P_B_10", TransitionOperation.AddElement, "P_INT_2"));
        T_I_10.GuardMappingList.add(grdT_I_10);

        T_I_10.Delay = 2;
        pn.Transitions.add(T_I_10);

        // LANE 2 INPUT
        PetriTransition T_U_11 = new PetriTransition(pn);
        T_U_11.TransitionName = "T_U_11";
        T_U_11.InputPlaceName.add("P_A_11");
        T_U_11.InputPlaceName.add("P_X_11");

        Condition T_U_11_CT1 = new Condition(T_U_11, "P_A_11", TransitionCondition.NotNull);
        Condition T_U_11_CT2 = new Condition(T_U_11, "P_X_11", TransitionCondition.CanAddCars);
        T_U_11_CT1.SetNextCondition(LogicConnector.AND, T_U_11_CT2);

        GuardMapping grdT_U_11 = new GuardMapping();
        grdT_U_11.condition = T_U_11_CT1;
        grdT_U_11.Activations.add(new Activation(T_U_11, "P_A_11", TransitionOperation.AddElement, "P_X_11"));
        T_U_11.GuardMappingList.add(grdT_U_11);

        T_U_11.Delay = 2;
        pn.Transitions.add(T_U_11);

        PetriTransition T_E_11 = new PetriTransition(pn);
        T_E_11.TransitionName = "T_E_11";
        T_E_11.InputPlaceName.add("P_X_11");

        Condition T_E_11_CT1 = new Condition(T_E_11, "P_X_11", TransitionCondition.HaveCar);

        GuardMapping grdT_E_11 = new GuardMapping();
        grdT_E_11.condition = T_E_11_CT1;
        grdT_E_11.Activations.add(new Activation(T_E_11, "P_X_11", TransitionOperation.PopElementWithoutTarget, "P_B_11"));
        T_E_11.GuardMappingList.add(grdT_E_11);

        Condition T_E_11_CT2 = new Condition(T_E_11, "P_X_11", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_11_1 = new GuardMapping();
        grdT_E_11_1.condition = T_E_11_CT2;
        grdT_E_11_1.Activations.add(new Activation(T_E_11, "P_X_11", TransitionOperation.PopElementWithoutTarget, "P_B_11"));
        T_E_11.GuardMappingList.add(grdT_E_11_1);

        T_E_11.Delay = 2;
        pn.Transitions.add(T_E_11);


        PetriTransition T_I_11 = new PetriTransition(pn);
        T_I_11.TransitionName = "T_I_11";
        T_I_11.InputPlaceName.add("P_B_11");
        T_I_11.InputPlaceName.add("P_INT_2");

        Condition T_I_11_CT1 = new Condition(T_I_11, "P_B_11", TransitionCondition.NotNull);
        Condition T_I_11_CT2 = new Condition(T_I_11, "P_INT_2", TransitionCondition.CanAddCars);
        T_I_11_CT1.SetNextCondition(LogicConnector.AND, T_I_11_CT2);

        GuardMapping grdT_I_11 = new GuardMapping();
        grdT_I_11.condition = T_I_11_CT1;
        grdT_I_11.Activations.add(new Activation(T_I_11, "P_B_11", TransitionOperation.AddElement, "P_INT_2"));
        T_I_11.GuardMappingList.add(grdT_I_11);

        T_I_11.Delay = 2;
        pn.Transitions.add(T_I_11);

        // LANE 3 INPUT
        PetriTransition T_U_12 = new PetriTransition(pn);
        T_U_12.TransitionName = "T_U_12";
        T_U_12.InputPlaceName.add("P_A_12");
        T_U_12.InputPlaceName.add("P_X_12");

        Condition T_U_12_CT1 = new Condition(T_U_12, "P_A_12", TransitionCondition.NotNull);
        Condition T_U_12_CT2 = new Condition(T_U_12, "P_X_12", TransitionCondition.CanAddCars);
        T_U_12_CT1.SetNextCondition(LogicConnector.AND, T_U_12_CT2);

        GuardMapping grdT_U_12 = new GuardMapping();
        grdT_U_12.condition = T_U_12_CT1;
        grdT_U_12.Activations.add(new Activation(T_U_12, "P_A_12", TransitionOperation.AddElement, "P_X_12"));
        T_U_12.GuardMappingList.add(grdT_U_12);

        T_U_12.Delay = 2;
        pn.Transitions.add(T_U_12);

        PetriTransition T_E_12 = new PetriTransition(pn);
        T_E_12.TransitionName = "T_E_12";
        T_E_12.InputPlaceName.add("P_X_12");

        Condition T_E_12_CT1 = new Condition(T_E_12, "P_X_12", TransitionCondition.HaveCar);

        GuardMapping grdT_E_12 = new GuardMapping();
        grdT_E_12.condition = T_E_12_CT1;
        grdT_E_12.Activations.add(new Activation(T_E_12, "P_X_12", TransitionOperation.PopElementWithoutTarget, "P_B_12"));
        T_E_12.GuardMappingList.add(grdT_E_12);

        Condition T_E_12_CT2 = new Condition(T_E_12, "P_X_12", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_12_1 = new GuardMapping();
        grdT_E_12_1.condition = T_E_12_CT2;
        grdT_E_12_1.Activations.add(new Activation(T_E_12, "P_X_12", TransitionOperation.PopElementWithoutTarget, "P_B_12"));
        T_E_12.GuardMappingList.add(grdT_E_12_1);

        T_E_12.Delay = 2;
        pn.Transitions.add(T_E_12);


        PetriTransition T_I_12 = new PetriTransition(pn);
        T_I_12.TransitionName = "T_I_12";
        T_I_12.InputPlaceName.add("P_B_12");
        T_I_12.InputPlaceName.add("P_INT_2");

        Condition T_I_12_CT1 = new Condition(T_I_12, "P_B_12", TransitionCondition.NotNull);
        Condition T_I_12_CT2 = new Condition(T_I_12, "P_INT_2", TransitionCondition.CanAddCars);
        T_I_12_CT1.SetNextCondition(LogicConnector.AND, T_I_12_CT2);

        GuardMapping grdT_I_12 = new GuardMapping();
        grdT_I_12.condition = T_I_12_CT1;
        grdT_I_12.Activations.add(new Activation(T_I_12, "P_B_12", TransitionOperation.AddElement, "P_INT_2"));
        T_I_12.GuardMappingList.add(grdT_I_12);

        T_I_12.Delay = 2;
        pn.Transitions.add(T_I_12);

        // LANE 4 INPUT
        PetriTransition T_U_13 = new PetriTransition(pn);
        T_U_13.TransitionName = "T_U_13";
        T_U_13.InputPlaceName.add("P_A_13");
        T_U_13.InputPlaceName.add("P_X_13");

        Condition T_U_13_CT1 = new Condition(T_U_13, "P_A_13", TransitionCondition.NotNull);
        Condition T_U_13_CT2 = new Condition(T_U_13, "P_X_13", TransitionCondition.CanAddCars);
        T_U_13_CT1.SetNextCondition(LogicConnector.AND, T_U_13_CT2);

        GuardMapping grdT_U_13 = new GuardMapping();
        grdT_U_13.condition = T_U_13_CT1;
        grdT_U_13.Activations.add(new Activation(T_U_13, "P_A_13", TransitionOperation.AddElement, "P_X_13"));
        T_U_13.GuardMappingList.add(grdT_U_13);

        T_U_13.Delay = 2;
        pn.Transitions.add(T_U_13);

        PetriTransition T_E_13 = new PetriTransition(pn);
        T_E_13.TransitionName = "T_E_13";
        T_E_13.InputPlaceName.add("P_X_13");

        Condition T_E_13_CT1 = new Condition(T_E_13, "P_X_13", TransitionCondition.HaveCar);

        GuardMapping grdT_E_13 = new GuardMapping();
        grdT_E_13.condition = T_E_13_CT1;
        grdT_E_13.Activations.add(new Activation(T_E_13, "P_X_13", TransitionOperation.PopElementWithoutTarget, "P_B_13"));
        T_E_13.GuardMappingList.add(grdT_E_13);

        Condition T_E_13_CT2 = new Condition(T_E_13, "P_X_13", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_13_1 = new GuardMapping();
        grdT_E_13_1.condition = T_E_13_CT2;
        grdT_E_13_1.Activations.add(new Activation(T_E_13, "P_X_13", TransitionOperation.PopElementWithoutTarget, "P_B_13"));
        T_E_13.GuardMappingList.add(grdT_E_13_1);

        T_E_13.Delay = 2;
        pn.Transitions.add(T_E_13);


        PetriTransition T_I_13 = new PetriTransition(pn);
        T_I_13.TransitionName = "T_I_13";
        T_I_13.InputPlaceName.add("P_B_13");
        T_I_13.InputPlaceName.add("P_INT_2");

        Condition T_I_13_CT1 = new Condition(T_I_13, "P_B_13", TransitionCondition.NotNull);
        Condition T_I_13_CT2 = new Condition(T_I_13, "P_INT_2", TransitionCondition.CanAddCars);
        T_I_13_CT1.SetNextCondition(LogicConnector.AND, T_I_13_CT2);

        GuardMapping grdT_I_13 = new GuardMapping();
        grdT_I_13.condition = T_I_13_CT1;
        grdT_I_13.Activations.add(new Activation(T_I_13, "P_B_13", TransitionOperation.AddElement, "P_INT_2"));
        T_I_13.GuardMappingList.add(grdT_I_13);

        T_I_13.Delay = 2;
        pn.Transitions.add(T_I_13);


        // LANE 1 EXiT
        PetriTransition T_O_10 = new PetriTransition(pn);
        T_O_10.TransitionName = "T_O_10";
        T_O_10.InputPlaceName.add("P_INT_2");
        T_O_10.InputPlaceName.add("P_O_10");

        Condition T_O_10_CT1 = new Condition(T_O_10, "P_INT_2", TransitionCondition.HaveCarForMe);
        Condition T_O_10_CT2 = new Condition(T_O_10, "P_O_10", TransitionCondition.CanAddCars);
        T_O_10_CT1.SetNextCondition(LogicConnector.AND, T_O_10_CT2);

        GuardMapping grdT_O_10 = new GuardMapping();
        grdT_O_10.condition = T_O_10_CT1;
        grdT_O_10.Activations.add(new Activation(T_O_10, "P_INT_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_10"));
        T_O_10.GuardMappingList.add(grdT_O_10);

        T_O_10.Delay = 1;
        pn.Transitions.add(T_O_10);

        PetriTransition T_OE_10 = new PetriTransition(pn);
        T_OE_10.TransitionName = "T_OE_10";
        T_OE_10.InputPlaceName.add("P_O_10");

        Condition T_OE_10_CT1 = new Condition(T_OE_10, "P_O_10", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_10 = new GuardMapping();

        grdT_OE_10.condition = T_OE_10_CT1;
        grdT_OE_10.Activations.add(new Activation(T_OE_10, "P_O_10", TransitionOperation.PopElementWithoutTarget, "P_OE_10"));
        T_OE_10.GuardMappingList.add(grdT_OE_10);

        T_OE_10.Delay = 2;
        pn.Transitions.add(T_OE_10);

        // LANE 2 EXiT
        PetriTransition T_O_11 = new PetriTransition(pn);
        T_O_11.TransitionName = "T_O_11";
        T_O_11.InputPlaceName.add("P_INT_2");
        T_O_11.InputPlaceName.add("P_O_11");

        Condition T_O_11_CT1 = new Condition(T_O_11, "P_INT_2", TransitionCondition.HaveCarForMe);
        Condition T_O_11_CT2 = new Condition(T_O_11, "P_O_11", TransitionCondition.CanAddCars);
        T_O_11_CT1.SetNextCondition(LogicConnector.AND, T_O_11_CT2);

        GuardMapping grdT_O_11 = new GuardMapping();
        grdT_O_11.condition = T_O_11_CT1;
        grdT_O_11.Activations.add(new Activation(T_O_11, "P_INT_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_11"));
        T_O_11.GuardMappingList.add(grdT_O_11);

        T_O_11.Delay = 1;
        pn.Transitions.add(T_O_11);


        PetriTransition T_OE_11 = new PetriTransition(pn);
        T_OE_11.TransitionName = "T_OE_11";
        T_OE_11.InputPlaceName.add("P_O_11");

        Condition T_OE_11_CT1 = new Condition(T_OE_11, "P_O_11", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_11 = new GuardMapping();
        grdT_OE_11.condition = T_OE_11_CT1;
        grdT_OE_11.Activations.add(new Activation(T_OE_11, "P_O_11", TransitionOperation.PopElementWithoutTarget, "P_OE_11"));
        T_OE_11.GuardMappingList.add(grdT_OE_11);

        T_OE_11.Delay = 2;
        pn.Transitions.add(T_OE_11);

        // LANE 3 EXiT
        PetriTransition T_O_12 = new PetriTransition(pn);
        T_O_12.TransitionName = "T_O_12";
        T_O_12.InputPlaceName.add("P_INT_2");
        T_O_12.InputPlaceName.add("P_O_12");

        Condition T_O_12_CT1 = new Condition(T_O_12, "P_INT_2", TransitionCondition.HaveCarForMe);
        Condition T_O_12_CT2 = new Condition(T_O_12, "P_O_12", TransitionCondition.CanAddCars);
        T_O_12_CT1.SetNextCondition(LogicConnector.AND, T_O_12_CT2);

        GuardMapping grdT_O_12 = new GuardMapping();
        grdT_O_12.condition = T_O_12_CT1;
        grdT_O_12.Activations.add(new Activation(T_O_12, "P_INT_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_12"));
        T_O_12.GuardMappingList.add(grdT_O_12);

        T_O_12.Delay = 1;
        pn.Transitions.add(T_O_12);

        PetriTransition T_OE_12 = new PetriTransition(pn);
        T_OE_12.TransitionName = "T_OE_12";
        T_OE_12.InputPlaceName.add("P_O_12");

        Condition T_OE_12_CT1 = new Condition(T_OE_12, "P_O_12", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_12 = new GuardMapping();
        grdT_OE_12.condition = T_OE_12_CT1;
        grdT_OE_12.Activations.add(new Activation(T_OE_12, "P_O_12", TransitionOperation.PopElementWithoutTarget, "P_OE_12"));
        T_OE_12.GuardMappingList.add(grdT_OE_12);

        T_OE_12.Delay = 2;
        pn.Transitions.add(T_OE_12);

        // LANE 4 EXiT
        PetriTransition T_O_13 = new PetriTransition(pn);
        T_O_13.TransitionName = "T_O_13";
        T_O_13.InputPlaceName.add("P_INT_2");
        T_O_13.InputPlaceName.add("P_O_13");

        Condition T_O_13_CT1 = new Condition(T_O_13, "P_INT_2", TransitionCondition.HaveCarForMe);
        Condition T_O_13_CT2 = new Condition(T_O_13, "P_O_13", TransitionCondition.CanAddCars);
        T_O_13_CT1.SetNextCondition(LogicConnector.AND, T_O_13_CT2);

        GuardMapping grdT_O_13 = new GuardMapping();
        grdT_O_13.condition = T_O_13_CT1;
        grdT_O_13.Activations.add(new Activation(T_O_13, "P_INT_2", TransitionOperation.PopElementWithTargetToQueue, "P_O_13"));
        T_O_13.GuardMappingList.add(grdT_O_13);

        T_O_13.Delay = 1;
        pn.Transitions.add(T_O_13);


        PetriTransition T_OE_13 = new PetriTransition(pn);
        T_OE_13.TransitionName = "T_OE_13";
        T_OE_13.InputPlaceName.add("P_O_13");

        Condition T_OE_13_CT1 = new Condition(T_OE_13, "P_O_13", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_13 = new GuardMapping();
        grdT_OE_13.condition = T_OE_13_CT1;
        grdT_OE_13.Activations.add(new Activation(T_OE_13, "P_O_13", TransitionOperation.PopElementWithoutTarget, "P_OE_13"));
        T_OE_13.GuardMappingList.add(grdT_OE_13);

        T_OE_13.Delay = 2;
        pn.Transitions.add(T_OE_13);

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
