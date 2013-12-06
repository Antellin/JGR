package skills;

public class Blather extends Skill {
	
	private static Blather instance;
	
	private Blather(){
		super("Blather", Skill.SkillType.Advanced, Skill.SkillCharacteristic.Fellowship, "Interaction", "description");
	}
	
	public static Blather getInstance(){
		if(Blather.instance == null){
			Blather.instance = new Blather();
		}
		return Blather.instance;
	}
}
