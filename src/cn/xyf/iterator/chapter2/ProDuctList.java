package cn.xyf.iterator.chapter2;

import java.util.List;

public class ProDuctList extends AbstractObjectList{

	public ProDuctList(List<Object> objects) {
		super(objects);
	}
	
	//实现创建迭代器对象的具体工厂方法
	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
	
}
