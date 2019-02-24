package practice.multithread.ch02.section01.syncLockIn_2;

public class Sub extends Main {
	
	synchronized public void operateISubMethod() {
		try {
			while(i > 0) {
				i--;
				System.out.println("sub print i = " +i);
				Thread.sleep(100);
				this.operateIMainMethod();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
