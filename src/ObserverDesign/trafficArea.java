package ObserverDesign;
//observes the traffic Station for the light and subsribes to the station to get the light
public class trafficArea {
    String Area;
    String Light;
    public trafficArea(String area){
        this.Area = area;
    }
    void NotifyLight(String light){
        this.Light = light;

    }
    public void DisplayLight(){
        System.out.println("Traffic in " + Area + " display : " + Light);
    }

}
