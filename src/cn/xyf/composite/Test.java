package cn.xyf.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式  之  组合模式    模拟excel数据变化图表也跟着变化
 * 1.针对接口、基类编程
 * 2.满足开闭原则、可扩展性
 * 
 * */
public class Test {
	public static void main(String args[]){
		Data da = new Data(1, 2, 3);
		List<ChartA> listA = new ArrayList<ChartA>();
		
	}
	
}

//数据源类
class Data
{	
	//数据表的三个属性 a、b、c
	private int a,b,c;
	
	//把图形对象A、B作为数据类的两个属性
	private List<Chart> listCh = new ArrayList<Chart>();
	
	//添加
	public void addChart(Chart ch){
		listCh.add(ch);
	}
	
	//移除
	public void remove(int index){
		listCh.remove(index);
	}

	public Data(){
		
	}
	
	public Data(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setABC(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		//当数据源的数据发生变化时可以绘制图形
		for(int i=0;i<listCh.size();i++){
			listCh.get(i).Draw(this);  //多态(基类的指针指向子类的方法)
		}
		
	}
	
	public int getA(){
		return a;
	}
	public int getB(){
		return a;
	}
	public int getC(){
		return a;
	}	
	
	
}

//构造一个图表基类
class Chart{
	Data data;
	public void Draw(Data data){
		
	}
	public void setData(Data data){
		this.data = data;
	}
	
}

class ChartA  extends Chart//柱状图
{	
	//在Draw里面写传一个Data类型的对象
	//方法根据需要从对象中get到属性值
	public void Draw(){
		//需要获得abc的值
		int a = data.getA();
		System.out.println("饼状图A的值为: "+a);
	}
	
	//修改
	public void modify(ChartA ca){
		ca.setData(data);
	}

}

class ChartB  extends Chart//饼状图
{
	//在Draw里面写传一个Data类型的对象
	//方法根据需要从对象中get到属性值
	public void Draw(){
		//需要获得abc的值
		int b = data.getB();
		System.out.println("饼状图B的值为: "+b);
	}

}