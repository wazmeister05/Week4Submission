package Week2;

//for Week 2.9
public class Circle extends Shape {

    protected double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double rad){  //because this constructor is doubly awesome.
        super();
        radius = rad;           //literally used rad instead of radius for that joke
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle. Area: "+ getArea() +". Radius: "+ getRadius() +". Perimeter: "+ getPerimeter() +". Color: "+ getColor() +". Filled: "+ isFilled();
    }
}
