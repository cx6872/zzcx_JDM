package observer_pattern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017��12��11�� ����1:41:13
 * 
 */
public interface Subject {
	public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
