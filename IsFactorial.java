Write a function to find the factorial of the given number

class IsFactorial
{
public int number(int input1)
{
// Write code here...
		if(input1==0)
		{
			return 1;
		}
		return input1*number(input1-1);
}
}
