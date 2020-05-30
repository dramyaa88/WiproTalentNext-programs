Initialize an integer array with ascii values and print the corresponding character values in a single row.

public class AsciiVal {
	public static void doOp(int arr[])
	{
		char a;
		for(int i=0;i<arr.length;i++)
		{
			a=(char)arr[i];
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {67,98,102,99};
		AsciiVal.doOp(arr);

	}

}
