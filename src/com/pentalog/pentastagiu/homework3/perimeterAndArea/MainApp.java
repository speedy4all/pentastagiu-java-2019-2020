
//Create an application that knows how to calculate the perimeter and area for common shapes(circle, square, rectangle, triangle)
//To test it: create few objects of each type and print to the console information about the object that has the biggest area

package com.pentalog.pentastagiu.homework3.perimeterAndArea;

import com.sun.deploy.security.WinDeployNTLMAuthCallback;

import java.util.ArrayList;
import java.util.List;

public class MainApp {




    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Rectangle drept=new Rectangle(19,12);
        System.out.println(drept.area());
        System.out.println(drept.perimeter());
        Square patra=new Square(11);
        System.out.println(patra.area());
        System.out.println(patra.perimeter());
       shapes.add(drept);

       shapes.add(patra);
        int ariaCeaMaiMare = 0;

        int index = 0;
        int i = 0;
        for (Shape shape : shapes) {
//            System.out.println("shape = " + shape + " i" + i);
        //adunare arie cea mai mare
            if (ariaCeaMaiMare < shape.area()) {

                ariaCeaMaiMare = shape.area();
               index=shapes.indexOf(shape);

            }
            i++;
        }
         System.out.println("Aria cea mai mare o are = " + shapes.get(index));

    }




}
