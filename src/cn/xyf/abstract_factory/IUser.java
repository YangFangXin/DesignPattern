package cn.xyf.abstract_factory;

import cn.xyf.abstract_factory.entity.User;

/**
 * @author Dale
 *  抽象工厂IUser接口
 */
public interface IUser {
	//插入数据
	public void Insert(User user);
	
	//得到User对象
	public void getUser(int id);
}
