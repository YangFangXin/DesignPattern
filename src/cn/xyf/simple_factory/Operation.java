package cn.xyf.simple_factory;

/**
 * @author Dale
 *  编写一个计算器类实现加减乘除(简单工厂模式)
 */
public class Operation {
	private double numA =0;
	private double numB =0;
	
	
	public double getResult(){
		//定义一个局部变量result
		double result = 0;
		return result;
	}
	
	
	public double getNumA() {
		return numA;
	}
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public double getNumB() {
		return numB;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
}

//加法
class OperationAdd extends Operation{
	//返回一个结果
	public double getResult(){
		double result = 0;
		//子类访问父类private的参数要用get方法
		result = getNumA()+getNumB();
		return result;
	}
}

//减法
class OperationSub extends Operation{
	//返回一个结果
	public double getResult(){
		double result = 0;
		result = getNumA()-getNumB();
		return result;
	}
	
	
}

//乘法
class OperationMul extends Operation{
	//返回一个结果
	public double getResult(){
		double result = 0;
		result = getNumA()*getNumB();
		return result;
	}
}


//除法
class OperationDiv extends Operation{
	//返回一个结果
	public double getResult(){
		double result = 0;
		result = getNumA()/getNumB();
		return result;
	}
}
