package practice.multithread.ch02.section03.t99;

public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("��Ҫֹͣ����stopThread = " + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
