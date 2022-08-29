package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import POM_Classes.Pom1;
import POM_Classes.Pom2;
import POM_Classes.Pom3;
import Utility.UtilityClass;

public class TestClass extends BaseClass {

	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	@BeforeClass
	public void openBrowser() {
		initializeBrowser();
		//all objects in POM Class
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable {
		login1.enterUN(UtilityClass.getID1(0, 0));
		System.out.println(UtilityClass.getID1(0, 0));
		login1.enterPWD(UtilityClass.getID1(0, 1));
		System.out.println(UtilityClass.getID1(0, 1));
		login1.clickLOGINBTN();
		
		login2.enterPIN(UtilityClass.getID1(0, 2));
		login2.clickCNTBTN();
		
	}
	
	@Test
	public void verifyuserID() throws Throwable {
		Reporter.log("running verify userid",true);
		String actID=home.verifyuserID();
		String expID=UtilityClass.getID1(0, 0);
		
		Assert.assertEquals(actID, expID,"both are diffrent tc is failed");
	}
	
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);
	}
}
