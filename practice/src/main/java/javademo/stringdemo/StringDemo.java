package javademo.stringdemo;

public class StringDemo extends Object {
	
	public static void main(String[] args) throws Throwable {
		String s = new String("hello");
		String intern = s.intern();
		System.out.println(intern);
		StringDemo d = new StringDemo();
		d.finalize();
	}
	
	public final void test() {
		System.out.println("test");
	}

}
