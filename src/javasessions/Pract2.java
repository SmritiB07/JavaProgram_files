package javasessions;

public class Pract2 {

	public static void main(String[] args) {
//	int a=20;
//	int b = 30;
//	int largest=a>b?a:b;
//	System.out.println("largest no is :"+" "+largest);

		String str="WelCo8m9e To AUto5M8at3io1N";
		String upper="";
		String lower="";
		String special="";
       for(int i=0;i<str.length();i++) {
    	   char ch=str.charAt(i);
    	   if(ch>65 && ch<90 ) {
    		   upper=upper+ch;   
    	   }
    	   else if(ch<48 && ch>57){
    		special=special+ch;   
    	   }
    	   else {
    		 lower=lower+ch;  
    	   }
    	   
       }
		System.out.println("upper letters are:"+upper.length());
		System.out.println("lower letters are:"+lower.length());
		System.out.println("no are there:"+" "+special.length());

		
	}

}
