package java8.defaultfunction;

public class DefaultFunctionTest {
	
	class supercar implements vehicle, car {

		// 当类实现了多个具有相同默认方法的接口时，编译器会显式的要求重写这个默认方法；
		@Override
		public void print() {
			car.super.print();
		}
		
	}
	
	interface vehicle {
		// java8新特性之一，可以在接口中添加一个默认方法；
		default void print() {
			System.out.println("vehicle");
		}

		// java8新特性之一，可以在接口中声明静态方法，且可以提供实现；
		static void stop() {
			System.out.println("vehicle stopped...");
		}
	}
	
	interface car {
		default void print() {
			System.out.println("car");
		}
	}
}
