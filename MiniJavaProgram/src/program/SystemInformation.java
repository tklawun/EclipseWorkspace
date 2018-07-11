package program;
/**
 * 
 * @author das70
 *
 */
public class SystemInformation {
	
	/**
	 * 
	 * @return String Java Runtime Version
	 */
	
	public String getVersionOfJava() {
		String version = "Check";
		//System.out.println(version.getClass().getPackage().getSpecificationVersion());
		version = version.getClass().getPackage().getImplementationVersion();
		System.out.println(version);
		return version;
	}
	
	public String getJavaRuntimeDir() {
		String javaRuntimeDir = "check";
		return javaRuntimeDir;
	}
}
