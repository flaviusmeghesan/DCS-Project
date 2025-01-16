package asearalamaduspejohncena;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersection4 {
        public static void main(String[] args) {
                PetriNet pn = new PetriNet();
                pn.PetriNetName = "Main Petri";
                pn.NetworkPort = 1080;

                DataTransfer OP1 = new DataTransfer();
                OP1.SetName("OP1");
                OP1.Value = new TransferOperation("localhost","1081","in1");
                pn.PlaceList.add(OP1);

                DataTransfer OP2 = new DataTransfer();
                OP2.SetName("OP2");
                OP2.Value = new TransferOperation("localhost","1082","in2");
                pn.PlaceList.add(OP2);

                DataTransfer OP3 = new DataTransfer();
                OP3.SetName("OP3");
                OP3.Value = new TransferOperation("localhost","1083","in3");
                pn.PlaceList.add(OP3);

                DataTransfer OP4 = new DataTransfer();
                OP4.SetName("OP4");
                OP4.Value = new TransferOperation("localhost","1084","in4");
                pn.PlaceList.add(OP4);

                DataTransfer OP_tram1 = new DataTransfer();
                OP_tram1.SetName("Op_tram1");
                OP_tram1.Value = new TransferOperation("localhost","1085","tram1");
                pn.PlaceList.add(OP_tram1);

                DataTransfer OP_tram2 = new DataTransfer();
                OP_tram2.SetName("Op_tram1");
                OP_tram2.Value = new TransferOperation("localhost","1086","tram2");
                pn.PlaceList.add(OP_tram2);

                DataCar Pa_1 = new DataCar();
                Pa_1.SetName("Pa_1");
                pn.PlaceList.add(Pa_1);

                DataCar Pa_2 = new DataCar();
                Pa_2.SetName("Pa_2");
                pn.PlaceList.add(Pa_2);

                DataCar Pa_3 = new DataCar();
                Pa_3.SetName("Pa_3");
                pn.PlaceList.add(Pa_3);

                DataCar Pa_4 = new DataCar();
                Pa_4.SetName("Pa_4");
                pn.PlaceList.add(Pa_4);

                DataCar Pa_5 = new DataCar();
                Pa_5.SetName("Pa_5");
                pn.PlaceList.add(Pa_5);

                DataCar Pa_6 = new DataCar();
                Pa_6.SetName("Pa_6");
                pn.PlaceList.add(Pa_6);

                DataCar Pb_1 = new DataCar();
                Pb_1.SetName("Pb_1");
                pn.PlaceList.add(Pb_1);

                DataCar Pb_2 = new DataCar();
                Pb_2.SetName("Pb_2");
                pn.PlaceList.add(Pb_2);

                DataCar Pb_3 = new DataCar();
                Pb_3.SetName("Pb_3");
                pn.PlaceList.add(Pb_3);

                DataCar Pb_4 = new DataCar();
                Pb_4.SetName("Pb_4");
                pn.PlaceList.add(Pb_4);

                DataCar Pb_5 = new DataCar();
                Pb_5.SetName("Pb_5");
                pn.PlaceList.add(Pb_5);

                DataCar Pb_6 = new DataCar();
                Pb_6.SetName("Pb_6");
                pn.PlaceList.add(Pb_6);

                DataCarQueue PO_1 = new DataCarQueue();
                PO_1.Value.Size = 3;
                PO_1.SetName("PO_1");
                pn.PlaceList.add(PO_1);

                DataCarQueue PO_2 = new DataCarQueue();
                PO_2.Value.Size = 3;
                PO_2.SetName("PO_2");
                pn.PlaceList.add(PO_2);

                DataCarQueue PO_3 = new DataCarQueue();
                PO_3.Value.Size = 3;
                PO_3.SetName("PO_3");
                pn.PlaceList.add(PO_3);

                DataCarQueue PO_4 = new DataCarQueue();
                PO_4.Value.Size = 3;
                PO_4.SetName("PO_4");
                pn.PlaceList.add(PO_4);

                DataCarQueue PO_5 = new DataCarQueue();
                PO_5.Value.Size = 3;
                PO_5.SetName("PO_5");
                pn.PlaceList.add(PO_5);

                DataCarQueue PO_6 = new DataCarQueue();
                PO_6.Value.Size = 3;
                PO_6.SetName("PO_6");
                pn.PlaceList.add(PO_6);

                DataCar P_OE_1 = new DataCar();
                P_OE_1.SetName("P_OE_1");
                pn.PlaceList.add(P_OE_1);

                DataCar P_OE_2 = new DataCar();
                P_OE_2.SetName("P_OE_2");
                pn.PlaceList.add(P_OE_2);

                DataCar P_OE_3 = new DataCar();
                P_OE_3.SetName("P_OE_3");
                pn.PlaceList.add(P_OE_3);

                DataCar P_OE_4 = new DataCar();
                P_OE_4.SetName("P_OE_4");
                pn.PlaceList.add(P_OE_4);

                DataCar P_OE_5 = new DataCar();
                P_OE_5.SetName("P_OE_5");
                pn.PlaceList.add(P_OE_5);

                DataCar P_OE_6 = new DataCar();
                P_OE_6.SetName("P_OE_6");
                pn.PlaceList.add(P_OE_6);

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

                DataString P_TL_4 = new DataString();
                P_TL_4.SetName("P_TL_4");
                P_TL_4.SetValue("red");
                pn.PlaceList.add(P_TL_4);

                DataString P_TL_5 = new DataString();
                P_TL_5.SetName("P_TL_1");
                P_TL_5.SetValue("red");
                pn.PlaceList.add(P_TL_5);

                DataString P_TL_6 = new DataString();
                P_TL_6.SetName("P_TL_1");
                P_TL_6.SetValue("red");
                pn.PlaceList.add(P_TL_6);

                DataCarQueue Px_1 = new DataCarQueue();
                Px_1.Value.Size = 3;
                Px_1.SetName("Px_1");
                pn.PlaceList.add(Px_1);

                DataCarQueue Px_2 = new DataCarQueue();
                Px_2.Value.Size = 3;
                Px_2.SetName("Px_2");
                pn.PlaceList.add(Px_2);

                DataCarQueue Px_3 = new DataCarQueue();
                Px_3.Value.Size = 3;
                Px_3.SetName("Px_3");
                pn.PlaceList.add(Px_3);

                DataCarQueue Px_4 = new DataCarQueue();
                Px_4.Value.Size = 3;
                Px_4.SetName("Px_4");
                pn.PlaceList.add(Px_4);

                DataCarQueue Px_5 = new DataCarQueue();
                Px_5.Value.Size = 3;
                Px_5.SetName("Px_5");
                pn.PlaceList.add(Px_5);

                DataCarQueue Px_6 = new DataCarQueue();
                Px_6.Value.Size = 3;
                Px_6.SetName("Px_6");
                pn.PlaceList.add(Px_6);

                DataCarQueue P_INT_4 = new DataCarQueue();
                P_INT_4.Value.Size = 20;
                P_INT_4.SetName("P_INT_4");
                pn.PlaceList.add(P_INT_4);


                DataCarQueue P_STATION_11 = new DataCarQueue();
                P_STATION_11.Value.Size = 3;
                P_STATION_11.SetName("P_STATION_11");
                pn.PlaceList.add(P_STATION_11);

                DataCarQueue P_STATION_12 = new DataCarQueue();
                P_STATION_12.Value.Size = 3;
                P_STATION_12.SetName("P_STATION_12");
                pn.PlaceList.add(P_STATION_12);

                DataCarQueue P_bus_11 = new DataCarQueue();
                P_bus_11.Value.Size = 3;
                P_bus_11.SetName("P_bus_11");
                pn.PlaceList.add(P_bus_11);

                DataCarQueue P_bus_12 = new DataCarQueue();
                P_bus_12.Value.Size = 3;
                P_bus_12.SetName("P_bus_12");
                pn.PlaceList.add(P_bus_12);

                DataCarQueue end1 = new DataCarQueue();
                end1.Value.Size = 3;
                end1.SetName("end1");
                pn.PlaceList.add(end1);

                DataCarQueue P_STATION_21 = new DataCarQueue();
                P_STATION_21.Value.Size = 3;
                P_STATION_21.SetName("P_STATION_21");
                pn.PlaceList.add(P_STATION_21);

                DataCarQueue P_STATION_22 = new DataCarQueue();
                P_STATION_22.Value.Size = 3;
                P_STATION_22.SetName("P_STATION_22");
                pn.PlaceList.add(P_STATION_22);

                DataCarQueue P_bus_21 = new DataCarQueue();
                P_bus_21.Value.Size = 3;
                P_bus_21.SetName("P_bus_21");
                pn.PlaceList.add(P_bus_21);

                DataCarQueue P_bus_22 = new DataCarQueue();
                P_bus_22.Value.Size = 3;
                P_bus_12.SetName("P_bus_22");
                pn.PlaceList.add(P_bus_22);

                DataCarQueue end2 = new DataCarQueue();
                end2.Value.Size = 3;
                end2.SetName("end2");
                pn.PlaceList.add(end1);

                DataCarQueue P_STATION_31 = new DataCarQueue();
                P_STATION_31.Value.Size = 3;
                P_STATION_31.SetName("P_STATION_31");
                pn.PlaceList.add(P_STATION_31);

                DataCarQueue P_STATION_32 = new DataCarQueue();
                P_STATION_32.Value.Size = 3;
                P_STATION_32.SetName("P_STATION_32");
                pn.PlaceList.add(P_STATION_32);

                DataCarQueue P_bus_31 = new DataCarQueue();
                P_bus_31.Value.Size = 3;
                P_bus_31.SetName("P_bus_31");
                pn.PlaceList.add(P_bus_31);

                DataCarQueue P_bus_32 = new DataCarQueue();
                P_bus_32.Value.Size = 3;
                P_bus_32.SetName("P_bus_32");
                pn.PlaceList.add(P_bus_32);

                DataCarQueue end3 = new DataCarQueue();
                end3.Value.Size = 3;
                end3.SetName("end1");
                pn.PlaceList.add(end3);

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

                // LANE 1 INPUT
                PetriTransition T0 = new PetriTransition(pn);
                T0.TransitionName = "T0";
                T0.InputPlaceName.add("Pa_1");
                T0.InputPlaceName.add("Px_1");

                Condition T0_CT1 = new Condition(T0, "Pa_1", TransitionCondition.NotNull);
                Condition T0_CT2 = new Condition(T0, "Px_1", TransitionCondition.CanAddCars);
                T0_CT1.SetNextCondition(LogicConnector.AND, T0_CT2);

                GuardMapping grdT0 = new GuardMapping();
                grdT0.condition = T0_CT1;
                grdT0.Activations.add(new Activation(T0, "Pa_1", TransitionOperation.AddElement, "Px_1"));
                T0.GuardMappingList.add(grdT0);

                T0.Delay = 2;
                pn.Transitions.add(T0);

                PetriTransition T1 = new PetriTransition(pn);
                T1.TransitionName = "T1";
                T1.InputPlaceName.add("Px_1");
                T1.InputPlaceName.add("P_TL_1");

                Condition T1_CT1 = new Condition(T1, "P_TL_1", TransitionCondition.Equal, "green");
                Condition T1_CT2 = new Condition(T1, "Px_1", TransitionCondition.HaveCar);
                T1_CT1.SetNextCondition(LogicConnector.AND,T1_CT2);

                GuardMapping grd_T1 = new GuardMapping();
                grd_T1.condition= T1_CT1;
                grd_T1.Activations.add(new Activation(T1, "Px_1", TransitionOperation.PopElementWithoutTarget, "Pb_1"));
                grd_T1.Activations.add(new Activation(T1, "P_TL_1", TransitionOperation.Move, "P_TL_1"));
                T1.GuardMappingList.add(grd_T1);

                Condition T111_CT1 = new Condition(T1, "Px_1",TransitionCondition.HavePriorityCar);
                GuardMapping grd_T111 = new GuardMapping();
                grd_T111.condition= T111_CT1;
                grd_T111.Activations.add(new Activation(T1, "Px_1", TransitionOperation.PopElementWithoutTarget, "Pb_1"));
                grd_T111.Activations.add(new Activation(T1, "P_TL_1", TransitionOperation.Move, "P_TL_1"));
                T1.GuardMappingList.add(grd_T111);

                T1.Delay = 2;
                pn.Transitions.add(T1);


                PetriTransition T2 = new PetriTransition(pn);
                T2.TransitionName = "T2";
                T2.InputPlaceName.add("Pb_1");
                T2.InputPlaceName.add("P_INT_4");

                Condition T2_CT1 = new Condition(T2, "Pb_1", TransitionCondition.NotNull);
                Condition T2_CT2 = new Condition(T2, "P_INT_4", TransitionCondition.CanAddCars);
                T2_CT1.SetNextCondition(LogicConnector.AND, T2_CT2);

                GuardMapping grdT2 = new GuardMapping();
                grdT2.condition = T2_CT1;
                grdT2.Activations.add(new Activation(T2, "Pb_1", TransitionOperation.AddElement, "P_INT_4"));
                T2.GuardMappingList.add(grdT2);

                T2.Delay = 2;
                pn.Transitions.add(T2);

                PetriTransition T3 = new PetriTransition(pn);
                T3.TransitionName = "T3";
                T3.InputPlaceName.add("Pa_1");
                T3.InputPlaceName.add("Px_1");
                T3.IsAsync = true;

                Condition T3_CT1 = new Condition(T3, "Pa_1", TransitionCondition.NotNull);
                Condition T3_CT2 = new Condition(T3, "Px_1", TransitionCondition.CanNotAddCars);
                T3_CT1.SetNextCondition(LogicConnector.AND,T3_CT2);

                GuardMapping grd_T3 = new GuardMapping();
                grd_T3.condition = T3_CT1;
                grd_T3.Activations.add(new Activation(T3, "full", TransitionOperation.SendOverNetwork,"OP1"));
                T3.GuardMappingList.add(grd_T3);

                T3.Delay = 2;
                pn.Transitions.add(T3);

                // LANE 1 EXIT
                PetriTransition T4 = new PetriTransition(pn);
                T4.TransitionName = "T4";
                T4.InputPlaceName.add("P_INT_4");
                T4.InputPlaceName.add("P0_1");

                Condition T4_CT1 = new Condition(T4, "P_INT_4", TransitionCondition.HaveCarForMe);
                Condition T4_CT2 = new Condition(T4, "PO_1", TransitionCondition.CanAddCars);
                T4_CT1.SetNextCondition(LogicConnector.AND,T4_CT2);

                GuardMapping grd_T4 = new GuardMapping();
                grd_T4.condition= T4_CT1;
                grd_T4.Activations.add(new Activation(T4, "P_INT_4", TransitionOperation.PopElementWithTargetToQueue, "PO_1"));
                T4.GuardMappingList.add(grd_T4);

                T4.Delay = 1;
                pn.Transitions.add(T4);


                PetriTransition T5 = new PetriTransition(pn);
                T5.TransitionName = "T5";
                T5.InputPlaceName.add("PO_1");
                Condition T5_CT1 = new Condition(T5, "PO_1", TransitionCondition.HaveCar);

                GuardMapping grd_T5 = new GuardMapping();
                grd_T5.condition= T5_CT1;
                grd_T5.Activations.add(new Activation(T5, "PO_1", TransitionOperation.PopElementWithoutTarget,"P_OE_1"));

                T5.GuardMappingList.add(grd_T5);
                T5.Delay = 2;

                pn.Transitions.add(T5);


                PetriTransition T6 = new PetriTransition(pn);
                T6.TransitionName = "T6";
                T6.InputPlaceName.add("P_OE_1");
                Condition T6_CT1 = new Condition(T6, "P_OE_1", TransitionCondition.HaveCar);

                GuardMapping grd_T6 = new GuardMapping();
                grd_T6.condition= T6_CT1;
                grd_T6.Activations.add(new Activation(T6, "P_OE_1", TransitionOperation.PopElementWithoutTarget,"P_bus11"));
                T6.GuardMappingList.add(grd_T6);
                T6.Delay = 2;

                pn.Transitions.add(T6);


                PetriTransition T9 = new PetriTransition(pn);
                T9.TransitionName = "T9";
                T9.InputPlaceName.add("P_bus11");

                Condition T9_CT1 = new Condition(T9, "P_bus11", TransitionCondition.HaveBus);
                Condition T9_CT2 = new Condition(T9, "P_bus11", TransitionCondition.HaveCarForMe);
                T9_CT1.SetNextCondition(LogicConnector.AND,T9_CT2);

                GuardMapping grd_T9 = new GuardMapping();
                grd_T9.condition= T9_CT1;
                grd_T9.Activations.add(new Activation(T9, "P_bus11", TransitionOperation.PopElementWithTargetToQueue,"P_STATION11"));

                T9.GuardMappingList.add(grd_T9);
                T9.Delay = 2;
                pn.Transitions.add(T9);


                PetriTransition T10 = new PetriTransition(pn);
                T10.TransitionName = "T10";
                T10.InputPlaceName.add("P_STATION11");
                T10.InputPlaceName.add("P_bus12");

                Condition T10_CT1 = new Condition(T10, "P_STATION11", TransitionCondition.HaveCar);
                Condition T10_CT2 = new Condition(T10, "P_bus12", TransitionCondition.CanAddCars);
                T10_CT1.SetNextCondition(LogicConnector.AND,T10_CT2);

                GuardMapping grd_T10 = new GuardMapping();
                grd_T10.condition= T10_CT1;
                grd_T10.Activations.add(new Activation(T10, "P_STATION_11", TransitionOperation.PopElementWithoutTargetToQueue,"P_bus12"));

                T10.GuardMappingList.add(grd_T10);
                T10.Delay = 2;

                pn.Transitions.add(T10);


                PetriTransition T7 = new PetriTransition(pn);
                T7.TransitionName = "T7";
                T7.InputPlaceName.add("P_bus11");
                T7.InputPlaceName.add("P_bus12");

                Condition T7_CT1 = new Condition(T7, "P_bus11", TransitionCondition.HaveCarForMe);
                Condition T7_CT2 = new Condition(T7, "P_bus12", TransitionCondition.CanAddCars);
                T7_CT1.SetNextCondition(LogicConnector.AND,T7_CT2);

                GuardMapping grd_T7 = new GuardMapping();
                grd_T7.condition = T7_CT1;
                grd_T7.Activations.add(new Activation(T7, "P_bus11", TransitionOperation.PopElementWithoutTargetToQueue,"P_bus12"));

                T7.GuardMappingList.add(grd_T7);


                T7.Delay = 2;
                pn.Transitions.add(T7);


                PetriTransition T8 = new PetriTransition(pn);
                T8.TransitionName = "T8";
                T8.InputPlaceName.add("P_bus12");

                Condition T8_CT1 = new Condition(T8, "P_bus12", TransitionCondition.HaveCar);

                GuardMapping grd_T8 = new GuardMapping();
                grd_T8.condition= T8_CT1;
                grd_T8.Activations.add(new Activation(T8, "P_bus12", TransitionOperation.PopElementWithoutTarget,"end1"));

                T8.GuardMappingList.add(grd_T8);
                T8.Delay = 2;

                pn.Transitions.add(T8);


                // LANE 2 INPUT
                PetriTransition T13 = new PetriTransition(pn);
                T13.TransitionName = "T13";
                T13.InputPlaceName.add("Pa_2");
                T13.InputPlaceName.add("Px_2");

                Condition T13_CT1 = new Condition(T13, "Pa_2", TransitionCondition.NotNull);
                Condition T13_CT2 = new Condition(T13, "Px_2", TransitionCondition.CanAddCars);
                T13_CT1.SetNextCondition(LogicConnector.AND, T13_CT2);

                GuardMapping grdT13 = new GuardMapping();
                grdT13.condition = T13_CT1;
                grdT13.Activations.add(new Activation(T13, "Pa_2", TransitionOperation.AddElement, "Px_2"));
                T13.GuardMappingList.add(grdT13);

                T13.Delay = 2;
                pn.Transitions.add(T13);

                PetriTransition T14 = new PetriTransition(pn);
                T14.TransitionName = "T14";
                T14.InputPlaceName.add("Px_2");
                T4.InputPlaceName.add("P_TL_2");

                Condition T14_CT1 = new Condition(T14, "P_TL_2", TransitionCondition.Equal, "green");
                Condition T14_CT2 = new Condition(T1, "Px_2", TransitionCondition.HaveCar);
                T14_CT1.SetNextCondition(LogicConnector.AND,T14_CT2);

                GuardMapping grd_T14 = new GuardMapping();
                grd_T14.condition= T14_CT1;
                grd_T14.Activations.add(new Activation(T14, "Px_2", TransitionOperation.PopElementWithoutTarget, "Pb_2"));
                grd_T14.Activations.add(new Activation(T14, "P_TL_2", TransitionOperation.Move, "P_TL_2"));
                T1.GuardMappingList.add(grd_T1);

                Condition T114_CT1 = new Condition(T14, "Px_2",TransitionCondition.HavePriorityCar);
                GuardMapping grd_T114 = new GuardMapping();
                grd_T114.condition= T114_CT1;
                grd_T114.Activations.add(new Activation(T14, "Px_2", TransitionOperation.PopElementWithoutTarget, "Pb_2"));
                grd_T114.Activations.add(new Activation(T14, "P_TL_2", TransitionOperation.Move, "P_TL_2"));
                T14.GuardMappingList.add(grd_T114);

                T14.Delay = 2;
                pn.Transitions.add(T14);


                PetriTransition T12 = new PetriTransition(pn);
                T12.TransitionName = "T12";
                T12.InputPlaceName.add("Pb_2");
                T12.InputPlaceName.add("P_INT_4");

                Condition T12_CT1 = new Condition(T2, "Pb_2", TransitionCondition.NotNull);
                Condition T12_CT2 = new Condition(T2, "P_INT_4", TransitionCondition.CanAddCars);
                T12_CT1.SetNextCondition(LogicConnector.AND, T12_CT2);

                GuardMapping grdT12 = new GuardMapping();
                grdT12.condition = T12_CT1;
                grdT12.Activations.add(new Activation(T12, "Pb_2", TransitionOperation.AddElement, "P_INT_4"));
                T12.GuardMappingList.add(grdT12);

                T12.Delay = 2;
                pn.Transitions.add(T12);

                PetriTransition T15 = new PetriTransition(pn);
                T15.TransitionName = "T15";
                T15.InputPlaceName.add("Pa_2");
                T15.InputPlaceName.add("Px_2");
                T15.IsAsync = true;

                Condition T15_CT1 = new Condition(T15, "Pa_2", TransitionCondition.NotNull);
                Condition T15_CT2 = new Condition(T15, "Px_2", TransitionCondition.CanNotAddCars);
                T15_CT1.SetNextCondition(LogicConnector.AND,T15_CT2);

                GuardMapping grd_T15 = new GuardMapping();
                grd_T15.condition = T15_CT1;
                grd_T15.Activations.add(new Activation(T15, "full", TransitionOperation.SendOverNetwork,"OP2"));
                T15.GuardMappingList.add(grd_T15);

                T15.Delay = 2;
                pn.Transitions.add(T15);


                // LANE 2 EXIT
                PetriTransition T17 = new PetriTransition(pn);
                T17.TransitionName = "T17";
                T17.InputPlaceName.add("P_INT_4");
                T17.InputPlaceName.add("P0_2");

                Condition T17_CT1 = new Condition(T17, "P_INT_4", TransitionCondition.HaveCarForMe);
                Condition T17_CT2 = new Condition(T17, "PO_2", TransitionCondition.CanAddCars);
                T17_CT1.SetNextCondition(LogicConnector.AND,T17_CT2);

                GuardMapping grd_T17 = new GuardMapping();
                grd_T17.condition= T17_CT1;
                grd_T17.Activations.add(new Activation(T17, "P_INT_4", TransitionOperation.PopElementWithTargetToQueue, "PO_2"));
                T17.GuardMappingList.add(grd_T17);

                T17.Delay = 1;
                pn.Transitions.add(T17);


                PetriTransition T18 = new PetriTransition(pn);
                T18.TransitionName = "T18";
                T18.InputPlaceName.add("PO_2");
                Condition T18_CT1 = new Condition(T18, "PO_2", TransitionCondition.HaveCar);

                GuardMapping grd_T18 = new GuardMapping();
                grd_T18.condition= T18_CT1;
                grd_T18.Activations.add(new Activation(T18, "PO_2", TransitionOperation.PopElementWithoutTarget,"P_OE_2"));

                T18.GuardMappingList.add(grd_T18);
                T18.Delay = 2;

                pn.Transitions.add(T18);

                // LANE 3 INPUT
                PetriTransition T19 = new PetriTransition(pn);
                T19.TransitionName = "T19";
                T19.InputPlaceName.add("Pa_3");
                T19.InputPlaceName.add("Px_3");

                Condition T19_CT1 = new Condition(T19, "Pa_3", TransitionCondition.NotNull);
                Condition T19_CT2 = new Condition(T19, "Px_3", TransitionCondition.CanAddCars);
                T19_CT1.SetNextCondition(LogicConnector.AND, T19_CT2);

                GuardMapping grdT19 = new GuardMapping();
                grdT19.condition = T19_CT1;
                grdT19.Activations.add(new Activation(T19, "Pa_3", TransitionOperation.AddElement, "Px_3"));
                T19.GuardMappingList.add(grdT19);

                T19.Delay = 2;
                pn.Transitions.add(T19);

                PetriTransition T20 = new PetriTransition(pn);
                T20.TransitionName = "T20";
                T20.InputPlaceName.add("Px_3");
                T20.InputPlaceName.add("P_TL_3");

                Condition T20_CT1 = new Condition(T20, "P_TL_3", TransitionCondition.Equal, "green");
                Condition T20_CT2 = new Condition(T1, "Px_3", TransitionCondition.HaveCar);
                T20_CT1.SetNextCondition(LogicConnector.AND,T20_CT2);

                GuardMapping grd_T20 = new GuardMapping();
                grd_T20.condition= T20_CT1;
                grd_T20.Activations.add(new Activation(T20, "Px_3", TransitionOperation.PopElementWithoutTarget, "Pb_3"));
                grd_T20.Activations.add(new Activation(T20, "P_TL_3", TransitionOperation.Move, "P_TL_3"));
                T20.GuardMappingList.add(grd_T20);

                Condition T1142_CT1 = new Condition(T20, "Px_3",TransitionCondition.HavePriorityCar);
                GuardMapping grd_T1142 = new GuardMapping();
                grd_T1142.condition= T1142_CT1;
                grd_T1142.Activations.add(new Activation(T20, "Px_3", TransitionOperation.PopElementWithoutTarget, "Pb_3"));
                grd_T1142.Activations.add(new Activation(T20, "P_TL_3", TransitionOperation.Move, "P_TL_3"));
                T20.GuardMappingList.add(grd_T1142);

                T20.Delay = 2;
                pn.Transitions.add(T20);


                PetriTransition T21 = new PetriTransition(pn);
                T21.TransitionName = "T21";
                T21.InputPlaceName.add("Pb_3");
                T21.InputPlaceName.add("P_INT_4");

                Condition T21_CT1 = new Condition(T21, "Pb_3", TransitionCondition.NotNull);
                Condition T21_CT2 = new Condition(T21, "P_INT_4", TransitionCondition.CanAddCars);
                T21_CT1.SetNextCondition(LogicConnector.AND, T21_CT2);

                GuardMapping grdT21 = new GuardMapping();
                grdT21.condition = T21_CT1;
                grdT21.Activations.add(new Activation(T2, "Pb_3", TransitionOperation.AddElement, "P_INT_4"));
                T21.GuardMappingList.add(grdT21);

                T21.Delay = 2;
                pn.Transitions.add(T21);

                PetriTransition T22 = new PetriTransition(pn);
                T22.TransitionName = "T22";
                T22.InputPlaceName.add("Pa_3");
                T22.InputPlaceName.add("Px_3");
                T22.IsAsync = true;

                Condition T22_CT1 = new Condition(T22, "Pa_3", TransitionCondition.NotNull);
                Condition T22_CT2 = new Condition(T22, "Px_3", TransitionCondition.CanNotAddCars);
                T22_CT1.SetNextCondition(LogicConnector.AND,T22_CT2);

                GuardMapping grd_T22 = new GuardMapping();
                grd_T22.condition = T22_CT1;
                grd_T22.Activations.add(new Activation(T22, "full", TransitionOperation.SendOverNetwork,"OP3"));
                T22.GuardMappingList.add(grd_T22);

                T22.Delay = 2;
                pn.Transitions.add(T22);

                // LANE 3 EXIT
                PetriTransition T23 = new PetriTransition(pn);
                T23.TransitionName = "T23";
                T23.InputPlaceName.add("P_INT_4");
                T23.InputPlaceName.add("P0_3");

                Condition T23_CT1 = new Condition(T23, "P_INT_4", TransitionCondition.HaveCarForMe);
                Condition T23_CT2 = new Condition(T23, "PO_3", TransitionCondition.CanAddCars);
                T23_CT1.SetNextCondition(LogicConnector.AND,T23_CT2);

                GuardMapping grd_T23 = new GuardMapping();
                grd_T23.condition= T23_CT1;
                grd_T23.Activations.add(new Activation(T23, "P_INT_4", TransitionOperation.PopElementWithTargetToQueue, "PO_3"));
                T23.GuardMappingList.add(grd_T23);

                T23.Delay = 1;
                pn.Transitions.add(T23);


                PetriTransition T24 = new PetriTransition(pn);
                T24.TransitionName = "T24";
                T24.InputPlaceName.add("PO_3");
                Condition T24_CT1 = new Condition(T24, "PO_3", TransitionCondition.HaveCar);

                GuardMapping grd_T24 = new GuardMapping();
                grd_T24.condition= T24_CT1;
                grd_T24.Activations.add(new Activation(T24, "PO_3", TransitionOperation.PopElementWithoutTarget,"P_OE_3"));

                T24.GuardMappingList.add(grd_T24);
                T24.Delay = 2;

                pn.Transitions.add(T24);

                // LANE 4 INPUT
                PetriTransition T25 = new PetriTransition(pn);
                T25.TransitionName = "T25";
                T25.InputPlaceName.add("Pa_4");
                T25.InputPlaceName.add("Px_4");

                Condition T25_CT1 = new Condition(T25, "Pa_4", TransitionCondition.NotNull);
                Condition T25_CT2 = new Condition(T25, "Px_4", TransitionCondition.CanAddCars);
                T25_CT1.SetNextCondition(LogicConnector.AND, T25_CT2);

                GuardMapping grdT25 = new GuardMapping();
                grdT25.condition = T25_CT1;
                grdT25.Activations.add(new Activation(T25, "Pa_4", TransitionOperation.AddElement, "Px_4"));
                T25.GuardMappingList.add(grdT25);

                T25.Delay = 2;
                pn.Transitions.add(T25);

                PetriTransition T26 = new PetriTransition(pn);
                T26.TransitionName = "T26";
                T26.InputPlaceName.add("Px_4");
                T26.InputPlaceName.add("P_TL_4");

                Condition T26_CT1 = new Condition(T20, "P_TL_4", TransitionCondition.Equal, "green");
                Condition T26_CT2 = new Condition(T1, "Px_4", TransitionCondition.HaveCar);
                T26_CT1.SetNextCondition(LogicConnector.AND,T26_CT2);

                GuardMapping grd_T26 = new GuardMapping();
                grd_T26.condition= T26_CT1;
                grd_T26.Activations.add(new Activation(T26, "Px_4", TransitionOperation.PopElementWithoutTarget, "Pb_4"));
                grd_T26.Activations.add(new Activation(T26, "P_TL_4", TransitionOperation.Move, "P_TL_4"));
                T26.GuardMappingList.add(grd_T26);

                Condition T11426_CT1 = new Condition(T26, "Px_4",TransitionCondition.HavePriorityCar);
                GuardMapping grd_T11426 = new GuardMapping();
                grd_T11426.condition= T11426_CT1;
                grd_T11426.Activations.add(new Activation(T26, "Px_4", TransitionOperation.PopElementWithoutTarget, "Pb_4"));
                grd_T11426.Activations.add(new Activation(T26, "P_TL_4", TransitionOperation.Move, "P_TL_4"));
                T26.GuardMappingList.add(grd_T11426);

                T26.Delay = 2;
                pn.Transitions.add(T26);


                PetriTransition T27 = new PetriTransition(pn);
                T27.TransitionName = "T27";
                T27.InputPlaceName.add("Pb_4");
                T27.InputPlaceName.add("P_INT_4");

                Condition T27_CT1 = new Condition(T27, "Pb_4", TransitionCondition.NotNull);
                Condition T27_CT2 = new Condition(T27, "P_INT_4", TransitionCondition.CanAddCars);
                T27_CT1.SetNextCondition(LogicConnector.AND, T27_CT2);

                GuardMapping grdT27 = new GuardMapping();
                grdT27.condition = T27_CT1;
                grdT27.Activations.add(new Activation(T27, "Pb_4", TransitionOperation.AddElement, "P_INT_4"));
                T27.GuardMappingList.add(grdT27);

                T27.Delay = 2;
                pn.Transitions.add(T27);

                PetriTransition T28 = new PetriTransition(pn);
                T28.TransitionName = "T28";
                T28.InputPlaceName.add("Pa_4");
                T28.InputPlaceName.add("Px_4");
                T28.IsAsync = true;

                Condition T28_CT1 = new Condition(T28, "Pa_4", TransitionCondition.NotNull);
                Condition T28_CT2 = new Condition(T28, "Px_4", TransitionCondition.CanNotAddCars);
                T28_CT1.SetNextCondition(LogicConnector.AND,T28_CT2);

                GuardMapping grd_T28 = new GuardMapping();
                grd_T28.condition = T28_CT1;
                grd_T28.Activations.add(new Activation(T28, "full", TransitionOperation.SendOverNetwork,"OP4"));
                T28.GuardMappingList.add(grd_T22);

                T28.Delay = 2;
                pn.Transitions.add(T28);

                // LANE 4 EXIT
                PetriTransition T29 = new PetriTransition(pn);
                T29.TransitionName = "T29";
                T29.InputPlaceName.add("P_INT_4");
                T29.InputPlaceName.add("P0_4");

                Condition T29_CT1 = new Condition(T29, "P_INT_4", TransitionCondition.HaveCarForMe);
                Condition T29_CT2 = new Condition(T4, "PO_4", TransitionCondition.CanAddCars);
                T29_CT1.SetNextCondition(LogicConnector.AND,T29_CT2);

                GuardMapping grd_T29 = new GuardMapping();
                grd_T29.condition= T29_CT1;
                grd_T29.Activations.add(new Activation(T29, "P_INT_4", TransitionOperation.PopElementWithTargetToQueue, "PO_4"));
                T29.GuardMappingList.add(grd_T29);

                T29.Delay = 1;
                pn.Transitions.add(T29);


                PetriTransition T30 = new PetriTransition(pn);
                T30.TransitionName = "T30";
                T30.InputPlaceName.add("PO_4");
                Condition T30_CT1 = new Condition(T30, "PO_4", TransitionCondition.HaveCar);

                GuardMapping grd_T30 = new GuardMapping();
                grd_T30.condition= T30_CT1;
                grd_T30.Activations.add(new Activation(T30, "PO_4", TransitionOperation.PopElementWithoutTarget,"P_OE_4"));

                T30.GuardMappingList.add(grd_T30);
                T30.Delay = 2;

                pn.Transitions.add(T30);


                PetriTransition T31 = new PetriTransition(pn);
                T31.TransitionName = "T31";
                T31.InputPlaceName.add("P_OE_4");
                Condition T31_CT1 = new Condition(T31, "P_OE_4", TransitionCondition.HaveCar);

                GuardMapping grd_T31 = new GuardMapping();
                grd_T31.condition= T31_CT1;
                grd_T31.Activations.add(new Activation(T31, "P_OE_4", TransitionOperation.PopElementWithoutTarget,"P_bus21"));
                T31.GuardMappingList.add(grd_T31);
                T31.Delay = 2;

                pn.Transitions.add(T31);


                PetriTransition T34 = new PetriTransition(pn);
                T34.TransitionName = "T34";
                T34.InputPlaceName.add("P_bus21");

                Condition T34_CT1 = new Condition(T34, "P_bus21", TransitionCondition.HaveBus);
                Condition T34_CT2 = new Condition(T34, "P_bus21", TransitionCondition.HaveCarForMe);
                T34_CT1.SetNextCondition(LogicConnector.AND,T34_CT2);

                GuardMapping grd_T34 = new GuardMapping();
                grd_T34.condition= T34_CT1;
                grd_T34.Activations.add(new Activation(T34, "P_bus21", TransitionOperation.PopElementWithTargetToQueue,"P_STATION21"));

                T34.GuardMappingList.add(grd_T34);
                T34.Delay = 2;
                pn.Transitions.add(T34);


                PetriTransition T35 = new PetriTransition(pn);
                T35.TransitionName = "T35";
                T35.InputPlaceName.add("P_STATION21");
                T35.InputPlaceName.add("P_bus22");

                Condition T35_CT1 = new Condition(T35, "P_STATION21", TransitionCondition.HaveCar);
                Condition T35_CT2 = new Condition(T35, "P_bus22", TransitionCondition.CanAddCars);
                T35_CT1.SetNextCondition(LogicConnector.AND,T35_CT2);

                GuardMapping grd_T35 = new GuardMapping();
                grd_T35.condition= T35_CT1;
                grd_T35.Activations.add(new Activation(T35, "P_STATION_21", TransitionOperation.PopElementWithoutTargetToQueue,"P_bus22"));

                T35.GuardMappingList.add(grd_T35);
                T35.Delay = 2;

                pn.Transitions.add(T35);


                PetriTransition T32 = new PetriTransition(pn);
                T32.TransitionName = "T32";
                T32.InputPlaceName.add("P_bus21");
                T32.InputPlaceName.add("P_bus22");

                Condition T32_CT1 = new Condition(T32, "P_bus21", TransitionCondition.HaveCarForMe);
                Condition T32_CT2 = new Condition(T32, "P_bus22", TransitionCondition.CanAddCars);
                T32_CT1.SetNextCondition(LogicConnector.AND,T32_CT2);

                GuardMapping grd_T32 = new GuardMapping();
                grd_T32.condition = T32_CT1;
                grd_T32.Activations.add(new Activation(T32, "P_bus21", TransitionOperation.PopElementWithoutTargetToQueue,"P_bus22"));

                T32.GuardMappingList.add(grd_T32);


                T32.Delay = 2;
                pn.Transitions.add(T32);


                PetriTransition T33 = new PetriTransition(pn);
                T33.TransitionName = "T33";
                T33.InputPlaceName.add("P_bus22");

                Condition T33_CT1 = new Condition(T33, "P_bus22", TransitionCondition.HaveCar);

                GuardMapping grd_T33 = new GuardMapping();
                grd_T33.condition= T33_CT1;
                grd_T33.Activations.add(new Activation(T33, "P_bus22", TransitionOperation.PopElementWithoutTarget,"end2"));

                T33.GuardMappingList.add(grd_T33);
                T33.Delay = 2;

                pn.Transitions.add(T33);

                // LANE 5 INPUT
                PetriTransition T43 = new PetriTransition(pn);
                T43.TransitionName = "T43";
                T43.InputPlaceName.add("Pa_5");
                T43.InputPlaceName.add("Px_5");

                Condition T43_CT1 = new Condition(T43, "Pa_5", TransitionCondition.NotNull);
                Condition T43_CT2 = new Condition(T43, "Px_5", TransitionCondition.CanAddCars);
                T0_CT1.SetNextCondition(LogicConnector.AND, T43_CT2);

                GuardMapping grdT43 = new GuardMapping();
                grdT43.condition = T43_CT1;
                grdT43.Activations.add(new Activation(T43, "Pa_5", TransitionOperation.AddElement, "Px_5"));
                T19.GuardMappingList.add(grdT19);

                T43.Delay = 2;
                pn.Transitions.add(T43);

                PetriTransition T44 = new PetriTransition(pn);
                T44.TransitionName = "T44";
                T44.InputPlaceName.add("Px_5");
                T44.InputPlaceName.add("P_TL_5");

                Condition T44_CT1 = new Condition(T44, "P_TL_5", TransitionCondition.Equal, "green");
                Condition T44_CT2 = new Condition(T44, "Px_5", TransitionCondition.HaveCar);
                T44_CT1.SetNextCondition(LogicConnector.AND,T44_CT2);

                GuardMapping grd_T44 = new GuardMapping();
                grd_T44.condition= T44_CT1;
                grd_T44.Activations.add(new Activation(T44, "Px_5", TransitionOperation.PopElementWithoutTarget, "Pb_5"));
                grd_T44.Activations.add(new Activation(T44, "P_TL_5", TransitionOperation.Move, "P_TL_5"));
                T44.GuardMappingList.add(grd_T44);

                Condition T114264_CT1 = new Condition(T44, "Px_5",TransitionCondition.HavePriorityCar);
                GuardMapping grd_T114264 = new GuardMapping();
                grd_T114264.condition= T114264_CT1;
                grd_T114264.Activations.add(new Activation(T44, "Px_5", TransitionOperation.PopElementWithoutTarget, "Pb_5"));
                grd_T114264.Activations.add(new Activation(T44, "P_TL_5", TransitionOperation.Move, "P_TL_5"));
                T44.GuardMappingList.add(grd_T114264);

                T44.Delay = 2;
                pn.Transitions.add(T44);


                PetriTransition T45 = new PetriTransition(pn);
                T45.TransitionName = "T45";
                T45.InputPlaceName.add("Pb_5");
                T45.InputPlaceName.add("P_INT_4");

                Condition T45_CT1 = new Condition(T45, "Pb_5", TransitionCondition.NotNull);
                Condition T45_CT2 = new Condition(T45, "P_INT_4", TransitionCondition.CanAddCars);
                T45_CT1.SetNextCondition(LogicConnector.AND, T45_CT2);

                GuardMapping grdT45 = new GuardMapping();
                grdT45.condition = T45_CT1;
                grdT45.Activations.add(new Activation(T2, "Pb_5", TransitionOperation.AddElement, "P_INT_4"));
                T45.GuardMappingList.add(grdT45);

                T45.Delay = 2;
                pn.Transitions.add(T45);

                PetriTransition T46 = new PetriTransition(pn);
                T46.TransitionName = "T46";
                T46.InputPlaceName.add("Pa_5");
                T46.InputPlaceName.add("Px_5");
                T46.IsAsync = true;

                Condition T46_CT1 = new Condition(T46, "Pa_5", TransitionCondition.NotNull);
                Condition T46_CT2 = new Condition(T46, "Px_5", TransitionCondition.CanNotAddCars);
                T46_CT1.SetNextCondition(LogicConnector.AND,T46_CT2);

                GuardMapping grd_T46 = new GuardMapping();
                grd_T46.condition = T46_CT1;
                grd_T46.Activations.add(new Activation(T46, "full", TransitionOperation.SendOverNetwork,"OP_tram1"));
                T46.GuardMappingList.add(grd_T46);

                T46.Delay = 2;
                pn.Transitions.add(T46);

                // LANE 5 EXIT
                PetriTransition T48 = new PetriTransition(pn);
                T48.TransitionName = "T48";
                T48.InputPlaceName.add("P_INT_4");
                T48.InputPlaceName.add("P0_5");

                Condition T48_CT1 = new Condition(T48, "P_INT_4", TransitionCondition.HaveCarForMe);
                Condition T48_CT2 = new Condition(T48, "PO_5", TransitionCondition.CanAddCars);
                T48_CT1.SetNextCondition(LogicConnector.AND,T48_CT2);

                GuardMapping grd_T48 = new GuardMapping();
                grd_T48.condition= T48_CT1;
                grd_T48.Activations.add(new Activation(T48, "P_INT_4", TransitionOperation.PopElementWithTargetToQueue, "PO_5"));
                T48.GuardMappingList.add(grd_T48);

                T48.Delay = 1;
                pn.Transitions.add(T48);


                PetriTransition T51 = new PetriTransition(pn);
                T51.TransitionName = "T51";
                T51.InputPlaceName.add("PO_5");
                Condition T51_CT1 = new Condition(T51, "PO_5", TransitionCondition.HaveCar);

                GuardMapping grd_T51 = new GuardMapping();
                grd_T51.condition= T51_CT1;
                grd_T51.Activations.add(new Activation(T51, "PO_5", TransitionOperation.PopElementWithoutTarget,"P_OE_5"));

                T51.GuardMappingList.add(grd_T51);
                T51.Delay = 2;

                pn.Transitions.add(T51);


                // LANE 6 INPUT
                PetriTransition T50 = new PetriTransition(pn);
                T50.TransitionName = "T50";
                T50.InputPlaceName.add("Pa_6");
                T50.InputPlaceName.add("Px_6");

                Condition T50_CT1 = new Condition(T50, "Pa_6", TransitionCondition.NotNull);
                Condition T50_CT2 = new Condition(T50, "Px_6", TransitionCondition.CanAddCars);
                T50_CT1.SetNextCondition(LogicConnector.AND, T50_CT2);

                GuardMapping grdT50 = new GuardMapping();
                grdT50.condition = T50_CT1;
                grdT50.Activations.add(new Activation(T43, "Pa_6", TransitionOperation.AddElement, "Px_6"));
                T50.GuardMappingList.add(grdT50);

                T50.Delay = 2;
                pn.Transitions.add(T50);

                PetriTransition T52 = new PetriTransition(pn);
                T52.TransitionName = "T52";
                T52.InputPlaceName.add("Px_6");
                T52.InputPlaceName.add("P_TL_6");

                Condition T52_CT1 = new Condition(T52, "P_TL_6", TransitionCondition.Equal, "green");
                Condition T52_CT2 = new Condition(T52, "Px_6", TransitionCondition.HaveCar);
                T52_CT1.SetNextCondition(LogicConnector.AND,T52_CT2);

                GuardMapping grd_T52 = new GuardMapping();
                grd_T52.condition= T52_CT1;
                grd_T52.Activations.add(new Activation(T52, "Px_6", TransitionOperation.PopElementWithoutTarget, "Pb_6"));
                grd_T52.Activations.add(new Activation(T52, "P_TL_6", TransitionOperation.Move, "P_TL_6"));
                T52.GuardMappingList.add(grd_T52);

                Condition T1142645_CT1 = new Condition(T52, "Px_6",TransitionCondition.HavePriorityCar);
                GuardMapping grd_T1142645 = new GuardMapping();
                grd_T1142645.condition= T1142645_CT1;
                grd_T1142645.Activations.add(new Activation(T52, "Px_6", TransitionOperation.PopElementWithoutTarget, "Pb_6"));
                grd_T1142645.Activations.add(new Activation(T52, "P_TL_6", TransitionOperation.Move, "P_TL_6"));
                T52.GuardMappingList.add(grd_T1142645);

                T52.Delay = 2;
                pn.Transitions.add(T52);


                PetriTransition T53 = new PetriTransition(pn);
                T53.TransitionName = "T53";
                T53.InputPlaceName.add("Pb_53");
                T53.InputPlaceName.add("P_INT_4");

                Condition T53_CT1 = new Condition(T45, "Pb_6", TransitionCondition.NotNull);
                Condition T53_CT2 = new Condition(T45, "P_INT_4", TransitionCondition.CanAddCars);
                T53_CT1.SetNextCondition(LogicConnector.AND, T53_CT2);

                GuardMapping grdT53 = new GuardMapping();
                grdT53.condition = T53_CT1;
                grdT53.Activations.add(new Activation(T53, "Pb_6", TransitionOperation.AddElement, "P_INT_4"));
                T53.GuardMappingList.add(grdT53);

                T53.Delay = 2;
                pn.Transitions.add(T53);

                PetriTransition T54 = new PetriTransition(pn);
                T54.TransitionName = "T54";
                T54.InputPlaceName.add("Pa_6");
                T54.InputPlaceName.add("Px_6");
                T54.IsAsync = true;

                Condition T54_CT1 = new Condition(T54, "Pa_6", TransitionCondition.NotNull);
                Condition T54_CT2 = new Condition(T54, "Px_6", TransitionCondition.CanNotAddCars);
                T54_CT1.SetNextCondition(LogicConnector.AND,T54_CT2);

                GuardMapping grd_T54 = new GuardMapping();
                grd_T54.condition = T54_CT1;
                grd_T54.Activations.add(new Activation(T54, "full", TransitionOperation.SendOverNetwork,"OP_tram2"));
                T54.GuardMappingList.add(grd_T54);

                T54.Delay = 2;
                pn.Transitions.add(T54);

                // LANE 6 EXIT
                PetriTransition T55 = new PetriTransition(pn);
                T55.TransitionName = "T55";
                T55.InputPlaceName.add("P_INT_4");
                T55.InputPlaceName.add("P0_6");

                Condition T55_CT1 = new Condition(T55, "P_INT_4", TransitionCondition.HaveCarForMe);
                Condition T55_CT2 = new Condition(T48, "PO_6", TransitionCondition.CanAddCars);
                T55_CT1.SetNextCondition(LogicConnector.AND,T55_CT2);

                GuardMapping grd_T55 = new GuardMapping();
                grd_T55.condition= T55_CT1;
                grd_T55.Activations.add(new Activation(T55, "P_INT_4", TransitionOperation.PopElementWithTargetToQueue, "PO_6"));
                T55.GuardMappingList.add(grd_T55);

                T55.Delay = 1;
                pn.Transitions.add(T55);


                PetriTransition T56 = new PetriTransition(pn);
                T56.TransitionName = "T56";
                T56.InputPlaceName.add("PO_6");
                Condition T56_CT1 = new Condition(T56, "PO_6", TransitionCondition.HaveCar);

                GuardMapping grd_T56 = new GuardMapping();
                grd_T56.condition= T56_CT1;
                grd_T56.Activations.add(new Activation(T56, "PO_6", TransitionOperation.PopElementWithoutTarget,"P_OE_6"));

                T56.GuardMappingList.add(grd_T56);
                T56.Delay = 2;

                pn.Transitions.add(T56);

                // -------------------------------------------------------------------------------------
                // ----------------------------PNStart-------------------------------------------------
                // -------------------------------------------------------------------------------------

                System.out.println("Intersection 4 started \n ------------------------------");
                pn.Delay = 2000;
                // pn.Start();

                PetriNetWindow frame = new PetriNetWindow(false);
                frame.petriNet = pn;
                frame.setVisible(true);

        }
}
