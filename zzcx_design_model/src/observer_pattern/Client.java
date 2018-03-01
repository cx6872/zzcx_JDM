package observer_pattern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017年12月11日 下午1:45:28
 * 
 */
public class Client {
	public static void main(final String[] args) {
		final ConcreteSubject sb = new ConcreteSubject();
		sb.setTemperature((float) 20.00);

		final Observer o = new ConcreteObserver(sb);
		sb.setTemperature((float) 21.00);
	}
}
