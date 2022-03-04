package homework5;
import java.lang.Number;
@FunctionalInterface
public interface NumberInterface {
    void operation(Number number1, Number number2);
    default void defaultMethod(){
        System.out.println(" ");

    }
}
