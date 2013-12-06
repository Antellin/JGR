package skills;

public class Ciphets extends Skill {
	
	private static Ciphets instance;
	
	private Ciphets(){
		super("Ciphets", Skill.SkillType.Advanced, Skill.SkillCharacteristic.Intelligence, "", "description");
	}
	
	public static Ciphets getInstance(){
		if(Ciphets.instance == null){
			Ciphets.instance = new Ciphets();
		}
		return Ciphets.instance;
	}
}
