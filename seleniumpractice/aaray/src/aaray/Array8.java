package aaray;

public class Array8
{
	static void reverse(int x[])
	{ 
		int i=0;
		int j=x.length -1;
		while(i<j)
		{
			int temp =x[i];
		x[i]=x[j];
	     x[j]=temp;
		i++;
		j--;
	}}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int ar[]= {34,56,42,98};
		System.out.println("before reverse");
		for(int i=0;i<ar.length;i++)
		
		{
			System.out.println(ar[i]+"  ");
		
		}
		reverse(ar);
		{
		System.out.println("\n after the reverse");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		

	}

}}
