package console_fighting_game;

public class Attacken {
	private int dmg;
	private String name;
	
	public Attacken(int dmg, String name) {
		this.dmg = dmg;
		this.name = name;
	}
	public int getDmg() {
		return this.dmg;
	}
	public String getName() {
		return this.name;
	}
}
