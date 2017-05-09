package domain;

public class DomainException extends IllegalArgumentException {
	
	public DomainException(){
		super();
	}

	public DomainException(String string) {
		super(string);
	}
	
}
