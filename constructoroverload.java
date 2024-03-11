import java.lang.Math;
class Area
{
    double area;
    Area(int a)
    {
        area=a*a;
        System.out.println("Area of Sqaure="+area);
    }
    Area(int a, int b)
    {
        area=a*b;
        System.out.println("Area of Rectangle="+area);
    }
    Area(int a, int b, int c)
    {
        int s=(a+b+c)/2;
        area=s*Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle="+area);
    }
}

class Test
{
	public static void main(String[] args)
	{
	    Area a;
        a=new Area(6);
	    a= new Area(5,10);
	    a= new Area(6,6,4);
	}
}