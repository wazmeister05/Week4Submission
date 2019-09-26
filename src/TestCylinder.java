public class TestCylinder {

    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder radius: " + c1.getRadius() +
                "\nCylinder height: " + c1.getHeight() +
                "\nCylinder area: " + c1.getArea() +
                "\nCylinder volume: " + c1.getVolume() +
                "\nCylinder colour: " + c1.getColor());

        Cylinder c2 = new Cylinder(2.0);
        System.out.println("\nCylinder radius: " + c2.getRadius() +
                "\nCylinder height: " + c2.getHeight() +
                "\nCylinder area: " + c2.getArea() +
                "\nCylinder volume: " + c2.getVolume() +
                "\nCylinder colour: " + c2.getColor());

        Cylinder c3 = new Cylinder(34.0, 3.0);
        System.out.println("\nCylinder radius: " + c3.getRadius() +
                "\nCylinder height: " + c3.getHeight() +
                "\nCylinder area: " + c3.getArea() +
                "\nCylinder volume: " + c3.getVolume() +
                "\nCylinder colour: " + c3.getColor());

        Cylinder c4 = new Cylinder(6.0, 10.0, "blue");
        System.out.println("\nCylinder radius: " + c4.getRadius() +
                "\nCylinder height: " + c4.getHeight() +
                "\nCylinder area: " + c4.getArea() +
                "\nCylinder volume: " + c4.getVolume() +
                "\nCylinder colour: " + c4.getColor());
    }
}
