package constructAutomation;

import java.io.File;

/**<h1>Data</h1> 
 * Data to be utilized elsewhere. Personal information should instead go in {@link #SensitiveData}
 * @author laserwolve
 */
public class Data
{
	static String fs = File.separator;
	static String editorURL = "https://editor.construct.net/r339";
	static String userDataArgument = "user-data-dir=" + System.getProperty("user.home") + fs + "AppData" + fs + "Local" + fs + "Microsoft" + fs + "Edge" + fs + "User Data" + fs + "Construct";
}
