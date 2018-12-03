package practice.designpattern.factory.factorymethod;


/** 
 * @Description 
 * @date 2018年6月28日 下午2:05:34 
 */
public class CarFactory extends AbstractFactory {

	/**
	 * Description 
	 * @return 
	 * @see designpattern.factory.factorymethod.AbstractFactory#createVehicle() 
	 */
	Vehicle createVehicle() {
		return new Car();
	}

}
