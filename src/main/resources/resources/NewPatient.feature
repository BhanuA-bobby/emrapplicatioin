Feature: Scenarios
In order to check if the application is working as required
Background: Below are common for this scenario
Given : I have browse with openemrpage



Scenario: LoginValidCredentials

When I enter username as 'admin' and I enter password as 'pass'
Then I should access to the portal with the title as 'openemr'



Scenario: LoginValidCredentials

When I enter Text message and send to clients with 'date' and 'duedate' and 'text'  
Then I should access to the portal with the title message

Scenario: Aboutpage Details

When I should click on the about field and navigate to  usermanual 
Then I should go to the about field with the title message in parallel tab page

Scenario: Fees Details

When I should click on the Fees field and choose the 'file' and submit
Then I should go to the Fees field and close the file

Scenario: upload Details

When I should click on the Upload field and show steps to upload
Then I should go to the steps to upload

Scenario: valid login 
When I login with valid credentials
|username|password|
|admin|pass|

Then I should access to the portal with the title as 'openemr'

