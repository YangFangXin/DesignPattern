package cn.xyf.abstract_factory2;

import cn.xyf.abstract_factory2.IUser;

public class DataAccess {
	private static String db = "Mysql";
	//private static String db = "Oracle";  通过改变配置字符串来改变创建子类
	
	//静态创建IUser子类方法
	public static IUser createUser(){
		IUser result = null;
		switch(db){
			case "Mysql":
				result =  new MysqlUser();
				break;
			case "Oracle":
				result = new OracleUser();
		}
		return result;
	}
	
	//静态创建IDept子类方法
	public static IDept createDept(){
		IDept result = null;
		switch(db){
			case "Mysql":
				result =  new MysqlDept();
				break;
			case "Oracle":
				result = new OracleDept();
		}
		return result;
	}
}
