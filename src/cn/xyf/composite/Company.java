package cn.xyf.composite;

/**
 * @author Dale
 * 定义组合中的对象声明抽象类Company(也可用接口),在适当情况下，实现类公有接口的默认行为。
 */
public abstract class Company {
	
	private String name;
	
	
	public Company() {
		
	}

	public Company(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

	//增加公司
	protected abstract void add(Company company);
	//移除公司
	protected abstract void remove(Company company);
	//显示公司
	protected abstract void display(int depth);
	//履行职责方法  (不同公司需要履行不同的职责)
	protected abstract void LineOfDuty();
}
