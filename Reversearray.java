Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1:
C:\>java Sample 1 2 3
O/P Expected : Please enter 4 integer numbers

Example2:
C:\>java Sample 1 2 3 4
O/P Expected :
The given array is :
1 2
3 4
The reverse of the array is :
4 3
2 1public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] =new int[2][2];
		
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				int n =Integer.parseInt(args[2*i+j]);
				arr[i][j]=n;
			}
		}
		
		
		for(int i = 0;i < 2;i++)
		{
			for(int k = 0;k<2;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
		int t=2;
		int r=2;
		
		for(int i =t-1 ;i>=0;i--)
		{
			for(int j = r-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}


public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] =new int[2][2];
		
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				int n =Integer.parseInt(args[2*i+j]);
				arr[i][j]=n;
			}
		}
		
		
		for(int i = 0;i < 2;i++)
		{
			for(int k = 0;k<2;k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
		int t=2;
		int r=2;
		
		for(int i =t-1 ;i>=0;i--)
		{
			for(int j = r-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
