Write a program to print * in Floyds format (using for and while loop)
*
* *
* * *

Example1:

C:\>java Sample
O/P Expected : Please enter an integer number

Example1:
C:\>java Sample 3
O/P Expected :
*
* *
* * *

import java.util.Scanner;

public class StarFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
