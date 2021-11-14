
public class FuelGauge 
{
	private int amtFuel;
	final static int MAXIMUM_FUEL = 15;
	
	public FuelGauge()
	{
		amtFuel = 0;
	}
	
	public FuelGauge(int gallons)
	{
		if (gallons <= MAXIMUM_FUEL)
		{
			this.amtFuel = gallons;
		}
		
		else
		{
			this.amtFuel = MAXIMUM_FUEL;
		}
	}
	
	public int getAmtFuel()
	{
		return amtFuel;
	}
	
	public void addFuel()
	{
		if (amtFuel < MAXIMUM_FUEL)
		{
		amtFuel = amtFuel + 1;
		}
		else if (amtFuel >= MAXIMUM_FUEL  )
		{
		System.out.println("fuel is full.");
		
		}
			
	}
	
	public void burnFuel()
	{
		if (amtFuel > 0)
		{
			amtFuel--;
		}
		else
		{
			System.out.println("Out of fuel");
		}
	}
	
	public String toString()
	{
		return ("Fuel is now at " + amtFuel + "gallon(s)");
	}
	
}
