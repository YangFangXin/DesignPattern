package cn.xyf.abstract_factory;

public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		//返回一个Oracle()
		return new OracleUser();
	}

	@Override
	public IDept createDept() {
		return new OracleDept();
	}

}
