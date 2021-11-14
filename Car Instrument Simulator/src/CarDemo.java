import java.util.Scanner;

public class CarDemo 
{
	public static void main(String[] args)
	{
	FuelGauge carfuel = new FuelGauge();
	Odometer meter = new Odometer(0, carfuel);
	
	
	//ask user if they want to proceed
	Scanner proceed = new Scanner (System.in);
	System.out.println("Do you want to proceed? \n1 yes \n2 no");
	
	int response = proceed.nextInt();
	
	while (response < 1 || response >2)
	{
		proceed = new Scanner (System.in);
		System.out.println("Do you want to proceed? \n1 yes \n2 no");
		response = proceed.nextInt();
	}
	
	do {
	//adding fuel
	Scanner getFuel = new Scanner(System.in);
	System.out.println("How many fuel would you like to fill?");
	
	int addingFuel = getFuel.nextInt();
	
	for (int i = 0; i < addingFuel; i++)
	{
	System.out.println("Adding 1 gallon fuel...");
	carfuel.addFuel();
	System.out.println("Fuel is at: " + carfuel.getAmtFuel());
	}
	//end of adding fuel
	
	//car is running
	Scanner getMiles = new Scanner(System.in);
	System.out.println("How far do you wanna drive?");
	
	int addingMiles = getMiles.nextInt();
	
	//drive until the end of user's inputted mile
	
	while(addingMiles > 0)
	{
		//add miles driven
		meter.addMil();
		addingMiles--;
		
		//display the mileage
		System.out.println("Mileage: " + meter.getMil());
		
		//display the amt of fuel
		System.out.println("Fuel level: " + carfuel.getAmtFuel() + "gallons");
		System.out.println("########################################################3");
	}
	
	/*
	for (int i = 0; i < addingMiles; i++)
	{
		System.out.println("Going 1 mile...");
		meter.addMil();
		
		System.out.println("Mileage is at: " + meter.getMil());
		meter.decFuel(carfuel);
		System.out.println("Fuel is at: " + carfuel.getAmtFuel());
		
	}
	*/
	
	proceed = new Scanner (System.in);
	System.out.println("Do you want to proceed? \n1 yes \n2 no");
	response = proceed.nextInt();
	
	} while (response == 1);
	}
}
