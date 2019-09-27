package Week2;

public class TestShapes {


    Circle circle1, circle2, circle3;
    Rectangle rectangle1, rectangle2, rectangle3;
    Square square1, square2, square3;

    Shape circle4, square4, rectangle4;

    public TestShapes() {

        //standard cases to show each constructor is working.
        //These should all just run like normal as the methods are being overridden
        circle1 = new Circle();
        circle2 = new Circle(4);
        circle3 = new Circle(6, "Purple", false);

        rectangle1 = new Rectangle();
        rectangle2 = new Rectangle(2, 4);
        rectangle3 = new Rectangle(3, 12, "Green", true);

        square1 = new Square();
        square2 = new Square(2);
        square3 = new Square(3, "Blue", false);

        //Static shapes with dynamic references.
        //The compiler should be happy to run these as I'm casting
        circle4 = new Circle();
        square4 = new Square();
        rectangle4 = new Rectangle();

    }

    public void run(){

        //these will print without issue
        System.out.println("Circles");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        System.out.println();

        //these will print without issue
        System.out.println("Rectangles");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());
        System.out.println();

        //these will print without issue
        System.out.println("Squares");
        System.out.println(square1.toString());
        System.out.println(square2.toString());
        System.out.println(square3.toString());
        System.out.println();

        //These are Shapes according to the compiler, but at runtime will be
        //regarded as their particular dynamic type and call the appropriate
        //method.
        System.out.println("Shapes");
        System.out.println(circle4.toString());
        System.out.println(rectangle4.toString());
        System.out.println(square4.toString());
    }

    public static void main(String[] args){
        TestShapes test = new TestShapes();
        test.run();
    }

}
