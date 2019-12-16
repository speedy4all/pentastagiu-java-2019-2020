package com.pentalog.pentastagiu.homework2;

public class Person {

    private Integer personId;
    private String fullName;
    private String identityCard;
    private Integer age;

    public Integer getPersonId() {
        return personId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public Integer getAge() {
        return age;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void withdraw(int amount, BankAccount ba){
        if(amount>ba.getBalance() && ba.getTypeAccount()=="DEBIT"){
            System.out.println("You can not withdraw this amount: " + amount + " because the account is DEBIT");
        }else {
            ba.setBalance(ba.getBalance()-amount);
            System.out.println("The account with id " + ba.getAccountId() + " has the balance, now: " + ba.getBalance() );
        }
    }

    public void deposit(int amount, BankAccount ba){
        ba.setBalance(ba.getBalance()+amount);
        System.out.println("The balance of account " + ba.getAccountId() + " is: " + ba.getBalance());
    }

    public Person(Integer personId, String fullName, String identityCard, Integer age) {
        this.personId = personId;
        this.fullName = fullName;
        this.identityCard = identityCard;
        this.age = age;
    }
}
