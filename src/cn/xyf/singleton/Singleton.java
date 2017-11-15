package cn.xyf.singleton;

/**
 * @author Dale
 *  单例模式
 */
public class Singleton {

	private static Singleton instance;
    
	public Singleton() {
		
	}
	
	//获取实例的静态方法
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		
		return instance;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)
		{
			System.out.println("两个对象是相同的实例!");
		}
	}

}
