package constructAutomation;

import java.awt.AWTException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import com.google.common.io.Files;

@DisplayName("Method Tester")
class MethodTester extends ConstructMethods {

    @BeforeEach
    void setUp() throws AWTException {
	start();
    }

    @AfterEach
    void tearDown() {
	quit();
    }

    @Test
    @DisplayName("Import Sprites")
    void methodTester() {
	String path = "C:" + fs + "assets" + fs + "output" + fs + "man_chestDefault_gear.zip";
	String sprite = Files.getNameWithoutExtension(path);

	openProjectFolder(6000, "C:" + fs + "DaggerQuest");

	sendText(Project.ProjectBar.searchBar, sprite);

	contextClick(Project.ProjectBar.searchResult(sprite));

	click(Project.ProjectBar.ContextMenu.editAnimations);

	// This will deselect the first animation.
	contextClick(Project.AnimationsEditor.AnimationsPane.title);

	// This creates and selects a new animation.
	click(Project.AnimationsEditor.AnimationsPane.PaneContextMenu.addAnimation);
										    
	// Select the first animation.
	// This deselects the animation that was created previously.
	click(Project.AnimationsEditor.AnimationsPane.firstAnimation);

	waitForElementToBeSelected(Project.AnimationsEditor.AnimationsPane.firstAnimation, 5);

	scrollToElement(Project.AnimationsEditor.AnimationsPane.penultimateAnimation);

	actions.keyDown(Keys.SHIFT).perform();

	// Select the second to last animation while holding the shift key down. 
	// This will select all animations between the first and the penultimate animation.
	click(Project.AnimationsEditor.AnimationsPane.penultimateAnimation); 

	actions.keyUp(Keys.SHIFT).perform();

	waitForElementToBeSelected(Project.AnimationsEditor.AnimationsPane.penultimateAnimation, 5);

	contextClick(Project.AnimationsEditor.AnimationsPane.penultimateAnimation);

	click(Project.AnimationsEditor.AnimationsPane.AnimationContextMenu.delete);

	contextClick(Project.AnimationsEditor.AnimationsPane.title);

	click(Project.AnimationsEditor.AnimationsPane.PaneContextMenu.importAnimation);

	click(Project.AnimationsEditor.AnimationsPane.PaneContextMenu.importAnimationPopout.fromFiles);

	typeIntoFileExplorer(path.toString());
    }
}
