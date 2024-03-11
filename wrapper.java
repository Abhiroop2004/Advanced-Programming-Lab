class IntWrapper
{
	int data;
	IntWrapper(int a)
	{data=a;}
}
class Test
{
	static void addition(IntWrapper a1, IntWrapper a2)
	{
		a1.data+=a2.data;
	}
	public static void main(String args[])
	{
		int a=10,b=12;
		IntWrapper a1=new IntWrapper(a);
		IntWrapper a2=new IntWrapper(b);
		System.out.println("Orignal numbers:"+a1.data+", "+a2.data);
		addition(a1,a2);
		System.out.println("Sum:"+a1.data);
	}
}