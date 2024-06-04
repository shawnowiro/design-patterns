package factoryMethod;

import singleton.SingletonDB;

public class Main {
    public static void main(String[] args) {
        Circle cirlce = (Circle) Shape.Createshape("cirle");
        System.out.println(cirlce.getShapeName());

        Rectangle rectangle = (Rectangle) Shape.Createshape("rectangle");
        System.out.println(rectangle.getShapeName());

        Shape cube = Shape.Createshape("circle");
        System.out.println(cube);
    }

}
