package homework5;
import java.lang.Number;
public class NumberApp {
    public static void main(String[] args) {
        NumberInterface addition = (Number x, Number y) -> System.out.println(x.intValue() + y.intValue());
        addition.operation(20, 30);
        NumberInterface substraction = (Number x, Number y) -> System.out.println(x.intValue() - y.intValue());
        substraction.operation(20, 30);
        NumberInterface mulpiply = (Number x, Number y) -> System.out.println(x.intValue() * y.intValue());
        mulpiply.operation(20, 30);
        NumberInterface divide = (Number x, Number y) -> System.out.println(x.doubleValue() / y.doubleValue());
        divide.operation(20, 30);

        //nu am inteles partea asta din tema, ce ar trebui sa faca :(
        //  NumberApp numberApp = new NumberApp();
        //  numberApp.operate(20, 30, addition);
    }

    public void operate(Number x, Number y, NumberInterface z) {

    }
}
