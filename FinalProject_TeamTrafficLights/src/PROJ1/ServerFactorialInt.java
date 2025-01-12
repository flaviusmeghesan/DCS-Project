package PROJ1;

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

import java.util.ArrayList;

public class ServerFactorialInt {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Server Petri";
        pn.NetworkPort = 1081;

        // ----------------------- sub petri ------------------------------------
        PetriNet spn = new PetriNet();
        spn.PetriNetName = "SubPetri";

        DataInteger constantOne = new DataInteger();
        constantOne.SetName("constantOne");
        constantOne.SetValue(1);
        spn.ConstantPlaceList.add(constantOne);

        DataInteger constantZero = new DataInteger();
        constantZero.SetName("constantZero");
        constantZero.SetValue(0);
        spn.ConstantPlaceList.add(constantZero);

        DataInteger p21 = new DataInteger();
        p21.SetName("p21");
        p21.SetValue(1);
        spn.PlaceList.add(p21);

        DataInteger p22 = new DataInteger();
        p22.SetName("p22");
        spn.PlaceList.add(p22);

        // T21 ------------------------------------------------
        PetriTransition t21 = new PetriTransition(spn);
        t21.TransitionName = "t21";
        t21.InputPlaceName.add("p21");
        t21.InputPlaceName.add("p22");

        Condition T21Ct1 = new Condition(t21, "p21", TransitionCondition.NotNull);
        Condition T21Ct2 = new Condition(t21, "p22", TransitionCondition.NotNull);
        Condition T21Ct3 = new Condition(t21, "p22", TransitionCondition.MoreThan, "constantZero");
        T21Ct2.SetNextCondition(LogicConnector.AND, T21Ct3);
        T21Ct1.SetNextCondition(LogicConnector.AND, T21Ct2);

        GuardMapping grdT21 = new GuardMapping();
        grdT21.condition = T21Ct1;

        ArrayList<String> lstFact = new ArrayList<String>();
        lstFact.add("p21");
        lstFact.add("p22");

        grdT21.Activations.add(new Activation(t21, lstFact, TransitionOperation.Prod, "p21"));

        ArrayList<String> lstMinusOne = new ArrayList<String>();
        lstMinusOne.add("p22");
        lstMinusOne.add("constantOne");

        grdT21.Activations.add(new Activation(t21, lstMinusOne, TransitionOperation.Sub, "p22"));

        t21.GuardMappingList.add(grdT21);
        t21.Delay = 0;
        spn.Transitions.add(t21);

        // T22 ------------------------------------------------
        PetriTransition t22 = new PetriTransition(spn);
        t22.TransitionName = "t22";
        t22.InputPlaceName.add("p22");

        Condition T22Ct1 = new Condition(t22, "p22", TransitionCondition.NotNull);
        Condition T22Ct2 = new Condition(t22, "p22", TransitionCondition.Equal, "constantZero");
        T22Ct1.SetNextCondition(LogicConnector.AND, T22Ct2);

        GuardMapping grdT22 = new GuardMapping();
        grdT22.condition = T22Ct1;

        grdT22.Activations.add(new Activation(t22,"", TransitionOperation.StopPetriNet, ""));

        t22.GuardMappingList.add(grdT22);
        t22.Delay = 0;
        spn.Transitions.add(t22);


        // ------------------------end sub petri ---------------------------------

        DataSubPetriNet subPetriNet = new DataSubPetriNet();
        subPetriNet.SetName("SubPetri");
        SubPetri sptr = new SubPetri(spn);
        subPetriNet.SetValue(sptr);
        pn.ConstantPlaceList.add(subPetriNet);


        DataInteger p_0 = new DataInteger();
        p_0.SetName("p_0");
        p_0.SetValue(1);
        pn.PlaceList.add(p_0);

        DataInteger p_1 = new DataInteger();
        p_1.SetName("p_1");
        pn.PlaceList.add(p_1);

        DataSubPetriNet p_2 = new DataSubPetriNet();
        p_2.SetName("p_2");
        pn.PlaceList.add(p_2);

        DataInteger p_2_1 = new DataInteger();
        p_2_1.SetName("p_2_1");
        pn.PlaceList.add(p_2_1);

        DataTransfer p_3 = new DataTransfer();
        p_3.SetName("p_3");
        p_3.Value = new TransferOperation("localhost", "1080", "p6");
        pn.PlaceList.add(p_3);

        // T0 ------------------------------------------------
        PetriTransition t0 = new PetriTransition(pn);
        t0.TransitionName = "t0";
        t0.InputPlaceName.add("p_0");
        t0.InputPlaceName.add("p_1");

        Condition T0Ct0 = new Condition(t0, "p_0", TransitionCondition.NotNull);
        Condition T0Ct1 = new Condition(t0, "p_1", TransitionCondition.NotNull);
        T0Ct0.SetNextCondition(LogicConnector.AND, T0Ct1);

        GuardMapping grdT0 = new GuardMapping();
        grdT0.condition = T0Ct0;

        grdT0.Activations.add(new Activation(t0, "SubPetri", TransitionOperation.Move, "p_2"));
        grdT0.Activations.add(new Activation(t0, "p_1", TransitionOperation.Move, "p_2-p22"));
        grdT0.Activations.add(new Activation(t0, "p_2", TransitionOperation.ActivateSubPetri, ""));

        t0.GuardMappingList.add(grdT0);

        t0.Delay = 0;
        pn.Transitions.add(t0);


        // T11 ------------------------------------------------
        PetriTransition t11 = new PetriTransition(pn);
        t11.TransitionName = "t11";
        t11.InputPlaceName.add("p_2");

        Condition T11Ct0 = new Condition(t11, "p_2", TransitionCondition.NotNull);
        Condition T11Ct1 = new Condition(t11, "p_2", TransitionCondition.SubPetriStopped);
        T11Ct0.SetNextCondition(LogicConnector.AND, T11Ct1);

        GuardMapping grdT11 = new GuardMapping();
        grdT11.condition = T11Ct0;

        grdT11.Activations.add(new Activation(t11, "p_2-p21", TransitionOperation.Move, "p_2_1"));

        t11.GuardMappingList.add(grdT11);

        t11.Delay = 0;
        pn.Transitions.add(t11);


        // T1 ------------------------------------------------
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p_2_1");

        Condition T1Ct0 = new Condition(t1, "p_2_1", TransitionCondition.NotNull);


        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct0;

        grdT1.Activations.add(new Activation(t1, "p_2_1", TransitionOperation.Move, "p_0"));
        grdT1.Activations.add(new Activation(t1, "p_2_1", TransitionOperation.SendOverNetwork, "p_3"));


        t1.GuardMappingList.add(grdT1);

        t1.Delay = 0;
        pn.Transitions.add(t1);

        // AFISARE ----------------------------------------------------
        System.out.println("Exp1 started \n ------------------------------");
        pn.Delay = 1000;

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
