Write a program to remove the duplicate elements in an array and print

Eg) Array Elements--12,34,12,45,67,89
O/P: 12,34,45,67,89

import java.util.HashSet;

public class RemoveDup {
	public static void Dup(int arr[])
	{
		HashSet<Integer> has = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			has.add(arr[i]);
		}
		java.util.Iterator<Integer> itr = has.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,7,8,5,4,22,8};
		RemoveDup.Dup(arr);

	}

}
