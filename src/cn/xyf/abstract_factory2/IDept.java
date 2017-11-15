package cn.xyf.abstract_factory2;

import cn.xyf.abstract_factory2.entity.Dept;

public interface IDept {
	//插入数据
	public void Insert(Dept dept);
	
	//得到Dept对象
	public void getDept(int id);
}
