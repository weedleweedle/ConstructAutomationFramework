package constructAutomation;

import java.awt.AWTException;

public class ImportImages extends ConstructMethodLibrary
{
	static ConstructMethodLibrary cml = new ConstructMethodLibrary();

	public static void main(String[] args) throws InterruptedException, AWTException
	{	
		try
		{
			start();
			
			logIn();
			
			openProject();
			
		} finally
		{
			quit();
		}
	}
}
