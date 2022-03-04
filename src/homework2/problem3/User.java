package homework2.problem3;

public class User {
    private String name;
    private String email;
    private Message message;

    public User(String name, String email){
        this.name = name;
        this.email = email;

    }

    public void sendMessage(String message){
        if (message != null){
            this.message = new Message(message, this.name);
        }

    }


    public String getName() {
        return name;
    }

    public Message getMessage() {
        return message;
    }



}
