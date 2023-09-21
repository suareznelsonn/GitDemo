package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("----------------------------------------");
		System.out.println("Setup the entries in NetBanking database");
	}
	
	@Before("@Mortage")
	public void mortageSetup()
	{
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("Setup the entries in Mortage database");
	}

	@After
	public void tearDown()
	{
		System.out.println("Clear the database entries");
	}

}
// Before->Background->Scenario->After
