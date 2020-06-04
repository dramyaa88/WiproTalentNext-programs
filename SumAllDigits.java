package college;

public class sumdig {
	public static int sum(int input1)
	{
		int sum=0;
		int n = input1;
		input1=Math.abs(input1);
		while(input1>0 || sum>9)
		{
			if(input1==0)
			{
				input1=sum;
				sum=0;
			}
			
			sum+=input1%10;
			input1/=10;
		}
		if(n>0)
		{
			return sum;
		}
		else
		{
			return -(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumdig.sum(-1345));

	}

}
