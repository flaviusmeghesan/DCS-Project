package src.FinalProject_TrafficLights;

public class Intersection1 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Intersection1";
        pn.NetworkPort = 1080;

        DataObjects.DataString green = new DataObjects.DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataObjects.DataString full = new DataObjects.DataString();
        full.Printable = false;
        full.SetName("full");
        full.SetValue("full");
        pn.ConstantPlaceList.add(full);




        




















    }
}
