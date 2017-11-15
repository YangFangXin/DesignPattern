package cn.xyf.factory;

/**
 * @author Dale
 *  封装一个雷峰类
 */
public class LeiFeng {
	//扫地
	public void sweep(){
		System.out.println("扫地");
	}
	
	//洗衣
	public void wash(){
		System.out.println("洗衣");
	}
	
	//买米
	public void buyRice(){
		System.out.println("买米");
	}
}

//大学生子类
class UnderGraduate extends LeiFeng{
	
}

//社区志愿者子类
class Volunteer extends LeiFeng{
	
}
