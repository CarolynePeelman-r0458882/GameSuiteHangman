package ui;

import javax.swing.JOptionPane;

import domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		Speler speler = new Speler(vraagNaam());
		PictionaryUi ui = new PictionaryUi(speler);
		ui.showMenu();
		ui.toonTekening();
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
