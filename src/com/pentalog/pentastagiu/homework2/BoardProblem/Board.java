package com.pentalog.pentastagiu.homework2.BoardProblem;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private static Board boardSingleton;

    private List<Message> messageList;

    private Board() {
        this.messageList = new ArrayList<>();
    }

    public static Board getInstance() {
        if (boardSingleton == null) {
            synchronized (Board.class) {
                if (boardSingleton == null) {
                    boardSingleton = new Board();
                }
            }
        }
        return boardSingleton;
    }

    public void addMessage(Message message) {
        messageList.add(message);
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    @Override
    public String toString() {
        return "Board{" +
                "messageList=" + messageList +
                '}';
    }
}
