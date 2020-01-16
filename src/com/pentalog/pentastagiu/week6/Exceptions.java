package com.pentalog.pentastagiu.week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class Exceptions {

    public static void main(String[] args) {
//        try {
//            readFile();
//        } catch (RuntimeException | FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("Finally close the file");
//        }

//        int result = 0;
//        try{
//            result = divide(null, 3);
//        } catch (ArithmeticException | NullPointerException ex) {
//            System.out.println(ex.getMessage());
//            return;
//        } finally {
//            System.out.println(result);
//        }

        try {
            System.out.println(checkAccount("Alin"));

            System.out.println(checkAccount(null));
        } catch (InsufficientFoundsException ex) {
            System.out.println(ex.getAmount());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Program finished with success");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
    }

    public static int divide(Integer a, Integer b) throws ArithmeticException {
        return a / b;
    }

    public static double checkAccount(String id) throws InsufficientFoundsException {

        if (id.equals("bogdan")) {
            throw new InsufficientFoundsException(200);
        }
        return 500;
    }
}