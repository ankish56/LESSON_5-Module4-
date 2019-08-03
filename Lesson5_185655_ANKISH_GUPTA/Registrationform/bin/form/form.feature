Feature: Email Registration Page


Scenario: User will enter UserName
Given User is on Email Registration Page
When User will forget to enter username
Then Registration Form will not be Accepted.

Scenario: User will enter Password and confirm Password
Given User is on Email Registration Page
When Password and confirm Password are different.
Then Message will display Passwords donot match!

Scenario: User will enter FirstName and LastName
Given User is on Email Registration Page
When User will forget to enter FirstName and LastName
Then Registration Form will not be Accepted.

Scenario: User will select Gender
Given User is on Email Registration Page
When User will forget to select Gender
Then Registration Form will not be Accepted.


Scenario: User will enter BirthDate, Email and Address
Given User is on Email Registration Page
When User will forget to enter BirthDate, Email and Address
Then Registration Form will not be Accepted.

Scenario: User will select city
Given User is on Email Registration Page
When User will forget to select city
Then Registration Form will not be Accepted.


Scenario: User will enter PhoneNumber
Given User is on Email Registration Page
When User will forget to enter PhoneNumber
Then Registration Form will not be Accepted.

Scenario: User will select Hobbies
Given User is on Email Registration Page
When User will forget to select Hobbies
Then Registration Form will not be Accepted.