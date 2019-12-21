package com.pentalog.pentastagiu.homework2.board;
//
public class UsersOfBoardApp {
    private String name;
    private String e_mail;
    public String userName;

    public UsersOfBoardApp(String name, String e_mail, String userName) {
        this.name = name;
        this.e_mail = e_mail;
        this.userName = userName;
    }

    public void postMessageToBoard(String userName){
        System.out.println("Acesta este mesajul meu: "+ userName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
