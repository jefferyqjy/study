package practice.designpattern.factory.factorymethod;


/** 
 * @Description 
 * @date 2018年6月28日 下午2:05:34 
 */
public class TruckFactory extends AbstractFactory {

	/**
	 * Description 
	 * @return 
	 * @see designpattern.factory.factorymethod.AbstractFactory#createVehicle() 
	 */
	Truck createVehicle() {
		return new Truck();
	}

}
