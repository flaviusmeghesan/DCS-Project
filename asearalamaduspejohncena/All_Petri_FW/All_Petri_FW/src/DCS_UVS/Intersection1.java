package DCS_UVS;

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
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Main Petri";
        pn.NetworkPort = 1080;

        // INTERSECTION 1 DEFINITION
        DataTransfer OP_1 = new DataTransfer();
        OP_1.SetName("OP_1");
        OP_1.Value = new TransferOperation("localhost","1081","in1");
        pn.PlaceList.add(OP_1);

        DataTransfer OP_2 = new DataTransfer();
        OP_2.SetName("OP_2");
        OP_2.Value = new TransferOperation("localhost","1082","in2");
        pn.PlaceList.add(OP_2);

        DataTransfer OP_3 = new DataTransfer();
        OP_3.SetName("OP_3");
        OP_3.Value = new TransferOperation("localhost","1083","in3");
        pn.PlaceList.add(OP_3);

        DataCar P_A_1 = new DataCar();
        P_A_1.SetName("P_A_1");
        pn.PlaceList.add(P_A_1);

        DataCar P_A_2 = new DataCar();
        P_A_2.SetName("P_A_2");
        pn.PlaceList.add(P_A_2);

        DataCar P_A_3 = new DataCar();
        P_A_3.SetName("P_A_3");
        pn.PlaceList.add(P_A_3);

        DataCar P_A1_3 = new DataCar();
        P_A1_3.SetName("P_A1_3");
        pn.PlaceList.add(P_A1_3);

        DataCar P_B_1 = new DataCar();
        P_B_1.SetName("P_B_1");
        pn.PlaceList.add(P_B_1);

        DataCar P_B_2 = new DataCar();
        P_B_2.SetName("P_B_2");
        pn.PlaceList.add(P_B_2);

        DataCar P_B_3 = new DataCar();
        P_B_3.SetName("P_B_3");
        pn.PlaceList.add(P_B_3);

        DataCarQueue P_O_1 = new DataCarQueue();
        P_O_1.Value.Size = 3;
        P_O_1.SetName("P_O_1");
        pn.PlaceList.add(P_O_1);

        DataCarQueue P_O_2 = new DataCarQueue();
        P_O_2.Value.Size = 3;
        P_O_2.SetName("P_O_2");
        pn.PlaceList.add(P_O_2);

        DataCarQueue P_O_4 = new DataCarQueue();
        P_O_4.Value.Size = 3;
        P_O_4.SetName("P_O_4");
        pn.PlaceList.add(P_O_4);

        DataCarQueue P_O_5 = new DataCarQueue();
        P_O_5.Value.Size = 3;
        P_O_5.SetName("P_O_5");
        pn.PlaceList.add(P_O_5);

        DataCar P_OE_1 = new DataCar();
        P_OE_1.SetName("P_OE_1");
        pn.PlaceList.add(P_OE_1);

        DataCar P_OE_2 = new DataCar();
        P_OE_2.SetName("P_OE_2");
        pn.PlaceList.add(P_OE_2);

        DataCar P_OE_4 = new DataCar();
        P_OE_4.SetName("P_OE_4");
        pn.PlaceList.add(P_OE_4);

        DataCar P_OE1_4 = new DataCar();
        P_OE1_4.SetName("P_OE1_4");
        pn.PlaceList.add(P_OE1_4);

        DataString P_TL_1 = new DataString();
        P_TL_1.SetName("P_TL_1");
        P_TL_1.SetValue("red");
        pn.PlaceList.add(P_TL_1);

        DataString P_TL_2 = new DataString();
        P_TL_2.SetName("P_TL_2");
        P_TL_2.SetValue("red");
        pn.PlaceList.add(P_TL_2);

        DataString P_TL_3 = new DataString();
        P_TL_3.SetName("P_TL_3");
        P_TL_3.SetValue("red");
        pn.PlaceList.add(P_TL_3);

        DataCarQueue P_STATION_3 = new DataCarQueue();
        P_STATION_3.Value.Size = 3;
        P_STATION_3.SetName("P_STATION_3");
        pn.PlaceList.add(P_STATION_3);

        DataCarQueue P_STATION_4 = new DataCarQueue();
        P_STATION_4.Value.Size = 3;
        P_STATION_4.SetName("P_STATION_3");
        pn.PlaceList.add(P_STATION_4);

        DataCarQueue P_X_1 = new DataCarQueue();
        P_X_1.Value.Size = 3;
        P_X_1.SetName("P_X_1");
        pn.PlaceList.add(P_X_1);

        DataCarQueue P_X_2 = new DataCarQueue();
        P_X_2.Value.Size = 3;
        P_X_2.SetName("P_X_2");
        pn.PlaceList.add(P_X_2);

        DataCarQueue P_X_3 = new DataCarQueue();
        P_X_3.Value.Size = 3;
        P_X_3.SetName("P_X_3");
        pn.PlaceList.add(P_X_3);

        DataCarQueue P_X1_3 = new DataCarQueue();
        P_X1_3.Value.Size = 3;
        P_X1_3.SetName("P_X1_3");
        pn.PlaceList.add(P_X1_3);

        DataCarQueue P_X2_3 = new DataCarQueue();
        P_X2_3.Value.Size = 3;
        P_X2_3.SetName("P_X2_3");
        pn.PlaceList.add(P_X2_3);

        DataCarQueue P_X1_4 = new DataCarQueue();
        P_X1_4.Value.Size = 3;
        P_X1_4.SetName("P_X1_4");
        pn.PlaceList.add(P_X1_4);

        DataCarQueue P_X2_4 = new DataCarQueue();
        P_X2_4.Value.Size = 3;
        P_X2_4.SetName("P_X2_4");
        pn.PlaceList.add(P_X2_4);

        DataCarQueue P_INT_1 = new DataCarQueue();
        P_INT_1.Value.Size = 20;
        P_INT_1.SetName("P_INT_1");
        pn.PlaceList.add(P_INT_1);

        DataString full = new DataString();
        full.SetName("full");
        full.SetValue("full");
        pn.ConstantPlaceList.add(full);

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

        // END OF INTERSECTION 1 DEFINITION

        // LANE 1 INPUT
        PetriTransition T_U_1 = new PetriTransition(pn);
        T_U_1.TransitionName = "T_U_1";
        T_U_1.InputPlaceName.add("P_A_1");
        T_U_1.InputPlaceName.add("P_X_1");

        Condition T_U_1_CT1 = new Condition(T_U_1, "P_A_1", TransitionCondition.NotNull);
        Condition T_U_1_CT2 = new Condition(T_U_1, "P_X_1", TransitionCondition.CanAddCars);
        T_U_1_CT1.SetNextCondition(LogicConnector.AND,T_U_1_CT2);

        GuardMapping grd_T_U_1 = new GuardMapping();

        grd_T_U_1.condition= T_U_1_CT1;
        grd_T_U_1.Activations.add(new Activation(T_U_1, "P_A_1", TransitionOperation.AddElement,"P_X_1"));
        T_U_1.GuardMappingList.add(grd_T_U_1);

        T_U_1.Delay = 2;
        pn.Transitions.add(T_U_1);


        PetriTransition T_E_1 = new PetriTransition(pn);
        T_E_1.TransitionName = "T_E_1";
        T_E_1.InputPlaceName.add("P_X_1");
        T_E_1.InputPlaceName.add("P_TL_1");

        Condition T_E_1_CT1 = new Condition(T_E_1, "P_TL_1", TransitionCondition.Equal, "green");
        Condition T_E_1_CT2 = new Condition(T_E_1, "P_X_1", TransitionCondition.HaveCar);
        T_E_1_CT1.SetNextCondition(LogicConnector.AND,T_E_1_CT2);

        GuardMapping grd_T_E_1 = new GuardMapping();
        grd_T_E_1.condition= T_E_1_CT1;
        grd_T_E_1.Activations.add(new Activation(T_E_1, "P_X_1", TransitionOperation.PopElementWithoutTarget, "P_B_1"));
        grd_T_E_1.Activations.add(new Activation(T_E_1, "P_TL_1", TransitionOperation.Move, "P_TL_1"));
        T_E_1.GuardMappingList.add(grd_T_E_1);

        Condition T_E_11_CT1 = new Condition(T_E_1, "P_X_1",TransitionCondition.HavePriorityCar);
        GuardMapping grd_T_E_11 = new GuardMapping();
        grd_T_E_11.condition= T_E_11_CT1;
        grd_T_E_11.Activations.add(new Activation(T_E_1, "P_X_1", TransitionOperation.PopElementWithoutTarget, "P_B_1"));
        grd_T_E_11.Activations.add(new Activation(T_E_1, "P_TL_1", TransitionOperation.Move, "P_TL_1"));
        T_E_1.GuardMappingList.add(grd_T_E_11);

        T_E_1.Delay = 2;
        pn.Transitions.add(T_E_1);


        PetriTransition T_I_1 = new PetriTransition(pn);
        T_I_1.TransitionName = "T_I_1";
        T_I_1.InputPlaceName.add("P_B_1");
        T_I_1.InputPlaceName.add("P_INT_1");

        Condition T_I_1_CT1 = new Condition(T_I_1, "P_B_1", TransitionCondition.NotNull);
        Condition T_I_1_CT2 = new Condition(T_I_1, "P_INT_1", TransitionCondition.CanAddCars);
        T_I_1_CT1.SetNextCondition(LogicConnector.AND,T_I_1_CT2);

        GuardMapping grd_T_I_1 = new GuardMapping();
        grd_T_I_1.condition = T_I_1_CT1;
        grd_T_I_1.Activations.add(new Activation(T_I_1, "P_B_1", TransitionOperation.AddElement,"P_INT_1"));
        T_I_1.GuardMappingList.add(grd_T_I_1);

        T_I_1.Delay = 2;
        pn.Transitions.add(T_I_1);


        PetriTransition T_OUT_1 = new PetriTransition(pn);
        T_OUT_1.TransitionName = "T_OUT_1";
        T_OUT_1.InputPlaceName.add("P_A_1");
        T_OUT_1.InputPlaceName.add("P_X_1");
        T_OUT_1.IsAsync = true;

        Condition T_OUT_1_CT1 = new Condition(T_OUT_1, "P_A_1", TransitionCondition.NotNull);
        Condition T_OUT_1_CT2 = new Condition(T_OUT_1, "P_X_1", TransitionCondition.CanNotAddCars);
        T_OUT_1_CT1.SetNextCondition(LogicConnector.AND,T_OUT_1_CT2);

        GuardMapping grd_T_OUT_1 = new GuardMapping();
        grd_T_OUT_1.condition = T_OUT_1_CT1;
        grd_T_OUT_1.Activations.add(new Activation(T_OUT_1, "full", TransitionOperation.SendOverNetwork,"OP_1"));
        T_OUT_1.GuardMappingList.add(grd_T_OUT_1);

        T_OUT_1.Delay = 2;
        pn.Transitions.add(T_OUT_1);


        // LANE 1 EXIT
        PetriTransition T_O_1 = new PetriTransition(pn);
        T_O_1.TransitionName = "T_O_1";
        T_O_1.InputPlaceName.add("P_INT_1");
        T_O_1.InputPlaceName.add("P_O_1");

        Condition T_O_1_CT1 = new Condition(T_O_1, "P_INT_1", TransitionCondition.HaveCarForMe);
        Condition T_O_1_CT2 = new Condition(T_O_1, "P_O_1", TransitionCondition.CanAddCars);
        T_O_1_CT1.SetNextCondition(LogicConnector.AND,T_O_1_CT2);

        GuardMapping grd_T_O_1 = new GuardMapping();
        grd_T_O_1.condition= T_O_1_CT1;
        grd_T_O_1.Activations.add(new Activation(T_O_1, "P_INT_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_1"));
        T_O_1.GuardMappingList.add(grd_T_O_1);

        T_O_1.Delay = 1;
        pn.Transitions.add(T_O_1);

        PetriTransition T_OE_1 = new PetriTransition(pn);
        T_OE_1.TransitionName = "T_OE_1";
        T_OE_1.InputPlaceName.add("P_O_1");
        Condition T_OE_1_CT1 = new Condition(T_OE_1, "P_O_1", TransitionCondition.HaveCar);

        GuardMapping grd_T_OE_1 = new GuardMapping();
        grd_T_OE_1.condition= T_OE_1_CT1;
        grd_T_OE_1.Activations.add(new Activation(T_OE_1, "P_O_1", TransitionOperation.PopElementWithoutTarget,"P_OE_1"));

        T_OE_1.GuardMappingList.add(grd_T_OE_1);
        T_OE_1.Delay = 2;
        pn.Transitions.add(T_OE_1);


        // LANE 2 INPUT
        PetriTransition T_U_2 = new PetriTransition(pn);
        T_U_2.TransitionName = "T_U_2";
        T_U_2.InputPlaceName.add("P_A_2");
        T_U_2.InputPlaceName.add("P_X_2");

        Condition T_U_2_CT1 = new Condition(T_U_2, "P_A_2", TransitionCondition.NotNull);
        Condition T_U_2_CT2 = new Condition(T_U_2, "P_X_2", TransitionCondition.CanAddCars);
        T_U_2_CT1.SetNextCondition(LogicConnector.AND,T_U_2_CT2);

        GuardMapping grd_T_U_2 = new GuardMapping();

        grd_T_U_2.condition= T_U_2_CT1;
        grd_T_U_2.Activations.add(new Activation(T_U_2, "P_A_2", TransitionOperation.AddElement,"P_X_2"));
        T_U_2.GuardMappingList.add(grd_T_U_2);

        T_U_2.Delay = 2;
        pn.Transitions.add(T_U_2);


        PetriTransition T_E_2 = new PetriTransition(pn);
        T_E_2.TransitionName = "T_E_2";
        T_E_2.InputPlaceName.add("P_X_2");
        T_E_2.InputPlaceName.add("P_TL_2");

        Condition T_E_2_CT1 = new Condition(T_E_2, "P_TL_2", TransitionCondition.Equal, "green");
        Condition T_E_2_CT2 = new Condition(T_E_2, "P_X_2", TransitionCondition.HaveCar);
        T_E_2_CT1.SetNextCondition(LogicConnector.AND,T_E_2_CT2);

        GuardMapping grd_T_E_2 = new GuardMapping();
        grd_T_E_2.condition= T_E_2_CT1;
        grd_T_E_2.Activations.add(new Activation(T_E_2, "P_X_2", TransitionOperation.PopElementWithoutTarget, "P_B_2"));
        grd_T_E_2.Activations.add(new Activation(T_E_2, "P_TL_2", TransitionOperation.Move, "P_TL_2"));
        T_E_2.GuardMappingList.add(grd_T_E_2);

        Condition T_E_21_CT1 = new Condition(T_E_2, "P_X_2",TransitionCondition.HavePriorityCar);
        GuardMapping grd_T_E_21 = new GuardMapping();
        grd_T_E_21.condition= T_E_21_CT1;
        grd_T_E_21.Activations.add(new Activation(T_E_2, "P_X_2", TransitionOperation.PopElementWithoutTarget, "P_B_2"));
        grd_T_E_21.Activations.add(new Activation(T_E_2, "P_TL_2", TransitionOperation.Move, "P_TL_2"));
        T_E_2.GuardMappingList.add(grd_T_E_21);

        T_E_2.Delay = 2;
        pn.Transitions.add(T_E_2);



        PetriTransition T_I_2 = new PetriTransition(pn);
        T_I_2.TransitionName = "T_I_2";
        T_I_2.InputPlaceName.add("P_B_2");
        T_I_2.InputPlaceName.add("P_INT_2");

        Condition T_I_2_CT1 = new Condition(T_I_2, "P_B_2", TransitionCondition.NotNull);
        Condition T_I_2_CT2 = new Condition(T_I_2, "P_INT_1", TransitionCondition.CanAddCars);
        T_I_2_CT1.SetNextCondition(LogicConnector.AND,T_I_2_CT2);

        GuardMapping grd_T_I_2 = new GuardMapping();
        grd_T_I_2.condition= T_I_2_CT1;
        grd_T_I_2.Activations.add(new Activation(T_I_2, "P_B_2", TransitionOperation.AddElement,"P_INT_1"));
        T_I_2.GuardMappingList.add(grd_T_I_2);

        T_I_2.Delay = 2;
        pn.Transitions.add(T_I_2);


        PetriTransition T_OUT_2 = new PetriTransition(pn);
        T_OUT_2.TransitionName = "T_OUT_2";
        T_OUT_2.InputPlaceName.add("P_A_2");
        T_OUT_2.InputPlaceName.add("P_X_2");
        T_OUT_2.IsAsync = true;

        Condition T_OUT_2_CT1 = new Condition(T_OUT_2, "P_A_2", TransitionCondition.NotNull);
        Condition T_OUT_2_CT2 = new Condition(T_OUT_2, "P_X_2", TransitionCondition.CanNotAddCars);
        T_OUT_2_CT1.SetNextCondition(LogicConnector.AND,T_OUT_2_CT2);

        GuardMapping grd_T_OUT_2 = new GuardMapping();
        grd_T_OUT_2.condition= T_OUT_2_CT1;
        grd_T_OUT_2.Activations.add(new Activation(T_OUT_2, "full", TransitionOperation.SendOverNetwork,"OP_2"));
        T_OUT_2.GuardMappingList.add(grd_T_OUT_2);

        T_OUT_2.Delay = 0;
        pn.Transitions.add(T_OUT_2);

        // LANE 2 EXIT

        PetriTransition T_O_2 = new PetriTransition(pn);
        T_O_2.TransitionName = "T_O_2";
        T_O_2.InputPlaceName.add("P_INT_1");
        T_O_2.InputPlaceName.add("P_O_2");

        Condition T_O_2_CT1 = new Condition(T_O_2, "P_INT_1", TransitionCondition.HaveCarForMe);
        Condition T_O_2_CT2 = new Condition(T_O_2, "P_O_2", TransitionCondition.CanAddCars);
        T_O_2_CT1.SetNextCondition(LogicConnector.AND,T_O_2_CT2);

        GuardMapping grd_T_O_2 = new GuardMapping();
        grd_T_O_2.condition= T_O_2_CT1;
        grd_T_O_2.Activations.add(new Activation(T_O_2, "P_INT_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_2"));
        T_O_2.GuardMappingList.add(grd_T_O_2);

        T_O_2.Delay = 1;
        pn.Transitions.add(T_O_2);

        PetriTransition T_OE_2 = new PetriTransition(pn);
        T_OE_2.TransitionName = "T_OE_2";
        T_OE_2.InputPlaceName.add("P_O_2");
        Condition T_OE_2_CT1 = new Condition(T_OE_2, "P_O_2", TransitionCondition.HaveCar);

        GuardMapping grd_T_OE_2 = new GuardMapping();
        grd_T_OE_2.condition = T_OE_2_CT1;
        grd_T_OE_2.Activations.add(new Activation(T_OE_2, "P_O_2", TransitionOperation.PopElementWithoutTarget,"P_OE_2"));

        T_OE_2.GuardMappingList.add(grd_T_OE_2);
        T_OE_2.Delay = 2;
        pn.Transitions.add(T_OE_2);


        // LANE 3 INPUT
        PetriTransition T_U1_3 = new PetriTransition(pn);
        T_U1_3.TransitionName = "T_U1_3";
        T_U1_3.InputPlaceName.add("P_A1_3");
        T_U1_3.InputPlaceName.add("P_X1_3");

        Condition T_U1_3_CT1 = new Condition(T_U1_3, "P_A1_3", TransitionCondition.NotNull);
        Condition T_U1_3_CT2 = new Condition(T_U1_3, "P_X1_3", TransitionCondition.CanAddCars);
        T_U1_3_CT1.SetNextCondition(LogicConnector.AND,T_U1_3_CT2);

        GuardMapping grd_T_U1_3 = new GuardMapping();
        grd_T_U1_3.condition = T_U1_3_CT1;
        grd_T_U1_3.Activations.add(new Activation(T_U1_3, "P_A1_3", TransitionOperation.AddElement,"P_X1_3"));

        Condition T_U1_31_CT1 = new Condition(T_U1_3, "P_A1_3", TransitionCondition.NotNull);
        Condition T_U1_31_CT2 = new Condition(T_U1_3, "P_X1_3", TransitionCondition.CanAddCars);
        Condition T_U1_31_CT3 = new Condition(T_U1_3, "P_X1_3", TransitionCondition.isPriorityCar);
        T_U1_31_CT2.SetNextCondition(LogicConnector.AND,T_U1_31_CT3);
        T_U1_31_CT1.SetNextCondition(LogicConnector.AND,T_U1_31_CT2);

        GuardMapping grd_T_U1_31 = new GuardMapping();
        grd_T_U1_31.condition = T_U1_31_CT1;
        grd_T_U1_31.Activations.add(new Activation(T_U1_3, "P_A1_3", TransitionOperation.AddElement,"P_X1_3"));

        T_U1_3.GuardMappingList.add(grd_T_U1_3);
        T_U1_3.GuardMappingList.add(grd_T_U1_31);

        T_U1_3.Delay = 2;
        pn.Transitions.add(T_U1_3);


        PetriTransition T_S_3 = new PetriTransition(pn);
        T_S_3.TransitionName = "T_S_3";
        T_S_3.InputPlaceName.add("P_X1_3");

        Condition T_S_3_CT1 = new Condition(T_S_3, "P_X1_3", TransitionCondition.isBus);
        Condition T_S_3_CT2 = new Condition(T_S_3, "P_STATION_3", TransitionCondition.HaveCarForMe);
        T_S_3_CT1.SetNextCondition(LogicConnector.AND,T_S_3_CT2);

        GuardMapping grd_T_S_3 = new GuardMapping();
        grd_T_S_3.condition = T_S_3_CT1;
        grd_T_S_3.Activations.add(new Activation(T_S_3, "P_X1_3", TransitionOperation.PopElementWithTargetToQueue,"P_STATION_3"));

        T_S_3.GuardMappingList.add(grd_T_S_3);
        T_S_3.Delay = 2;
        pn.Transitions.add(T_S_3);

        PetriTransition T_ES_3 = new PetriTransition(pn);
        T_ES_3.TransitionName = "T_ES_3";
        T_ES_3.InputPlaceName.add("P_STATION_3");
        T_ES_3.InputPlaceName.add("P_X2_3");

        Condition T_ES_3_CT1 = new Condition(T_ES_3, "P_STATION_3", TransitionCondition.HaveCar);
        Condition T_ES_3_CT2 = new Condition(T_ES_3, "P_X2_3", TransitionCondition.CanAddCars);
        T_ES_3_CT1.SetNextCondition(LogicConnector.AND,T_ES_3_CT2);

        GuardMapping grd_T_ES_3 = new GuardMapping();
        grd_T_ES_3.condition= T_ES_3_CT1;
        grd_T_ES_3.Activations.add(new Activation(T_ES_3, "P_STATION_3", TransitionOperation.PopElementWithTargetToQueue,"P_X2_3"));

        T_ES_3.GuardMappingList.add(grd_T_ES_3);
        T_ES_3.Delay = 2;

        pn.Transitions.add(T_ES_3);


        PetriTransition T_C_3 = new PetriTransition(pn);
        T_C_3.TransitionName = "T_C_3";
        T_C_3.InputPlaceName.add("P_X1_3");
        T_C_3.InputPlaceName.add("P_X2_3");

        Condition T_C_3_CT1 = new Condition(T_C_3, "P_X1_3", TransitionCondition.HaveCarForMe);
        Condition T_C_3_CT2 = new Condition(T_C_3, "P_X2_3", TransitionCondition.CanAddCars);
        T_C_3_CT1.SetNextCondition(LogicConnector.AND,T_C_3_CT2);

        GuardMapping grd_T_C_3 = new GuardMapping();
        grd_T_C_3.condition = T_C_3_CT1;
        grd_T_C_3.Activations.add(new Activation(T_C_3, "P_X1_3", TransitionOperation.PopElementWithTargetToQueue,"P_X2_3"));

        T_C_3.GuardMappingList.add(grd_T_C_3);

        T_C_3.Delay = 2;
        pn.Transitions.add(T_C_3);


        PetriTransition T_U2_3 = new PetriTransition(pn);
        T_U2_3.TransitionName = "T_U2_3";
        T_U2_3.InputPlaceName.add("P_X2_3");

        Condition T_U2_3_CT1 = new Condition(T_U2_3, "P_X2_3", TransitionCondition.HaveCar);

        GuardMapping grd_T_U2_3 = new GuardMapping();
        grd_T_U2_3.condition = T_U2_3_CT1;
        grd_T_U2_3.Activations.add(new Activation(T_U2_3, "P_X2_4", TransitionOperation.PopElementWithoutTarget,"P_A_3"));

        T_U2_3.GuardMappingList.add(grd_T_U2_3);
        T_U2_3.Delay = 2;

        pn.Transitions.add(T_U2_3);

        PetriTransition T_U_3 = new PetriTransition(pn);
        T_U_3.TransitionName = "T_U_3";
        T_U_3.InputPlaceName.add("P_A_3");
        T_U_3.InputPlaceName.add("P_X_3");

        Condition T_U_3_CT1 = new Condition(T_U_3, "P_A_3", TransitionCondition.NotNull);
        Condition T_U_3_CT2 = new Condition(T_U_3, "P_X_3", TransitionCondition.CanAddCars);
        T_U_3_CT1.SetNextCondition(LogicConnector.AND,T_U_3_CT2);

        GuardMapping grd_T_U_3 = new GuardMapping();
        grd_T_U_3.condition = T_U_3_CT1;
        grd_T_U_3.Activations.add(new Activation(T_U_3, "P_A_3", TransitionOperation.AddElement,"P_X_3"));

        T_U_3.GuardMappingList.add(grd_T_U_3);

        T_U_3.Delay = 2;
        pn.Transitions.add(T_U_3);


        PetriTransition T_E_3 = new PetriTransition(pn);
        T_E_3.TransitionName = "T_E_3";
        T_E_3.InputPlaceName.add("P_X_3");
        T_E_3.InputPlaceName.add("P_TL_3");

        Condition T_E_3_CT1 = new Condition(T_E_3, "P_TL_3", TransitionCondition.Equal, "green");
        Condition T_E_3_CT2 = new Condition(T_E_3, "P_X_3", TransitionCondition.HaveCar);
        T_E_3_CT1.SetNextCondition(LogicConnector.AND,T_E_3_CT2);

        GuardMapping grd_T_E_3 = new GuardMapping();
        grd_T_E_3.condition = T_E_3_CT1;
        grd_T_E_3.Activations.add(new Activation(T_E_3, "P_X_3", TransitionOperation.PopElementWithoutTarget, "P_B_3"));
        grd_T_E_3.Activations.add(new Activation(T_E_3, "P_TL_3", TransitionOperation.Move, "P_TL_3"));

        T_E_3.GuardMappingList.add(grd_T_E_3);

        Condition T_E_31_CT1 = new Condition(T_E_3, "P_X_3", TransitionCondition.HavePriorityCar);
        GuardMapping grd_T_E_31 = new GuardMapping();
        grd_T_E_31.condition = T_E_31_CT1;

        grd_T_E_31.Activations.add(new Activation(T_E_3, "P_X_3", TransitionOperation.PopElementWithoutTarget, "P_B_3"));
        grd_T_E_31.Activations.add(new Activation(T_E_3, "P_TL_3", TransitionOperation.Move, "P_TL_3"));

        T_E_3.GuardMappingList.add(grd_T_E_31);

        T_E_3.Delay = 2;
        pn.Transitions.add(T_E_3);


        PetriTransition T_OUT_3 = new PetriTransition(pn);
        T_OUT_3.TransitionName = "T_OUT_3";
        T_OUT_3.InputPlaceName.add("P_A_3");
        T_OUT_3.InputPlaceName.add("P_X_3");
        T_OUT_3.IsAsync = true;

        Condition T_OUT_3_CT1 = new Condition(T_OUT_3, "P_A_3", TransitionCondition.NotNull);
        Condition T_OUT_3_CT2 = new Condition(T_OUT_3, "P_X_3", TransitionCondition.CanNotAddCars);
        T_OUT_3_CT1.SetNextCondition(LogicConnector.AND,T_OUT_3_CT2);

        GuardMapping grd_T_OUT_3 = new GuardMapping();
        grd_T_OUT_3.condition = T_OUT_3_CT1;
        grd_T_OUT_3.Activations.add(new Activation(T_OUT_3, "full", TransitionOperation.SendOverNetwork,"OP_3"));
        T_OUT_3.GuardMappingList.add(grd_T_OUT_3);

        T_OUT_3.Delay = 2;
        pn.Transitions.add(T_OUT_3);

        PetriTransition T_I_3 = new PetriTransition(pn);
        T_I_3.TransitionName = "T_I_3";
        T_I_3.InputPlaceName.add("P_B_3");
        T_I_3.InputPlaceName.add("P_INT_1");

        Condition T_I_3_CT1 = new Condition(T_I_3, "P_B_3", TransitionCondition.NotNull);
        Condition T_I_3_CT2 = new Condition(T_I_3, "P_INT_1", TransitionCondition.CanAddCars);
        T_I_3_CT1.SetNextCondition(LogicConnector.AND,T_I_3_CT2);

        GuardMapping grd_T_I_3 = new GuardMapping();
        grd_T_I_3.condition = T_I_3_CT1;
        grd_T_I_3.Activations.add(new Activation(T_I_3, "P_B_3", TransitionOperation.AddElement,"P_INT_1"));
        T_I_3.GuardMappingList.add(grd_T_I_3);

        T_I_3.Delay = 2;
        pn.Transitions.add(T_I_3);





        // LANE 5 EXIT
        PetriTransition T_O_5 = new PetriTransition(pn);
        T_O_5.TransitionName = "T_O_5";
        T_O_5.InputPlaceName.add("P_B_3");
        T_O_5.InputPlaceName.add("P_O_5");

        Condition T_O_5_CT1 = new Condition(T_O_5, "P_B_3", TransitionCondition.HaveCarForMe);
        Condition T_O_5_CT2 = new Condition(T_O_5, "P_O_5", TransitionCondition.CanAddCars);
        T_O_5_CT1.SetNextCondition(LogicConnector.AND,T_O_5_CT2);

        GuardMapping grd_T_O_5 = new GuardMapping();
        grd_T_O_5.condition= T_O_5_CT1;
        grd_T_O_5.Activations.add(new Activation(T_O_5, "P_B_3", TransitionOperation.PopElementWithTargetToQueue, "P_O_5"));
        T_O_5.GuardMappingList.add(grd_T_O_5);

        T_O_5.Delay = 1;
        pn.Transitions.add(T_O_5);

        PetriTransition T_OE_5 = new PetriTransition(pn);

        T_OE_5.TransitionName = "T_OE_5";
        T_OE_5.InputPlaceName.add("P_O_5");
        Condition T_OE_5_CT1 = new Condition(T_OE_5, "P_O_5", TransitionCondition.HaveCar);

        GuardMapping grd_T_OE_5 = new GuardMapping();
        grd_T_OE_5.condition= T_OE_5_CT1;
        grd_T_OE_5.Activations.add(new Activation(T_OE_5, "P_O_5", TransitionOperation.PopElementWithoutTarget,"P_OE_5"));

        T_OE_5.GuardMappingList.add(grd_T_OE_5);
        T_OE_5.Delay = 2;

        pn.Transitions.add(T_OE_5);

        // LANE 4 EXIT
        PetriTransition T_O_4 = new PetriTransition(pn);
        T_O_4.TransitionName = "T_O_4";
        T_O_4.InputPlaceName.add("P_INT_1");
        T_O_4.InputPlaceName.add("P_O_4");

        Condition T_O_4_CT1 = new Condition(T_O_4, "P_INT_1", TransitionCondition.HaveCarForMe);
        Condition T_O_4_CT2 = new Condition(T_O_4, "P_O_4", TransitionCondition.CanAddCars);
        T_O_4_CT1.SetNextCondition(LogicConnector.AND,T_O_4_CT2);

        GuardMapping grd_T_O_4 = new GuardMapping();
        grd_T_O_4.condition= T_O_4_CT1;
        grd_T_O_4.Activations.add(new Activation(T_O_4, "P_INT_1", TransitionOperation.PopElementWithTargetToQueue, "P_O_4"));
        T_O_4.GuardMappingList.add(grd_T_O_4);

        T_O_4.Delay = 1;
        pn.Transitions.add(T_O_4);


        PetriTransition T_OE_4 = new PetriTransition(pn);
        T_OE_4.TransitionName = "T_OE_4";
        T_OE_4.InputPlaceName.add("P_O_4");
        Condition T_OE_4_CT1 = new Condition(T_OE_4, "P_O_4", TransitionCondition.HaveCar);

        GuardMapping grd_T_OE_4 = new GuardMapping();
        grd_T_OE_4.condition= T_OE_4_CT1;
        grd_T_OE_4.Activations.add(new Activation(T_OE_4, "P_O_4", TransitionOperation.PopElementWithoutTarget,"P_OE_4"));

        T_OE_4.GuardMappingList.add(grd_T_OE_4);
        T_OE_4.Delay = 2;

        pn.Transitions.add(T_OE_4);


        PetriTransition T_U_4 = new PetriTransition(pn);
        T_U_4.TransitionName = "T_U_4";
        T_U_4.InputPlaceName.add("P_OE_4");
        Condition T_U_4_CT1 = new Condition(T_U_4, "P_OE_4", TransitionCondition.HaveCar);

        GuardMapping grd_T_U_4 = new GuardMapping();
        grd_T_U_4.condition= T_U_4_CT1;
        grd_T_U_4.Activations.add(new Activation(T_U_4, "P_OE_4", TransitionOperation.PopElementWithoutTarget,"P_X1_4"));
        T_U_4.GuardMappingList.add(grd_T_U_4);
        T_U_4.Delay = 2;

        pn.Transitions.add(T_U_4);


        PetriTransition T_S_4 = new PetriTransition(pn);
        T_S_4.TransitionName = "T_S_4";
        T_S_4.InputPlaceName.add("P_X1_4");

        Condition T_S_4_CT1 = new Condition(T_S_4, "P_X1_4", TransitionCondition.isBus);
        Condition T_S_4_CT2 = new Condition(T_S_4, "P_STATION_4", TransitionCondition.HaveCarForMe);
        T_S_4_CT1.SetNextCondition(LogicConnector.AND,T_S_4_CT2);

        GuardMapping grd_T_S_4 = new GuardMapping();
        grd_T_S_4.condition= T_S_4_CT1;
        grd_T_S_4.Activations.add(new Activation(T_S_4, "P_X1_4", TransitionOperation.PopElementWithTargetToQueue,"P_STATION_4"));

        T_S_4.GuardMappingList.add(grd_T_S_4);
        T_S_4.Delay = 2;
        pn.Transitions.add(T_S_4);


        PetriTransition T_ES_4 = new PetriTransition(pn);
        T_ES_4.TransitionName = "T_ES_4";
        T_ES_4.InputPlaceName.add("P_STATION_4");
        T_ES_4.InputPlaceName.add("P_X2_4");

        Condition T_ES_4_CT1 = new Condition(T_ES_4, "P_STATION_4", TransitionCondition.HaveCar);
        Condition T_ES_4_CT2 = new Condition(T_ES_4, "P_X2_4", TransitionCondition.CanAddCars);
        T_ES_4_CT1.SetNextCondition(LogicConnector.AND,T_ES_4_CT2);

        GuardMapping grd_T_ES_4 = new GuardMapping();
        grd_T_ES_4.condition= T_ES_4_CT1;
        grd_T_ES_4.Activations.add(new Activation(T_ES_4, "P_STATION_4", TransitionOperation.PopBusToQueue,"P_X2_4"));

        T_ES_4.GuardMappingList.add(grd_T_ES_4);
        T_ES_4.Delay = 2;

        pn.Transitions.add(T_ES_4);


        PetriTransition T_C_4 = new PetriTransition(pn);
        T_C_4.TransitionName = "T_C_4";
        T_C_4.InputPlaceName.add("P_X1_4");
        T_C_4.InputPlaceName.add("P_X2_4");

        Condition T_C_4_CT1 = new Condition(T_C_4, "P_X1_4", TransitionCondition.HaveCarForMe);
        Condition T_C_4_CT2 = new Condition(T_C_4, "P_X2_4", TransitionCondition.CanAddCars);
        T_C_4_CT1.SetNextCondition(LogicConnector.AND,T_C_4_CT2);

        GuardMapping grd_T_C_4 = new GuardMapping();
        grd_T_C_4.condition = T_C_4_CT1;
        grd_T_C_4.Activations.add(new Activation(T_C_4, "P_X1_4", TransitionOperation.PopElementWithTargetToQueue,"P_X2_4"));

        T_C_4.GuardMappingList.add(grd_T_C_4);

        T_C_4.Delay = 2;
        pn.Transitions.add(T_C_4);


        PetriTransition T_OE1_4 = new PetriTransition(pn);
        T_OE1_4.TransitionName = "T_OE1_4";
        T_OE1_4.InputPlaceName.add("P_X2_4");

        Condition T_OE1_4_CT1 = new Condition(T_OE1_4, "P_X2_4", TransitionCondition.HaveCar);

        GuardMapping grd_T_OE1_4 = new GuardMapping();
        grd_T_OE1_4.condition= T_OE1_4_CT1;
        grd_T_OE1_4.Activations.add(new Activation(T_OE1_4, "P_X2_4", TransitionOperation.PopElementWithoutTarget,"P_OE1_4"));

        T_OE1_4.GuardMappingList.add(grd_T_OE1_4);
        T_OE1_4.Delay = 2;

        pn.Transitions.add(T_OE1_4);

        //-------------------------------------------------------------------------------------
        //----------------------------PN Start-------------------------------------------------
        //-------------------------------------------------------------------------------------

        System.out.println("Intersection 1 started \n ------------------------------");
        pn.Delay = 2000;
        //pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
