package Circle;

public class TestCylinder {

    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Circle.Cylinder radius: " + c1.getRadius() +
                "\nCircle.Cylinder height: " + c1.getHeight() +
                "\nCircle.Cylinder area: " + c1.getArea() +
                "\nCircle.Cylinder volume: " + c1.getVolume() +
                "\nCircle.Cylinder colour: " + c1.getColor());

        Cylinder c2 = new Cylinder(2.0);
        System.out.println("\nCircle.Cylinder radius: " + c2.getRadius() +
                "\nCircle.Cylinder height: " + c2.getHeight() +
                "\nCircle.Cylinder area: " + c2.getArea() +
                "\nCircle.Cylinder volume: " + c2.getVolume() +
                "\nCircle.Cylinder colour: " + c2.getColor());

        Cylinder c3 = new Cylinder(34.0, 3.0);
        System.out.println("\nCircle.Cylinder radius: " + c3.getRadius() +
                "\nCircle.Cylinder height: " + c3.getHeight() +
                "\nCircle.Cylinder area: " + c3.getArea() +
                "\nCircle.Cylinder volume: " + c3.getVolume() +
                "\nCircle.Cylinder colour: " + c3.getColor());

        Cylinder c4 = new Cylinder(6.0, 10.0, "blue");
        System.out.println("\nCircle.Cylinder radius: " + c4.getRadius() +
                "\nCircle.Cylinder height: " + c4.getHeight() +
                "\nCircle.Cylinder area: " + c4.getArea() +
                "\nCircle.Cylinder volume: " + c4.getVolume() +
                "\nCircle.Cylinder colour: " + c4.getColor());
    }
}
