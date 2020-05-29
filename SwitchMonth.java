Program to print the month from the number given as input

import java.util.Scanner;

public class Switchmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		default:
			System.out.println("Invalid number");
		}
		
			
		

	}

}
