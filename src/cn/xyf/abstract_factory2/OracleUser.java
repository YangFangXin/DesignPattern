package cn.xyf.abstract_factory2;

import cn.xyf.abstract_factory2.entity.User;

public class OracleUser implements IUser{

	@Override
	public void Insert(User user) {
		System.out.println("OracleUser  insert into User");
	}

	@Override
	public void getUser(int id) {
		System.out.println("OracleUser  select * from User");
	}


}
