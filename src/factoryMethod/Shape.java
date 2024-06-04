package factoryMethod;

public abstract class Shape {
    public abstract String getShapeName();
    public  static Shape Createshape(String shape){
        if (shape == "circle"){
            return new Circle();
        } else if(shape == "rectangle"){
            return new Rectangle();
        } else {
            System.err.println("Cannot Create Specified Animal");
        }
        throw new RuntimeException();
    };
}
