package Week2;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }



    //these are to be overridden by subclasses
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

}
