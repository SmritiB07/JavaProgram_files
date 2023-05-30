package javasessions;

public class Small_to_cap {

	public static String capitalizeWord(String str) {
		if(str==null) {
			System.out.println("no value is avaialable");
			return str;
		}
		
  if (str.length()==1) {
	return  str.toUpperCase();
  }
  String word[] = str.split(" ");
	String result = "";
	
		for (String w : word) {
			String first = w.substring(0, 1).toUpperCase();// h--H
			String rest = w.substring(1);
			 result = result + first + rest+" ";

		}
		//System.out.println(result);
		return result.trim();
	}

	public static void main(String[] args) {
		String capital=capitalizeWord("hello smriti bhandari");// HelloSmritiBhandari
         System.out.println(capital);
         capital=capitalizeWord("hello");// Hello
         System.out.println(capital);
         capital=capitalizeWord("h");// Hello
         System.out.println(capital);
         capital=capitalizeWord("h h h h");// H H H H
         System.out.println(capital);
         capital=capitalizeWord("123");// 123
         System.out.println(capital);
	}

}
