package strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		//! �̳��Ի������Ϊ���ӿڣ���ʵ������ʵ�������õ����������Ϊ�ı�����ʽ
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
