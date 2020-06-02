Create a new class called “Calculator” which contains the following:

1. A static method called powerInt(int num1,int num2) that accepts two integers and returns
num1 to the power of num2 (num1 power num2).
2. A static method called powerDouble(double num1,int num2) that accepts one double and one
integer and returns num1 to the power of num2 (num1 power num2).
3. Call your method from another class without instantiating the class (i.e. call it like
Calculator.powerInt(12,10) since your methods are defined to be static)

Hint: Use Math.pow(double,double) to calculate the power.

public class Calci {
	public static int powerInt(int num1,int num2)
	{
		int pow = (int) Math.pow(num1, num2);
		return pow;
	}
	public static double powerDouble(double num1,double num2)
	{
		double pow = Math.pow(num1, num2);
		return pow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calci.powerInt(2, 3));
		System.out.println(Calci.powerDouble(0.777, 14.87654678));
		
	}

}
