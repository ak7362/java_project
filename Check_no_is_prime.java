package java_project;

import java.util.Scanner;

public class Check_no_is_prime {
  public static void main(String args[]) {
	  System.out.println("Enter the number:");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int i,count=0;
	for(i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println(n+ " is not prime number");
			count+=1;
			break;
		}
	}
if(count==0)
	System.out.println(n+" is prime number");
	
	
	  
  }

}
