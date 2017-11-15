package cn.xyf.observer;

/**
 * @author Dale
 * NBA观察者
 */
public class NBAObserver extends Observer {

	public NBAObserver(String name, Informer informer) {
		super(name, informer);
	}

	@Override
	public void update() {
		System.out.println(informer.state+name+"关闭NBA视频，继续工作!");  //输出抽象通知者状态
	}

}
