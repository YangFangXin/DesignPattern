package cn.xyf.abstract_factory;

import cn.xyf.abstract_factory.entity.User;

public class MysqlUser implements IUser {

	@Override
	public void Insert(User user) {
		System.out.println("MysqlUser  insert into User");
	}

	@Override
	public void getUser(int id) {
		System.out.println("MysqlUser  select * from User where id="+id);
	}

}
