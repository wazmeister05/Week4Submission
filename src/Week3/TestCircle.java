package Week3;

public class TestCircle {

    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("The circle has a radius of: " + c1.getRadius() + ", and an area of: " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has a radius of: " + c2.getRadius() + ", and an area of: " + c2.getArea());
    }
}
