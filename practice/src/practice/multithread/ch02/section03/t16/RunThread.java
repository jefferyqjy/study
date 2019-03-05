package practice.multithread.ch02.section03.t16;

public class RunThread extends Thread {
	
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		System.out.println("开始设置isRunning");
		this.isRunning = isRunning;
		System.out.println("结束设置isRunning");
	}

	@Override
	public void run() {
		System.out.println("进入run了");
		while(isRunning == true) {
			System.out.println("isRunning == true");
		}
		System.out.println("线程被停止了！");
	}
	
}
