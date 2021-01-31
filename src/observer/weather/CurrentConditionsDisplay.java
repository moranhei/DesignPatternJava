package observer.weather;
/**
 * 布告板类（观察者），其继承自观察者和显示接口
 * @author Benedace
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	// 构造器根据Subject进行注册，即将当前观察者对象注册到主题
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	// 实现所继承的接口中的更新方法，即更新相关数据
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	// 布告板显示数据
	public void display() {
		System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + 
				"% humidity");
	}
}
