package eratait;

public class ThreadExample implements Runnable{

	String name;
	int limit;
	
	public ThreadExample(String name, int limit) {
		this.name = name;
		this.limit = limit;
	}	
	
	@Override
	public void run() {
		for(int i = 0; i < limit; i++) {
			System.out.println(name + ":" + i);
		}		
	}
}
