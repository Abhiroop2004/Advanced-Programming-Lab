interface Area
{
	void area();
}
interface Perimeter
{
	void perimeter();
}
class Square implements Area,Perimeter
{
	int s;
	Square(int a)
	{s=a;}
	public void area()
	{
		System.out.println("Area="+(s*s));
	}
	public void perimeter()
	{
		System.out.println("Perimeter="+(4*s));
	}
}
class Test
{
	public static void main (String [] args)
	{
		Square s=new Square(6);
		s.area();
		s.perimeter();
	}
}