package ex3;

class Main {

    public static void main(String[] args) {

        User user1 = new User("David", "david3@gmail.com");

        User user2 = new User("Diana", "dianaaa@gmail.com");

        Message message1 = new Message("Description", "User3");

        Message message2 = new Message("Description3", "User4");



        Board board = new Board();

        board.addMessages(message1);

        board.addMessages(message2);

        board.displayMessages();

    }

}