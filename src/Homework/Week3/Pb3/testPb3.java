package Homework.Week3.Pb3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testPb3 {

    public static void main(String[] args) {
        ArrayList<User> allUsers = new ArrayList<User>();
        Board board = new Board();
        Scanner s = new Scanner(System.in);
        User currentUser = null;
        while(true)
        {
            System.out.print("Enter a command and press enter: ");
            String command = s.nextLine();
            if(command.equals("register"))
            {
                System.out.print("Name: ");
                String name = s.nextLine();
                System.out.print("Email: ");
                String email = s.nextLine();
                System.out.print("Password: ");
                String password = s.nextLine();
                currentUser = new User(name, email, password);
                if(!allUsers.contains(currentUser))
                    allUsers.add(currentUser);
            }
            else if(command.equals("login"))
            {
                if(currentUser != null) {
                    System.out.println("Logged out");
                    currentUser = null;
                }
                System.out.print("Name: ");
                String name = s.nextLine();
                System.out.print("Password: ");
                String password = s.nextLine();
                for(User u : allUsers)
                {
                    if(u.getName().equals(name) && u.getPassword().equals(password)) {
                        currentUser = u;
                        break;
                    }
                }
                if(currentUser == null)
                    System.out.println("User and password combination does not exist");
            }
            else if(command.equals("comment"))
            {
                if(currentUser == null) {
                    System.out.println("You are not logged in");
                    return;
                }
                System.out.print("Message: ");
                String message =  s.nextLine();
                board.AddMessage(new Message(currentUser.getName(), message));
            }
            else if(command.equals("print board"))
            {
                board.printAllMessages();
            }
            else if(command.equals("sign out"))
            {
                currentUser = null;
            }
            else if(command.equals("exit"))
            {
                return;
            }
        }
    }
}
