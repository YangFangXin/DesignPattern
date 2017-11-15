package cn.xyf.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dale
 *	具体公司类  继承公司类 (树枝节点)
 */
public class ConcreteCompany extends Company {
	
	//声明一个公司子节点
	private List<Company> children =  new ArrayList<Company>();	
	
	public ConcreteCompany() {
		super();
		
	}

	public ConcreteCompany(String name) {
		super(name);
	}


	@Override
	protected void add(Company company) {
		children.add(company);
	}

	@Override
	protected void remove(Company company) {
		children.remove(company);
	}

	@Override
	protected void display(int depth) {
		//虽然StringBuilder 不是线程安全的，但对于大多数单线程程序，我们可以采用它，它的速度>StringBuffer>String
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(new String(sb)+this.getName());
		for(Company company:children){
			company.display(depth + 2);  //两级之间相差两杠
		}
		
	}
	
	//部门履行职责方法
	@Override
	protected void LineOfDuty() {
		for(Company company:children){
			company.LineOfDuty();
		}
	}

}
