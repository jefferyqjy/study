package practice.multithread.t1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskTest extends FutureTask {

	public FutureTaskTest(Callable callable) {
		super(callable);
	}

}
