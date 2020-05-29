Write a Java program to find if the given number is prime or not.

Example1:
C:\>java Sample
O/P Expected : Please enter an integer number
Example2:
C:\>java Sample 1
O/P Expected : 1 is neither prime nor composite
Example3:
C:\>java Sample 0
O/P Expected : 0 is neither prime nor composite
Example4:
C:\>java Sample 10
O/P Expected : 10 is not a prime number
Example5:
C:\>java Sample 7
O/P Expected : 7 is a prime number

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int m=a/2;
		int flag=0;
		if(a==1 || a==0)
		{
			System.out.println(a+" is neither a prime nor composite");
		}
		for(int i=2;i<=m;i++)
		{
			if(a%2==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(a+ " is a prime number");
		}
		else
		{
			System.out.println(a+" is not a Prime number");
		}

	}

}
