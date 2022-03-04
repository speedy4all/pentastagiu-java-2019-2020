package homework2.problem3;

public class MainApp {
    public static void main(String[] args) {
        User user1 = new User("Maria", "maria@gmail.com");
        user1.sendMessage("Message from " + user1.getName() );
        User user2 = new User("Ana", "ana@gmail.com");
        user2.sendMessage("Message from " + user2.getName() );
        User user3 = new User("Dana", "dana@gmail.com");
        user3.sendMessage("Message from " + user3.getName() );

        Board board = new Board();
        board.register(user1);
        board.register(user2);
        board.register(user3);

        board.displayAllMessages();




    }


}
