@login
Feature:  Login into Cathkidston as registered customer
As a registered customer
I want to click on login
so that  I can login with my login details

Scenario:
  Given I am on Homepage
  When I click on "LOGIN/REGISTER"
  Then I should be to able to view the Login/Registration page
  And I should enter EMAIL ADDRESS "papu_23@yahoo.com"
  And I should be able to select the Radio button "YES, I HAVE A PASSWORD"
  And I enter the text in password box"AmeenaPavan"
  And I click on Log in to my account button
  Then I should be able to successfully see "MY ACCOUNT" page

