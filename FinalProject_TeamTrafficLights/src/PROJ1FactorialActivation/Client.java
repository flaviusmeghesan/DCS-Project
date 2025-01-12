package PROJ1FactorialActivation;

import Components.*;
import DataObjects.DataInteger;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Client {
    public static void main(String[] args) {
        PetriNet petriClient = new PetriNet();
        petriClient.PetriNetName = "Client Petri";
        petriClient.NetworkPort = 1080;

        DataInteger placeClient_0 = new DataInteger();
        placeClient_0.SetName("placeClient_0");
        placeClient_0.SetValue(1);
        petriClient.PlaceList.add(placeClient_0);

        DataInteger placeClient_1 = new DataInteger();
        placeClient_1.SetName("placeClient_1");
        petriClient.PlaceList.add(placeClient_1);

        DataInteger placeClient_2 = new DataInteger();
        placeClient_2.SetName("placeClient_2");
        petriClient.PlaceList.add(placeClient_2);

        DataInteger placeClient_3 = new DataInteger();
        placeClient_3.SetName("placeClient_3");
        petriClient.PlaceList.add(placeClient_3);

        DataTransfer placeClient_4 = new DataTransfer();
        placeClient_4.SetName("placeClient_4");
        placeClient_4.Value = new TransferOperation("localhost", "1081", "placeServer_1");
        petriClient.PlaceList.add(placeClient_4);

        DataInteger placeClient_5 = new DataInteger();
        placeClient_5.SetName("placeClient_5");
        petriClient.PlaceList.add(placeClient_5);

        DataInteger placeClient_6 = new DataInteger();
        placeClient_6.SetName("placeClient_6");
        petriClient.PlaceList.add(placeClient_6);

        DataInteger placeClient_7 = new DataInteger();
        placeClient_7.SetName("placeClient_7");
        petriClient.PlaceList.add(placeClient_7);

        //t_0
        PetriTransition t_0 = new PetriTransition(petriClient);
        t_0.TransitionName = "t_0";
        t_0.InputPlaceName.add("placeClient_0");

        //grd1 t_0
        Condition T0Ct1 = new Condition(t_0, "placeClient_0", TransitionCondition.NotNull);

        GuardMapping grdT0 = new GuardMapping();
        grdT0.condition = T0Ct1;

        grdT0.Activations.add(new Activation(t_0, "placeClient_0", TransitionOperation.Move, "placeClient_1"));
        grdT0.Activations.add(new Activation(t_0, "placeClient_0", TransitionOperation.Move, "placeClient_2"));

        t_0.GuardMappingList.add(grdT0);
        t_0.Delay = 0;
        petriClient.Transitions.add(t_0);

        //t_1
        PetriTransition t_1 = new PetriTransition(petriClient);
        t_1.TransitionName = "t_1";
        t_1.InputPlaceName.add("placeClient_1");
        t_1.InputPlaceName.add("placeClient_3");

        //grd1 t_1
        Condition T1Ct1 = new Condition(t_1, "placeClient_1", TransitionCondition.NotNull);
        Condition T1Ct2 = new Condition(t_1, "placeClient_3", TransitionCondition.NotNull);
        T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;

        grdT1.Activations.add(new Activation(t_1, "placeClient_3", TransitionOperation.SendOverNetwork, "placeClient_4"));
        grdT1.Activations.add(new Activation(t_1, "placeClient_1", TransitionOperation.Move, "placeClient_5"));

        t_1.GuardMappingList.add(grdT1);
        t_1.Delay = 0;
        petriClient.Transitions.add(t_1);

        //t_2
        PetriTransition t_2 = new PetriTransition(petriClient);
        t_2.TransitionName = "t_2";
        t_2.InputPlaceName.add("placeClient_5");

        //grd1 t_2
        Condition T2Ct1 = new Condition(t_2, "placeClient_5", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;

        grdT2.Activations.add(new Activation(t_2, "placeClient_5", TransitionOperation.Move, "placeClient_1"));

        t_2.GuardMappingList.add(grdT2);
        t_2.Delay = 1;
        petriClient.Transitions.add(t_2);

        //t_3
        PetriTransition t_3 = new PetriTransition(petriClient);
        t_3.TransitionName = "t_3";
        t_3.InputPlaceName.add("placeClient_2");
        t_3.InputPlaceName.add("placeClient_6");

        //grd1 t_3
        Condition T3Ct1 = new Condition(t_1, "placeClient_2", TransitionCondition.NotNull);
        Condition T3Ct2 = new Condition(t_1, "placeClient_6", TransitionCondition.NotNull);
        T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3Ct1;

        grdT3.Activations.add(new Activation(t_3, "placeClient_6", TransitionOperation.Move, "placeClient_7"));
        grdT3.Activations.add(new Activation(t_3, "placeClient_2", TransitionOperation.Move, "placeClient_2"));

        t_3.GuardMappingList.add(grdT3);
        t_3.Delay = 0;
        petriClient.Transitions.add(t_3);

        System.out.println("Client started \n ------------------------------");
        petriClient.Delay = 1000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = petriClient;
        frame.setVisible(true);

    }
}
