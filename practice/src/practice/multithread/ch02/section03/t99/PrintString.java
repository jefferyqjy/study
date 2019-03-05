package practice.multithread.ch02.section03.t99;

/**
 * @Description
 * @Author qjy13114
 * @Date 2019/3/5 16:08
 */
public class PrintString {

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() {
        try {
			while (isContinuePrint == true) {
			    System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
			    Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
