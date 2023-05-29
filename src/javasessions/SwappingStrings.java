package javasessions;

public class SwappingStrings {

	public static void main(String[] args) {
		String s1="Good";
		String s2="Morning";
		System.out.println("strings before swapping:"+s1+""+s2);
		String s=s1+s2;
		s2=s.substring(0, s1.length());
		s1=s.substring(s1.length());
System.out.println("Strings after swapping:"+s1+""+s2);
	}

}
