package skills;

public class Dodge extends Skill {
	
	private static Dodge instance;
	
	private Dodge(){
		super("Dodge", Skill.SkillType.Basic, Skill.SkillCharacteristic.Agility, "Movement", "description");
	}
	
	public static Dodge getInstance(){
		if(Dodge.instance == null){
			Dodge.instance = new Dodge();
		}
		return Dodge.instance;
	}
}
