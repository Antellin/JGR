package skills;

public class Barter extends Skill {
	
	private static Barter instance;
	
	private Barter(){
		super("Barter", Skill.SkillType.Basic, Skill.SkillCharacteristic.Fellowship, "", "description");
	}
	
	public static Barter getInstance(){
		if(Barter.instance == null){
			Barter.instance = new Barter();
		}
		return Barter.instance;
	}
}
