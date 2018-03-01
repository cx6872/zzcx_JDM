package observer_pattern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017年12月11日 下午1:41:13
 * 
 */
public interface Subject {
	public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
