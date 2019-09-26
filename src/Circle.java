import java.util.Scanner;

//for Week 2.9
public class Circle {

    private double radius;
    private String color;

    private Circle(double d, String colour){
        radius = d;
        color = colour;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please specify colour code: ");

        double colourCode = scanner.nextDouble();
        String colour = setColour(colourCode);
        Circle circle = new Circle(setRadius(), colour);

        System.out.println(circle.getColor(circle));
        System.out.println(circle.getRadius(circle));
        System.out.println(circle.getArea(circle));

    }


    private double getRadius(Circle circle){
        return circle.radius;
    }

    private double getArea(Circle circle){
        return Math.PI * Math.pow(circle.radius, 2);
    }

    private String getColor(Circle circle){
        return circle.color;
    }

    private static double setRadius(){
        System.out.print("What is the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        double userSpec = scanner.nextDouble();
        return userSpec;
    }
    
    private static String setColour(double colorCode) {

        if (colorCode >= 0 && colorCode <= 5) {
            return "red";
        } else if (colorCode >= 6 && colorCode <= 10) {
            return "amber";
        } else if (colorCode >= 11 && colorCode <= 15){
            return "black";
        } else if (colorCode >= 16 && colorCode <= 20) {
            return "blue";
        } else if (colorCode >= 21 && colorCode <= 25){
            return "beige";
        } else if (colorCode > 25){
            return "maroon";
        } else return null;
    }

}
