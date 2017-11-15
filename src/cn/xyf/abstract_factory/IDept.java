package cn.xyf.abstract_factory;

import cn.xyf.abstract_factory.entity.Dept;

public interface IDept {
	//插入数据
	public void Insert(Dept dept);
	
	//得到Dept对象
	public void getDept(int id);
}
