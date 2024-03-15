import java.util.Scanner;
class Account 
{
	int interest_rate=5, acc_no, dep;
	String cust_name;
	float sbalance,rbalance;
	void deposit(float amount, int c, int tenure)
	{
		if (amount > 0)
		{
			if (c==0)
			{
	            sbalance += amount;
	            System.out.println("Deposit successful! Current balance: " + sbalance);
	        }
	        else if (c==1 && dep<tenure)
	        {
	        	rbalance += amount;
	        	dep++;
	            System.out.println("Monthly deposit successful! Current balance: " + rbalance);
	        }
    	}
        else
        {
        	System.out.println("Invalid deposit amount.");
        }
	}
	void withdraw(float amount)
	{
		if (amount > 0 && sbalance >= amount) 
		{
            sbalance -= amount;
            System.out.println("Withdrawal successful! Current balance: " + sbalance);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
	}
	void view_balance(int c)
	{
		if (c==0)
			System.out.println("Account Balance: " + sbalance);
		else if (c==1)
			System.out.println("Account Balance: " + rbalance);
	}
	void close_acc(int c, int t)
	{
		if (c==0)
		{
			System.out.println("Your account has been closed! Amount: " + sbalance);
			sbalance=0;
		}
		else if(c==1)
		{
			rbalance+=interest_rate*(dep/12);
			System.out.println("Your account has been closed! Amount: " + rbalance);
		}
	}
}
class Savings_acc extends Account
{
	int acc_type;
	float Amount;
	Savings_acc(int t)
	{
		acc_type=t;
	}
	void deposit(float a)
	{
		Amount=a;
		super.deposit(Amount,0,0);
	}
	void withdraw()
	{
		super.withdraw(Amount);
	}
	void view_balance()
	{
		super.view_balance(0);
	}
	void close_acc()
	{
		super.close_acc(0,0);
	}
}
class Recurring_acc extends Account
{
	int tenure;
	float Amount;
	Recurring_acc(int t)
	{
		tenure=t;
	}
	void deposit(float a)
	{
		Amount=a;
		super.deposit(Amount,1, tenure);
	}
	void view_balance()
	{
		super.view_balance(1);
	}
	void close_acc()
	{
		super.close_acc(1,tenure);
	}
}
class Bank
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner (System.in);

	}
}