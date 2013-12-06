package skills;

public class Climb extends Skill {
	
	private static Climb instance;
	
	private Climb(){
		super("Climb", Skill.SkillType.Basic, Skill.SkillCharacteristic.Strength, "Movement", "description");
	}
	
	public static Climb getInstance(){
		if(Climb.instance == null){
			Climb.instance = new Climb();
		}
		return Climb.instance;
	}
}
