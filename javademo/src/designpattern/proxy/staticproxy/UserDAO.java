package designpattern.proxy.staticproxy;


/** 
 * @Description 
 * @date 2018年6月29日 上午11:14:03 
 */
public class UserDAO extends BaseUserDAO implements IUserDAO{

	/**
	 * Description  
	 * @see designpattern.proxy.staticproxy.IUserDAO#select() 
	 */
	public void select() {
		System.out.println("select from user...");
	}

}
