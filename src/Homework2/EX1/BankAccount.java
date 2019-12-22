package Homework2.EX1;

public class BankAccount {
    private String iban;
    private String name;
    private String birthdate;
    private Double balance;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Bank Account\n")
                .append("\t\t\t iban: " + this.iban + "\n")
                .append("\t\t\t name: " + this.name + "\n")
                .append("\t\t\t birthdate: " + this.birthdate + "\n")
                .append("\t\t\t balance: " + this.balance + "\n").toString();
    }

    public void withdrawal(double amount) {
        System.out.println("The user " + this.getName() + " tried to withdraw the amount of " + amount);
        if (this.getBalance() > amount) {
            this.setBalance(this.getBalance() - amount);

        }
        else {
            System.out.println("Balance limit exceeded");
        }
        }

    public void deposit (double amount) {
        System.out.println("The user " + this.getName() + " made the deposit of " + amount);
            this.setBalance(this.getBalance() + amount);
    }
    }
