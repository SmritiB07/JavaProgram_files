package javasessions;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Smriti");
//	String str1=sb.substring(0, 6);
//	String str2=sb.substring(7);
//	String str=str1+str2;
//	str2=str.substring(0,str1.length());
//	str1=str.substring(str1.length());
//	System.out.println(str1);
//	System.out.println(str2);
//	str=str1+str2;
		for(int i=0;i<sb.length()/2;i++) {
			//indexing
			int front=i;
			int back=sb.length()-1-i;
			//character
			char frontchar=sb.charAt(front);
			char backchar=sb.charAt(back);
			//swapping
			sb.setCharAt(front, backchar);
              sb.setCharAt(back, frontchar);
					}
       System.out.println(sb);
////        
        
        
//        System.out.println("======= reversing string without sb=======");
//        String orgstr= "Smriti";
//        String reversestr="";
//        for(int i=orgstr.length()-1;i>=0;i--) {
//         reversestr=reversestr+orgstr.charAt(i);
//        }
//        System.out.println(reversestr);
        
        
        
        
        
        
	}

}
