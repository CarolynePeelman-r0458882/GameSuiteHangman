package domain;

public class Speler {
	private String naam;
	private int score;
	
	
	
	public Speler(String naam) {
		super();
		this.naam = naam;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	
	
}
