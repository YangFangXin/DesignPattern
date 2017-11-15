package cn.xyf.observer;

/**
 * @author Dale
 *	观察者抽象类，以便不同的观察者实现()
 */
public abstract class Observer {
	//观察者名称
	protected String name;
	//注入一个观察者对象(抽象的对象，可以适当解耦) 
	protected Informer informer;
	
	//接口没有构造方法，但是抽象类有构造方法
	public Observer(String name,Informer informer)
	{
		this.name = name;
		this.informer = informer;
	}
	
	//更新当前状态
	public abstract void update();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Informer getInformer() {
		return informer;
	}

	public void setInformer(Informer informer) {
		this.informer = informer;
	}
	
	
}
