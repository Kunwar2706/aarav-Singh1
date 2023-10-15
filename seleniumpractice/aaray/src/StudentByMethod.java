
public class StudentByMethod {
int sid;
String sname;
char grade;
void getvalues(int id,String name,char g)
{
	sid=id;
	sname=name;
	grade=g;
}
	void display()
	{
		System.out.println(sid+"  "+sname+"  "+ grade);
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentByMethod stu=new StudentByMethod();
		stu.getvalues( 101, "sumit ",'A');
		stu.display();
				
				
				
	}

}
