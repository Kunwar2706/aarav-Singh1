
public class Student {
int sid;
String sname;
char grade;
void display()
{
	System.out.println(sid+"  "+sname+"   "+grade);
}
public static void main(String[] args) {
	Student stu1=new Student();
	stu1.sid=101;
	stu1.sname="amit";
	stu1.grade='a';
	stu1.display();
	}

}
