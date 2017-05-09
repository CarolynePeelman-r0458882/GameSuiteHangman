package domain;

import java.util.ArrayList;

public class Tekening {

	private String naam;
	private ArrayList<Vorm> vormen;
	private static final int MIN_X = 0;
	private static final int MAX_X = 399;
	private static final int MIN_Y = 0;
	private static final int MAX_Y = 399;
	
	public Tekening(String naam){
		setNaam(naam);
		ArrayList<Vorm> vormen = new ArrayList<>();
	}

	public void voegToe(Vorm vorm){
		vormen.add(vorm);
	}
	
	public Vorm getVorm(int index){
		return vormen.get(index);
	}
	
	public int getAantalVormen(){
		return vormen.size();
	}
	
	public void verwijder(Vorm vorm){
		for(Vorm v : vormen){
			if(v.equals(vorm)){
				vormen.remove(v);
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
		boolean gelijk = false;
		if(object instanceof Tekening){
			Tekening tekening = (Tekening)object;
			if(this.getNaam()==tekening.getNaam()){
				gelijk = true;
			}
		}
		return gelijk;
	}
	
	@Override
	public String toString(){
		return "Tekening: " + this.getNaam();
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	
	
}
