package Homework3.EX1;

public class Main {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5);
        System.out.println(myCircle);
        System.out.println("Area is: " + myCircle.area());
        System.out.println("Perimeter is: " + myCircle.perimeter());
       /* myCircle.setRadius(7);
        System.out.println("Radius is now: " + myCircle.getRadius());

        System.out.println("Area is: " + myCircle.area());
        System.out.println("Perimeter is: " + myCircle.perimeter());
*/
        Circle myOtherCircle = new Circle(5);
        System.out.println(myOtherCircle);
        System.out.println("Area is: " + myOtherCircle.area());
        System.out.println("Perimeter is: " + myOtherCircle.perimeter());

        System.out.println(myCircle == myOtherCircle);

        if (myCircle.area()> myOtherCircle.area()) {
            System.out.println("The area of the first circle is bigger");
        }
        else if (myOtherCircle.area()>myCircle.area()){
            System.out.println("The area of the first circle is smaller");
        }
        else {
            System.out.println("The both circles have the same value of area");
        }

        Rectangle myRectangle1 = new Rectangle(4,3);
        System.out.println(myRectangle1);
        System.out.println("Area is: " + myRectangle1.area());
        System.out.println("Perimeter is: " + myRectangle1.perimeter());

        Rectangle myRectangle2 = new Rectangle(6,5);
        System.out.println(myRectangle2);
        System.out.println("Area is: " + myRectangle2.area());
        System.out.println("Perimeter is: " + myRectangle2.perimeter());

        if (myRectangle1.area()> myRectangle2.area()) {
            System.out.println("The area of the first rectangle is bigger");
        }
        else if (myRectangle2.area()>myRectangle1.area()){
            System.out.println("The area of the first rectangle is smaller");
        }
        else {
            System.out.println("The both rectangles have the same value of area");
        }
        
        Square mySquare1 = new Square(3);
        System.out.println(mySquare1);
        System.out.println("Area is: " + mySquare1.area());
        System.out.println("Perimeter is: " + mySquare1.perimeter());

        Square mySquare2 = new Square(2.5);
        System.out.println(mySquare2);
        System.out.println("Area is: " + mySquare2.area());
        System.out.println("Perimeter is: " + mySquare2.perimeter());

        if (mySquare1.area()> mySquare2.area()) {
            System.out.println("The area of the first square is bigger");
        }
        else if (mySquare2.area()>mySquare1.area()){
            System.out.println("The area of the first square is smaller");
        }
        else {
            System.out.println("The both squares have the same value of area");
        }
        
        Triangle myTriangle1=new Triangle(3,4,5);
        System.out.println(myTriangle1);
        System.out.println("Area is: " + myTriangle1.area());
        System.out.println("Perimeter is: " + myTriangle1.perimeter());

        Triangle myTriangle2=new Triangle(4,5,6);
        System.out.println(myTriangle2);
        System.out.println("Area is: " + myTriangle2.area());
        System.out.println("Perimeter is: " + myTriangle2.perimeter());

        if (myTriangle1.area()> myTriangle2.area()) {
            System.out.println("The area of the first triangle is bigger");
        }
        else if (myTriangle2.area()>myTriangle1.area()){
            System.out.println("The area of the first triangle is smaller");
        }
        else {
            System.out.println("The both triangles have the same value of area");
        }
    }
}
