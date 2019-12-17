package src.mndragossh.week3.task3;

public class Task3Main {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("First User", "first@gmail.com"),
                new User("Second User", "second@gmail.com"),
                new User("Third User", "third@gmail.com"),
                new User("Fourth User", "fourth@gmail.com"),
                new User("Fifth User", "fifth@gmail.com"),
        };
        Board board = new Board();
        for (var user : users
        ) {
            board.postMessage(
                    new Message(user,
                            String.format("Hello I'm %s and this is %s message", user.getName(),
                                    user.getName().split(" ")[0].toLowerCase())));
        }

        board.prindBoardMessages();
    }
}
