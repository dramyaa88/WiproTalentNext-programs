Write a program to initialize an array and print them in a sorted fashion

public class SortArray {
	public static void sorting(int arr[])
	{
		int temp;
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print( i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,4,3,6,1};
		SortArray.sorting(arr);

	}

}
