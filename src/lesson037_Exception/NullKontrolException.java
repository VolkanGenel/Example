package lesson037_Exception;

public class NullKontrolException extends RuntimeException {

	String message;
	
	
	
	public NullKontrolException(String message) {
		super();
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "NullKontrolException [message=" + message + "]";
	}
	
	

}
