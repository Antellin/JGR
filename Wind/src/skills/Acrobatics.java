package skills;

public class Acrobatics extends Skill {
	
	private static Acrobatics instance;
	
	private Acrobatics(){
		super("Acrobatics", Skill.SkillType.Advanced, Skill.SkillCharacteristic.Agility, "Movement", "description");
	}
	
	public static Acrobatics getInstance(){
		if(Acrobatics.instance == null){
			Acrobatics.instance = new Acrobatics();
		}
		return Acrobatics.instance;
	}
}
