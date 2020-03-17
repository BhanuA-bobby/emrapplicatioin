Feature: Scenarios
In order to check if the application is working as required
Background: Below are common for this scenario
Given : I have browse with openemrpage


Scenario: clickonadministration
When I will click on administration
Then I should access to add new address
Scenario: clickonprocedure
When I will click on configuration
Then I should configure the orders

Scenario: clickonadministrationbutton
When I will click on administartion button
Then I should be able to search the details of patient


Scenario: click on reports
When I will give patient name
Then i will get no of patient


Scenario: click on reports icon
When I will click on sales and send 'name' and 'from' and 'to' 
Then I will submit the sales dates



Scenario: click on providers icon
When I will click on providers send 'npi' and 'protocol'
Then I will submit the providers dates


Scenario: click on Administration icon
When I will click on userpage send 'username' and 'pass' and 'password' and 'firstname' and 'lastname'
Then I will submit the userpage dates

Scenario: click on administartion
When I will click on addfacility
Then I will be able to add the facility

Scenario: LoginValidCredentials

When I enter username as 'surya' and I enter password as 'pass'
Then I should access to the portal with the title as 'openemr'
