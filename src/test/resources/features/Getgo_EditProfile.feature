# ========================================================================================================================================
# Author: Gopinath Rajaram
# Functionality : As a tester, I want to be able to change my personal profile so that my details are updated.
# ========================================================================================================================================



@EditProfile @RegressionPack2
Feature: Edit Profile

  Background: Login into account
    Given I'm on Getgo landing page

  @run22
  Scenario: As a tester, I want to be able to change my personal profile so that my details are updated - Edit Mobile number
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Mobile Number" section
    Then  "Update Mobile Number" page should be displayed with a edit mobile textbox, "SAVE" and "NEXT" button
    When  I enter new mobile number
    And   click next button
    And   Enter OTP details
    Then  Mobile number should be updated and verified in "Manage Profile" page

  @run22
  Scenario: As a tester, I want to be able to change my personal profile so that my details are updated - Edit Address
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Address" section
    Then  "Update Address" page should be displayed with Country,State,City Combo Boxes,Edit House/Street textbox and "SAVE" button
    When  I click on SAVE button with updated address details
    Then  Address details should be updated and verified in "Manage Profile" page

  @run22
  Scenario: As a tester, I want to be able to change my personal profile so that my details are updated - Edit Other details
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Other details" section
    Then  "Update Other Details" page should be displayed
    When  I click on SAVE button with updated other details
    Then  Other details should be updated and verified in "Manage Profile" page

  @run2
  Scenario: As a tester, I want to see the Verify Account page on clicking Profile option from Manage My settings
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then I should see "Verify Account" page & prompting to enter password
  @run2
  Scenario: As a tester, I want to see an error message on entering invalid password in the Verify Account page
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then I should see "Verify Account" page & prompting to enter password
    When I enter Invalid password
    Then An error message should be displayed as "Password is incorrect."
  @run2
  Scenario: As a tester, I want to see Profile page on entering valid password in the Verify Account page
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then I should see "Verify Account" page & prompting to enter password
    When I enter valid password
    Then I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" & "OTHER DETAILS" sections

  @run21
  Scenario: As a tester, I want to Edit Mobile number page on clicking edit link in the Mobile section of Profile update page
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" & "OTHER DETAILS" sections
    When  I click on edit link in the "Mobile Number" section
    Then  "Update Mobile Number" page should be displayed with a edit mobile textbox, "SAVE" and "NEXT" button

  @run21
  Scenario: As a tester, I want to see the OTP page when i enter mobile number and click next in Edit Mobile number page
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Mobile Number" section
    Then  "Update Mobile Number" page should be displayed with a edit mobile textbox, "SAVE" and "NEXT" button
    When  I enter new mobile number
    And   click next button
    Then  Enter OTP Page should be displayed

  @run21
  Scenario: As a tester, I want to see an error message on entering invalid OTP in Edit Mobile number page
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Mobile Number" section
    Then  "Update Mobile Number" page should be displayed with a edit mobile textbox, "SAVE" and "NEXT" button
    When  I enter new mobile number
    And   click next button
    Then  Enter OTP Page should be displayed
    When I enter Invalid OTP
    Then An error message should be displayed

  @run21
  Scenario: As a tester, I want to see Edit Address details page when i click on Edit click on the Address section of Update Profile
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Address" section
    Then  "Update Address" page should be displayed with Country,State,City Combo Boxes,Edit House/Street textbox and "SAVE" button

  @run21
  Scenario: As a tester, I want to see Edit Other details page when i click on Edit click on the Other details section of Update Profile
    Given I'm on "Dashboard" page of GetGo pay with valid "edit_username" and "edit_password"
    When  I choose Settings option from the menu
    Then  I should see "Manage My Settings" page
    When  I choose "Profile" option from settings page
    Then  I should see "Manage Profile" page with "PERSONAL DETAILS" , "ADDRESS" and "OTHER DETAILS" sections
    When  I click on edit link in the "Other details" section
    Then  "Update Other Details" page should be displayed
