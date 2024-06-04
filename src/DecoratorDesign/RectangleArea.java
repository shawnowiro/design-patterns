package DecoratorDesign;

public class RectangleArea implements ShapeArea{
    public static int width;
    public static  int length;

    public RectangleArea(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double CalculateArea() {
        double Area = width * length;
        return Area;
    }

}
