package com.pentalog.pentastagiu.week5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Lists {


    public static void main(String[] args) {

        Integer[] oldArray = {1,2,3,4,5};

        List<Integer> newList = new ArrayList<>();
        System.out.println(newList);

        newList.addAll(Arrays.asList(oldArray));
        System.out.println(newList);

        List<Integer> newListWithElements = new ArrayList<>(Arrays.asList(oldArray));
        System.out.println(newListWithElements);

        //add element
        newList.add(6);
        System.out.println(newList);
        newList.add(5, 7);
        System.out.println(newList);

        //remove
        newList.remove(Integer.valueOf(7));
        System.out.println(newList);
        newList.remove(5);
        System.out.println(newList);
        int res = newList.indexOf(4);
        System.out.println(res);

        //Stiva
        System.out.println("======STIVA======>");
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        Integer headOfStack = stack.peek();
        System.out.println(headOfStack);



    }
}
