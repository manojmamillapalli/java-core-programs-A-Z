package com.google.upcasting;
import java.util.*;
class Details
{
	Scanner sc=new Scanner(System.in);
	private long accountno;
	private int pin;
	private String AccHolderName;
	private long balance;
	
	//WITHDRAW THE AMOUNT
	public void withdraw()
	{
		System.out.println("INSERT YOUR CARD");
		System.out.println("VALIDATING YOUR CARD./n PLEASE WAIT...............");
		System.out.println("CHOOSE YOUR ACCOUNT:\n"
				+ "1.CURRENT ACCOUNT\n"
				+ "2.SAVINGS ACCOUNT\n");
		switch(sc.nextInt())
		{
		case 2:
			System.out.println("ENTER THE AMOUNT TO WITHDRAW\n");
			int amount=sc.nextInt();
			System.out.println("ENTER YOUR PIN NUMBER/n");
			if(pin==sc.nextInt())
			{
				if(amount>balance)
				{
					System.out.println("insufficient balance:");
				}
				else
				{
					balance-=amount;
					System.out.println(amount+ "  is successfully withdrawn\n");
				}
				
			}
			else System.out.println("INVALID PIN NUMBER");
			break;
		case 1:
			System.out.println("SORRY!!!! CURRENT ACCOUNT IS EMPTY TO WITHDRAW\n");
			break;
			default:
				System.out.println("Please select valid option");
		}
		
	}
	public void resetpin()
	{
		System.out.println("INSERT YOUR CARD");
		System.out.println("VALIDATING YOUR CARD./n PLEASE WAIT...............");
		System.out.println("ENTER YOUR PIN NUMBER/n");
		
		if(pin==sc.nextInt())
		{
			System.out.println("ENTER NEW PIN\n");
			setPin(sc.nextInt());
			System.out.println("CONFORM YOUR PIN\n");
			setPin(sc.nextInt());
		}
		else System.out.println("INVALID PIN NUMBER");
	}
	//ADDING MONEY TO THE BANK ACCOUNT
	public void deposit()
	{
		
		System.out.println("INSERT YOUR CARD");
		System.out.println("VALIDATING YOUR CARD./n PLEASE WAIT...............");
		System.out.println("ENTER YOUR PIN NUMBER/n");
		 
		if(pin==sc.nextInt())
		{
			System.out.println("ENTER THE AMOUNT TO DEPOSIT\n");
			long depositamount=sc.nextLong();
			balance+=depositamount;
		}
		else System.out.println("INVALID PIN NUMBER");
		
	}
		
	//CHECK BALANCE IN THE ACCOUNT
	public long CheckBalance()
	{
		System.out.println("INSERT YOUR CARD");
		System.out.println("VALIDATING YOUR CARD./n PLEASE WAIT...............");
		System.out.println("ENTER YOUR PIN NUMBER/n");
		if(sc.nextInt()==pin)
		{
			System.out.println(balance+"/-");
			return balance;
		}
		else System.out.println("INVALID PIN NUMBER/n"
				+ " UNABLE TO FETCH BALANCE");
		return 0;
	}
	
	// GET ACCOUNT NUMBER
	public long getAccountno() {
		System.out.println(accountno);
		return accountno;
	}
	
	//SET ACCOUNT NUMBER
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	
	//SET PIN NUMBER
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	//GET ACCOUNTHOLDER NAME
	public String getAccHolderName() {
		System.out.println(AccHolderName);
		return AccHolderName;
	}
	//SET ACCOUNTHOLDER NAME
	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}
	
}
public class Account {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account ac=new Account();
		Details d=new Details();
		 boolean running = true;
        int i=0;
	        while (running) {
	        	if(i==0)
	        	{
	            display();
	        	}
	        	else
	        	{
	        		display1();
	        	}
	            int choice = sc.nextInt();
	            i++;
	            switch (choice) {
	                case 1:
	                    System.out.println("INSERT YOUR CARD");
	                    System.out.println("VALIDATING YOUR CARD. PLEASE WAIT...............");
	                    System.out.println("PLEASE SET YOUR PIN NUMBER");
	                    d.setPin(sc.nextInt());
	                    System.out.println("SUCCESSFULLY ESTABLISHED YOUR PIN...PLEASE VERIFY YOUR PHONE");
	                    break;
	                case 2:
	                    System.out.println("your account balance is "+d.CheckBalance()+"rupees");
	                    break;
	                case 3:
	                	d.deposit();
	                	System.out.println("Amount is successfully deposited to your account:");
	                	break;
	                case 4:
	                	d.resetpin();
	                	System.out.println("Your pin is resetted successfully");
	                	break;
	                case 5:
	                	d.withdraw();
	                	break;
	                case 0:
	                    System.out.println("THANK YOU FOR CONSULTING GRAMEENA BANK");
	                    running = false;
	                    break;
	                default:
	                    System.out.println("INVALID CHOICE. PLEASE TRY AGAIN.");
	            }
	        }

	        sc.close(); // Close the scanner to avoid resource leak

}
	public static void display()
	{
		System.out.println("WELCOME TO GRAMEENA BANK\n"
				+ "...............................................");
		System.out.println("SELECT YOUR REQUIREMENTS\n"
				+ "............................................\n"
				+ " "
				+ "1. SET PIN NUMBER\n 2. CHECK BALANCE\n 3. DEPOSIT MONEY\n 4. WITHDRAW MONEY\n");
		System.out.println("ENTER  YOUR CHOICE\n....................................................\n"
				+ ""
				+ "ENTER 0 TO EXIT");
	}
	public static void display1()
	{
		System.out.println("FOR  FURTHER QUERIES SELECT\n"
				+ "............................................\n"
				+ " "
				+ "2. CHECK BALANCE\n 3.DEPOSIT MONEY\n 4. RSET PIN NUMBER\n 5.WITHDRAW AMOUNT");
		System.out.println("ENTER  YOUR CHOICE\n....................................................\n"
				+ ""
				+ "ENTER 0 TO EXIT");
	}
}


