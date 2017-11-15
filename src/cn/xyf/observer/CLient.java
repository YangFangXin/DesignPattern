package cn.xyf.observer;

/**
 * @author Dale
 *	java语言实现观察者模式
 */
public class CLient {

	public static void main(String[] args) {
		//声明一个老板对象
		Boss boss = new Boss();
		//看股票的同事
		StockObserver so = new StockObserver("彭蕾", boss);
		
		//看NBA的同事
		NBAObserver no = new NBAObserver("龚宇", boss);
		
		//添加两个同事
		boss.Attach(so);
		boss.Attach(no);
		
		//减少一个同事
		boss.Detach(no);
		
		//老板回来
		boss.state = "你爸爸马云回来了!!!";
		
		boss.Notify();
	}

}
