package javademo.classdemo;

public class NULL {
	public void sayHelloWorld() {
		System.out.println("hello world");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		((NULL) null).sayHelloWorld();
	}
}
