package cn.xyf.simple_factory;

/**
 * @author Dale
 * 简单工厂创建操作类
 */
public class OperationFactory {
	public static Operation createOperate(String operate){
		Operation oper = null;
		switch(operate){
			case "+": 
				oper = new OperationAdd();
				break;
			case "-": 
				oper = new OperationSub();
				break;
			case "*": 
				oper = new OperationMul();
				break;
			case "/": 
				oper = new OperationDiv();
				break;
		}
		return oper;
	}
}
