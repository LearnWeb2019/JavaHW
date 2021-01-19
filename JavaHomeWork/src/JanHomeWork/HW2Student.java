package JanHomeWork;

import java.util.Arrays;
class University{
	String[] clgs = {"1.SUNY", "2.TEXAS A&M", "3.UTD", "4.Aligton"};
	void listOfColleges() {
		System.out.println(Arrays.toString(clgs));
	}
	
	void selectCollege(int clg1, int clg2)
	{
		if(clg1 <clg2)
		{
			System.out.println("College Rank " + clg1 + " is allocated for you");
		}
		else {
			System.out.println("College Rank " + clg2 + " is allocated for you");
		}
	}
	int seatAlloted()
	{
	
		return 1;
	}
	String payFee(int fee)
	{
		if(fee < 10) return "NO";
		return "YES";
	}
	
}

public class HW2Student {

	public static void main(String[] args) {
		University unv = new University();
		System.out.println("List of colleges: please selecte the college rank to allocate: ");
		unv.listOfColleges();
		System.out.println("College Allocated for you");
		unv.selectCollege(4, 2);
		System.out.println("No. of seats allocated " + unv.seatAlloted());
		System.out.println("Fees payed " + unv.payFee(40));

	}

}
