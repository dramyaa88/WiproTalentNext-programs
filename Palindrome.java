Write a Java program to find if the given number is palindrome or not

Example1:
C:\>java Sample 110011
O/P Expected : 110011 is a palindrome

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
		if(rev == b)
		{
			System.out.println(b+" is a Palindrome ");
		}
		else
		{
			System.out.println(b+" is not a palindrome");
		}
	

	}

}
