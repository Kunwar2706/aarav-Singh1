
public class Employee {

	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	void display ()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.eid =101;
	emp1.ename="amit";
	emp1.sal=55000.00;
	emp1.deptno=06;
	emp1.job="software engineer";
	emp1.display();
	}

}
