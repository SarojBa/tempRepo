package jenkinsTestParams;

import org.testng.annotations.Test;

public class jenkinsTest {
	
	@Test
	public void loginTest(){
		System.out.println("reading username from Jenkins: ");
		System.out.println(System.getProperty("userName"));
		System.out.println("reading password from Jenkins: ");
		System.out.println(System.getProperty("password"));
		
	}

}
