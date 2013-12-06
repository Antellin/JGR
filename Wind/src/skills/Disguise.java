package skills;

public class Disguise extends Skill {
	
	private static Disguise instance;
	
	private Disguise(){
		super("Disguise", Skill.SkillType.Basic, Skill.SkillCharacteristic.Fellowship, "", "description");
	}
	
	public static Disguise getInstance(){
		if(Disguise.instance == null){
			Disguise.instance = new Disguise();
		}
		return Disguise.instance;
	}
}
