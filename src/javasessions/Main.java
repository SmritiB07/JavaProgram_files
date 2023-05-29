package javasessions;

//import java.util.ArrayList;
//import java.util.function.Consumer;
//
//public class Main {
//  public static void main(String[] args) {
//    ArrayList<Integer> numbers = new ArrayList<Integer>();
//    numbers.add(5);
//    numbers.add(9);
//    numbers.add(8);
//    numbers.add(1);
//    Consumer<Integer> method = (n) -> { System.out.println(n); };
//    numbers.forEach( method );
//  }
//}

interface StringFunction {
	  String run(String str);
	}

	public class Main {
	  public static void main(String[] args) {
	    StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	  }
	  public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
	}

