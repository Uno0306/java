package blood.transfusion.exception;

public class NotExistException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1564197238271360961L;

	public NotExistException() {}

	public NotExistException(String msg) {
		super(msg);
	}

}
