package observer.weather;
/**
 * ������һ������ӿڣ������۲��߾����ĸýӿ�
 * @author Benedace
 *
 */
public interface Subject {
	public void registerObserver(Observer o); //! ע��۲���
	public void removeObserver(Observer o); //! �Ƴ��۲���
	public void notifyObservers(); //! ������״̬�ı�ʱ��֪ͨ���Թ۲���
}