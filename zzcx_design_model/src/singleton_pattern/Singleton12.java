package singleton_pattern;


//2��˫�ؼ������
public class Singleton12 {
	private Singleton12() {
	}

	private static Singleton12 single = null;

	// ��̬��������
	public static Singleton12 getInstance() {
		if (single == null) {
			synchronized (Singleton12.class) {
				if (single == null) {
					single = new Singleton12();
				}
			}
		}
		return single;
	}
}
