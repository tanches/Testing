package helper;

import org.junit.After;
import org.junit.Before;

public class TestBase {

	protected AppManager app;
	
	  @Before
	  public void setUp() throws Exception {
		app = AppManager.getInstance();
	  }
	  
/*	  @After
	  public void tearDown() throws Exception {
	    app.stop();
	  }*/
}
