package PROJ1;
import java.util.ArrayList;

import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataFloat;
import DataObjects.DataInteger;
import DataObjects.DataSubPetriNet;
import DataObjects.DataTransfer;
import DataOnly.SubPetri;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Client Petri";
        pn.NetworkPort = 1080;

        DataInteger p0 = new DataInteger();
        p0.SetName("p0");
        p0.SetValue(1);
        pn.PlaceList.add(p0);

        DataInteger p1 = new DataInteger();
        p1.SetName("p1");
        pn.PlaceList.add(p1);

        DataInteger p2 = new DataInteger();
        p2.SetName("p2");
        pn.PlaceList.add(p2);

        DataInteger p3 = new DataInteger();
        p3.SetName("p3");
        pn.PlaceList.add(p3);

        DataTransfer p4 = new DataTransfer();
        p4.SetName("p4");
        p4.Value = new TransferOperation("localhost", "1081", "p_1");
        pn.PlaceList.add(p4);

        DataInteger p5 = new DataInteger();
        p5.SetName("p5");
        pn.PlaceList.add(p5);

        DataInteger p6 = new DataInteger();
        p6.SetName("p6");
        pn.PlaceList.add(p6);

        DataInteger p7 = new DataInteger();
        p7.SetName("p7");
        pn.PlaceList.add(p7);

        // T0 ------------------------------------------------
        PetriTransition t0 = new PetriTransition(pn);
        t0.TransitionName = "t0";
        t0.InputPlaceName.add("p0");

        Condition T0Ct0 = new Condition(t0, "p0", TransitionCondition.NotNull);

        GuardMapping grdT0 = new GuardMapping();
        grdT0.condition = T0Ct0;

        grdT0.Activations.add(new Activation(t0, "p0", TransitionOperation.Move, "p1"));
        grdT0.Activations.add(new Activation(t0, "p0", TransitionOperation.Move, "p2"));

        t0.GuardMappingList.add(grdT0);

        t0.Delay = 0;
        pn.Transitions.add(t0);

        // T1 ------------------------------------------------
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p1");
        t1.InputPlaceName.add("p3");

        Condition T1Ct0 = new Condition(t1, "p1", TransitionCondition.NotNull);
        Condition T1Ct1 = new Condition(t1, "p3", TransitionCondition.NotNull);
        T1Ct0.SetNextCondition(LogicConnector.AND, T1Ct1);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct0;

        grdT1.Activations.add(new Activation(t1, "p3", TransitionOperation.SendOverNetwork, "p4"));
        grdT1.Activations.add(new Activation(t1, "p1", TransitionOperation.Move, "p5"));


        t1.GuardMappingList.add(grdT1);

        t1.Delay = 0;
        pn.Transitions.add(t1);

        // T2 ------------------------------------------------
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "t2";
        t2.InputPlaceName.add("p5");

        Condition T2Ct0 = new Condition(t2, "p5", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct0;

        grdT2.Activations.add(new Activation(t2, "p5", TransitionOperation.Move, "p1"));

        t2.GuardMappingList.add(grdT2);

        t2.Delay = 1;
        pn.Transitions.add(t2);

        // T3 ------------------------------------------------
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "t3";
        t3.InputPlaceName.add("p2");
        t3.InputPlaceName.add("p6");

        Condition T3Ct0 = new Condition(t3, "p2", TransitionCondition.NotNull);
        Condition T3Ct1 = new Condition(t3, "p6", TransitionCondition.NotNull);
        T3Ct0.SetNextCondition(LogicConnector.AND, T3Ct1);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3Ct0;

        grdT3.Activations.add(new Activation(t3, "p2", TransitionOperation.Move, "p2"));
        grdT3.Activations.add(new Activation(t3, "p6", TransitionOperation.Move, "p7"));

        t3.GuardMappingList.add(grdT3);

        t3.Delay = 0;
        pn.Transitions.add(t3);

        // AFISARE ----------------------------------------------------
        System.out.println("Exp1 started \n ------------------------------");
        pn.Delay = 1000;

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
