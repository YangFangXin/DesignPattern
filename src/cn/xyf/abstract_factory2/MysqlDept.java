package cn.xyf.abstract_factory2;

import cn.xyf.abstract_factory2.entity.Dept;

public class MysqlDept implements IDept {

	@Override
	public void Insert(Dept dept) {
		System.out.println("MysqlDept insert into Dept");
	}

	@Override
	public void getDept(int id) {
		System.out.println("MysqlDept select * from Dept where id="+id);
	}

}
