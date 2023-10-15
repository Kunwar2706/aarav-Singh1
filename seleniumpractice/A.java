package seleniumpractice;

interface A {
	void testA()
	{
		
	}
class B impiments A
{
	void testA()
	{
	System.out.println("hi");
	}
}
class c impiments A
{
	System.out.println("bye");
}
}
class D 
{
	static void demo(A a1)
	{
		a1.testA();
	}
}
class E1
{
public static void main(String[] args) {
	A a=new B();
	D.demo(a1);

	}
}
class E2
{
public static void main(String []args)
{
	A a=new C();
	D.demo(a1)
}
}

