package DCS_UVS;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection3 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Main Petri";
        pn.NetworkPort = 1080;

        DataCar P_A_20 = new DataCar();
        P_A_20.SetName("P_A_20");
        pn.PlaceList.add(P_A_20);

        DataCar P_A_21 = new DataCar();
        P_A_21.SetName("P_A_21");
        pn.PlaceList.add(P_A_21);

        DataCar P_A_22 = new DataCar();
        P_A_22.SetName("P_A_22");
        pn.PlaceList.add(P_A_22);
        

        DataCar P_OE_20 = new DataCar();
        P_OE_20.SetName("P_OE_20");
        pn.PlaceList.add(P_OE_20);

        DataCar P_OE_21 = new DataCar();
        P_OE_21.SetName("P_OE_21");
        pn.PlaceList.add(P_OE_21);

        DataCar P_OE_22 = new DataCar();
        P_OE_22.SetName("P_OE_22");
        pn.PlaceList.add(P_OE_22);

        DataCar P_OE_23 = new DataCar();
        P_OE_23.SetName("P_OE_23");
        pn.PlaceList.add(P_OE_23);

        DataCarQueue P_X_20 = new DataCarQueue();
        P_X_20.Value.Size = 3;
        P_X_20.SetName("P_X_20");
        pn.PlaceList.add(P_X_20);

        DataCarQueue P_X_21 = new DataCarQueue();
        P_X_21.Value.Size = 3;
        P_X_21.SetName("P_X_21");
        pn.PlaceList.add(P_X_21);

        DataCarQueue P_X_22 = new DataCarQueue();
        P_X_22.Value.Size = 3;
        P_X_22.SetName("P_X_22");
        pn.PlaceList.add(P_X_22);
        

        DataCar P_B_20 = new DataCar();
        P_B_20.SetName("P_B_20");
        pn.PlaceList.add(P_B_20);

        DataCar P_B_21 = new DataCar();
        P_B_21.SetName("P_B_21");
        pn.PlaceList.add(P_B_21);

        DataCar P_B_22 = new DataCar();
        P_B_22.SetName("P_B_22");
        pn.PlaceList.add(P_B_22);
        

        DataCarQueue P_O_20 = new DataCarQueue();
        P_O_20.Value.Size = 3;
        P_O_20.SetName("P_O_20");
        pn.PlaceList.add(P_O_20);

        DataCarQueue P_O_21 = new DataCarQueue();
        P_O_21.Value.Size = 3;
        P_O_21.SetName("P_O_21");
        pn.PlaceList.add(P_O_21);

        DataCarQueue P_O_22 = new DataCarQueue();
        P_O_22.Value.Size = 3;
        P_O_22.SetName("P_O_22");
        pn.PlaceList.add(P_O_22);

        DataCarQueue P_O_23 = new DataCarQueue();
        P_O_23.Value.Size = 3;
        P_O_23.SetName("P_O_23");
        pn.PlaceList.add(P_O_23);

        DataCarQueue P_INT_3 = new DataCarQueue();
        P_INT_3.Value.Size = 20;
        P_INT_3.SetName("P_INT_3");
        pn.PlaceList.add(P_INT_3);

        // LANE 1 INPUT
        PetriTransition T_U_20 = new PetriTransition(pn);
        T_U_20.TransitionName = "T_U_20";
        T_U_20.InputPlaceName.add("P_A_20");
        T_U_20.InputPlaceName.add("P_X_20");

        Condition T_U_20_CT1 = new Condition(T_U_20, "P_A_20", TransitionCondition.NotNull);
        Condition T_U_20_CT2 = new Condition(T_U_20, "P_X_20", TransitionCondition.CanAddCars);
        T_U_20_CT1.SetNextCondition(LogicConnector.AND, T_U_20_CT2);

        GuardMapping grdT_U_20 = new GuardMapping();
        grdT_U_20.condition = T_U_20_CT1;
        grdT_U_20.Activations.add(new Activation(T_U_20, "P_A_20", TransitionOperation.AddElement, "P_X_20"));
        T_U_20.GuardMappingList.add(grdT_U_20);

        T_U_20.Delay = 2;
        pn.Transitions.add(T_U_20);

        PetriTransition T_E_20 = new PetriTransition(pn);
        T_E_20.TransitionName = "T_E_20";
        T_E_20.InputPlaceName.add("P_X_20");

        Condition T_E_20_CT1 = new Condition(T_E_20, "P_X_20", TransitionCondition.HaveCar);

        GuardMapping grdT_E_20 = new GuardMapping();
        grdT_E_20.condition = T_E_20_CT1;
        grdT_E_20.Activations.add(new Activation(T_E_20, "P_X_20", TransitionOperation.PopElementWithoutTarget, "P_B_20"));
        T_E_20.GuardMappingList.add(grdT_E_20);

        Condition T_E_20_CT2 = new Condition(T_E_20, "P_X_20", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_20_1 = new GuardMapping();
        grdT_E_20_1.condition = T_E_20_CT2;
        grdT_E_20_1.Activations.add(new Activation(T_E_20, "P_X_20", TransitionOperation.PopElementWithoutTarget, "P_B_20"));
        T_E_20.GuardMappingList.add(grdT_E_20_1);

        T_E_20.Delay = 2;
        pn.Transitions.add(T_E_20);


        PetriTransition T_I_20 = new PetriTransition(pn);
        T_I_20.TransitionName = "T_I_20";
        T_I_20.InputPlaceName.add("P_B_20");
        T_I_20.InputPlaceName.add("P_INT_3");

        Condition T_I_20_CT1 = new Condition(T_I_20, "P_B_20", TransitionCondition.NotNull);
        Condition T_I_20_CT2 = new Condition(T_I_20, "P_INT_3", TransitionCondition.CanAddCars);
        T_I_20_CT1.SetNextCondition(LogicConnector.AND, T_I_20_CT2);

        GuardMapping grdT_I_20 = new GuardMapping();
        grdT_I_20.condition = T_I_20_CT1;
        grdT_I_20.Activations.add(new Activation(T_I_20, "P_B_20", TransitionOperation.AddElement, "P_INT_3"));
        T_I_20.GuardMappingList.add(grdT_I_20);

        T_I_20.Delay = 2;
        pn.Transitions.add(T_I_20);

        // LANE 2 INPUT
        PetriTransition T_U_21 = new PetriTransition(pn);
        T_U_21.TransitionName = "T_U_21";
        T_U_21.InputPlaceName.add("P_A_21");
        T_U_21.InputPlaceName.add("P_X_21");

        Condition T_U_21_CT1 = new Condition(T_U_21, "P_A_21", TransitionCondition.NotNull);
        Condition T_U_21_CT2 = new Condition(T_U_21, "P_X_21", TransitionCondition.CanAddCars);
        T_U_21_CT1.SetNextCondition(LogicConnector.AND, T_U_21_CT2);

        GuardMapping grdT_U_21 = new GuardMapping();
        grdT_U_21.condition = T_U_21_CT1;
        grdT_U_21.Activations.add(new Activation(T_U_21, "P_A_21", TransitionOperation.AddElement, "P_X_21"));
        T_U_21.GuardMappingList.add(grdT_U_21);

        T_U_21.Delay = 2;
        pn.Transitions.add(T_U_21);

        PetriTransition T_E_21 = new PetriTransition(pn);
        T_E_21.TransitionName = "T_E_21";
        T_E_21.InputPlaceName.add("P_X_21");

        Condition T_E_21_CT1 = new Condition(T_E_21, "P_X_21", TransitionCondition.HaveCar);

        GuardMapping grdT_E_21 = new GuardMapping();
        grdT_E_21.condition = T_E_21_CT1;
        grdT_E_21.Activations.add(new Activation(T_E_21, "P_X_21", TransitionOperation.PopElementWithoutTarget, "P_B_21"));
        T_E_21.GuardMappingList.add(grdT_E_21);

        Condition T_E_21_CT2 = new Condition(T_E_21, "P_X_21", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_21_1 = new GuardMapping();
        grdT_E_21_1.condition = T_E_21_CT2;
        grdT_E_21_1.Activations.add(new Activation(T_E_21, "P_X_21", TransitionOperation.PopElementWithoutTarget, "P_B_21"));
        T_E_21.GuardMappingList.add(grdT_E_21_1);

        T_E_21.Delay = 2;
        pn.Transitions.add(T_E_21);


        PetriTransition T_I_21 = new PetriTransition(pn);
        T_I_21.TransitionName = "T_I_21";
        T_I_21.InputPlaceName.add("P_B_21");
        T_I_21.InputPlaceName.add("P_INT_3");

        Condition T_I_21_CT1 = new Condition(T_I_21, "P_B_21", TransitionCondition.NotNull);
        Condition T_I_21_CT2 = new Condition(T_I_21, "P_INT_3", TransitionCondition.CanAddCars);
        T_I_21_CT1.SetNextCondition(LogicConnector.AND, T_I_21_CT2);

        GuardMapping grdT_I_21 = new GuardMapping();
        grdT_I_21.condition = T_I_21_CT1;
        grdT_I_21.Activations.add(new Activation(T_I_21, "P_B_21", TransitionOperation.AddElement, "P_INT_3"));
        T_I_21.GuardMappingList.add(grdT_I_21);

        T_I_21.Delay = 2;
        pn.Transitions.add(T_I_21);

        // LANE 3 INPUT
        PetriTransition T_U_22 = new PetriTransition(pn);
        T_U_22.TransitionName = "T_U_22";
        T_U_22.InputPlaceName.add("P_A_22");
        T_U_22.InputPlaceName.add("P_X_22");

        Condition T_U_22_CT1 = new Condition(T_U_22, "P_A_22", TransitionCondition.NotNull);
        Condition T_U_22_CT2 = new Condition(T_U_22, "P_X_22", TransitionCondition.CanAddCars);
        T_U_22_CT1.SetNextCondition(LogicConnector.AND, T_U_22_CT2);

        GuardMapping grdT_U_22 = new GuardMapping();
        grdT_U_22.condition = T_U_22_CT1;
        grdT_U_22.Activations.add(new Activation(T_U_22, "P_A_22", TransitionOperation.AddElement, "P_X_22"));
        T_U_22.GuardMappingList.add(grdT_U_22);

        T_U_22.Delay = 2;
        pn.Transitions.add(T_U_22);

        PetriTransition T_E_22 = new PetriTransition(pn);
        T_E_22.TransitionName = "T_E_22";
        T_E_22.InputPlaceName.add("P_X_22");

        Condition T_E_22_CT1 = new Condition(T_E_22, "P_X_22", TransitionCondition.HaveCar);

        GuardMapping grdT_E_22 = new GuardMapping();
        grdT_E_22.condition = T_E_22_CT1;
        grdT_E_22.Activations.add(new Activation(T_E_22, "P_X_22", TransitionOperation.PopElementWithoutTarget, "P_B_22"));
        T_E_22.GuardMappingList.add(grdT_E_22);

        Condition T_E_22_CT2 = new Condition(T_E_22, "P_X_22", TransitionCondition.HavePriorityCar);
        GuardMapping grdT_E_22_1 = new GuardMapping();
        grdT_E_22_1.condition = T_E_22_CT2;
        grdT_E_22_1.Activations.add(new Activation(T_E_22, "P_X_22", TransitionOperation.PopElementWithoutTarget, "P_B_22"));
        T_E_22.GuardMappingList.add(grdT_E_22_1);

        T_E_22.Delay = 2;
        pn.Transitions.add(T_E_22);


        PetriTransition T_I_22 = new PetriTransition(pn);
        T_I_22.TransitionName = "T_I_22";
        T_I_22.InputPlaceName.add("P_B_22");
        T_I_22.InputPlaceName.add("P_INT_3");

        Condition T_I_22_CT1 = new Condition(T_I_22, "P_B_22", TransitionCondition.NotNull);
        Condition T_I_22_CT2 = new Condition(T_I_22, "P_INT_3", TransitionCondition.CanAddCars);
        T_I_22_CT1.SetNextCondition(LogicConnector.AND, T_I_22_CT2);

        GuardMapping grdT_I_22 = new GuardMapping();
        grdT_I_22.condition = T_I_22_CT1;
        grdT_I_22.Activations.add(new Activation(T_I_22, "P_B_22", TransitionOperation.AddElement, "P_INT_3"));
        T_I_22.GuardMappingList.add(grdT_I_22);

        T_I_22.Delay = 2;
        pn.Transitions.add(T_I_22);


        // LANE 1 EXiT
        PetriTransition T_O_20 = new PetriTransition(pn);
        T_O_20.TransitionName = "T_O_20";
        T_O_20.InputPlaceName.add("P_INT_3");
        T_O_20.InputPlaceName.add("P_O_20");

        Condition T_O_20_CT1 = new Condition(T_O_20, "P_INT_3", TransitionCondition.HaveCarForMe);
        Condition T_O_20_CT2 = new Condition(T_O_20, "P_O_20", TransitionCondition.CanAddCars);
        T_O_20_CT1.SetNextCondition(LogicConnector.AND, T_O_20_CT2);

        GuardMapping grdT_O_20 = new GuardMapping();
        grdT_O_20.condition = T_O_20_CT1;
        grdT_O_20.Activations.add(new Activation(T_O_20, "P_INT_3", TransitionOperation.PopElementWithTargetToQueue, "P_O_20"));
        T_O_20.GuardMappingList.add(grdT_O_20);

        T_O_20.Delay = 1;
        pn.Transitions.add(T_O_20);

        PetriTransition T_OE_20 = new PetriTransition(pn);
        T_OE_20.TransitionName = "T_OE_20";
        T_OE_20.InputPlaceName.add("P_O_20");

        Condition T_OE_20_CT1 = new Condition(T_OE_20, "P_O_20", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_20 = new GuardMapping();

        grdT_OE_20.condition = T_OE_20_CT1;
        grdT_OE_20.Activations.add(new Activation(T_OE_20, "P_O_20", TransitionOperation.PopElementWithoutTarget, "P_OE_20"));
        T_OE_20.GuardMappingList.add(grdT_OE_20);

        T_OE_20.Delay = 2;
        pn.Transitions.add(T_OE_20);

        // LANE 2 EXiT
        PetriTransition T_O_21 = new PetriTransition(pn);
        T_O_21.TransitionName = "T_O_21";
        T_O_21.InputPlaceName.add("P_INT_3");
        T_O_21.InputPlaceName.add("P_O_21");

        Condition T_O_21_CT1 = new Condition(T_O_21, "P_INT_3", TransitionCondition.HaveCarForMe);
        Condition T_O_21_CT2 = new Condition(T_O_21, "P_O_21", TransitionCondition.CanAddCars);
        T_O_21_CT1.SetNextCondition(LogicConnector.AND, T_O_21_CT2);

        GuardMapping grdT_O_21 = new GuardMapping();
        grdT_O_21.condition = T_O_21_CT1;
        grdT_O_21.Activations.add(new Activation(T_O_21, "P_INT_3", TransitionOperation.PopElementWithTargetToQueue, "P_O_21"));
        T_O_21.GuardMappingList.add(grdT_O_21);

        T_O_21.Delay = 1;
        pn.Transitions.add(T_O_21);


        PetriTransition T_OE_21 = new PetriTransition(pn);
        T_OE_21.TransitionName = "T_OE_21";
        T_OE_21.InputPlaceName.add("P_O_21");

        Condition T_OE_21_CT1 = new Condition(T_OE_21, "P_O_21", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_21 = new GuardMapping();
        grdT_OE_21.condition = T_OE_21_CT1;
        grdT_OE_21.Activations.add(new Activation(T_OE_21, "P_O_21", TransitionOperation.PopElementWithoutTarget, "P_OE_21"));
        T_OE_21.GuardMappingList.add(grdT_OE_21);

        T_OE_21.Delay = 2;
        pn.Transitions.add(T_OE_21);

        // LANE 3 EXiT
        PetriTransition T_O_22 = new PetriTransition(pn);
        T_O_22.TransitionName = "T_O_22";
        T_O_22.InputPlaceName.add("P_INT_3");
        T_O_22.InputPlaceName.add("P_O_22");

        Condition T_O_22_CT1 = new Condition(T_O_22, "P_INT_3", TransitionCondition.HaveCarForMe);
        Condition T_O_22_CT2 = new Condition(T_O_22, "P_O_22", TransitionCondition.CanAddCars);
        T_O_22_CT1.SetNextCondition(LogicConnector.AND, T_O_22_CT2);

        GuardMapping grdT_O_22 = new GuardMapping();
        grdT_O_22.condition = T_O_22_CT1;
        grdT_O_22.Activations.add(new Activation(T_O_22, "P_INT_3", TransitionOperation.PopElementWithTargetToQueue, "P_O_22"));
        T_O_22.GuardMappingList.add(grdT_O_22);

        T_O_22.Delay = 1;
        pn.Transitions.add(T_O_22);

        PetriTransition T_OE_22 = new PetriTransition(pn);
        T_OE_22.TransitionName = "T_OE_22";
        T_OE_22.InputPlaceName.add("P_O_22");

        Condition T_OE_22_CT1 = new Condition(T_OE_22, "P_O_22", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_22 = new GuardMapping();
        grdT_OE_22.condition = T_OE_22_CT1;
        grdT_OE_22.Activations.add(new Activation(T_OE_22, "P_O_22", TransitionOperation.PopElementWithoutTarget, "P_OE_22"));
        T_OE_22.GuardMappingList.add(grdT_OE_22);

        T_OE_22.Delay = 2;
        pn.Transitions.add(T_OE_22);

        // LANE 4 EXiT
        PetriTransition T_O_23 = new PetriTransition(pn);
        T_O_23.TransitionName = "T_O_23";
        T_O_23.InputPlaceName.add("P_INT_3");
        T_O_23.InputPlaceName.add("P_O_23");

        Condition T_O_23_CT1 = new Condition(T_O_23, "P_INT_3", TransitionCondition.HaveCarForMe);
        Condition T_O_23_CT2 = new Condition(T_O_23, "P_O_23", TransitionCondition.CanAddCars);
        T_O_23_CT1.SetNextCondition(LogicConnector.AND, T_O_23_CT2);

        GuardMapping grdT_O_23 = new GuardMapping();
        grdT_O_23.condition = T_O_23_CT1;
        grdT_O_23.Activations.add(new Activation(T_O_23, "P_INT_3", TransitionOperation.PopElementWithTargetToQueue, "P_O_23"));
        T_O_23.GuardMappingList.add(grdT_O_23);

        T_O_23.Delay = 1;
        pn.Transitions.add(T_O_23);


        PetriTransition T_OE_23 = new PetriTransition(pn);
        T_OE_23.TransitionName = "T_OE_23";
        T_OE_23.InputPlaceName.add("P_O_23");

        Condition T_OE_23_CT1 = new Condition(T_OE_23, "P_O_23", TransitionCondition.HaveCar);

        GuardMapping grdT_OE_23 = new GuardMapping();
        grdT_OE_23.condition = T_OE_23_CT1;
        grdT_OE_23.Activations.add(new Activation(T_OE_23, "P_O_23", TransitionOperation.PopElementWithoutTarget, "P_OE_23"));
        T_OE_23.GuardMappingList.add(grdT_OE_23);

        T_OE_23.Delay = 2;
        pn.Transitions.add(T_OE_23);

        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Intersection 3 started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
