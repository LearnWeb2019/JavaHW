package JanHomeWork;
import java.util.Scanner;

class OverRidingMethods{
	int num1, num2;
	float flt1, flt2;
	
	void sum(int x, int y)
	{
		System.out.println("Method 01: Sum of two int parameters " + 
							x + " and " + y + " is " + (x+y));
	}
	void sum(float x, float y)
	{
		System.out.println("Method 02: Sum of two float parameters " + 
							x + " and " + y + " is " + (x+y));
	}
	void sum(int x, float y)
	{
		System.out.println("Method 03: Sum of int and float parameters " + 
							x + " and " + y + " is " + (x+y));
	}
	void sum(float x, int y)
	{
		System.out.println("Method 04: Sum of float and int parameters " + 
							x + " and " + y + " is " + (x+y));
	}
	void sum(int x)
	{
		System.out.println("Method 05: with one int parameters " + x);
	}
	
}

public class HW3Polymorphism {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OverRidingMethods or = new OverRidingMethods();
		or.num1 = sc.nextInt();
		or.num2 = sc.nextInt();
		or.flt1 = sc.nextFloat();
		or.flt2 = sc.nextFloat();
		or.sum(or.num1,or.num2);
		or.sum(or.flt1,or.flt2);
		or.sum(or.num1,or.flt2);
		or.sum(or.flt1,or.num2);
		or.sum(or.num2);
		

	}

}
