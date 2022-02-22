package Atm;

import java.io.IOException;
import java.text.DecimalFormat;	
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	
	
		Scanner menuInput= new Scanner(System.in);
		DecimalFormat  moneyFormat = new  DecimalFormat("$ ###,##0.00");
		
	    HashMap<Integer, Integer>  data = new HashMap<Integer, Integer>();
		 
		  public void getLogin() throws IOException 
		  {
			   int x=1;
			   do {
				   try {
					    data.put(191533420, 7300);
					    data.put(43954438, 4534);
					    
					    System.out.println("Welcome to Atm");
					    System.out.println("Enter your Bank Account Number Here");
					    setCustomerNumber(menuInput.nextInt());
					    
					    
					    System.out.println("Enter Your Atm Pin");
					    setPinNumber(menuInput.nextInt());
				   }
					    catch (Exception e)
				   {
					    	
					    System.out.println("\n "+ "Invaild Number (s) Please Enter A corrcet number" +"/n");	
					    x=2;
					  }
				   
				   
				   int cn= getCustomerNumber();
				   int pn= getPinNumber();
				   if(data.containsKey(cn) && data.get(cn)== pn) {
					    getAccountType();
				   }
				   else 
					   
					   System.out.println("Please check your number And Pin");
					  
				   } while(x == 1);
				   
				 
				   }
		 
		  
		  public  void getAccountType()
		  {
			  System.out.println("Select The  Account  You Wnat To Access");
			  System.out.println(" Type 1 Check Account	");
			  System.out.println(" Type 2  Saving Account	");
			  System.out.println(" Type 3 Exit	");
			  
			  int Selection = menuInput.nextInt();
			  
			  switch(Selection) {
			  case 1:
				   getChecking();
				   break;
			  case 2:
				  getSaving();
				  break;
			  case 3:
				  System.out.println("Thanks for Using Atm");
				  break;
				  
				  default:
					  System.out.println("/n" + "Invaild  chocie"+"/n");
					  getAccountType();
			  }
			  
		  }
	
		  public void getChecking()
		  {
			  System.out.println("Checkeing Account:");
			  System.out.println("Type 1: View Balance");
			  System.out.println(" Type 2:Withdraw money	");
			  System.out.println(" Type 3: Depostie Money	");
			  System.out.println(" Type 4 Exit	");
			  System.out.println("Choice:");
			  
			  
			  int Selection = menuInput.nextInt();
			  
			  switch(Selection) {
			  case 1:
				System.out.println ("Checking Account Balance" + moneyFormat.format(getCheckingBalanace()));
				 getAccountType();
				   break;
			  case 2:
				  getCheckingWithdrawInput();
				  getAccountType();
				  break;
			  case 3:
				  getCheckingDepositeInput();
				  getAccountType();
				  break;
				  
			  case 4:
				  System.out.println("Thanks  you for using Atm");
					 break;
					 
					 default:
						  System.out.println("/n" + "Invaild  chocie"+"/n");
					
			  }
		  }
			   
		  public void  getSaving()
		  {
			  System.out.println("Saving Account");
			  System.out.println("Type 2: VIEW Balance");
			  System.out.println(" Type 3:Withdraw Fund");
			  System.out.println(" Type 4: Depostie Fund");
			  System.out.println(" Type 5 Exit	");
			  System.out.println("Choice");
			  
			  
			  int Selection = menuInput.nextInt();
			  
			  switch(Selection) {
			  case 1:
				System.out.println ("Saving Account Balance" +moneyFormat.format(getsavingBalanace()));
				 getAccountType();
				   break;
			  case 2:
				 getSavingWithdrawInput();
				  getAccountType();
				  break;
			  case 3:
				  getSavingDepositeInput();
				  getAccountType();
				  break;
				  
			  case 4:
				  System.out.println("Thanks  you for using Atm");
					 break;
					 
					 default:
						  System.out.println("/n" + "Invaild  chocie"+"/n");
					
			  }
		  
		  }
		  
	

}
