package testNg2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotations {
  @Test
  public void test() {
	  
	  Reporter.log("@Test Annotation", true);
  }
  
  @Test
  public void test2() {
	  
	  Reporter.log("@Test Annotation", true);
  }
  
  @BeforeSuite
  public void beforeSuit() {
	  
	  Reporter.log("@beforsuit Annotation", true);
  }
  
  @AfterSuite
  public void aftersuit() {
	  
	  Reporter.log("@aftersuit Annotation", true);
  }
  
  @BeforeClass
  public void beforClass() {
	  
	  Reporter.log("@beforeclass Annotation", true);
  }
  
  @BeforeMethod
  public void beforMethod() {
	  
	  Reporter.log("@beformethod Annotation", true);
  }
  
  @AfterTest
  public void afterTest() {
	  
	  Reporter.log("@afterTest Annotation", true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  Reporter.log("@afterTest Annotation", true);
  }
  
  @BeforeTest
  public void beforTest() {
	  
	  Reporter.log("@beforTest Annotation", true);
  }
  
  @AfterClass
  public void afterClass() {
	  
	  Reporter.log("@afterClass", true);
  }
}

