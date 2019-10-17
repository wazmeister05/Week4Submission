package Week3;

import java.util.Scanner;

public class ManyCylinders extends Cylinder{

    Cylinder[][] cylinders;
    private Scanner scanner;

    //initialise scanner
    public ManyCylinders(int noOfCylinders){
        scanner = new Scanner(System.in);
        cylinders = new Cylinder[noOfCylinders][1];
    }

    public String defOrCust(){
        System.out.print("(D)efault or (C)ustomised size? > ");
        return scanner.next();
    }

    public void defaultCylinders(int noOfCylinders){
        for (int i = 0; i < noOfCylinders; i++){
            for (int j = 0; j < cylinders[i].length; j++) {
                Cylinder cylinder = new Cylinder();
                cylinders[i][j] = cylinder;
            }
        }
    }

    public void customCylinders(int noOfCylinders, double height, double rad){
        for (int i = 0; i < noOfCylinders; i++){
            for (int j = 0; j < cylinders[i].length; j++) {
                Cylinder cylinder = new Cylinder(rad, height);
                cylinders[i][j] = cylinder;
            }
        }
    }

}
