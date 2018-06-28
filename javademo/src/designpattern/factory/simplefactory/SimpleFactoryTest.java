package designpattern.factory.simplefactory;


/** 
 * @Description 简单工厂模式
 * 对象：
 * 	工厂
 * 	抽象产品接口
 * 	产品实现类
 * 缺点：
 * 	不是很好的符合开闭原则，高耦合
 * @date 2018年6月28日 下午1:16:15 
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		Vehicle car = factory.createCar("car");
		Vehicle truck = factory.createCar("truck");
		car.run();
		truck.run();
	}
}
