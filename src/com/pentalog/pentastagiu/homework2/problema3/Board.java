package com.pentalog.pentastagiu.homework2.problema3;

public class Board {
    private User[] users;
    private static int noUsers = 0;
    private static int chunk = 3;

    public Board() {
        this.users = new User[chunk];
    }

    public void RegisterTheUser(User user) {
        if (user.isRegistering() == true) {
            if (noUsers % 3 == 0) {
                User[] new_users = new User[noUsers + chunk];
                for (int i = 0; i < noUsers; ++i) {
                    new_users[i] = users[i];
                }
                users = new_users;
            }
            users[noUsers] = user;
            System.out.println("Clientul " + user.getName() +" cu e-mail-ul " + user.getMail() + " a fost inregistrat");
            noUsers++;
        }
        else{
            System.out.println("Clientul " + user.getName() +" cu e-mail-ul " + user.getMail() + " doar viziteaza aplicatia");
        }
    }
    public void DisplayAllMessages()
    {
        for(int i = 0; i < noUsers; ++i) {
            if (users[i].isSendingMessage()) {
                System.out.println(users[i].getMessage());
                users[i].setSendingMessage(false);
            }
        }
    }
}
