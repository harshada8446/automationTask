package testNG_Annotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 
{
  @Test(description = "PErform Login")
  public void method1() 
  { 
	  Reporter.log("Method1",true);
  }
  @Test(description = "Perform Create User")
  public void method2()
  {
	  Reporter.log("Method2",true);
  }
  @Test(description = "Perform Logout")
  public void method3()
  {
	  Reporter.log("Method3",true);
  }
}