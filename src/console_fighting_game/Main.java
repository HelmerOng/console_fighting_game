package console_fighting_game;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Drachen ohnezahn = new Drachen("Ohnezahn", 100);
		Drachen wolkenspringer = new Drachen("Wolkenspringer", 100);
		
		Attacken plasmastrahl = new Attacken(10, "Plasmastrahl");
		Attacken windstoß = new Attacken(7, "Windstoß");
		System.out.println("Attacke eingeben: ");	
		Scanner auswahlAttacken = new Scanner(System.in);
		//int number = input.nextInt();
		System.out.println(ohnezahn.getHp());		
		System.out.println(auswahlAttacken);	
	}
}
