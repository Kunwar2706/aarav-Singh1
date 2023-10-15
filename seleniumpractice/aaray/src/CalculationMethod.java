
public class CalculationMethod {
	int a=10;
	int b=20;
	void tum()// case1:not taking parameter and also not returning values
	{
		System.out.println(a+b);
	}
	int sum()//case 2: not taking parameter but also returning values
	{
		return(a+b);
	}
	void sum(int a,int b)//case 3: taking parameter not returning value
	{
		System.out.println(a+b);
	}
	int amit (int a,int b)// case 4:taking parameter also returning value
	{
		return(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CalculationMethod cal=new CalculationMethod();
	cal.tum();//case 1
	

	int res=cal.sum();// case 2
	System.out.println(res);
	

	cal.sum(100,200);// case 3
	cal.amit(120, 230);// case4 
	int ret=cal.amit(100,200);
	System.out.println(ret);

	}
}

	

	
	

	


