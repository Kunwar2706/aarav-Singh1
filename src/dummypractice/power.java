package dummypractice;

import java.util.Scanner;

public class power {
public static int getPow(int n,int p) {
	int pw=1;
	while(p>0) {
		pw=pw*n;
		p--;
	}
	return pw;
}

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the base no");
int n=s.nextInt();
System.out.println("enter the power ");
int p=s.nextInt();
int power =getPow(n,p);
System.out.println(power);
	}

}
