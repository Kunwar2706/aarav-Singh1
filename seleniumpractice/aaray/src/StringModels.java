
public class StringModels {

	public static void main(String[] args) {
		
		String s=("Welcome");
		String s1=("to Java");
		System.out.println(s.length());
		System.out.println(s.concat(s1));
	String S = ("   Welcome   ");
		
		
		System.out.println("before triming string is:"+s);
		System.out.println("after triming string is:" +s.trim());
		System.out.println(s.charAt(4));
		System.out.println(s.contains("Wel"));
		System.out.println(s.equals("welcome"));
		System.out.println(s.replace(" java","selenium"));
		System.out.println(s.substring(1,3));
		
		
	}

}
