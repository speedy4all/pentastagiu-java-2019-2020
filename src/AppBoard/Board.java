package AppBoard;

public class Board {
    private User user;
    private Message message;

    User ion = new User("ionmatei@gmail.com", "Ion");
    User paul = new User("paulmargaritiu@gmail.com", "Paul");
    User matei = new User("mateimatei@gmail.com", "Matei");
    User maria = new User("mariamaria@gmail.com", "Maria");

    public User getIon() {
        return ion;
    }

    public User getPaul() {
        return paul;
    }

    public User getMatei() {
        return matei;
    }

    public User getMaria() {
        return maria;
    }

    public String writeMessage(String message){
        return message;
    }

}
