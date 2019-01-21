package designpattern.factory.factorymethod;


/** 
 * @Description 简单工厂模式
 * 对象：
 * 	抽象工厂类
 * 	工厂实现类
 * 	抽象产品接口
 * 	产品实现类
 * 优点：
 * 	符合开闭原则，有新产品加入时，创建新的工厂及其子类即可；
 * 	符合单一职责原则，每个工厂只负责自己产品的创建；
 * 
 * 缺点：
 * 	开闭对于新增产品类型来说是符合的，但是对于产品内部，如果产品有改动，抽象工厂也要跟着改动；
 * 	一个工厂只能创建一个类型的产品，扩展性来讲，将来越来越多的产品会导致系统越来越庞大；
 * @date 2018年6月28日 下午1:16:15 
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		CarFactory carfactory = new CarFactory();
		carfactory.createVehicle().run();
		
		TruckFactory truckfactory = new TruckFactory();
		truckfactory.createVehicle().run();
		
		SportsCarFactory sportscarfactory = new SportsCarFactory();
		sportscarfactory.createVehicle().run();
		sportscarfactory.createVehicle().turbo();
	}
}
