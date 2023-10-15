package amit;

public class CountEO {
	static void printCountEO(int n)
	{
		int ec=0;int oc=0;
		{
			int d=n%10;
			if(d%2==0)
				ec++;
			else
				oc++;
			n=n/10;
		}
		while(n!=0)
		{
			System.out.println("no of even digit" +ec);
			System.out.println("noof odd digit" +oc);
		}
	}
	public static void main(String[] args) {
		printCountEO(235);
	}

}
