package week3day1classroomassignments;

public class RBI {
	
	public void loanInterestRate() 
	{
		int loanpercentage=6;
		int amount=15000;
		double resulting_amount=(double)(amount-(loanpercentage*amount)/100);
		System.out.println("The resulting amount after applying loan percentage is: "+resulting_amount);
	}
	
	
	public void loanInterestRate(String agri)
	{
	
		int loanpercentage=8;
		int amount=25000;
		double resulting_amount=(double)(amount-(loanpercentage*amount)/100);
		System.out.println("The resulting amount after applying loan percentage for "+agri+" is: "+resulting_amount);
	}

}
