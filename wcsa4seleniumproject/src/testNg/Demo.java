package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	  Reporter.log("This is method of Demo class !!",true);
  }
  
  @Test
  public void demo1()
  {
	  Reporter.log("This is method of Demo1 class !!",true);
  }
  
  @Test
  public void demo2()
  {
	  int a=10;
	  int b=2;
	  int c=a/b;
	  Reporter.log("This is method of Demo2 class !!",true);
  }
}
