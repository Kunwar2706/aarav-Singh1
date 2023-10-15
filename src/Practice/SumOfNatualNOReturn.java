package Practice;

public class  SumOfNatualNOReturn {
        static int sumOfNatural(int n)
        {
        	int sum=0;
        	for(int i=1;i<=n;i++)
        	  {
                sum=sum+i;
        	   }
        	return sum;
       }
  public static void main(String[] args) {
     int s=sumOfNatural(5);
     System.out.println(s);

	}

}
