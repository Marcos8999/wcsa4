package testNg2;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.AssertionFailedError;

public class AlwaysRun {
  @Test
  public void m1() {
	  
	  Assert.fail();
	  Reporter.log("m1 method is run");
  }
  
  @Test(dependsOnMethods = "m1", alwaysRun = true)
  public void m2() {
	  
	  Reporter.log("m2 method is run");
  }
 
}
