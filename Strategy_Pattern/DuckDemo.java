

public class DuckDemo {
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		md.performFly();
		md.performQuack();
	}
}


interface QuackBehaviour {
	public void quack();
}


interface FlyBehaviour {
	public void fly();
}

class Squeek implements QuackBehaviour{
	public void quack() {
		System.out.println("Sound : Squeek Squeek .......");
	}
}



class FlyNoWay implements FlyBehaviour{
	public void fly() {
		System.out.println("Flying is not possible.");
	}
}


class FlyWithWings implements FlyBehaviour{
	public void fly() {
		System.out.println("Flying with Wings.");
	}
}



class Quack implements QuackBehaviour{
	public void quack() {
		System.out.println("Sound : Quack Quack Quack.......");
	}
}

class QuackNoWay implements QuackBehaviour{
	public void quack() {
		System.out.print("Quack No Way.....");
	}
}


abstract class Duck {
	FlyBehaviour flying;
	QuackBehaviour quacking;
	
	public static void printInfo() {
		System.out.println("I am Duck");
	}
	
	public void setFlyBehaviour(FlyBehaviour flying) {
		this.flying = flying;
	}
	
	public void setQuackBehaviour(QuackBehaviour quacking) {
		this.quacking = quacking;
	}
}



class MallardDuck extends Duck{
	
	public MallardDuck() {
		flying = new FlyWithWings();
		quacking = new Quack();
	}
	
	public void performFly() {
		flying.fly();
	}
	
	public void performQuack() {
		quacking.quack();
	}
}



class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		flying = new FlyNoWay();
		quacking = new QuackNoWay();
	}
	
	public void performFly() {
		flying.fly();
	}
	
	public void performQuack() {
		quacking.quack();
	}
}


class RubberDuck extends Duck{
	
	public RubberDuck() {
		flying = new FlyNoWay();
		quacking = new Squeek();
	}
	
	public void performFly() {
		flying.fly();
	}
	
	public void performQuack() {
		quacking.quack();
	}
	
}


