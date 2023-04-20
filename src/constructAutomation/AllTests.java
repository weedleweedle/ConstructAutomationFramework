package constructAutomation;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses
({ 
	LocatorValidation.class,
})
public class AllTests {

}
