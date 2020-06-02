Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of
double type). The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() 
function.

public class Box {
	public int Box(int width,int height,double depth)
	{
		int volume = (int) (width*height*depth);
		return volume;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj = new Box();
		int a =obj.Box(4,6,7.888);
		System.out.println(a);

	}

}
