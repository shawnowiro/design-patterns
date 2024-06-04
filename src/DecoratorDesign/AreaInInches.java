package DecoratorDesign;

public class AreaInInches implements ShapeArea{
    private double area;
    private ShapeArea shape;

    public  AreaInInches(ShapeArea shape) {
        this.shape = shape;
        DisplayArea();

    }
    public void DisplayArea(){
        System.out.println("Area in Inches : " + this.CalculateArea() + " inches");
    }

    @Override
    public double CalculateArea() {
        double Area = shape.CalculateArea();
        return (Area * 0.393701 * 0.393701);
    }
}
