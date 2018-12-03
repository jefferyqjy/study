package practice.designpattern.proxy.staticproxy;


/** 
 * @Description 
 * @date 2018年6月29日 上午11:14:40 
 */
public class UserDAOProxy extends BaseUserDAO implements IUserDAO{
	
	private IUserDAO target;
	
	public UserDAOProxy(IUserDAO target) {
		this.target = target;
	}
	
	/**
	 * Description  
	 * @see designpattern.proxy.staticproxy.IUserDAO#select() 
	 */
	public void select() {
		log();
		target.select();
		log();
	}

}
