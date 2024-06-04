package DecoratorDesign;

public class AreaInCm implements ShapeArea  {
    private final ShapeArea shape;

    public AreaInCm(ShapeArea shape) {
        this.shape = shape;
        DisplayArea();
    }
    public void DisplayArea(){
        System.out.println("Area in Centimeters : " + this.CalculateArea() + "cm");
    }

    @Override
    public double CalculateArea() {

        return shape.CalculateArea();
    }
}
