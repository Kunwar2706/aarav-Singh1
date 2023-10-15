package amit;

public class Employee 

	 {
	
		 String ename;
		 int eid;
		 double salary;
		 
		 public Employee(String ename,int eid,double salary)
		 {
			 this.ename=ename;
			 this.eid =eid;
			 this.salary=salary;
		 }
		 public Employee(String ename)
		 {
			 this.ename=ename;
		 }
			 public String toString()
			 {
			 return ename+" "+eid+" "+salary;
		     }
	 }

