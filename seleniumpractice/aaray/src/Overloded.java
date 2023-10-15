
public class Overloded {
void sum(int a,int b)
{
	System.out.println(a+b);
}
	
void sum(int a,int b,int c)
{
	System.out.println(a+b+c);
}
void sum(double a,int b) {
	System.out.println(a+b);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloded ol=new Overloded();
ol.sum(10, 20);
ol.sum(5, 10, 20);
ol.sum(10.5, 5);
	}

}
