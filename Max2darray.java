Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.

Example1:
C:\>java Sample 1 2 3
O/P Expected : Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P Expected :
The given array is :
1 23 45
55 121 222
56 77 89

The biggest number in the given array is 222

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int row=3;
		int column=3;
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<column;j++)
			{
				int a=sc.nextInt();
				arr[i][j] = a;
			}
		}
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int max = arr[0][0];
		for(int i = 0;i<row;i++)
		{
			for(int j =0;j<column;j++)
			{
				if(arr[i][j]>max)
				{
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
