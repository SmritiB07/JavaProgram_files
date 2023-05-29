package javasessions;

import java.util.Scanner;

public class LeftHalfPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
//*
//**
//***
//****
//*****
//******

//i=rows
//j=spaces
//k=*
//always look for println