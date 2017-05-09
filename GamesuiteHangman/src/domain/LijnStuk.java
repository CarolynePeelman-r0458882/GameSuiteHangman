package domain;

import javax.swing.JOptionPane;

public class LijnStuk {
	private Punt StartPunt;
	private Punt EindPunt;

	public LijnStuk(Punt startPunt, Punt eindPunt) {

		if (startPunt == null || eindPunt == null) {
			throw new DomainException("Startpunt en eindpunt mogen niet null zijn.");
		}

		setStartEnEindPunt(startPunt, eindPunt);
	}

	public Punt getStartPunt() {
		return StartPunt;
	}

	public Punt getEindPunt() {
		return EindPunt;
	}

	public void setStartEnEindPunt(Punt startPunt, Punt eindPunt) {
		this.StartPunt = startPunt;
		this.EindPunt = eindPunt;
	}

	@Override
	public boolean equals(Object object) {
		LijnStuk lijnstuk = (LijnStuk) object;
		if (lijnstuk == null) {
			return false;
		} else if (lijnstuk.getStartPunt().equals(this.getStartPunt())
				&& lijnstuk.getEindPunt().equals(this.getEindPunt())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Lijn: startpunt: " + getStartPunt().toString() + " - eindpunt: " + getEindPunt().toString();
	}

}