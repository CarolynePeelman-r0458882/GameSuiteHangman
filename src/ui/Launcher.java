package ui;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import db.WoordenLezer;
import domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		Speler speler = new Speler(vraagNaam());
		WoordenLezer woordenlezer;
		try {
			woordenlezer = new WoordenLezer();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Woorden.txt not found.");
			return;
		}
		/*PictionaryUi ui = new PictionaryUi(speler);
		ui.showMenu();¨*/
		HangManUi ui = new HangManUi(woordenlezer.getWoorden());

		PictionaryUi ui2 = new PictionaryUi(speler);
		ui2.showMenu();
		ui2.toonTekening();
	}
	
	public static String vraagNaam(){
		String naam;
		while(true){
			naam = JOptionPane.showInputDialog("Naam:");
			if(naam.trim().equals("")){
				JOptionPane.showMessageDialog(null, "Naam mag niet leeg zijn.");
				continue;
			}
			break;
		}
		return naam;
	}

}
