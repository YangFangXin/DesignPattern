package cn.xyf.abstract_factory2;

import cn.xyf.abstract_factory2.entity.Dept;
import cn.xyf.abstract_factory2.entity.User;

/**
 * @author Dale
 *  简单工厂类之于抽象工厂的优点
 */
public class Client {

	public static void main(String[] args) {
		DataAccess da = new DataAccess();
	
		//1.创建User操作对象
		User user = new User();
		IUser iUser = da.createUser();
		iUser.Insert(user);
		
		//2.创建Dept操作对象
		Dept dept = new Dept();
		IDept iDept = da.createDept();
		iDept.getDept(1);
	}

}
