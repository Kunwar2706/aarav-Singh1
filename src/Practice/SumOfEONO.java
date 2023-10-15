package Practice;
	public class SumOfEONO 
	{ 
	public static void printSumOFEO(int n)
	       {
			int es=0; int os=0;
			for(int i=1;i<=n;i++)
			{
		           if(i%2==0)
			         es=es+i;
				else
			         os=os+i;
		}
	 System.out.println(" sum of even no: " +es); 
	 System.out.println(" sum of odd No. :" +os);
		}
		public static void main(String[] args){
			 printSumOFEO(10);
			
			
	

	}

}
