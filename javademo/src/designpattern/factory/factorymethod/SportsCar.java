package designpattern.factory.factorymethod;


/** 
 * @Description 
 * @date 2018年6月28日 下午3:18:29 
 */
public class SportsCar implements Vehicle{

	
	/**
	 * Description  
	 * @see designpattern.factory.factorymethod.Vehicle#run() 
	 */
	public void run() {
		System.out.println("sports car is running...");
	}
	
	public void turbo() {
		System.out.println("sports car is turboing...");
	}

}
