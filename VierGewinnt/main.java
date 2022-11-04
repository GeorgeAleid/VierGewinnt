package VierGewinnt;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Spieler k = new Spieler("George", 1);
		Spieler k1 = new Spieler("G", 2);
		Spielfeld b = new Spielfeld();
		b.initialisiereSpielfeld();
		boolean player = true;
		do {
			if (player) {
				System.out.println(k.getSpieler() + ":  Spalte?");
				int x = sc.nextInt();
				b.setzeSpielstein(x, k);
				player = false;
			} else {
				System.out.println(k1.getSpieler() + ":  Spalte?");
				int x = sc.nextInt();
				b.setzeSpielstein(x, k1);
				player = true;
			}
		} while (!b.testeSieg());
		if (!player) {
			System.out.println(k.getSpieler() + " hat gewonnen!");
		} else
			System.out.println(k1.getSpieler() + " hat gewonnen!");

//	System.out.println();
//	System.out.println();
//	b.setzeSpielstein(0);
//	System.out.println();
//	System.out.println();
//	b.setzeSpielstein(0);
//	System.out.println();
//	System.out.println();
//	b.setzeSpielstein(0);
//	System.out.println();
//	System.out.println();
//	b.setzeSpielstein(0);
//	
//	System.out.println(b.testeSieg());
	}
}
