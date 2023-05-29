package javasessions;

public class SumOfNaturalNumber {
	
	
	public static void printSum(int i, int n, int sum) {
		if(i==n) {
			sum=sum+i;
			System.out.println(sum);
			return;
		}
		sum=sum+i;
		printSum(i+1,n,sum);
		
	}

	public static void main(String[] args) {
		printSum(1,5,0);

	}

}

//natural no sum
// n=5,1+2+3+4+5
//  
//
//
//
//
//
//