package Week3;

import java.util.Scanner;

public class TestCylinder {

    public static void main(String[] args){


        System.out.println("\nThese are the default cylinders");
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


        System.out.println("\n\n");


        //create the cylinder array and populate it before printing everything
        /*
        This problem bothered me. I wanted to create a 10x10 array and populate that but it turns out that
        if you create say 4 cylinders, it creates the 4 and then iterates over the rest of the array anyway.
        So my solution (probably the wrong one) was to create an array of length [specified by user] and depth 1.
        So it's still a multidimensional array, it just has a very flat second dimension.
         */

        System.out.print("Please enter number of cylinders: ");
        Scanner scanner = new Scanner(System.in);
        int noOfCylinders = scanner.nextInt();

        ManyCylinders mc = new ManyCylinders(noOfCylinders);
        if (mc.defOrCust().toLowerCase().equals("d")){
            mc.defaultCylinders(noOfCylinders);
        }
        else {
            System.out.print("Height > ");
            double height = scanner.nextDouble();
            System.out.print("Radius > ");
            double rad = scanner.nextDouble();
            mc.customCylinders(noOfCylinders, height, rad);
        }

        //below are the ones from the array
        System.out.println("\n----------------------------------------------");
        System.out.println("Below are the cylinders stored in the array\n");

        for(int i = 0; i < mc.cylinders.length; i++) {
            for (int j = 0; j < mc.cylinders[i].length; j++) {
                System.out.println("\nCylinder radius: " + mc.cylinders[i][j].getRadius() +
                        ". Cylinder height: " + mc.cylinders[i][j].getHeight() +
                        ". Cylinder area: " + mc.cylinders[i][j].getArea() +
                        ". Cylinder volume: " + mc.cylinders[i][j].getVolume() +
                        ". Cylinder colour: " + mc.cylinders[i][j].getColor());
            }
        }

    }
}
