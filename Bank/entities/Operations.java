package entities;

public class Operations {
    private final int accNumber;
    private String name;
    private double balance;

    public Operations(int accNumber, String name) {
        this.accNumber = accNumber;
        this.name = name;
    }

    public Operations(int accNumber, double initialDeposit, String name) {
        this.accNumber = accNumber;
        setDeposit(initialDeposit);
        this.name = name;
    }

    public void setDeposit(double deposit) {
        balance += deposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setWithdraw(double withdraw) {
        balance -= withdraw + 5;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return accNumber+", Holder: "+name+", Balance: $ "+String.format("%.2f",balance);
    }
}
