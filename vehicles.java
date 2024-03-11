class Vehicle
{
	String colour;
	int no_of_wheels, start;
	Vehicle(String c,int n)
	{
		colour=c;
		no_of_wheels=n;
		start=0;
	}
	void start()
	{
		if (start != 1)
		{
			start=1;
			System.out.println(colour+" "+no_of_wheels+" wheeled Vehicle started!");
		}
		else 
			System.out.println(colour+" "+no_of_wheels+" wheeled Vehicle already started!");
	}
	void stop()
	{
		if (start != 0)
		{
			start=0;
			System.out.println(colour+" "+no_of_wheels+" wheeled Vehicle stopped!");
		}
		else 
			System.out.println(colour+" "+no_of_wheels+" wheeled Vehicle already at stop!");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Vehicle v;
		v=new Vehicle("green",3);
		v.start();
		v.start();
		v.stop();
		v=new Vehicle("blue",4);
		v.start();
		v.stop();
		v.stop();
	}
}