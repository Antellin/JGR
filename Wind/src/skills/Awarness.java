package skills;

public class Awarness extends Skill {
	
	private static Awarness instance;
	
	private Awarness(){
		super("Awarness", Skill.SkillType.Basic, Skill.SkillCharacteristic.Perception, "", "description");
	}
	
	public static Awarness getInstance(){
		if(Awarness.instance == null){
			Awarness.instance = new Awarness();
		}
		return Awarness.instance;
	}
}
