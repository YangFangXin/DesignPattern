package cn.xyf.composite;

/**
 * @author Dale
 *  组合模式客户端类
 */
public class Client {
	public static void main(String []args){
		//添加一个根节点
		ConcreteCompany  root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartmemt("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		//添加第一个枝节点[
		ConcreteCompany comp = new ConcreteCompany("上海华东分工司");
		comp.add(new HRDepartmemt("华东分公司人力资源部"));
		comp.add(new FinanceDepartment("华东分公司财务部"));
		//把这个枝节点添加到根节点下
		root.add(comp);
		
		//添加第二个枝节点
		ConcreteCompany comp2 = new ConcreteCompany("南昌办事处");
		comp2.add(new HRDepartmemt("南昌办事处人力资源部"));
		comp2.add(new FinanceDepartment("南昌办事处公司财务部"));
		root.add(comp2);
		
		//添加第三个枝节点
		ConcreteCompany comp3 = new ConcreteCompany("杭州办事处");
		comp3.add(new HRDepartmemt("杭州办事处人力资源部"));
		comp3.add(new FinanceDepartment("杭州办事处公司财务部"));
		root.add(comp3);
		
		System.out.println("结构图: \n");
		root.display(1);
		
		System.out.println("职责: \n");
		root.LineOfDuty();
	}
}
