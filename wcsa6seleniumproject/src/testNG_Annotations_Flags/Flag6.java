package testNG_Annotations_Flags;

import org.testng.annotations.Test;

public class Flag6 
{
  @Test(groups = "Functional Test Case")
  public void ft1() 
  {
	  System.out.println("Functional Test Case1");
  }
  @Test(groups = "Integration Test Case")
  public void it1() 
  {
	  System.out.println("Integration Test Case1");
  }
  @Test(groups = "Smoke Test Case")
  public void st1() 
  {
	  System.out.println("Smoke Test Case1");
  }
  
//-----------------------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void ft2() 
  {
	  System.out.println("Functional Test Case2");
  }
  @Test(groups = "Integration Test Case")
  public void it2() 
  {
	  System.out.println("Integration Test Case2");
  }
  @Test(groups = "Smoke Test Case")
  public void st2() 
  {
	  System.out.println("Smoke Test Case2");
  }
  
//------------------------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void ft3() 
  {
	  System.out.println("Functional Test Case3");
  }
  @Test(groups = "Integration Test Case")
  public void it3() 
  {
	  System.out.println("Integration Test Case3");
  }
  @Test(groups = "Smoke Test Case")
  public void st3() 
  {
	  System.out.println("Smoke Test Case3");
  }
  
//------------------------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void ft4() 
  {
	  System.out.println("Functional Test Case4");
  }
  @Test(groups = "Integration Test Case")
  public void it4() 
  {
	  System.out.println("Integration Test Case4");
  }
  @Test(groups = "Smoke Test Case")
  public void st4() 
  {
	  System.out.println("Smoke Test Case4");
  }
  
//-----------------------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void ft5() 
  {
	  System.out.println("Functional Test Case5");
  }
  @Test(groups = "Integration Test Case")
  public void it5() 
  {
	  System.out.println("Integration Test Case5");
  }
  @Test(groups = "Smoke Test Case")
  public void st5() 
  {
	  System.out.println("Smoke Test Case5");
  }
  
//----------------------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void ft6() 
  {
	  System.out.println("Functional Test Case6");
  }
  @Test(groups = "Integration Test Case")
  public void it6() 
  {
	  System.out.println("Integration Test Case6");
  }
  @Test(groups = "Smoke Test Case")
  public void st6() 
  {
	  System.out.println("Smoke Test Case6");
  }
}
