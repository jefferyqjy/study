package practice.multithread.ch02.section03.t16;

public class RunThread extends Thread {
	
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		System.out.println("��ʼ����isRunning");
		this.isRunning = isRunning;
		System.out.println("��������isRunning");
	}

	@Override
	public void run() {
		System.out.println("����run��");
		while(isRunning == true) {
			System.out.println("isRunning == true");
		}
		System.out.println("�̱߳�ֹͣ�ˣ�");
	}
	
}
