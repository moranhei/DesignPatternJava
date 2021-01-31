package observer.weather;

import java.util.ArrayList;
/**
 * 定义一个主题（其继承并实现主题接口）
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
	// 注册观察者
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	// 移除观察者
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	// 将状态改变告诉每一个观察者
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i); // 获得每个观察者
			observer.update(temperature, humidity, pressure); // 调用每个观察者的该函数，实现布告板
		}
	}
	// 当气象站得到更新数据后通知观察者
	public void measurementsChanged() {
		notifyObservers();
	}
	// 程序模拟气象站数据改变
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}






