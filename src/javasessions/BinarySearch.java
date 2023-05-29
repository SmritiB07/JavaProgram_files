package javasessions;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {0,1,2,5,6,7,9,10};
		int key=10;
		int l=0;
		int h=arr.length-1;
		boolean flag=false;
		
		while(l<=h) {
			int m =(l+h)/2;
			
			if(arr[m]==key) {
				System.out.println("Element is found");
				flag=true;
				break;
			}
			if(arr[m]<key) {
			l=m+1;	
			}
			if(arr[m]>key) {
			h=m-1;	
			}	
		} 
		if(flag==false) {
			System.out.println("Elemnt NOT Found...");
		}

	}

}
