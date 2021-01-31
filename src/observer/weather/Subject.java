package observer.weather;
/**
 * 定义了一个主题接口，其它观察者均订阅该接口
 * @author Benedace
 *
 */
public interface Subject {
	public void registerObserver(Observer o); //! 注册观察者
	public void removeObserver(Observer o); //! 移除观察者
	public void notifyObservers(); //! 当主题状态改变时，通知所以观察者
}