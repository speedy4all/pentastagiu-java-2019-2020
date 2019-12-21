package problem3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Math", "math33@gmail.com");
        User user2 = new User("Kim", "kim@gmail.com");
        Message message1 = new Message("Description", "User2");
        Message message2 = new Message("Description2", "User2");

        Board board = new Board();
        board.addMessages(message1);
        board.addMessages(message2);
        board.displayMessages();
    }
}