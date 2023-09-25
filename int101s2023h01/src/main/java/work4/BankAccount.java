package work4;

public class BankAccount {

    private int number;
    private double balance;
    private Person owner;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    public double deposit(double amount) {
        return this.balance += amount;
    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    public void transfer(double amount, BankAccount account) {
        withdraw(amount);
        account.deposit(amount);

    }

    @Override
    public String toString() {
        return "BankAccount{" + "owner=" + owner + '}';
    }
}
