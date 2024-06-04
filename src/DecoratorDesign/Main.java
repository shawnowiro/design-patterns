package DecoratorDesign;

public class Main {
    public static void main(String[] args) {
        RectangleArea rec1 = new RectangleArea(20,10);

        AreaInInches areainches = new AreaInInches(rec1);
        AreaInCm areaCm = new AreaInCm(rec1);



    }
}
