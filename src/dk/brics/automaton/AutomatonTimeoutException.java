package dk.brics.automaton;

/**
 * Exception raised when a BRICS automaton operation exceeds its local budget.
 */
public class AutomatonTimeoutException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AutomatonTimeoutException() {
		super("BRICS automaton operation timed out");
	}

	public AutomatonTimeoutException(String operation) {
		super(operation == null
			? "BRICS automaton operation timed out"
			: "BRICS automaton operation timed out during " + operation);
	}
}