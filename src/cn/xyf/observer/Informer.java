package cn.xyf.observer;



/**
 * @author Dale
 *	通知者抽象类
 */
public abstract class Informer {
	
	//添加一个观察者
	public abstract void Attach(Observer ob);
	//减少一个观察者
	public abstract void Detach(Observer ob);
	//通知方法
	public abstract void Notify();
	
	//观察者状态
	protected String state;
	
	
}
