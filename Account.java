package Atm;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance =0;
	private double savingBalance =0;

	Scanner  input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("$###,##0.00");
	
	
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber= customerNumber;
		return customerNumber;
	}
		public int getCustomerNumber()
		{
			return customerNumber;
		}
		
		public int setPinNumber(int pinNumber)
		{
			 this.pinNumber = pinNumber;
			 return pinNumber;
		}
		
		public int getPinNumber()
		{
			return pinNumber;
		}
		
		public double getCheckingBalanace()
		{
			return checkingBalance;
		}
		public double getsavingBalanace()
		{
			return savingBalance;
		}
		
		public double calcCheckingWithdraw(double amount)
		{ 
			checkingBalance =(checkingBalance - amount);
			   return checkingBalance;
		}
		
		public double calcSavingWithdraw(double amount)
		{ 
			savingBalance =(savingBalance - amount);
			   return savingBalance;
			   
			 }
		public double calcCheckingDeposit(double amount)
		{ 
			checkingBalance =(checkingBalance + amount);
			   return checkingBalance;
		}
		
		public double calcSavingDeposit(double amount)
		{ 
			savingBalance =(savingBalance + amount);
			   return savingBalance;
		}
		
		public  void  getCheckingWithdrawInput()
		{
			System.out.println(" Checking Account Balance "+ moneyFormat.format(checkingBalance));
      		System.out.println("Amount  you want to Withdraw from Cheking amount");
      		double amount = input.nextDouble();
      		 if((checkingBalance - amount)>= 0)
            {
	                calcCheckingWithdraw(amount);
	                System.out.println("New Checking  Account  Balance" +moneyFormat.format(checkingBalance ));
	                
                      }
      		 else {
      			 System.out.println("Balance Cannot be Negavite"+"/n");
      		 }
		}
		
		
		public void  getCheckingDepositeInput()
		{
			System.out.println(" Checking Account Balance "+ moneyFormat.format(checkingBalance));
      		System.out.println("Amount  you want to Withdraw from Cheking amount");
      		double amount = input.nextDouble();
      		 if((checkingBalance +	 amount)>= 0)
            {
	                calcCheckingWithdraw(amount);
	                System.out.println("New Checking  Account  Balance" +moneyFormat.format(checkingBalance ));
	                
                      }
      		 else {
      			 System.out.println("Balance Cannot be Negavite"+"/n");
      		 }
		}
		
		public void  getSavingWithdrawInput()
		{
			System.out.println(" Checking Account Balance "+ moneyFormat.format(savingBalance));
      		System.out.println("Amount  you want to Withdraw from Cheking amount");
      		double amount = input.nextDouble();
      		 if((checkingBalance -	 amount)>= 0)
            {
	                calcCheckingWithdraw(amount);
	                System.out.println("New Checking  Account  Balance" +moneyFormat.format(checkingBalance ));
	                
                      }
      		 else {
      			 System.out.println("Balance Cannot be Negavite"+"/n");
      		 }
		}
		public void getSavingDepositeInput()
		{
			System.out.println(" Checking Account Balance "+ moneyFormat.format(checkingBalance));
      		System.out.println("Amount  you want to Withdraw from Cheking amount");
      		double amount = input.nextDouble();
      		 if((checkingBalance +	 amount)>= 0)
            {
	                calcCheckingWithdraw(amount);
	                System.out.println("New Checking  Account  Balance" +moneyFormat.format(checkingBalance ));
	                
                      }
      		 else {
      			 System.out.println("Balance Cannot be Negavite"+"/n");
      		 }
		}
}
