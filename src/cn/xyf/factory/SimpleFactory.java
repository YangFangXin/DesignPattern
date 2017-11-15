package cn.xyf.factory;

/**
 * @author Dale
 * 简单工厂模式
 */
public class SimpleFactory {
	//静态方法创建雷锋对象
	public static LeiFeng createLeiFeng(String type){
		LeiFeng result = null;
		switch(type){
			case "UnderGraduate":
				result = new UnderGraduate();
				break;
			case "UnderGrate":
				result = new Volunteer();
				break;
		}
		return result;
	}
}
