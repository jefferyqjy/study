package practice.designpattern.proxy.staticproxy;


/** 
 * @Description 静态代理模式
 * 角色：
 * 目标对象实现的接口
 * @date 2018年6月29日 上午11:25:07 
 */
public class StaticProxyTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		UserDAOProxy proxy = new UserDAOProxy(userDAO);
		
		proxy.select();
	}
}
