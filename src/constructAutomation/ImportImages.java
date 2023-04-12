package constructAutomation;

import java.awt.AWTException;

public class ImportImages extends ConstructMethodLibrary
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{	
		try
		{
			start();
			
			dismissWelcomePopup();
			
			logIn();
			
			openProjectFolder();
			
			importImages("frameworkTesting", "frameworkTesting");
			
		} finally
		{
			quit();
		}
	}
}
