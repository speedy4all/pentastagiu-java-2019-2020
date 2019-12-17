package myHomeWork.week3.bank;

public class BankAccount {
    private int idAccount;
    private float money;

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public BankAccount() {
        this.idAccount = (int) (Math.random() * 100000);
        this.money = 0;
    }

    public BankAccount(float money) {
        this.idAccount = (int) (Math.random() * 100000);
        this.money = money;
    }

    public static void withdrawAccount(BankAccount bankAccount, int withdrawMoney) {
        if (bankAccount.getMoney() < withdrawMoney) {
            System.out.println("(Error) The maximum amount you can withdraw is: " + (int)(bankAccount.getMoney()/10)*10);
        }
        else if(withdrawMoney % 10 != 0){
            System.out.println("(Error) Enter a multiple for 10");
        }
        else if(withdrawMoney < 1){
            System.out.println("(Error) Enter a positive value");
        }
        else{
            System.out.println("Account: " + bankAccount.getIdAccount() + " operation: withdraw -" + withdrawMoney);
            bankAccount.setMoney(bankAccount.getMoney() - withdrawMoney);
        }
    }

    public static void debitAccount(BankAccount bankAccount, int debitMoney) {

        if (debitMoney < 1) {
            System.out.println("(Error) Enter a positive value");
        } else {
            System.out.println("Account: " + bankAccount.getIdAccount() + " operation: debit +" + debitMoney);
            bankAccount.setMoney(bankAccount.getMoney() + debitMoney);
        }
    }
    public String toString(){
        return "Account: " + getIdAccount() + " balance: " + getMoney();
    }
}
