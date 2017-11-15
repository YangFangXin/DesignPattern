package cn.xyf.abstract_factory;

import cn.xyf.abstract_factory.entity.Dept;
import cn.xyf.abstract_factory.entity.User;

public class Client {
	
	public static void main(String[] args) {
		User user = new User();
		Dept dept = new Dept();
		
		//创建抽象工厂引用  iFactory 指向不同的实例(这里用了多态)  只需要改变具体工厂就可实现不同的产品配置
		IFactory iFactory = new MysqlFactory();
		
		//1.创建mysqlUser 引用
		IUser mysqlUser =  iFactory.createUser();
		mysqlUser.Insert(user);
		mysqlUser.getUser(1);
		
		System.out.println();
		
		//2.创建  mysqlDept 引用
		IDept mysqlDept = iFactory.createDept();
		mysqlDept.Insert(dept);
		mysqlDept.getDept(1);
	}

}
