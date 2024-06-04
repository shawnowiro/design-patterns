package ObserverDesign;

public class Main {
    public static void main(String[] args) {
        TrafficStation trafficGiver = new TrafficStation();

        trafficArea Trmtraffic = new trafficArea("Thika");
        trafficArea embatraffic = new trafficArea("Embakasi");
        trafficArea ruirutraffic = new trafficArea("Ruiru");


        trafficGiver.RegisterTraffic(Trmtraffic);
        trafficGiver.RegisterTraffic(embatraffic);
        trafficGiver.RegisterTraffic(ruirutraffic);

        trafficGiver.RemoveTraffic(ruirutraffic);

        trafficGiver.Setlight("blue");

    }
}
