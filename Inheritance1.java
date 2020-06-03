Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new
method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.Create
an instance of Bird class and invoke the eat, sleep and fly methods using this object.

package college;

public class Animal {
	public void eat()
	{
		System.out.println("Eating");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
class Bird extends Animal{
	public void fly()
	{
		System.out.println("Flying");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal();
		obj.eat();
		obj.sleep();
		Bird obj1 = new Bird();
		obj1.eat();
		obj1.sleep();
		obj1.fly();
	}
}

