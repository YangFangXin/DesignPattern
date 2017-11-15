package cn.xyf.iterator.chapter1;

/**
 * @author Dale
 *  抽象迭代器(声明了用于遍历聚合对象中所存储元素的方法)
 */
public interface Iterator {
	
	//将游标指向第一个元素
	public void first();
	
	//将游标指向下一个元素
	public void next();
	
	//判断是否存在下一个元素
	public boolean hasNext();
	
	//获取游标指向的当前元素
	public Object currentItem();
}
