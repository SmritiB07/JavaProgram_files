package javasessions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPrac {

	public static void main(String[] args) {
//    Pattern pattern=Pattern.compile("Smriti",Pattern.CASE_INSENSITIVE);
//    Matcher matcher=pattern.matcher("You are amazing smriti!");    
    Pattern pattern=Pattern.compile("121212",Pattern.CASE_INSENSITIVE);
    Matcher matcher=pattern.matcher("Lucky number is :121212!");    
    boolean matchfinder=matcher.find();
    if(matchfinder) {
    	System.out.println("Match is found");
    }
    else {
    	System.out.println("Match is not found");
    }
    
    
    
	}

}
