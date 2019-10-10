package Week3;

import java.util.Scanner;

public class ManyCylinders {

    Cylinder[] cylinders;
    private Scanner scanner;

    public ManyCylinders(){
        scanner = new Scanner(System.in);
    }

    public void fillCylinderOfCylinders(){
        System.out.print("Please enter number of cylinders: ");
        int noOfCylinders = scanner.nextInt();
        for (int i = 0; i <= noOfCylinders; i++){
            cylinders[i] = new Cylinder();
        }
    }

}
