package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

//holds the list of traffic area and notifies for any change
public class TrafficStation {
    String Light;
    List<trafficArea> traffics = new ArrayList<>();

    void RegisterTraffic(trafficArea traffic){
        traffics.add(traffic);
    }
    void RemoveTraffic(trafficArea traffic){
        traffics.remove(traffic);
    }

    void NotifyTraffic(){
        for(trafficArea traffic : traffics){
            traffic.NotifyLight(Light);
            traffic.DisplayLight();
        }
    }

    void Setlight(String light){
        this.Light = light;
        NotifyTraffic();
    }

}
