package PROJ1FactorialActivation;

import Components.*;
import DataObjects.DataFloat;
import DataObjects.DataInteger;
import DataObjects.DataSubPetriNet;
import DataObjects.DataTransfer;
import DataOnly.SubPetri;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        PetriNet serverPetri = new PetriNet();
        serverPetri.PetriNetName = "Server";
        serverPetri.NetworkPort = 1081;

        DataInteger placeServer_1 = new DataInteger();
        placeServer_1.SetName("placeServer_1");
        serverPetri.PlaceList.add(placeServer_1);

        DataInteger placeServer_0 = new DataInteger();
        placeServer_0.SetName("placeServer_0");
        placeServer_0.SetValue(1);
        serverPetri.PlaceList.add(placeServer_0);

        DataInteger placeServer_2 = new DataInteger();
        placeServer_2.SetName("placeServer_2");
        serverPetri.PlaceList.add(placeServer_2);

        DataTransfer placeServer_3 = new DataTransfer();
        placeServer_3.SetName("placeServer_3");
        placeServer_3.Value = new TransferOperation("localhost", "1080", "placeClient_6");
        serverPetri.PlaceList.add(placeServer_3);

        //t_0
        PetriTransition t_0 = new PetriTransition(serverPetri);
        t_0.TransitionName = "t_0";
        t_0.InputPlaceName.add("placeServer_0");
        t_0.InputPlaceName.add("placeServer_1");

        //grd1 t_0
        Condition T0Ct1 = new Condition(t_0, "placeServer_0", TransitionCondition.NotNull);
        Condition T0Ct2 = new Condition(t_0, "placeServer_1", TransitionCondition.NotNull);

        T0Ct1.SetNextCondition(LogicConnector.AND, T0Ct2);

        GuardMapping grdT0 = new GuardMapping();
        grdT0.condition = T0Ct1;

        //here do the factorial instead of multiplication

        grdT0.Activations.add(new Activation(t_0, "placeServer_1", TransitionOperation.Factorial, "placeServer_2"));

        t_0.GuardMappingList.add(grdT0);
        t_0.Delay = 0;
        serverPetri.Transitions.add(t_0);

        //t_1
        PetriTransition t_1 = new PetriTransition(serverPetri);
        t_1.TransitionName = "t_1";
        t_1.InputPlaceName.add("placeServer_2");

        //grd1 t_1
        Condition T1Ct1 = new Condition(t_1, "placeServer_2", TransitionCondition.NotNull);


        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;

        grdT1.Activations.add(new Activation(t_1, "placeServer_2", TransitionOperation.SendOverNetwork, "placeServer_3"));
        grdT1.Activations.add(new Activation(t_1, "placeServer_2", TransitionOperation.Move, "placeServer_0"));

        t_1.GuardMappingList.add(grdT1);
        t_1.Delay = 0;
        serverPetri.Transitions.add(t_1);


        System.out.println("Server started \n ------------------------------");
        serverPetri.Delay = 1000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = serverPetri;
        frame.setVisible(true);
    }
}
