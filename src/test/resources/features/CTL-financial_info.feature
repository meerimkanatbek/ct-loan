Feature: Financail Information-Positive Testing 
@Test2 
Scenario: Fill up the form and submit successfully 
	Given I am on the home page of CT-Loan 
	Then I add first name  "William" 
	And I add middle name "Sam" 
	And I add last name "Jones" 
	And I choose my gender 
	And I add date of birth "10/18/1984" 
	And I  add SSN "234346980" 
	When I click on Next button 
	Then I add Address Line first  "51 Main st" 
	And I add Address Line second  "apt 3" 
	And I add City "New York" 
	And I add State "New York" 
	And I  add Zipcode "11107" 
	And I select country 
	And I  add Personal Phone "4566574637" 
	And I  add Work Phone "5564567898" 
	And I add an Ext. "23312" 
	And I  add Email_Personal "MJones@gmail.com" 
	And I  add Email_Work "MarkJones@cybertek.com" 
	When I click on Next button contact page 
	Then I have to end up in employment information page. 
	Then I select title 
	And I select department 
	And I select Duration of Employment 
	And I select Purpose of Loan 
	And I select Supervisor 
	When I click on Next button employment page 
	Then I have to end up in financial information page. 
	And user checks the button for loan application 	
	And user enter anual income 
	And user selects income type 
	And user checks button about rent/own a house 
	And user enters amount about monthly expanse 
	And user enters a data into dependence field 
	And user enter a data into saving field 
	And user selects desired loan term 
	And user checks the button to confirm about all information above 
	And user enters full name "John Jones" 
	And user enters single line "__________________" 
	And user enters the date in mm/dd/yyyy format 
	Then user clicks on submit button 
	Then you should see succesfull message "Your application was successfully submitted!" 
	
	
	
	
	
	
	
		