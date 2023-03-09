package constructAutomation;

import java.awt.AWTException;

public class ImportImages extends ConstructMethodLibrary
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{	
		try
		{
			start();
			
			logIn();
			
			openProjectFolder();
			
			importImages("frameworkTesting");
			
		} finally
		{
			quit();
		}
	}
}
