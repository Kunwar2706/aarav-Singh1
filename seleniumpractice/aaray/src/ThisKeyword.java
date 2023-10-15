
public class ThisKeyword {
int a,b;// classical variable
void getvalues(int a,int b)//ethod variable
{
this.a=a;
this.b=b;
}
void printvalues()
{
	System.out.println(a);
	System.out.println(b);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword call=new ThisKeyword();
call.getvalues(10,20);
call.printvalues();
	}

}
