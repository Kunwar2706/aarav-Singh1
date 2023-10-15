package Practice;

import java.util.Scanner;

public class BigeestAmong4NOusingtTO {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter 1st  no");
int a=s.nextInt();
System.out.println("enter 2nd  no");
int b=s.nextInt();
System.out.println("enter 3rd no");
int c=s.nextInt();
System.out.println("enter 4th no");
int d=s.nextInt();
int big=(a>b)?a:b;
    big=(big>c)?big:c;
    big=(big>d)?big:d;
   System.out.println(big +" is the biggest");

	}

}
