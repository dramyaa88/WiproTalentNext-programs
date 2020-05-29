Write a program to add all the values in a given number and print.

Ex: 1234->10

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a;
		while(a!=0)
		{
			r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.out.println(b+"->"+sum);

	}

}
