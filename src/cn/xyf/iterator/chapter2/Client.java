package cn.xyf.iterator.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dale
 *  迭代器测试类
 */
public class Client {

	public static void main(String[] args) {
		List products = new ArrayList();
		products.add("倚天剑");
		products.add("屠龙刀");
		products.add("断肠草");
		products.add("葵花宝典");
		products.add("四十二章经");
		
		//创建聚合对象
		AbstractObjectList list = new ProDuctList(products);
		//创建迭代器对象(工厂化创建)
		AbstractIterator iterator = list.createIterator();
		System.out.println("正向遍历:   ");
		while(!iterator.isLast()){
			System.out.print(iterator.getNextItem()+"，");
			//游标+1
			iterator.next();
		}
		
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("逆向遍历:  ");
		while(!iterator.isFirst()){
			System.err.print(iterator.getPreviousItem()+"，");
			iterator.previous();
		}
	}

}
