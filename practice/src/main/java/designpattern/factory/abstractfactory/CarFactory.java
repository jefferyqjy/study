package designpattern.factory.abstractfactory;


/** 
 * @Description 
 * @date 2018年6月28日 下午2:28:49 
 */
public abstract class CarFactory {

	abstract SportUtilityCar createSUV();
	abstract SportsCar createSportsCar();
	
}
