package observer.weather;
/**
 * ������һ���۲��߽ӿڣ������۲������������ʵ�ָýӿ�
 * @author Benedace
 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
