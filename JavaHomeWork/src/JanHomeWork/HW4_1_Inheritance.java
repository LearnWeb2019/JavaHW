package JanHomeWork;

class Processor{
	void speed(int val, String name) {
		System.out.println(name + " processor will process in " + val + " GHz");
	}
	
	void cores(int num, String name)
	{
		System.out.println(name + " process has " + num + " cores");
	}
}

class AMD extends Processor{
	void run() {
		System.out.println("AMD processor Can complete task in 1 hr");
	}
}

class Intel extends Processor{
	void run() {
		System.out.println("Intel processor Can complete task in 2 hr");
	}
}


public class HW4_1_Inheritance {
	
	
	public static void main(String[] args) {
		
		AMD amd = new AMD();
		amd.speed(45, "AMD");
		amd.cores(8,"AMD");
		amd.run();
		
		Intel itl = new Intel();
		itl.speed(50, "Intel");
		itl.cores(4,"Intel");
		itl.run();

		
	}

}
