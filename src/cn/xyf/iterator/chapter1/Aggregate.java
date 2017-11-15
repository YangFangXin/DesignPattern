package cn.xyf.iterator.chapter1;

/**
 * @author Dale
 *  抽象聚合类用于存储数据并负责创建迭代器对象
 */
public interface Aggregate {
	Iterator createIterator();  
}
