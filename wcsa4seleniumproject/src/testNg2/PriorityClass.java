package testNg2;

import org.apache.log4j.Priority;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass {
  @Test(priority = 3)
  public void f() {
	  
	  Reporter.log("f", true);
  }
  
  @Test(priority = 1)
  public void a() {
	  
	  Reporter.log("a", true);
  }
  
  @Test
  public void b() {
	  
	  Reporter.log("b", true);
  }
  
  @Test(priority = 5)
  public void c() {
	  
	  Reporter.log("c", true);
  }
  
  @Test
  public void d() {
	  
	  Reporter.log("d", true);
  }
  
  @Test(priority = 0)
  public void e() {
	  
	  Reporter.log("e", true);
  }
  
  @Test(priority = 4)
  public void g() {
	  
	  Reporter.log("g", true);
  }
  
  @Test(priority = 2)
  public void h() {
	  
	  Reporter.log("h", true);
  }
  
  @Test
  public void i() {
	  
	  Reporter.log("i", true);
  }
}
