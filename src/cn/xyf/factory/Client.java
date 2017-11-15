package cn.xyf.factory;

/**
 * @author Dale
 * java 工厂模式
 */
public class Client {
	
	public static void main(String[] args) {
		//1.简单工厂模式  
	/*	LeiFeng s1 = SimpleFactory.createLeiFeng("UnderGraduate");
		LeiFeng s2 = SimpleFactory.createLeiFeng("UnderGrate");
		s1.wash();
		s2.buyRice();*/
		
		//2.工厂模式
		IFactory iFactory = new UndergraduateFactory();
		LeiFeng student = iFactory.createLeiFeng();
		student.buyRice();
	}

}
