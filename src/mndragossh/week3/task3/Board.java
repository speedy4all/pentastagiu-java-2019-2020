package src.mndragossh.week3.task3;

import java.util.ArrayList;

public class Board {
    private ArrayList<Message> messages;

    public Board() {
        this.messages = new ArrayList<>();
    }

    public void postMessage(Message userMessage) {
        messages.add(userMessage);
    }

    public void prindBoardMessages() {
        for (var message : messages
        ) {
            System.out.println(String.format("Author @%s", message.author.getName()));
            System.out.println("Message: " + message.description);
        }
    }
}
