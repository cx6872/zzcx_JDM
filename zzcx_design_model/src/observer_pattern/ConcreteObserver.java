package observer_pattern;


/**
 * @version 1.00
 * @author chenxu
 * @date 2017年12月11日 下午1:40:10
 * 
 */

// reference   https://www.cnblogs.com/itTeacher/archive/2012/12/03/2800129.html
public class ConcreteObserver implements Observer{
	private float temperature;
    private final Subject subject;

    public ConcreteObserver(final Subject subject)
    {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public float getTemperature()
    {
        return temperature;
    }

    public void setTemperature(final float temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public void update(final float temperature)
    {
        this.temperature = temperature;
    }
}
