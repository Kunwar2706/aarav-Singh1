package SeleniumPractice;

public class InheritanceEx1 {

	void  testA()
	{
		System.out.println("hi");
	}
}
class B extends InheritanceEx1
{
	
}
class C
{
public static void main(String[] args)
{
B b=new B();
b.testA();
}

}
