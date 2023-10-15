package condition;

public class JumpingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=10;i++)
{
	if(i==5)
	{
		break;
	}
	System.out.println(i);

}

for(int a=1;a<=10;a++)
{
	if(a==4)
	{
		continue;
	}
	System.out.println(a);
    }
}
}