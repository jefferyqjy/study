package practice.designpattern.factory.abstractfactory;


/** 
 * @Description 
 * @date 2018年6月28日 下午2:29:14 
 */
public class BenzFactory extends CarFactory{

	
	/**
	 * Description 
	 * @return 
	 * @see designpattern.factory.abstractfactory.CarFactory#createSUV() 
	 */
	SportUtilityCar createSUV() {
		return new BenzGLA();
	}

	
	/**
	 * Description 
	 * @return 
	 * @see designpattern.factory.abstractfactory.CarFactory#createSportsCar() 
	 */
	SportsCar createSportsCar() {
		return new BenzSLK();
	}

}
