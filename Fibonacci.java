Write a function to find Nth fibonacci number

class IsFibonacci
{
public int number(int input1)
{
if(input1==1)
		{
			return input1-1;
		}
		if(input1==2)
		{
			return input1-1;
		}

		return (nthFibonacci(input1-1)+nthFibonacci(input1-2));
}
}
