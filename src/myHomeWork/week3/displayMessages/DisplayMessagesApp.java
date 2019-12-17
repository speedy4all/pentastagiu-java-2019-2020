package myHomeWork.week3.displayMessages;

public class DisplayMessagesApp {
    public static void main(String[] args) {
        User userIon = new User("Ion", "ion@gmail.com");
        User userSandu = new User("Sandu", "sandu@gmail.com");
        User userEmil = new User("Emil", "emil@gmail.com");
        Message messageFromIon = new Message(userIon, "Hello world, my name is Ion");
        Message messageFromSanu = new Message(userSandu, "Hello, my name is Sandu");
        Message messageFromEmil = new Message(userEmil, "My name is Emil");
    }
}
