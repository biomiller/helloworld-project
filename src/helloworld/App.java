package helloworld;

import java.util.HashMap;
import java.util.Map;

public class App {
	
	Map<String,String> appMap = new HashMap<String,String>();
	
	public void hello() {
		System.out.println("Hello world to the standard out.");
	}
	
	
	public void newEntry(String name, String job) {
		this.appMap.put(name, job);
	}
	
	public String getEntry(String name) {
		return this.appMap.get(name);
	}
	

}
