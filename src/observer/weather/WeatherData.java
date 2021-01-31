package observer.weather;

import java.util.ArrayList;
/**
 * ����һ�����⣨��̳в�ʵ������ӿڣ�
 * @author Benedace
 *
 */
public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	// ע��۲���
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	// �Ƴ��۲���
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	// ��״̬�ı����ÿһ���۲���
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i); // ���ÿ���۲���
			observer.update(temperature, humidity, pressure); // ����ÿ���۲��ߵĸú�����ʵ�ֲ����
		}
	}
	// ������վ�õ��������ݺ�֪ͨ�۲���
	public void measurementsChanged() {
		notifyObservers();
	}
	// ����ģ������վ���ݸı�
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}






