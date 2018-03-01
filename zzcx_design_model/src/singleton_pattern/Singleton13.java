package singleton_pattern;

public class Singleton13 {
	
	private static class LazyHolder {
		private static final Singleton13 INSTANCE = new Singleton13();
	}

	private Singleton13() {
	}

	public static final Singleton13 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
