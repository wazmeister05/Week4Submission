package Week3;

import java.util.Scanner;

public class ManyCylinders extends Cylinder{

    Cylinder[] cylinders;
    private Scanner scanner;

    //initialise scanner
    public ManyCylinders(){
        scanner = new Scanner(System.in);
    }

    public void fillCylinderOfCylinders(){
        System.out.print("Please enter number of cylinders: ");
        int noOfCylinders = scanner.nextInt();
        cylinders = new Cylinder[noOfCylinders];
        for (int i = 0; i < noOfCylinders; i++){
            System.out.print("(D)efault or (C)ustomised size? > ");
            //haven't added any sort of exception handling because that wasn't required.
            //user will select D or C to determine which path to take, FOR EACH INDIVIDUAL CYLINDER
            String choice = scanner.next();
            if (choice.toLowerCase().equals("d")){
                cylinders[i] = new Cylinder();
            }
            else{
                System.out.print("Height > ");
                double height = scanner.nextDouble();
                System.out.print("Radius > ");
                double rad = scanner.nextDouble();
                cylinders[i] = new Cylinder(rad, height);
            }

        }
    }

}
