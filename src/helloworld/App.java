package helloworld;

import java.util.HashMap;
import java.util.Map;

public class App {
	
	private Map<String,String> appMap = new HashMap<String,String>();
	
	public String hello() {
		return "Hello world to the standard out.";
	}
	
	
	public void newEntry(String name, String job) {
		this.appMap.put(name, job);
	}
	
	public String getEntry(String name) {
		return this.appMap.get(name);
	}
	

}
