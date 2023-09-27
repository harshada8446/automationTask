package testNG_Annotations_Flags;

import org.testng.annotations.Test;

public class Flag5 
{
	@Test(description = "Perform Login")
	public void loginMethod()
	{
		System.out.println("It is used to perform login");
	}
	@Test(description = "Perform create user",dependsOnMethods = "loginMethod")
	public void createUserMethod()
	{
		System.out.println("User Created");
	}
	@Test(description = "Perform Logout",dependsOnMethods = "createUserMethod")
	public void logoutMethod()
	{
		System.out.println("It is used to perform logout!!");
	}
}
