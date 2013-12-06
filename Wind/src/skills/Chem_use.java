package skills;

public class Chem_use extends Skill {
	
	private static Chem_use instance;
	
	private Chem_use(){
		super("Chem_use", Skill.SkillType.Advanced, Skill.SkillCharacteristic.Intelligence, "Crafting, Investigation", "description");
	}
	
	public static Chem_use getInstance(){
		if(Chem_use.instance == null){
			Chem_use.instance = new Chem_use();
		}
		return Chem_use.instance;
	}
}
