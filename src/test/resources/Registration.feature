@register
Feature: New Customer Registration
 As a New customer
I want to register for Cath Kidson
So that I can Login Successfully

Scenario: Registering for Login
Given  I am on Homepage
When I click on "LOGIN/REGISTER"
Then I should be to able to view the Login/Registration page
And I should enter EMAIL ADDRESS "papu_23@yahoo.com"
And I should be able to select the radio button "NO, I'M A NEW CUSTOMER"
And I select TITLE "Mrs"
And I enter the text in FIRST NAME box as "PAVAN"
And I enter the text in LAST NAME box as "CHODAGAM"
And I enter the text in TELEPHONE NUMNER as "02085517545"
And I enter the text in ENTER PASSWORD field "AmeenaPavan"
And I enter the text in CONFIRM PASSWORD field "AmeenaPavan"
And I click on "JOIN OUR EMAIL CLUB AND BE THE FIRST TO KNOW ABOUT EVENTS, COMPETITIONS AND SPECIAL OFFERS" tick box
Then I click on the "Create my account" button


