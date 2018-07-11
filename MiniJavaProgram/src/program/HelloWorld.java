package program;

/**
 * 
 */

/**
 * @author das70
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java World!");
		HelloWorldWindow helloWorldWindow = new HelloWorldWindow();
		helloWorldWindow.main(null);
		//helloWorldWindow.main();

	}

	public String getVersion() {
		SystemInformation s = new SystemInformation();
		return s.getVersionOfJava();

	}
}
