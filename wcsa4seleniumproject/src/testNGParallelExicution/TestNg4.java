package testNGParallelExicution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg4 {
  @Test
  public void today() {
	  
	  long tid = Thread.currentThread().getId();
	  Reporter.log("today"+tid+"is the thread", true);
  }
  
  @Test
  public void tommorow(){
	  
	  long tid = Thread.currentThread().getId();
	  Reporter.log("tommorow"+tid+"is the thread", true);
  }
}
