CCreate a class called Author is designed as follows:
It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or
‘f’).
• One constructor to initialize the name, email and gender with the given values.
And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you have just created),
price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(),
setQtyInStock(). Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier).
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

package college;



public class Author {
	  
private String name;
private String email;
private char gender;
  
public Author(String name, String email, char gender)
{
this.name = name;
this.email = email;
this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getName() {
	return name;
}

public char getGender() {
	return gender;
}

}

package college;

public class Book1 {
	private String name;
	//private final String email;
	// private char gender;
	private Author author;// = new Author(name,super.email,super.gender);
	private double price;
	private int qtyInStock;
	  
	public Book1(String name,Author author,double price,int qtyInStock)
	{
	this.name = name;
	this.author = author;
	this.price = price;
	this.qtyInStock = qtyInStock;
	}
	
	public String getName()
	{
	return name;
	}
	  
	public Author getAuthor()
	{
		return author;
	}
	  
	public double getPrice()
	{
	return price;
	}
	  
	public void setPrice(double price)
	{
	this.price =price;
	}
	  
	public int getQtyInStock()
	{
	return qtyInStock;
	}
	  
	public void setQtyInStock(int qtyInStock)
	{
	this.qtyInStock =qtyInStock;
	}

}

package college;

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj1 = new Author("ramyaa", "abc2123", 'f');
		Book1 obj = new Book1("kings of roses", obj1, 54.00, 10);
		System.out.println("name of book  "+obj.getName());
		System.out.println("book price  "+obj.getPrice());
		System.out.println("quantity of books  "+obj.getQtyInStock());
		System.out.println("author name  "+obj1.getName());
		System.out.println("author email  "+obj1.getEmail());
		System.out.println("author gender  "+obj1.getGender());
		

	}

}


	




