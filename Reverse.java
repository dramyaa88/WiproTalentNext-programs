Write a program to reverse a given number and print

Eg1)
I/P: 1234
O/P:4321

Eg2)
I/P:1004
O/P:4001

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b = a;
		int r;
		int rev=0;
		while(a!=0)
		{
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		System.out.println(rev);

	}

}
