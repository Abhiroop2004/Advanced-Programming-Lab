abstract class Car
{
	abstract void topspeed();
	void no_of_wheels()
	{
		System.out.println("4");
	}
}
class Challenger extends Car 
{
	void topspeed()
	{
		System.out.println("203mph");
	}
}
class Test
{
	public static void main (String [] args)
	{
		Challenger c=new Challenger();
		c.no_of_wheels();
		c.topspeed();
	}
}