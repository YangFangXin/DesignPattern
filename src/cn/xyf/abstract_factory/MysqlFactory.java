package cn.xyf.abstract_factory;

public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		//返回一个MysqlUser实例
		return new MysqlUser();
	}

	@Override
	public IDept createDept() {
		//返回一个MysqlDept实例
		return new MysqlDept();
	}

}
