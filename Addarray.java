Write a program to print the sum of the elements of the array with the given below condition. If the array has 6 and 7 in succeeding 
orders, ignore 6 and 7 and the numbers between them for the calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10

import java.util.Scanner;

public class AddRemove {
	public static int add(int arr[],int a,int b)
	{
		int sum = 0;
		boolean add = true;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i]!=a && add==true)
			{
				sum = sum+arr[i];
			}
			else if(arr[i]==a)
			{
				add = false;
			}
			else if(arr[i]==b)
			{
				add=true;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		int arr[] = {4,3,5,6,8,9,7,10};
		int a=6;
		int b=7;
		System.out.println(AddRemove.add(arr,a,b));
	}

}
