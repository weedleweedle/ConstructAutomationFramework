package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.Test;

class ProjectExporter extends ConstructMethodLibrary
{
	@Test
	void exportProject() throws AWTException, InterruptedException
	{
		start(false);
		
		openRecentProject("DaggerQuest");
		
		click(menuButton);
		
		click(MenuDropdown.project);
		
		click(MenuDropdown.ProjectPopout.export);
		
		click(ExportProjectPopup.nwjs);
		
		click(ExportProjectPopup.next);
		
		click(ExportProjectPopup.Page2.deduplicateImages);
		
		click(ExportProjectPopup.Page2.losslessFormat);
		
		click(ExportProjectPopup.Page2.LosslessFormatOptions.webp);
		
		click(ExportProjectPopup.Page2.lossyFormat);
		
		click(ExportProjectPopup.Page2.LossyFormatOptions.webp);
		
		click(ExportProjectPopup.Page2.minifyMode);
		
		click(ExportProjectPopup.Page2.MinifyModes.advanced);
		
		click(ExportProjectPopup.Page2.next);
		
		waitUntilElementIsGone(Misc.progressDialog, 10); // "Loading NW.js versions..."
		
		click(ExportProjectPopup.NwjsOptions.linux32); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.linux64); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.mac64); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.win32); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.windowFrame); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.resizableWindow); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.enableDevTools); // Uncheck
		
		click(ExportProjectPopup.NwjsOptions.exportForSteam); // Check
		
		click(ExportProjectPopup.NwjsOptions.next);
		
		waitUntilElementIsGone(Misc.progressDialog, 6000);
		
		click(ExportProjectPopup.ExportReport.downloadLink);
		
		quit();
	}
}
