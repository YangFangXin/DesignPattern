package cn.xyf.factory;

/**
 * @author Dale
 *	大学生工厂类
 */
public class UndergraduateFactory implements IFactory{
	
	//创建雷锋对象
	@Override
	public LeiFeng createLeiFeng() {
		return new UnderGraduate();
	}

}
