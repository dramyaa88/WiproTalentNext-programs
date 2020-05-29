Write a program to print prime numbers between 10 and 99.

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag;
		for(int i=10;i<=99;i++)
		{
			flag=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==2)
			{
				System.out.println(i);
			}
			
		}

	}

}
