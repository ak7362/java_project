package java_project;

import java.util.Scanner;

public class Sum_Of_number {
	public static void main(String args[]) {
	   System.out.println("Enter the number:");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
	   while(n!=0) {
		   sum=sum+n;
		   n=n-1;
	   }
	   System.out.println("Sum of number="+sum);
	}

}
