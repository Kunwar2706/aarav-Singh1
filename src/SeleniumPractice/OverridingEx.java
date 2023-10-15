package SeleniumPractice;

public class OverridingEx 
{
	void testA()
	{
		System.out.println("hi");
	}
}
class Child extends OverridingEx
{
	void testA() 
	{
		System.out.println("bye");
	}
}
class Main{
 public static void main(String[] args)
 {

Child b=new Child ();
b.testA();

	}

}
