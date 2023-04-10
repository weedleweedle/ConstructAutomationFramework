package constructAutomation;

/**<h1>Data</h1> 
 * Data to be utilized elsewhere. Personal information should instead go in {@link #SensitiveData}
 * @author laserwolve
 */
public class Data
{
	public static final class objectTypes
	{
		public static final String sprite = "Sprite";
	}
	public static final String archiveFileExtension = ".zip";
	public static final String editorURL = "https://editor.construct.net/";
	public static final String projectPath = "C:\\DaggerQuest";
	// We have to use escaped backslashes and not forward slashes to work with file explorer 
	public static final String sourcePath = "C:\\assets\\output\\";
}
