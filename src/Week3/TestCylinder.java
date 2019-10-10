package Week3;

public class TestCylinder {

    public static void main(String[] args){

        //create the cylinder array and populate it before printing everything
        ManyCylinders mc = new ManyCylinders();
        mc.fillCylinderOfCylinders();

        System.out.println("\nThese the default cylinders");
        System.out.println();
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

        //below are the ones from the array
        System.out.println("\n----------------------------------------------");
        System.out.println("Below are the cylinders stored in the array\n");

        for(int i = 0; i < mc.cylinders.length; i++){
            System.out.println("\nCylinder radius: " + mc.cylinders[i].getRadius() +
                    ". Cylinder height: " + mc.cylinders[i].getHeight() +
                    ". Cylinder area: " + mc.cylinders[i].getArea() +
                    ". Cylinder volume: " + mc.cylinders[i].getVolume() +
                    ". Cylinder colour: " + mc.cylinders[i].getColor());
        }

    }
}
