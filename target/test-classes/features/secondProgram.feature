

Feature: Application Login

Background:
When launch the browser from config variables
And hit the home page url of banking site
#// Before->Background->Scenario->After

#Reusable
@SmokeTest @RegressionTest @NetBanking
Scenario: User Page Default Login

Given User is on NetBanking landing page
When User login into application with "user" and "0953"
Then Home Page is displayed
And Cards are displayed

@SmokeTest @Mortage
Scenario Outline: User Page Default Login

Given User is on NetBanking landing page
When User login into application with <username> and <password>
Then Home Page is displayed
And Cards are displayed

Examples:

 | username   | password |
 | 76789456   | hello32  |
 | 56899346   | mac1234  |