package javasessions;

public class PatternQuestion {

	public static void main(String[] args) {
//		 System.out.println("========101Pattern======");
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			1
//			01   :output
//			101
//			0101
//			10101
//			for(int j=1;j<=i;j++) {
//			int sum=i+j;
//			if (sum%2==0) {
//				System.out.print("1");
//			}
//			else {
//				System.out.print("0");
//			}	
//			
//			}
//			System.out.println();
//		}
//
//		System.out.println("=========ButterFly Pattern===========");
		
//		int n=5;
//		//UpperHalf
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			int spaces=2*(n-i);
//			for(int k=1;k<=spaces;k++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
//		//LowerHalf
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			int spaces=2*(n-i);
//			for(int k=1;k<=spaces;k++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
////		
//	System.out.println("=============Solid Rhombus============");	
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			for (int j=1;j<n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	System.out.println("==========Repeated no.==========");
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//System.out.println("===========Palandromic Pattern===========");		
//	
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");	
//			}
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			for(int j=2;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
System.out.println("================Diamond Pattern=============");	
		
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=(2*i)-1;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
