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

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }


}
