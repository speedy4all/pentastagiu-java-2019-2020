package com.pentalog.pentastagiu.homework2.registration;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static List<String> messageList = new ArrayList<>();
    public static StringBuilder boardMessage;

    public static void writeMessage(String message){
        boardMessage.append(System.getProperty("line.separator"));
        boardMessage.append(message);
    }

    public Board() {
        boardMessage = new StringBuilder();
    }

    public static String getBoardMessage() {
        return boardMessage.toString();
    }
}
