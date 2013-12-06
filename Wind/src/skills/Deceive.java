package skills;

public class Deceive extends Skill {
	
	private static Deceive instance;
	
	private Deceive(){
		super("Deceive", Skill.SkillType.Basic, Skill.SkillCharacteristic.Fellowship, "Interaction", "description");
	}
	
	public static Deceive getInstance(){
		if(Deceive.instance == null){
			Deceive.instance = new Deceive();
		}
		return Deceive.instance;
	}
}
