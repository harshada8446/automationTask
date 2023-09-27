package testNG_Annotations_Flags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 
{
	@Test(description = "Perform Login")
	public void loginMethod()
	{
		System.out.println("It is used to perform login");
	}
	@Test(description = "Perform create user",dependsOnMethods = "loginMethod")
	public void createUserMethod()
	{
		Assert.fail();
		System.out.println("User Created");
	}
	@Test(description = "Perform Logout",dependsOnMethods = "createUserMethod",alwaysRun = true)
	public void logoutMethod()
	{
		System.out.println("It is used to perform logout!!");
	}
}
