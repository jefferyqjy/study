package practice.designpattern.factory.simplefactory;


/** 
 * @Description 
 * @date 2018年6月28日 下午1:50:09 
 */
public class VehicleFactory {

	Vehicle createCar(String type) {
		switch(type) {
			case "car":
				return new Car();
			case "truck":
				return new Truck();
		}
		
		return null;
	}
}
