package domain;

public class Driehoek extends Vorm{
	private Punt punt1;
	private Punt punt2;
	private Punt punt3;
	
	public Driehoek(Punt punt1, Punt punt2, Punt punt3){
		setHoekpunten(punt1, punt2, punt3);
	}
	
	public void setHoekpunten(Punt punt1, Punt punt2, Punt punt3){
		if(punt1==null||punt2==null||punt3==null) throw new DomainException("De 3 punten mogen niet leeg zijn.");
		this.punt1 = punt1;
		this.punt2 = punt2;
		this.punt3 = punt3;
	}
	
	public Punt getHoekPunt1(){
		return this.punt1;
	}
	
	public Punt getHoekPunt2(){
		return this.punt2;
	}
	
	public Punt getHoekPunt3(){
		return this.punt3;
	}

	@Override
	public boolean Equals(Object object) {
		if(object==null) return false;
		if(!(object instanceof Driehoek)) return false;
		Driehoek driehoek = (Driehoek) object;
		return this.getHoekPunt1().equals(driehoek.getHoekPunt1()) && this.getHoekPunt2().equals(driehoek.getHoekPunt2()) && this.getHoekPunt3().equals(driehoek.getHoekPunt3());
	}
	
	@Override
	public String toString(){
		return "Driehoek[punt1: " + punt1 + ", punt2: " + punt2 + ", punt3: " + punt3 + "]";
	}
	
	
}
