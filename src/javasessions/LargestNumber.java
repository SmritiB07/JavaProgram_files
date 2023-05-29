package javasessions;

public class LargestNumber {
	
	static int array[]= {19,89,32,45,99,18};
	public static int findLargestNumber() {
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		int maxnumber=findLargestNumber();
		System.out.println("Max no from static array is:"+maxnumber);

	}

	

	
	
}
