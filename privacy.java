class A 
{
    A() {}

    public void m1() {
        System.out.println("Public Method!");
    }

    private void m2() {
        System.out.println("Private Method!");
    }

    protected void m3() {
        System.out.println("Protected Method!");
    }
}
class B extends A
{
    B() {}
    public void m2() 
    {
        System.out.println("Private Method Override as not Inherited!");
    }
}

class Test {
    public static void main(String[] args) {
        
        A a = new A();
        a.m1(); 
        a.m3(); 
        B b = new B();
        b.m2();
    }
}