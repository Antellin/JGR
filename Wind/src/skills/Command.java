package skills;

public class Command extends Skill {
	
	private static Command instance;
	
	private Command(){
		super("Command", Skill.SkillType.Basic, Skill.SkillCharacteristic.Fellowship, "Interaction", "description");
	}
	
	public static Command getInstance(){
		if(Command.instance == null){
			Command.instance = new Command();
		}
		return Command.instance;
	}
}
