package com.pentalog.pentastagiu.week5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Lists {


    public static void main(String[] args) {

        Integer[] oldArray = {1, 2, 3, 4, 5};

        List<Integer> newList = new ArrayList<>();
        System.out.println(newList);

        newList.addAll(Arrays.asList(oldArray));
        System.out.println(newList);

        List<Integer> newListWithElements = new ArrayList<>(Arrays.asList(oldArray));
        System.out.println(newListWithElements);

        //Add element
        newList.add(6);
        newList.add(6);
        newList.add(5, 7);
        System.out.println(newList);

        //remove
//        newList.remove(Integer.valueOf(7));
        int indexOf7 = newList.indexOf(Integer.valueOf(7));
//        int indexOf7 = newList.indexOf(7);
        newList.remove(indexOf7);
        System.out.println(newList);

//        /retrieve
        int indexOfOne = newList.indexOf(1);
        System.out.println("Index of 1: " + indexOfOne);
        Integer one = newList.get(indexOfOne);
        System.out.println(one);


        //Stive

        System.out.println("STIVA");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        Integer headOfStack = stack.peek();
        System.out.println(headOfStack);
        System.out.println(stack);
    }
}
