package ui;
import javax.swing.JOptionPane;

import domain.*;

public class PictionaryUi {
	private Speler speler;
	
	public PictionaryUi(Speler speler){
		setSpeler(speler);
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
					Rechthoek r = nieuweRechthoek();
					JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek aangemaakt: " + r.toString());
					break;
				case "Driehoek":
					Driehoek d = nieuweDriehoek();
					JOptionPane.showMessageDialog(null, "U heeft een correcte driehoek aangemaakt: " + d.toString());
					break;
				case "Lijnstuk":
					LijnStuk l = nieuwLijnstuk();
					JOptionPane.showMessageDialog(null, "U heeft een correct lijnstuk aangemaakt: " + l.toString());
					break;
				case "Punt":
					Punt p = nieuwPunt();
					JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + p.toString());
					break;
				case "Cirkel":
					Cirkel c = nieuweCirkel();
					JOptionPane.showMessageDialog(null, "U heeft een correcte cirkel aangemaakt: " + c.toString());
					break;
				default:
					break;
			}
		}
	}
	


	private Cirkel nieuweCirkel() {
		Cirkel c;
		while(true){
			try{
				int x1 = askInt("X coordinaat van het middelpunt:");
				int y1 = askInt("Y coordinaat van het middelpunt:");
				Punt p1 = new Punt(x1, y1);
				int radius = askInt("De straal van de cirkel:");
				c = new Cirkel(p1, radius);
				break;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return c;
	}

	private LijnStuk nieuwLijnstuk() {
		LijnStuk lijnstuk;
		while(true){
			try{
				int x1 = askInt("X coordinaat van het eerste punt:");
				int y1 = askInt("Y coordinaat van het eerste punt:");
				int x2 = askInt("X coordinaat van het tweede punt:");
				int y2 = askInt("Y coordinaat van het tweede punt:");
				Punt p1 = new Punt(x1, y1);
				Punt p2 = new Punt(x2, y2);
				lijnstuk = new LijnStuk(p1, p2);
				break;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return lijnstuk;
	}

	private Driehoek nieuweDriehoek() {
		Driehoek driehoek;
		while(true){
			try{
				int x1 = askInt("X coordinaat van het eerste punt:");
				int y1 = askInt("Y coordinaat van het eerste punt:");
				int x2 = askInt("X coordinaat van het tweede punt:");
				int y2 = askInt("Y coordinaat van het tweede punt:");
				int x3 = askInt("X coordinaat van het derde punt:");
				int y3 = askInt("Y coordinaat van het derde punt:");

				Punt p1 = new Punt(x1, y1);
				Punt p2 = new Punt(x2, y2);
				Punt p3 = new Punt(x3, y3);
				driehoek = new Driehoek(p1, p2, p3);
				break;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return driehoek;
	}

	private Rechthoek nieuweRechthoek() {
		Rechthoek rechthoek;
		while(true){
			try{
				int x1 = askInt("X coordinaat van de linkerbovenhoek:");
				int y1 = askInt("Y coordinaat van de linkerbovenhoek:");
				Punt p1 = new Punt(x1, y1);
				
				int breedte = askInt("Breedte van de rechthoek:");
				int hoogte = askInt("Hoogte van de rechthoek:");
				
				rechthoek = new Rechthoek(p1, breedte, hoogte);
				break;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return rechthoek;
	}

	private Punt nieuwPunt() {
		Punt punt;
		while(true){
			try{
				int x = askInt("X coordinaat van het punt:");
				int y = askInt("Y coordinaat van het punt:");
				punt = new Punt(x, y);
				JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt.toString());
				break;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return punt;
	}
	
	private int askInt(String message){
		String txt = JOptionPane.showInputDialog(message);
		try{
			return Integer.parseInt(txt);
		}catch(Exception e){
			throw new DomainException("Input moet een getal zijn.");
		}
	}

	public Speler getSpeler() {
		return speler;
	}

	public void setSpeler(Speler speler) {
		this.speler = speler;
	}
}
