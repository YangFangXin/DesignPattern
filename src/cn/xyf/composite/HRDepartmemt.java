package cn.xyf.composite;

/**
 * @author Dale
 * 人力资源部   叶子节点
 */
public class HRDepartmemt extends Company {
	
	public HRDepartmemt() {
		super();
	}

	public HRDepartmemt(String name) {
		super(name);
	}

	//透明式声明
	@Override
	protected void add(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void remove(Company company) {
		// TODO Auto-generated method stub

	}
	
	//显示
	@Override
	protected void display(int depth) {
		//虽然StringBuilder 不是线程安全的，但对于大多数单线程程序，我们可以采用它，它的速度>StringBuffer>String
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		System.out.println(new String(sb)+this.getName());
		
	}
	
	
	/* 
	 * 部门履行职责
	 */
	@Override
	protected void LineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"   "+"员工招聘培训管理"+" ");
	}

}
