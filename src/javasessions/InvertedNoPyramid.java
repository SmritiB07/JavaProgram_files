package javasessions;

import java.util.Scanner;

public class InvertedNoPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}

//1234
//123
//12
//1

