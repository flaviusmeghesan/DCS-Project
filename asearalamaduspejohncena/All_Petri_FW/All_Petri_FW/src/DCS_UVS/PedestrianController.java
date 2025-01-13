package DCS_UVS;

import Components.*;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class PedestrianController {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "PedestrianController";
        pn.SetName("PedestrianController");
        pn.NetworkPort = 1081;


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

        DataString p1 = new DataString();
        p1.SetName("UserReq");
        pn.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("yr");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("rg");
        pn.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("ry");
        pn.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("gr");
        p5.SetValue("signal");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("wait");
        pn.PlaceList.add(p6);

        DataTransfer p7 = new DataTransfer();
        p7.SetName("P_TL");
        p7.Value = new TransferOperation("localhost", "1080" , "P_TL1");
        pn.PlaceList.add(p7);

        DataTransfer p8 = new DataTransfer();
        p8.SetName("P_PTL");
        p8.Value = new TransferOperation("localhost", "1080" , "P_PTL1");
        pn.PlaceList.add(p8);

        DataString p9 = new DataString();
        p9.SetName("Pinit");
        p9.SetValue("signal");
        pn.PlaceList.add(p9);

        // init
        PetriTransition init = new PetriTransition(pn);
        init.TransitionName = "init";
        init.InputPlaceName.add("Pinit");

        Condition initTCT1 = new Condition(init, "Pinit", TransitionCondition.NotNull);

        GuardMapping grdinit = new GuardMapping();
        grdinit.condition= initTCT1;

        grdinit.Activations.add(new Activation(init, "red", TransitionOperation.SendOverNetwork, "P_PTL"));
        grdinit.Activations.add(new Activation(init, "green", TransitionOperation.SendOverNetwork, "P_TL"));

        init.GuardMappingList.add(grdinit);

        init.Delay = 0;
        pn.Transitions.add(init);

        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "T1";
        t1.InputPlaceName.add("UserReq");
        t1.InputPlaceName.add("wait");


        Condition T1CT1 = new Condition(t1, "UserReq", TransitionCondition.NotNull);
        Condition T1CT2 = new Condition(t1, "wait", TransitionCondition.NotNull);
        T1CT1.SetNextCondition(LogicConnector.AND, T1CT2);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition= T1CT1;
        grdT1.Activations.add(new Activation(t1, "wait", TransitionOperation.Move, "yr"));
        grdT1.Activations.add(new Activation(t1, "yellow", TransitionOperation.SendOverNetwork, "P_TL"));
        t1.GuardMappingList.add(grdT1);

        t1.Delay = 0;
        pn.Transitions.add(t1);


        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "T2";
        t2.InputPlaceName.add("yr");


        Condition T2CT1 = new Condition(t2, "yr", TransitionCondition.NotNull);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition= T2CT1;
        grdT2.Activations.add(new Activation(t2, "yr", TransitionOperation.Move, "rg"));
        grdT2.Activations.add(new Activation(t2, "red", TransitionOperation.SendOverNetwork, "P_TL"));
        grdT2.Activations.add(new Activation(t2, "green", TransitionOperation.SendOverNetwork, "P_PTL"));

        t2.GuardMappingList.add(grdT2);

        t2.Delay = 5;
        pn.Transitions.add(t2);

        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "T3";
        t3.InputPlaceName.add("rg");



        Condition T3CT1 = new Condition(t2, "rg", TransitionCondition.NotNull);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition= T3CT1;
        grdT3.Activations.add(new Activation(t3, "rg", TransitionOperation.Move, "ry"));
        grdT3.Activations.add(new Activation(t3, "yellow", TransitionOperation.SendOverNetwork, "P_PTL"));

        t3.GuardMappingList.add(grdT3);

        t3.Delay = 5;
        pn.Transitions.add(t3);


        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "T4";
        t4.InputPlaceName.add("ry");


        Condition T4CT1 = new Condition(t4, "ry", TransitionCondition.NotNull);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition= T4CT1;
        grdT4.Activations.add(new Activation(t4, "ry", TransitionOperation.Move, "gr"));
        grdT4.Activations.add(new Activation(t4, "red", TransitionOperation.SendOverNetwork, "P_PTL"));
        grdT4.Activations.add(new Activation(t4, "green", TransitionOperation.SendOverNetwork, "P_TL"));

        t4.GuardMappingList.add(grdT4);

        t4.Delay = 5;
        pn.Transitions.add(t4);

        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "T5";
        t5.InputPlaceName.add("gr");


        Condition T5CT1 = new Condition(t2, "gr", TransitionCondition.NotNull);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition= T5CT1;
        grdT5.Activations.add(new Activation(t5, "gr", TransitionOperation.Move, "wait"));


        t5.GuardMappingList.add(grdT5);

        t5.Delay = 5;
        pn.Transitions.add(t5);

        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Pedestrian Controller started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
