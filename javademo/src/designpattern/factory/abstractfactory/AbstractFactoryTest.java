package designpattern.factory.abstractfactory;


/** 
 * @Description 抽象工厂模式
 * 角色：
 * 抽象工厂类（接口）
 * 具体工厂类
 * 抽象产品类（接口）
 * 具体产品类
 * 
 * 优点：
 * 符合开闭原则
 * @date 2018年6月28日 下午2:58:42 
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		CarFactory carfactory = new AudiFactory();
		
		SportsCar sportscar = carfactory.createSportsCar();
		sportscar.run();
		
		SportUtilityCar suv = carfactory.createSUV();
		suv.run();
		
		/*CarFactory benzfactory = new BenzFactory();
		benzfactory.createSportsCar().run();
		benzfactory.createSUV().run();*/
		
	}
}
