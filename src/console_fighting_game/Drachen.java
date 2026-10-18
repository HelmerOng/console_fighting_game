package console_fighting_game;
import java.util.ArrayList;
import java.util.List;

public class Drachen {
	private String name = "Hallo";
	private int hp = 100;
	private List<Attacken> attacken;
	
	public Drachen(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.attacken = new ArrayList<>();
	}
	public void addAttacke(Attacken neueAttacke) {
		this.attacken.add(neueAttacke);
	}
	
	public String getName(String name) {
		return name;
	}
	public int getHp() {
		return this.hp;
	}
}

