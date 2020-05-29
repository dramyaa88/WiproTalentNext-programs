Write a program to print first 5 values which are divisible by 2, 3, and 5.

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n=1;
		while(count<5 && n!=0)
		{
			if(n%2==0 && n%3==0 && n%5==0)
			{
				System.out.println(n);
				count++;
			}
			
			n++;
		}

	}

}
