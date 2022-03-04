package AppShapes;

public class AppShape {
    public static void main(String[] args) {
        Shape circle = new Circle(2.5);
        Calculate operCircle = new Calculate();
        operCircle.calculate(circle);

        Shape circle2 = new Circle(3.5);
        Calculate operCircle2 = new Calculate();
        operCircle2.calculate(circle2);

        Shape triangle = new Triangle(3, 5, 6,5);
        Calculate operTriangle = new Calculate();
        operTriangle.calculate(triangle);

        Shape rectangle = new Rectangle(10.8, 5.4);
        Calculate operRect = new Calculate();
        operRect.calculate(rectangle);

        Shape rectangle2 = new Rectangle(15, 9.4);
        Calculate operRect2 = new Calculate();
        operRect2.calculate(rectangle2);

        Shape square = new Square(5);
        Calculate operSquare = new Calculate();
        operSquare.calculate(square);

        Shape [] availablaShapes = new Shape[]{circle,circle2,square,rectangle,triangle,rectangle2};
        Shape largestAria = availablaShapes[5];
        Shape largestPerimeter = availablaShapes[5];
        for(int i=0; i<availablaShapes.length ; i++){
            if(availablaShapes[i].getAria() > largestAria.getAria()){
                largestAria=availablaShapes[i];
            }
        }
        System.out.println("\nThe largest area is: " + largestAria);

        for(int i=0; i<availablaShapes.length ; i++){
            if(availablaShapes[i].getPerimeter() > largestPerimeter.getPerimeter()){
                largestPerimeter=availablaShapes[i];
            }
        }
        System.out.println("\nThe largest perimeter is: " + largestPerimeter);
    }

}
