package dummypractice;

public class CountEONo {
static void printCoiuntEO(int x)
{
	int ec=0;int oc=0;
	while(x!=0)
	{
		int d=x%10;
		if(d%2==0)
			ec++;
		else 
			oc++;
		x=x/10;	
	}
System.out.println("no of even digit "  +ec);
System.out.println("no of odd digit  "  +oc);
	
}
	public static void main(String[] args) {
		printCoiuntEO(235);
	}

}
