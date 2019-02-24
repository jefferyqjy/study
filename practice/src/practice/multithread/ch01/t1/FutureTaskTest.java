package practice.multithread.ch01.t1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

@SuppressWarnings("rawtypes")
public class FutureTaskTest extends FutureTask {

	@SuppressWarnings("unchecked")
	public FutureTaskTest(Callable callable) {
		super(callable);
	}

}
