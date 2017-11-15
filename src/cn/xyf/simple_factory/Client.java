package cn.xyf.simple_factory;

/**
 * @author Dale
 *  简单工厂模式客户端(输入运算符号，工厂就实例化对应的对象,利用了java的多态)
 */
public class Client {

	public static void main(String[] args) {
		/*System.out.println("请输入您要做的操作: 1.加法  2.减法   3.乘法  4.除法");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		System.out.println("请输入要运算的两个数字");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double result =0;*/
		
		Operation oper;
		//利用对象创建工厂创建对象
		oper = OperationFactory.createOperate("+");
		oper.setNumA(1);
		oper.setNumB(2);
		double result = oper.getResult();
		System.out.println("运算结果为:  "+result);
		
//		System.out.println("运算的结果为: "+result);
	}

}
