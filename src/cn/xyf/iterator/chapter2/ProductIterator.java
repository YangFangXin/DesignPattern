package cn.xyf.iterator.chapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dale
 *  具体商品迭代器
 */
public class ProductIterator implements AbstractIterator {
	public static void main (String args[]){
		List list = new ArrayList<>();
		Iterator iterator =  list.iterator();
	}
	
	
	//注入具体商品聚合类
	private ProDuctList productList;
	//注入商品类
	private List products;
	private int cursors1;//定义一个游标，用于记录正向遍历的位置
	private int cursors2;//定义一个游标，用于记录反向遍历的位置
	
	
	public ProductIterator(ProDuctList list) {
		this.productList = list;
		this.products = list.getObjects();//获取集合对象
		cursors1 = 0;//获取正向遍历的初始值
		cursors2 = products.size()-1;//设置逆向遍历游标的初始值
	}

	@Override
	public void next() {
		if(cursors1 < products.size()){
			cursors1++;
		}
	}

	@Override
	public boolean isLast() {
		return (cursors1==products.size());
	}

	@Override
	public void previous() {
		if(cursors2>-1){
			cursors2--;
		}
	}

	@Override
	public boolean isFirst() {
		//如果游标2值为-1说明逆向遍历返回完了
		return (cursors2 == -1);
	}

	@Override
	public Object getNextItem() {
		return products.get(cursors1);
	}

	@Override
	public Object getPreviousItem() {
		return products.get(cursors2);
	}

}
