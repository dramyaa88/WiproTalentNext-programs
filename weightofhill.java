public class weighthill {
	public static int weigh(int input1,int input2,int input3)
	{
		int sum = 0;
		for(int i = 0;i<input1;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				sum=sum+input2;
			}
			input2=input2+input3;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(weighthill.weigh(4, 1, 5));
	}

}
