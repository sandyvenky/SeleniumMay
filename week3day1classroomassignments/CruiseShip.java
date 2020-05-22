package week3day1classroomassignments;

import java.util.Scanner;

public class CruiseShip extends Ship  {

	public void maximumPassengers(int  maxpassengerscount)
		{
	          System.out.println("Maximum number of passengers count that a ship can hold:" +maxpassengerscount);
		
		
		}
	
	public void cruiseCategory(String category) 
	{
		System.out.println("The cruise category is"+category);
	}
	
	
	
	


public static void main(String[]args)
{
	 Scanner sc = new Scanner(System.in);
	 CruiseShip sh = new CruiseShip();
	 CargoShip carship = new CargoShip();
	 String Name = sc.nextLine();
	 sh.shipName(Name);
	 String Year = sc.nextLine();
	 sh.shipbuiltYear(Year);
	 int Capacity = sc.nextInt();
	 carship.cargoCapacityinTons(Capacity);
	 int maxpassengerscount = sc.nextInt();
	 sh.maximumPassengers(maxpassengerscount);
	 sc.nextLine();
	 String category = sc.nextLine();
	 sh.cruiseCategory(category);
	 
	 
	 
	 
}
}