package testNg2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Funtional")
  public void ft1() {
	  
	 Reporter.log("Funtional Testing", true);
  }
  
  @Test(groups = "Integration")
  public void it1() {
	  
	 Reporter.log("Integration Testing", true);
  }
  
  @Test(groups = "System")
  public void st1() {
	 Reporter.log("System Testing", true);
  }
  
  @Test(groups = "Funtional")
  public void ft2() {
	  
	 Reporter.log("Funtional2 Testing", true);
  }
  
  @Test(groups = "Integration")
  public void it2() {
	  
	 Reporter.log("Integration2 Testing", true);
  }
  
  @Test(groups = "System")
  public void st2() {
	  
	 Reporter.log("System2 Testing", true);
  }
  
  @Test(groups = "Funtional")
  public void ft3() {
	  
	 Reporter.log("Funtional3 Testing", true);
  }
  
  @Test(groups = "Integration")
  public void it3() {
	  
	 Reporter.log("Integration3 Testing", true);
  }
  
  @Test(groups = "System")
  public void st3() {
	  
	 Reporter.log("System3 Testing", true);
  }
  
  @Test(groups = "Funtional")
  public void ft4() {
	  
	 Reporter.log("Funtional4 Testing", true);
  }
  
  @Test(groups = "Integration")
  public void it4() {
	  
	 Reporter.log("Integration4 Testing", true);
  }
  
  @Test(groups = "System")
  public void st4() {
	  
	 Reporter.log("System4 Testing", true);
  }
  
  @Test(groups = "Funtional")
  public void ft5() {
	  
	 Reporter.log("Funtional5 Testing", true);
  }
  
  @Test(groups = "Integration")
  public void it5() {
	  
	 Reporter.log("Integration5 Testing", true);
  }
  
  @Test(groups = "System")
  public void st5() {
	  
	 Reporter.log("System5 Testing", true);
  }
}
