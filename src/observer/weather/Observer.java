package observer.weather;
/**
 * 定义了一个观察者接口，其它观察者类均依赖并实现该接口
 * @author Benedace
 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
