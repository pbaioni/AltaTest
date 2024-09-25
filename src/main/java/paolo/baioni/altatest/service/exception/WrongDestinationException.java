package paolo.baioni.altatest.service.exception;

public class WrongDestinationException extends Exception {

	private static final long serialVersionUID = 6864052397274167135L;

	public WrongDestinationException(String vehicle, String wrongDestination) {
		super(String.format("You cannot move a %s to a %s point", vehicle + wrongDestination));
	}
}
