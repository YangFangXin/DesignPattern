package cn.xyf.observer;

/**
 * @author Dale
 * 看股票的同事
 */
public class StockObserver extends Observer {
	
	

	public StockObserver(String name, Informer informer) {
		super(name, informer);
	}
	
	@Override
	public void update() {
		System.out.println(informer.state+name+"关闭股票行情，继续工作!");  //输出抽象通知者状态
	}
	
	
	
}
