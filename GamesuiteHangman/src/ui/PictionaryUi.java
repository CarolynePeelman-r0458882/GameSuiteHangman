package ui;
import javax.swing.JOptionPane;

import domain.*;

public class PictionaryUi {
	private Speler speler;
	
	public PictionaryUi(Speler speler){
		this.speler = speler;
	}
	
	public void showMenu(){
		boolean running = true;
		while(running){
			Object[] shapes = {"Cirkel", "Rechthoek", "Driehoek", "Lijnstuk", "Punt", "Afsluiten"};
			String keuze = (String)JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "Input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
			switch(keuze){
				case "Afsluiten":
					running = false;
					break;
				case "Rechthoek":
					nieuweRechthoek();
					break;
				case "Driehoek":
					nieweDriehoek();
					break;
				case "Lijnstuk":
					nieuwLijnstuk();
					break;
				case "Punt":
					nieuwPunt();
					break;
				default:
					break;
			}
		}
	}
	


	private static Punt nieuwPunt() {
		Punt punt;
		while(true){
			try{
				int x = Integer.parseInt(JOptionPane.showInputDialog("x coordinaat van het punt:"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("y coordinaat van het punt:"));
				punt = new Punt(x, y);
				JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt.toString());
				break;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return punt;
	}
}
