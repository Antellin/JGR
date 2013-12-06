package skills;

public class Demolition extends Skill {
	
	private static Demolition instance;
	
	private Demolition(){
		super("Demolition", Skill.SkillType.Advanced, Skill.SkillCharacteristic.Intelligence, "Crafting", "description");
	}
	
	public static Demolition getInstance(){
		if(Demolition.instance == null){
			Demolition.instance = new Demolition();
		}
		return Demolition.instance;
	}
}
