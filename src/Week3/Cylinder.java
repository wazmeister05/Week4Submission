package Week3;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    public String toString(){
        return "Cylinder[radius=" + getRadius() + ",height=" + height + ",color=" + getColor() + "]";
    }

    /*
    Extend the code above such that you now have a program that allows
    the user to enter and store the details of up to 100 cylinders in a
    multi-dimensional
    array and to loop over that array retrieving and printing the details
    below for each cylinder.
    
    Cylinder Number 1 : Radius is 5.0 Height is 2.0
    Color is red Base area is 78.53981633974483 Volume is 157.07963267948966
     */
}

