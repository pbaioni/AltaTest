package paolo.baioni.altatest.service.exception;

public class DuplicateIdException extends Exception {

	private static final long serialVersionUID = -3601601434129891487L;

	public DuplicateIdException() {
		super("Duplicate Id, impossible to add vehicle");
	}
}
