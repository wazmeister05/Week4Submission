//for Week 2.9
public class Circle {

    private double radius;
    private String color;


    public Circle() {
        radius = 1.0;
        color = "red";
    }

    //because this constructor is double awesome.
    public Circle(double rad){
        radius = rad;
        color = "red";
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
