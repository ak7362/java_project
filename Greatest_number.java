package java_project;
import java.util.Scanner;
public class Greatest_number {
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	if(a>b && a>c) {
		System.out.println("Greatest number="+a);
	}
	else if( b>a && b>c) {
		System.out.println("Greatest number="+b);
	}
	else
		System.out.println("Greatest number="+c);
	}

}
