package practice.multithread.ch02.section01.syncLockIn_2;

public class MyThread extends Thread {

	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
