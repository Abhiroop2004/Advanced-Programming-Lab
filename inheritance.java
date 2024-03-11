class A
{
void Grandfather()
{
	System.out.println("Grandfather");
}
}
class B extends A
{
void Father()
{
	System.out.println("Father");
}
}
class C extends B
{
void Son()
{
	System.out.println("Son");
}
}
class D extends B
{
void Daughter()
{
	System.out.println("Daughter");
}
}
class Test
{
	public static void main (String [] args)
	{
		System.out.println("Single Inheritence");
		System.out.print("Father <- ");
		B b=new B();
		b.Grandfather();
		System.out.println("Multilevel Inheritence");
		System.out.print("Father <- ");
		b.Grandfather();
		System.out.print("Son <- ");
		C c=new C();
		c.Father();
		System.out.println("Hierarchical Inheritence");
		System.out.print("Son <- ");
		c.Father();
		System.out.print("Daughter <- ");
		D d=new D();
		d.Father();
	}
}