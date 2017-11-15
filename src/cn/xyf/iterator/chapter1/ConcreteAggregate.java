package cn.xyf.iterator.chapter1;

public class ConcreteAggregate implements Aggregate{

	@Override
	public Iterator createIterator() {
		//返回一个迭代器
		return new ConcreteIterator(this);
	}
	
}
