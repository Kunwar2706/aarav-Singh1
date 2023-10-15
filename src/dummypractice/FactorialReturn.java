package dummypractice;

public class FactorialReturn {
            static   int getFactorial(int n)
            {
            	int fact=1;
            	for(int i=n;i>=1;i--)
            	{
            		fact=fact*i;
            	}
            		return fact;
            }
	public static void main(String[] args) {
		int f=getFactorial(6);
System.out.println(f);
	}

}
