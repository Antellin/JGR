package skills;

public class Charm extends Skill {
	
	private static Charm instance;
	
	private Charm(){
		super("Charm", Skill.SkillType.Basic, Skill.SkillCharacteristic.Fellowship, "Interaction", "description");
	}
	
	public static Charm getInstance(){
		if(Charm.instance == null){
			Charm.instance = new Charm();
		}
		return Charm.instance;
	}
}
