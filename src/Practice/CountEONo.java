package Practice;

public class CountEONo {
static void printCountEO(int n)
{
	int ec=0; int oc=0;
	do {
		int d =n%10;
		if(d%2==0)
			ec++;
		else 
			oc++;
		n=n/10;
	}
	while(n!=0);
	{
		System.out.println("no of even digit"+ec);
	System.out.println("no of odd count"+oc);
    } 
 }

	public static void main(String[] args) {
		printCountEO(235);
	}

}
