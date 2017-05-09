package domain;

public class Rechthoek extends Vorm {
	private int breedte;
	private int hoogte;
	private Punt linkerBovenhoek;

	public Rechthoek(Punt linkerbovenhoek, int breedte, int hoogte) {
		setBreedte(breedte);
		setHoogte(hoogte);
		setLinkerBovenhoek(linkerbovenhoek);
	}

	public Punt getLinkerBovenhoek() {
		return linkerBovenhoek;
	}

	private void setLinkerBovenhoek(Punt hoek) {
		if (hoek == null) {
			throw new DomainException("hoek mag niet null zijn");
		}
		this.linkerBovenhoek = hoek;
	}

	public int getBreedte() {
		return breedte;
	}

	private void setBreedte(int breedte) {
		if (breedte <= 0) {
			throw new DomainException("breedte mag niet kleiner dan 0 zijn");
		}
		this.breedte = breedte;
	}

	public int getHoogte() {
		return hoogte;
	}

	private void setHoogte(int hoogte) {
		if (hoogte <= 0) {
			throw new DomainException("hoogte mag niet kleiner dan 0 zijn");
		}
		this.hoogte = hoogte;
	}

	@Override
	public boolean equals(Object o) {
		boolean gelijk = false;
		if (o instanceof Rechthoek) {
			Rechthoek rechthoek = (Rechthoek) o;
			if (this.getBreedte() == rechthoek.getBreedte() && this.getHoogte() == rechthoek.getHoogte()
					&& this.getLinkerBovenhoek() == rechthoek.getLinkerBovenhoek()) {
				gelijk = true;
			}
		}
		return gelijk;
	}

	@Override
	public String toString() {
		return "Rechthoek: positie: " + getLinkerBovenhoek().toString() + " - breedte: " + getBreedte() + " - hoogte: "
				+ getHoogte();
	}

	@Override
	public String getOmhullende() {
		Omhullende omhullende = new Omhullende(getLinkerBovenhoek(), getBreedte(), getHoogte());
		return omhullende.getOmhullende();
	}

}
