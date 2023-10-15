package Practice;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s="java programing java oops";
		int totalCount=s.length();//total length of string 5
		int totalcount_afterRemoveA=s.replace("j","").length();//total lenth after removing all lenth
		int count=totalCount-totalcount_afterRemoveA;
		System.out.println("no of occurances of a is : "+count);
	}

}
