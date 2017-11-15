package cn.xyf.abstract_factory2;

import cn.xyf.abstract_factory2.entity.Dept;

public class OracleDept implements IDept {

	@Override
	public void Insert(Dept dept) {
		System.out.println("OracleDept insert into Dept");
	}

	@Override
	public void getDept(int id) {
		System.out.println("OracleDept select * from Dept");
	}

}
