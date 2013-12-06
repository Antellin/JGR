package skills;

public abstract class Skill {
	public static enum SkillType{Advanced, Basic}
	public static enum SkillCharacteristic{Agility, Perception, Fellowship, Intelligence, Strength, Willpower, Toughness}
	
	private String skillName;
	private SkillType skillType;
	private SkillCharacteristic skillCharacteristic;
	private String skillDescriptor;
	private String skillDescription;
	
	public Skill() {
		super();
	}
	
	public Skill(String skillName, SkillType skillType,
			SkillCharacteristic skillCharacteristic, String skillDescriptor,
			String skillDescription) {
		super();
		this.skillName = skillName;
		this.skillType = skillType;
		this.skillCharacteristic = skillCharacteristic;
		this.skillDescriptor = skillDescriptor;
		this.skillDescription = skillDescription;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public SkillType getSkillType() {
		return skillType;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}

	public SkillCharacteristic getSkillCharacteristic() {
		return skillCharacteristic;
	}

	public void setSkillCharacteristic(SkillCharacteristic skillCharacteristic) {
		this.skillCharacteristic = skillCharacteristic;
	}

	public String getSkillDescriptor() {
		return skillDescriptor;
	}

	public void setSkillDescriptor(String skillDescriptor) {
		this.skillDescriptor = skillDescriptor;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

}
