
public class Odometer 
{
	
	private int mileage;
	private int initialMil;
	
	//constant for the maximum mileage
	public final int MAX_MILEAGE = 999999;
	
	// constant for the miles-per-gallon
	public final int FUEL_ECONOMY = 24;
	
	//field to reference a FuelGauge object
	private FuelGauge fuelGauge;
	
	public Odometer()
	{
		mileage = 0;
	}
	
	public Odometer(int mileage, FuelGauge fuelgauge)
	{
		this.initialMil = mileage;
		this.mileage = mileage;
		this.fuelGauge = fuelgauge;
	}

	
	public void addMil()
	{
		if (mileage < this.MAX_MILEAGE)
		{
			mileage++;
		}
		
		else
		{
			mileage = 0;
		}
		
		int driven = initialMil - mileage;
		if (driven % FUEL_ECONOMY == 0)
		{
			fuelGauge.burnFuel();
		}
	}
	
	public void decFuel(FuelGauge fuel)
	{
		//mile to fuel
		int mil_index = (this.mileage % 24);
		
		for (int i = 0; i < mil_index; i++)
		{
			fuel.burnFuel();
		}
	}
	
	public int getMil()
	{
		return mileage;
	}
}
