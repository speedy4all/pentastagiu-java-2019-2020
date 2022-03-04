package homework5;

import java.util.Arrays;
import java.util.List;

public class AppCircle {
    public static void main(String[] args) {

        List<Circle> circles = Arrays.asList(new Circle(), new Circle(), new Circle(), new Circle(), new Circle(), new Circle(),
                new Circle(), new Circle(), new Circle(), new Circle(), new Circle());

        circles.stream()
                .peek(System.out::println)
                .map(Circle::getArea)
                .forEach(System.out::println);
    }
}
