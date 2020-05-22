package week3day1classroomassignments;

import java.util.Scanner;

public class KVB extends RBI {
	
	public void loadInterestRate(String personalLoan)
	{
		int loanpercentage=10;
		int amount=35000;
		double resulting_amount=(double)(amount-(loanpercentage*amount)/100);
		System.out.println("The resulting amount after applying loan percentage for "+personalLoan+" is: "+resulting_amount);
	}
	
	
	
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		RBI bank=new RBI();
		KVB bank1=new KVB();
		int educationalloan=sc.nextInt();
		bank1.loanInterestRate();
		sc.nextLine();
		String agriLoan=sc.nextLine();
		bank.loanInterestRate(agriLoan);
		String personalLoan=sc.nextLine();
		bank1.loanInterestRate(personalLoan);
		
	}

}
