package skills;

public class Common_Lore extends Skill {
	
	private static Common_Lore instance;
	
	private Common_Lore(){
		super("Common_Lore", Skill.SkillType.Advanced, Skill.SkillCharacteristic.Intelligence, "Investigstion", "description");
	}
	
	public static Common_Lore getInstance(){
		if(Common_Lore.instance == null){
			Common_Lore.instance = new Common_Lore();
		}
		return Common_Lore.instance;
	}
}
