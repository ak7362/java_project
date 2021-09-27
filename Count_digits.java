package java_project;

import java.util.Scanner;

public class Count_digits {
	public static void main(String args[]) {
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=0;
	while(n!=0) {
		n=n/10;
		len=len+1;

	}
	System.out.println("length of the number is "+len);
	}

}
