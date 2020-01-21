package com.pentalog.pentastagiu.homework4.CircleList;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Circle> ListWithCircle=new ArrayList<>();
        double rand=Math.random()*10;
        while(rand>1)
        {
            double radiusCircle=Math.random()*10+1;
            Circle firstCircle=new Circle(radiusCircle);
            ListWithCircle.add(firstCircle);
            rand=Math.random()*10;
        }
        for(Circle iterator:ListWithCircle) {
            System.out.println("The area of circle is " + iterator.getArea());
        }




    }
}
