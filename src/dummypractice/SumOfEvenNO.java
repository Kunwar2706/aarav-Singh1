package dummypractice;

public class SumOfEvenNO {
	static int sumOfEven(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum=sum+i;
		}
		return sum;
	}
    static void main(String[] args) {
     int s=sumOfEven(6);
  System.out.println(s);
	}

}
