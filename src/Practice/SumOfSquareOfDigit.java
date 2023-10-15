package Practice;

public class SumOfSquareOfDigit {
 static int sumOfSquareOf(int x)
 {
	 int sum=0;
	 while(x!=0)
	 { 
		 int d=x%10;
		  sum=sum+d*d;
		 x=x/10;
	 }
	 return sum;
 }
	public static void main(String[] args) {
		int s=sumOfSquareOf(25);
		System.out.println(s);
	}

}
