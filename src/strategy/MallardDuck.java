package strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		//! 继承自基类的行为（接口）被实例化，实例化所用的类决定了行为的表现形式
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
