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

public class Server {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Server Petri";
        pn.NetworkPort = 1081;

        DataFloat ConstantValue1 = new DataFloat();
        ConstantValue1.SetName("ConstantValue1");
        ConstantValue1.SetValue(0.05f);
        pn.ConstantPlaceList.add(ConstantValue1);

        DataFloat p_0 = new DataFloat();
        p_0.SetName("p_0");
        p_0.SetValue(1.0f);
        pn.PlaceList.add(p_0);

        DataFloat p_1 = new DataFloat();
        p_1.SetName("p_1");
        pn.PlaceList.add(p_1);

        DataFloat p_2 = new DataFloat();
        p_2.SetName("p_2");
        pn.PlaceList.add(p_2);

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

        ArrayList<String> lstInput = new ArrayList<String>();
        lstInput.add("ConstantValue1");
        lstInput.add("p_0");
        lstInput.add("p_1");

        grdT0.Activations.add(new Activation(t0, lstInput, TransitionOperation.Prod, "p_2"));

        t0.GuardMappingList.add(grdT0);

        t0.Delay = 0;
        pn.Transitions.add(t0);

        // T1 ------------------------------------------------
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p_2");

        Condition T1Ct0 = new Condition(t1, "p_2", TransitionCondition.NotNull);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct0;

        grdT1.Activations.add(new Activation(t1, "p_2", TransitionOperation.SendOverNetwork, "p_3"));
        grdT1.Activations.add(new Activation(t1, "p_2", TransitionOperation.Move, "p_0"));

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
