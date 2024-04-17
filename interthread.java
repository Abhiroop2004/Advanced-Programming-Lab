class Bank 
{
    private int balance = 0;

    public synchronized void deposit(int amount) 
    {
        System.out.println("Depositing amount: " + amount);
        balance += amount;
        System.out.println("Deposit completed. Current balance: " + balance);
        notify(); 
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Withdrawing amount: " + amount);
        while (balance < amount) 
        {
            try {System.out.println("Insufficient balance. Waiting for deposit"); wait(); } 
            catch (InterruptedException e) {e.printStackTrace();}
        }
        balance -= amount;
        System.out.println("Withdrawal completed. Current balance: " + balance);
    }
}

public class BankManagement 
{
    public static void main(String[] args) 
    {
        final Bank bank = new Bank();

        // Thread for withdrawal
        new Thread(() -> {bank.withdraw(5000);}).start();

        // Thread for deposit
        new Thread(() -> {bank.deposit(7000);}).start();

    }
}
