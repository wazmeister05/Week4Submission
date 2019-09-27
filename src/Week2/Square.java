package Week2;

public class Square extends Rectangle {

    protected double side;

    public Square(){
        this.side = 1.0;
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side){
        this.width = side;
    }

    @Override
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "Square. Area: "+ getArea() +". Width and Length: "+ getSide() + ". Perimeter: " + getPerimeter()+ ". Color: "+ getColor() +". Filled: "+ isFilled();
    }

}
