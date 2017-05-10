package db;

public class DbException extends IllegalArgumentException{
	public DbException(){
		super();
	}
	
	public DbException(String message){
		super(message);
	}
}
