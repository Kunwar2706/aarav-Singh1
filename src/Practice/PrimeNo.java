package Practice;

public class PrimeNo {

	public static void main(String[] args) {
	int  x=9;
	int count =0;
	for ( int i=1;i<=x;i++)
	{
    if(x%i==0) 
    {
	count++;
    }
	}
	if(count>2)
	{
		System.out.println("not prime no");
	}
	else
	{
		System.out.println("  prime no");
	}
}
}



