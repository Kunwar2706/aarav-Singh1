package Practice;

public class Diviser {
         static int countDiviser(int n)
         {
        	 int count=0;
         for(int i=1;i<=n/2; i++)
         {
        	 if(n%i==0)
        		 count++; 
         }
         return count;
         }   
public static void main(String[] args) {
	 int c=countDiviser(10);
System.out.println(c);
	}

}
