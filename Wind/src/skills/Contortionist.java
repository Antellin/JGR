package skills;

public class Contortionist extends Skill {
	
	private static Contortionist instance;
	
	private Contortionist(){
		super("Contortionist", Skill.SkillType.Basic, Skill.SkillCharacteristic.Agility, "Movement", "description");
	}
	
	public static Contortionist getInstance(){
		if(Contortionist.instance == null){
			Contortionist.instance = new Contortionist();
		}
		return Contortionist.instance;
	}
}
