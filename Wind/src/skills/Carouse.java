package skills;

public class Carouse extends Skill {
	
	private static Carouse instance;
	
	private Carouse(){
		super("Carouse", Skill.SkillType.Basic, Skill.SkillCharacteristic.Toughness, "", "description");
	}
	
	public static Carouse getInstance(){
		if(Carouse.instance == null){
			Carouse.instance = new Carouse();
		}
		return Carouse.instance;
	}
}
