package practice.multithread.ch03.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List<String> list = new ArrayList<String>();
	
	public void add() {
		list.add("qjy");
	}
	
	public int size() {
		return list.size();
	}
}
