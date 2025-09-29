package model.exceptions;

public class DomainException extends Exception{

	// se extender de RuntimeExeception o compilador não obriga a tratar.	
	
	private static final long serialVersionUID = 1L;
	
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
	
}
