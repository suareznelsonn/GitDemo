

Feature: Application Login

Background:
Given Setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page Default Login

Given User is on NetBanking landing page
When User login into application with "admin" and "1234"
Then Home Page is displayed
And Cards are displayed

#Reusable
@SmokeTest @RegressionTest
Scenario: User Page Default Login

Given User is on NetBanking landing page
When User login into application with "user" and "0953"
Then Home Page is displayed
And Cards are displayed

@SmokeTest
Scenario Outline: User Page Default Login

Given User is on NetBanking landing page
When User login into application with <username> and <password>
Then Home Page is displayed
And Cards are displayed

Examples:

 | username   | password |
 | 76789456   | hello32  |
 | 56899346   | mac1234  |

@MobileTest
Scenario: User Page Default Sign Up

Given User is on Practice landing page
When User Signup into application
|rahul|
|shetty|
|contact@gmail.com|
|3158833660|
Then Home Page is displayed
And Cards are displayed

@RegressionTest
Scenario Outline: Users Page Default Sign Up
Given User is on Practice landing page
When User Signup into application
|<username>|
|<password>|
|<email>|
|<celular>|
Then Home Page is displayed
And Cards are displayed

Examples:

 | username   | password | email            | celular  |
 | 76789456   | hello32  | email1@gmail.com | 32678888 |
 | 56899346   | mac1234  | email2@gmail.com | 31678999 |