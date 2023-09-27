package testNG_Annotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{
  @Test
  public void method_test_Annotation1() 
  {
	  Reporter.log("TestAnnotation1",true);
  }
  @Test
  public void method_test_Annotation2() 
  {
	  Reporter.log("TestAnnotation2",true);
  }
  
  @BeforeMethod
  public void method_beforeMethodAnnotation()
  {
	  Reporter.log("BeforeMethodAnnotation",true);
  }
  
  @AfterMethod
  public void method_afterMethodAnnotation()
  {
	  Reporter.log("AfterMethodAnnotation",true);
  }
  
  @BeforeClass
  public void method_beforeClassAnnotation()
  {
	  Reporter.log("BeforeClassAnnotation",true);
  }
  
  @AfterClass
  public void method_afterClassAnnotation()
  {
	  Reporter.log("AfterClassAnnotation",true);
  }
  
  @BeforeTest
  public void method_beforeTestAnnotation()
  {
	  Reporter.log("BeforeTestAnnotation",true);
  }
  
  @AfterTest
  public void method_afterTestAnnotation()
  {
	  Reporter.log("After Test Annotation",true);
  }
  
  @BeforeSuite
  public void method_beforesuiteAnnotation()
  {
	  Reporter.log("BeforeSuiteAnnotation",true);
  }
  
  @AfterSuite
  public void method_afterSuiteAnnotation()
  {
	  Reporter.log("AfterSuiteAnnotation",true);
  }
}
