package cn.xyf.composite;

/**
 * @author Dale
 * 财务部
 */
public class FinanceDepartment extends Company {
	
	
	public FinanceDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void add(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void remove(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void display(int depth) {
		//虽然StringBuilder 不是线程安全的，但对于大多数单线程程序，我们可以采用它，它的速度>StringBuffer>String
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(new String(sb)+this.getName());
	}
	
	@Override
	protected void LineOfDuty() {
		System.out.println(this.getName()+"   "+"公司财务收支管理");
	}

}
