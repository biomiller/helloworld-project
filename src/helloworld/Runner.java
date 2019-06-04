package helloworld;

public class Runner {
	
	public static void main(String[] args) {
		
		App app1 = new App();
		
		app1.newEntry("Steve", "Developer");

		System.out.println(app1.getEntry("Steve"));
		
		app1.hello();
	}

}
