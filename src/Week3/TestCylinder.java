package Week3;

public class TestCylinder {

    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder radius: " + c1.getRadius() +
                ". Cylinder height: " + c1.getHeight() +
                ". Cylinder area: " + c1.getArea() +
                ". Cylinder volume: " + c1.getVolume() +
                ". Cylinder colour: " + c1.getColor());

        Cylinder c2 = new Cylinder(5.0, 2.0);
        System.out.println("\nCylinder radius: " + c2.getRadius() +
                ". Cylinder height: " + c2.getHeight() +
                ". Cylinder area: " + c2.getArea() +
                ". Cylinder volume: " + c2.getVolume() +
                ". Cylinder colour: " + c2.getColor());
    }
}
