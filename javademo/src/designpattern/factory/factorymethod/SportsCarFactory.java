package designpattern.factory.factorymethod;


/** 
 * @Description 
 * @date 2018年6月28日 下午2:05:34 
 */
public class SportsCarFactory extends AbstractFactory {

	/**
	 * Description 
	 * @return 
	 * @see designpattern.factory.factorymethod.AbstractFactory#createVehicle() 
	 */
	SportsCar createVehicle() {
		return new SportsCar();
	}

}
