
public class Calculation {

	
	
	int x=10;
	int y=20;
/*	void sum()// case 1:not taking parameter and also not returning values
	{
	System.out.println(x+y);
	}*/
	
	/*int sum() // case2 not taking parameter but returning values
	{
		return (x+y);
	}*/
	
	/*void sum(int a, int b)//case3 taking parameter ,but not returning any value
	{
		System.out.println(a+b);
	}*/
	 int sum(int a, int b)//case4 taking parameter also returning value
	 {
		 return(a+b);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculation cal=new Calculation();
//cal.sum();// case 1

/*int res =cal.sum();//case 2
System.out.println(res);*/
/*cal.sum(100,200);*///case3
System.out.println(cal.sum(100,200 ));
	}
}




