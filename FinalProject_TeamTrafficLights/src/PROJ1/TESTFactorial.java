package PROJ1;

import Components.*;
import DataObjects.DataInteger;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

import java.util.ArrayList;

public class TESTFactorial {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Server Petri";
        pn.NetworkPort = 1081;

        DataInteger p_0 = new DataInteger();
        p_0.SetName("p_0");
        p_0.SetValue(1);
        pn.PlaceList.add(p_0);

        DataInteger p_1 = new DataInteger();
        p_1.SetName("p_1");
        pn.PlaceList.add(p_1);

        PetriTransition t0 = new PetriTransition(pn);
        t0.TransitionName = "t0";
        t0.InputPlaceName.add("p_0");

        Condition T0Ct0 = new Condition(t0, "p_0", TransitionCondition.NotNull);

        GuardMapping grdT0 = new GuardMapping();
        grdT0.condition = T0Ct0;


        grdT0.Activations.add(new Activation(t0, "p_0", TransitionOperation.Factorial, "p_1"));

        t0.GuardMappingList.add(grdT0);

        t0.Delay = 0;
        pn.Transitions.add(t0);

        System.out.println("Exp1 started \n ------------------------------");
        pn.Delay = 1000;

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
