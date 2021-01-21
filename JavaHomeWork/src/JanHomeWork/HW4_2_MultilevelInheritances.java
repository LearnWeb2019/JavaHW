package JanHomeWork;

class GrandParent{
	int height;
	String skills;
	String behaviour;
	
	GrandParent(int height, String skill, String behv)
	{
		this.height = height;
		this.skills = skill;
		this.behaviour = behv;
	}
}

class Parent extends GrandParent{
	String additionalSkill;
	
	Parent(int height, String skill, String behv, String additional)
	{
		super(height, skill, behv);
		this.additionalSkill = additional;
	}
	
	void show(String name) {
		System.out.println(name + " has following qualities");
		System.out.println("Height : " + height + "cms\nSkills: " + skills +
						"\nbehaviour: " + behaviour + "\nAdditional Skills: " + additionalSkill);
	}
}

class Son extends Parent{
	String myFav;
	
	Son(int height, String skill, String behv, String additional, String myFav)
	{
		super(height, skill, behv, additional);
		this.myFav = myFav;
	}
		
		void show(String name) {
			System.out.println(name + " has following qualities");
			System.out.println("Height : " + height  + "cms \nSkills: " + skills +
							"\nbehaviour: " + behaviour + "\nAdditional Skills: " + additionalSkill + 
							"\nFavorite Skill: " + myFav);
		}
	}

public class HW4_2_MultilevelInheritances {

	public static void main(String[] args) {
		Parent prt = new Parent(183, "Acting", "aggressive", "Singing");
		prt.show("Parent");
		System.out.println();
		Son son = new Son(183, "Acting", "aggressive", "Singing","Dancing");
		son.show("Son");

	}

}
