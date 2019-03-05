package practice.multithread.ch02.section03.synchronizedUpdateNewValue;

public class Service {

	private boolean isContinueRun = true;
	
	public void runMethod() {
		System.out.println("run method isContinueRun:" + isContinueRun);
		String str = new String();
		while(isContinueRun == true) {
			synchronized(str) {
				
			}
		}
		System.out.println("停下来了！");
	}
	
	public void stopMethod() {
		isContinueRun = false;
		System.out.println("stop method isContinueRun:" + isContinueRun);
	}
}
