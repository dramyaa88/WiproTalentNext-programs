Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, the program should
ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program
should terminate.

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char b;
		do
		{
			System.out.println("Enter the number 1 for add 2 for sub");
			int a = sc.nextInt();
			System.out.println("Enter two numbers for add or sub");
			int p= sc.nextInt();
			int q=sc.nextInt();
			if(a==1)
			{
				System.out.println(p+q);
			}
			else
			{
				System.out.println(p-q);
			}
			System.out.println("if u need to continue press y or Y or n or N for no");
			b=sc.next().charAt(0);
			if(b=='n' || b=='N')
			{
				System.out.println("Thank you");
			}
		}while(b=='y' || b=='Y');
		

	}

}
