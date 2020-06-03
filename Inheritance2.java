Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the
employee class are annual salary (double), the year the employee started to work, and the
national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class
definition.

package college;

public class Person {
	
	private String name;
	public Person() //default constructor
	{
		this.name = "";
	}
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

package college;

public class Employee extends Person{
	
	double annual_salary;
	int year;
	String natInsurance;
	public Employee()
	{
		super();
		this.annual_salary = 0.0;
		this.year = 0;
		this.natInsurance = "";
	}
	public Employee(String name,double annual_salary,int year,String natInsurance) {
		super(name);
		// TODO Auto-generated constructor stub
		this.annual_salary=annual_salary;
		this.year = year;
		this.natInsurance = natInsurance;
	}
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNatInsurance() {
		return natInsurance;
	}
	public void setNatInsurance(String natInsurance) {
		this.natInsurance = natInsurance;
	}
}

package college;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person();
		a.setName("ramyaa");
		System.out.println(a.getName());
		
		Employee b = new Employee();
		b.setAnnual_salary(74000.45);
		b.setYear(2004);
		b.setNatInsurance("pfg");
		System.out.println(b.getAnnual_salary());
		System.out.println(b.getYear());
		System.out.println(b.getNatInsurance());

	}

}


