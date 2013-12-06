package character;


public class Characteristics {
	
	private int weaponSkill;
	private int ballisticSkill;
	private int Strength;
	private int Toughness;
	private int Agility;
	private int Intelligence;
	private int Perception;
	private int willPower;
	private int Fellowship;
	
	public Characteristics(){}
	
	public Characteristics(int weaponSkill, int ballisticSkill, int strength,
			int toughness, int agility, int intelligence, int perception,
			int willPower, int fellowship) {
		super();
		this.weaponSkill = weaponSkill;
		this.ballisticSkill = ballisticSkill;
		Strength = strength;
		Toughness = toughness;
		Agility = agility;
		Intelligence = intelligence;
		Perception = perception;
		this.willPower = willPower;
		Fellowship = fellowship;
	}
	
	public int getWeaponSkill() {
		return weaponSkill;
	}
	public void setWeaponSkill(int weaponSkill) {
		this.weaponSkill = weaponSkill;
	}
	public int getBallisticSkill() {
		return ballisticSkill;
	}
	public void setBallisticSkill(int ballisticSkill) {
		this.ballisticSkill = ballisticSkill;
	}
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength) {
		Strength = strength;
	}
	public int getToughness() {
		return Toughness;
	}
	public void setToughness(int toughness) {
		Toughness = toughness;
	}
	public int getAgility() {
		return Agility;
	}
	public void setAgility(int agility) {
		Agility = agility;
	}
	public int getIntelligence() {
		return Intelligence;
	}
	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}
	public int getPerception() {
		return Perception;
	}
	public void setPerception(int perception) {
		Perception = perception;
	}
	public int getWillPower() {
		return willPower;
	}
	public void setWillPower(int willPower) {
		this.willPower = willPower;
	}
	public int getFellowship() {
		return Fellowship;
	}
	public void setFellowship(int fellowship) {
		Fellowship = fellowship;
	}

	@Override
	public String toString() {
		return "Characteristics [weaponSkill=" + weaponSkill
				+ ", ballisticSkill=" + ballisticSkill + ", Strength="
				+ Strength + ", Toughness=" + Toughness + ", Agility="
				+ Agility + ", Intelligence=" + Intelligence + ", Perception="
				+ Perception + ", willPower=" + willPower + ", Fellowship="
				+ Fellowship + "]";
	}
	
}
