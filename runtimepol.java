class Bank
{
	float getRateOfInterest(){ return 0;}
}
class SBI extends Bank
{
	float getRateOfInterest(){ return 4.4f;}
}
class ICICI extends Bank
{
	float getRateOfInterest(){ return 4.2f;}
}
class AXIS extends Bank
{
	float getRateOfInterest(){ return 4.5f;}
}
class Test
{
	public static void main(String[] args) 
	{
		Bank B;
		System.out.println("Rate of Interest are->");
		B=new SBI();
		System.out.println("SBI: "+B.getRateOfInterest());
		B=new ICICI();
		System.out.println("ICICI: "+B.getRateOfInterest());
		B=new AXIS();
		System.out.println("AXIS: "+B.getRateOfInterest());
	}

}