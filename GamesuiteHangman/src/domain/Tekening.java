package domain;

import java.util.ArrayList;

public class Tekening {

	private String naam;
	ArrayList<Vorm> vormen;
	private static final int MIN_X = 0;
	private static final int MAX_X = 399;
	private static final int MIN_Y = 0;
	private static final int MAX_Y = 399;
	
	public Tekening(String naam){
		setNaam(naam);
	vormen = new ArrayList<>();
	}

	public void voegToe(Vorm vorm){
		if(vorm==null){
			throw new DomainException("vorm mag niet leeg zijn");
		}
		vormen.add(vorm);
	}
	
	public Vorm getVorm(int index){
		return vormen.get(index);
	}
	
	public int getAantalVormen(){
		return vormen.size();
	}
	
	public void verwijder(Vorm vorm){
		boolean ok = true;
		for(int i = 0 ; i < this.vormen.size() && ok; i++){
			if(this.vormen.get(i).equals(vorm)){
				vormen.remove(i);
				ok = false;
			}
		}
	}
	
	public boolean bevat(Vorm vorm){
		boolean bevat = false;
		if(vormen.contains(vorm)){
			bevat = true;
		}
		return bevat;
	}
	
	
	
	@Override
	public boolean equals(Object object){
		if(object == null){
			return false;
		}
		boolean gelijk = false;
		if(object instanceof Tekening){
			Tekening tekening = (Tekening)object;
			if(this.getNaam().equals(tekening.getNaam()) && this.getAantalVormen() == tekening.getAantalVormen() && this.isZelfdeLijst(tekening.getVormen())){
				gelijk = true;
			}
		}
		
		return gelijk;
	}
	
	@Override
	public String toString(){
		return "Tekening: " + this.getNaam();
	}
	
	//TODO: Check if vorm is out of image, then ignore (check tests)
	public boolean isZelfdeLijst(ArrayList<Vorm> vormen){
		boolean zelfde = true;
		for(Vorm v: vormen){
			if(!(this.vormen.contains(v))){
				zelfde = false;
			}
		}
		for(Vorm v: this.vormen){
			if(!(vormen.contains(v))){
				zelfde = false;
			}
		}
		return zelfde;
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		if(naam == null || naam.trim().isEmpty()){
			throw new DomainException("Naam is niet geldig");
		}
		this.naam = naam;
	}

	public ArrayList<Vorm> getVormen() {
		return vormen;
	}

	public void setVormen(ArrayList<Vorm> vormen) {
		this.vormen = vormen;
	}
	
	
	
	
}
