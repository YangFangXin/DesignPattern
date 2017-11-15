package cn.xyf.abstract_factory;

/**
 * @author Dale
 *  抽象工厂接口
 */
public interface IFactory {
	
	//创建IUser抽象方法
	public IUser createUser();
	
	
	//添加一个Department接口
	public IDept createDept();
	
}
