package cn.xyf.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Informer {
	
	//声明一个同事列表(抽象类代替具体类的实现)
	private List<Observer> observers = new ArrayList<Observer>();
	
	//老板状态
	protected String action;
	
	//添加观察者
	@Override
	public void Attach(Observer observer) {
		observers.add(observer);
	}
	
	//减少观察者
	@Override
	public void Detach(Observer observer) {
		observers.remove(observer);
	}
	
	
	//通知
	@Override
	public void Notify() {
		for(Observer o:observers)
		{
			o.update();
		}
	}

	
	
}
