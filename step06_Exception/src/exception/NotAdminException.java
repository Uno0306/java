package exception;

public class NotAdminException extends Exception {
	public NotAdminException() {}
	
	public NotAdminException(String msg) {
		super(msg);
	}
}
