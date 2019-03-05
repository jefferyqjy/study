package javademo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

public class CollectionDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new LinkedList();
		Map map = new HashMap();
		map = Collections.synchronizedMap(map);
		Map map2 = new ConcurrentHashMap();
		Map map3 = new Hashtable();
		AtomicInteger i = new AtomicInteger(); 
		
		map.notify();
		map.notifyAll();
		
		//ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}
	
}
