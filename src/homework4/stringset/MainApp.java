package homework4.stringset;

import jdk.nashorn.internal.codegen.Compiler;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class MainApp {

    public static void main(String[] args) {
        Set<String> setOfStocks = new HashSet<>();
        setOfStocks.add("INFY");
        setOfStocks.add("BABA");
        setOfStocks.add("GOOG");
        setOfStocks.add("MSFT");
        setOfStocks.add("AMZN");


        Iterator<String> itr = setOfStocks.iterator(); // traversing over HashSet System.out.println("Traversing over Set using Iterator");
         while(itr.hasNext()){
             System.out.println(itr.next());
         }


        System.out.println("Looping over HashSet using advanced for loop");
         for (String stock : setOfStocks) {

             System.out.println(stock); }

        System.out.println("stream");

        Stream<String> stringStream=setOfStocks.stream();

         stringStream.forEach(elem-> System.out.println(elem+" "));


    }

}
