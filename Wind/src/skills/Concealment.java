package skills;

public class Concealment extends Skill {
	
	private static Concealment instance;
	
	private Concealment(){
		super("Concealment", Skill.SkillType.Basic, Skill.SkillCharacteristic.Agility, "", "description");
	}
	
	public static Concealment getInstance(){
		if(Concealment.instance == null){
			Concealment.instance = new Concealment();
		}
		return Concealment.instance;
	}
}
