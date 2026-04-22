package dk.brics.automaton;

/**
 * Timeout bridge used to integrate BRICS operations with external solvers.
 */
public final class AutomatonTimeouts {

	private static final Runnable NO_OP = new Runnable() {
		@Override
		public void run() {
		}
	};

	private static volatile Runnable externalChecker = NO_OP;
	private static final ThreadLocal<Long> deadlineNanos = new ThreadLocal<Long>();

	private AutomatonTimeouts() {
	}

	public static void setExternalChecker(Runnable checker) {
		externalChecker = checker == null ? NO_OP : checker;
	}

	public static Long getDeadlineNanos() {
		return deadlineNanos.get();
	}

	public static void setDeadlineNanos(Long deadline) {
		if (deadline == null)
			deadlineNanos.remove();
		else
			deadlineNanos.set(deadline);
	}

	public static void clearDeadline() {
		deadlineNanos.remove();
	}

	public static void check() {
		check(null);
	}

	public static void check(String operation) {
		externalChecker.run();
		Long deadline = deadlineNanos.get();
		if (deadline != null && System.nanoTime() >= deadline.longValue())
			throw new AutomatonTimeoutException(operation);
	}
}