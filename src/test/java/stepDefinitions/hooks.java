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
	
	@Before("@NetBanking1")
	public void netBankingSetup()
	{
		System.out.println("----------------------------------------");
		System.out.println("Setup the entries in NetBanking database");
	}
	
	@Before("@NetBanking2")
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
	
	@After
	public void tearDown()
	{
		System.out.println("Clear the database entries1");
	}

	@After
	public void tearDown()
	{
		System.out.println("Clear the database entries2");
	}


}
// Before->Background->Scenario->After
