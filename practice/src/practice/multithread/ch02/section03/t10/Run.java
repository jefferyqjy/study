package practice.multithread.ch02.section03.t10;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		new Thread(printStringService).start();
		System.out.println("ÎÒÒªÍ£Ö¹Ëü£¡ stopThreadName = " + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
