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
import javax.xml.crypto.Data;


public class Intersection1 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Main Petri";
        pn.NetworkPort = 1080;

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

        DataCarQueue P_O_3 = new DataCarQueue();
        P_O_3.Value.Size = 3;
        P_O_3.SetName("P_O_3");
        pn.PlaceList.add(P_O_3);

        DataCarQueue P_O_4 = new DataCarQueue();
        P_O_4.Value.Size = 3;
        P_O_4.SetName("P_O_4");
        pn.PlaceList.add(P_O_4);

        DataCar P_OE_1 = new DataCar();
        P_OE_1.SetName("P_OE_1");
        pn.PlaceList.add(P_OE_1);

        DataCar P_OE_2 = new DataCar();
        P_OE_2.SetName("P_OE_2");
        pn.PlaceList.add(P_OE_2);

        DataCar P_OE_3 = new DataCar();
        P_OE_3.SetName("P_OE_3");
        pn.PlaceList.add(P_OE_3);

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


        //lane 1
        PetriTransition T_U_1 = new PetriTransition(pn);
        T_U_1.TransitionName = "T_U_1";
        T_U_1.InputPlaceName.add("P_A_1");
        T_U_1.InputPlaceName.add("P_X_1");

        Condition T_U_1_CT1 = new Condition(T_U_1, "P_A_1", TransitionCondition.NotNull);
        Condition T_U_1_CT2 = new Condition(T_U_1, "P_X_1", TransitionCondition.CanAddCars);
        T_U_1_CT2.SetNextCondition(LogicConnector.AND,T_U_1_CT1);

        GuardMapping grd_T_U_1 = new GuardMapping();

        grd_T_U_1.condition= T_U_1_CT1;
        grd_T_U_1.Activations.add(new Activation(T_U_1, "P_A_1", TransitionOperation.AddElement,"P_X_1"));
        T_U_1.GuardMappingList.add(grd_T_U_1);

        T_U_1.Delay = 2;
        pn.Transitions.add(T_U_1);

        PetriTransition T_I_1 = new PetriTransition(pn);
        T_I_1.TransitionName = "T_I_1";
        T_I_1.InputPlaceName.add("P_B_1");
        T_I_1.InputPlaceName.add("P_INT_1");

        Condition T_I_1_CT1 = new Condition(T_I_1, "P_B_1", TransitionCondition.NotNull);
        Condition T_I_1_CT2 = new Condition(T_I_1, "P_INT_1", TransitionCondition.CanAddCars);
        T_I_1_CT2.SetNextCondition(LogicConnector.AND,T_I_1_CT1);

        GuardMapping grd_T_I_1 = new GuardMapping();
        grd_T_I_1.condition= T_I_1_CT1;
        grd_T_I_1.Activations.add(new Activation(T_I_1, "P_B_1", TransitionOperation.AddElement,"P_INT_1"));
        T_I_1.GuardMappingList.add(grd_T_I_1);

        T_I_1.Delay = 2;
        pn.Transitions.add(T_I_1);

        PetriTransition T_E_1 = new PetriTransition(pn);
        T_E_1.TransitionName = "T_E_1";
        T_E_1.InputPlaceName.add("P_X_1");
        T_E_1.InputPlaceName.add("P_TL_1");

        Condition T_E_1_CT1 = new Condition(T_E_1, "P_TL_1", TransitionCondition.Equal, "green");
        Condition T_E_1_CT2 = new Condition(T_E_1, "P_X_1", TransitionCondition.HaveCar);
        T_E_1_CT2.SetNextCondition(LogicConnector.AND,T_E_1_CT1);

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

        PetriTransition T_O_1 = new PetriTransition(pn);
        T_O_1.TransitionName = "T_O_1";
        T_O_1.InputPlaceName.add("P_INT_1");
        T_O_1.InputPlaceName.add("P_O_1");

        Condition T_O_1_CT1 = new Condition(T_O_1, "P_INT_1", TransitionCondition.HaveCarForMe);
        Condition T_O_1_CT2 = new Condition(T_O_1, "P_O_1", TransitionCondition.CanAddCars);
        T_O_1_CT1.SetNextCondition(LogicConnector.AND,T_O_1_CT2);

        GuardMapping grd_T_O_1 = new GuardMapping();
        grd_T_O_1.condition= T_O_1_CT1;
        grd_T_O_1.Activations.add(new Activation(T_O_1, "P_INT_1", TransitionOperation.PopElementWithoutTarget, "P_O_1"));
        T_O_1.GuardMappingList.add(grd_T_O_1);

        T_O_1.Delay = 2;
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

        PetriTransition T_OUT_1 = new PetriTransition(pn);
        T_OUT_1.TransitionName = "T_OUT_1";
        T_OUT_1.InputPlaceName.add("P_A_1");
        T_OUT_1.InputPlaceName.add("P_X_1");
        T_OUT_1.IsAsync = true;

        Condition T_OUT_1_CT1 = new Condition(T_OUT_1, "P_A_1", TransitionCondition.NotNull);
        Condition T_OUT_1_CT2 = new Condition(T_OUT_1, "P_X_1", TransitionCondition.CanNotAddCars);
        T_OUT_1_CT1.SetNextCondition(LogicConnector.AND,T_OUT_1_CT2);

        GuardMapping grd_T_OUT_1 = new GuardMapping();
        grd_T_OUT_1.condition= T_OUT_1_CT1;
        grd_T_OUT_1.Activations.add(new Activation(T_OUT_1, "full", TransitionOperation.SendOverNetwork,"OP_1"));
        T_OUT_1.GuardMappingList.add(grd_T_OUT_1);

        T_OUT_1.Delay = 2;
        pn.Transitions.add(T_OUT_1);

        // lane 2
        PetriTransition T_U_2 = new PetriTransition(pn);
        T_U_2.TransitionName = "T_U_2";
        T_U_2.InputPlaceName.add("P_A_2");
        T_U_2.InputPlaceName.add("P_X_2");

        Condition T_U_2_CT1 = new Condition(T_U_2, "P_A_2", TransitionCondition.NotNull);
        Condition T_U_2_CT2 = new Condition(T_U_2, "P_X_2", TransitionCondition.CanAddCars);
        T_U_2_CT2.SetNextCondition(LogicConnector.AND,T_U_2_CT1);

        GuardMapping grd_T_U_2 = new GuardMapping();

        grd_T_U_2.condition= T_U_2_CT1;
        grd_T_U_2.Activations.add(new Activation(T_U_2, "P_A_2", TransitionOperation.AddElement,"P_X_2"));
        T_U_2.GuardMappingList.add(grd_T_U_2);

        T_U_2.Delay = 2;
        pn.Transitions.add(T_U_2);

        PetriTransition T_I_2 = new PetriTransition(pn);
        T_I_2.TransitionName = "T_I_2";
        T_I_2.InputPlaceName.add("P_B_2");
        T_I_2.InputPlaceName.add("P_INT_2");

        Condition T_I_2_CT1 = new Condition(T_I_2, "P_B_2", TransitionCondition.NotNull);
        Condition T_I_2_CT2 = new Condition(T_I_2, "P_INT_1", TransitionCondition.CanAddCars);
        T_I_2_CT2.SetNextCondition(LogicConnector.AND,T_I_2_CT1);

        GuardMapping grd_T_I_2 = new GuardMapping();
        grd_T_I_2.condition= T_I_2_CT1;
        grd_T_I_2.Activations.add(new Activation(T_I_2, "P_B_2", TransitionOperation.AddElement,"P_INT_1"));
        T_I_2.GuardMappingList.add(grd_T_I_2);

        T_I_2.Delay = 2;
        pn.Transitions.add(T_I_2);

        PetriTransition T_E_2 = new PetriTransition(pn);
        T_E_2.TransitionName = "T_E_2";
        T_E_2.InputPlaceName.add("P_X_2");
        T_E_2.InputPlaceName.add("P_TL_2");

        Condition T_E_2_CT1 = new Condition(T_E_2, "P_TL_2", TransitionCondition.Equal, "green");
        Condition T_E_2_CT2 = new Condition(T_E_2, "P_X_2", TransitionCondition.HaveCar);
        T_E_2_CT2.SetNextCondition(LogicConnector.AND,T_E_2_CT1);

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

        PetriTransition T_O_2 = new PetriTransition(pn);
        T_O_2.TransitionName = "T_O_2";
        T_O_2.InputPlaceName.add("P_INT_1");
        T_O_2.InputPlaceName.add("P_O_2");

        Condition T_O_2_CT1 = new Condition(T_O_2, "P_INT_1", TransitionCondition.HaveCarForMe);
        Condition T_O_2_CT2 = new Condition(T_O_2, "P_O_2", TransitionCondition.CanAddCars);
        T_O_2_CT1.SetNextCondition(LogicConnector.AND,T_O_2_CT2);

        GuardMapping grd_T_O_2 = new GuardMapping();
        grd_T_O_2.condition= T_O_2_CT1;
        grd_T_O_2.Activations.add(new Activation(T_O_2, "P_INT_1", TransitionOperation.PopElementWithoutTarget, "P_O_2"));
        T_O_2.GuardMappingList.add(grd_T_O_2);

        T_O_2.Delay = 2;
        pn.Transitions.add(T_O_2);

        PetriTransition T_OE_2 = new PetriTransition(pn);
        T_OE_2.TransitionName = "T_OE_2";
        T_OE_2.InputPlaceName.add("P_O_2");
        Condition T_OE_2_CT1 = new Condition(T_OE_2, "P_O_2", TransitionCondition.HaveCar);

        GuardMapping grd_T_OE_2 = new GuardMapping();
        grd_T_OE_2.condition= T_OE_2_CT1;
        grd_T_OE_2.Activations.add(new Activation(T_OE_2, "P_O_2", TransitionOperation.PopElementWithoutTarget,"P_OE_2"));

        T_OE_2.GuardMappingList.add(grd_T_OE_2);
        T_OE_2.Delay = 2;
        pn.Transitions.add(T_OE_2);

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

        T_OUT_2.Delay = 2;
        pn.Transitions.add(T_OUT_2);

    }
}
