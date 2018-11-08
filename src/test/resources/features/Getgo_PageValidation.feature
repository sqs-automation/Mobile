
# ======================================================================================
# Author: Balabharathi Jayaraman
# Functionality : Validate the fields & texts displayed on the Getgo application screens
# ======================================================================================

@PageValidation
Feature: Page Validation

  Background: Open Getgo mobile application
    Given I'm on Getgo landing page

    # ~ W E L C O M E   &   S I G N - U P
    # ------------------------------------------------------------------------------------------------------------------
 @AndroidOnly1
  Scenario: Validate the fields & texts displayed on the Getgo Welcome & SignUp page
    Then  I should see two buttons "LOG IN" "SIGN UP", Getgo logo, a caption "Flying for free now made fast and easy."
    When  I'm on Getgo SignUp page
    Then  I should see two button "Yes, I want to register my card." "No, sign me up for virtual.", Getgo card image, two messages "Do You have a CEB GetGo Prepaid card?" & "You can enjoy more perks by having one! Otherwise, you can still GetGoing with a free CEB GetGo Prepaid Virtual."

@IOSOnly
  Scenario: Validate the fields & texts displayed on the Getgo Welcome & SignUp page
    Then  I should see two buttons "LOG IN" "SIGN UP", Getgo logo, a caption "Now made easier. As simple as Ready, GetGo."
    When  I'm on Getgo SignUp page
    Then  I should see two button "Yes" "No", Getgo card image, two messages "Do you have a GetGo Peso Plus Card?" & "Start shopping online by creating your GetGo Virtual Prepaid Card. Or register your Peso + Prepaid Card now."

    # ~ L O G I N
    # ------------------------------------------------------------------------------------------------------------------

  @AndroidOnly2
  Scenario: Validate the fields & texts displayed on the Getgo Login page
    Given I'm on Getgo login page
    Then  I should see back arrow, page title as "Login", a caption "Enter your registered email address", a text box with inner text "Email address", a "NEXT" button & a sign up link "Don’t have an account? SIGN UP NOW!"
    When  I enter a "Peso_Username" & click next
    Then  I should see back arrow, page title as "Login", a caption "Enter your password", a text box with inner text "Password", a link "Forgot Password?", a "LOGIN" button & a password visibility toggle button

  @IOSOnly
  Scenario: Validate the fields & texts displayed on the Getgo Login page
    Given I'm on Getgo login page
    Then  I should see back arrow, page title as "Login", a caption "Now made easier. As simple as Ready, GetGo.", a text box with inner text "Email", a "NEXT" button & a sign up link "Don’t have an account? SIGN UP NOW!"
    When  I enter a "Peso_Username" & click next
    Then  I should see back arrow, page title as "Login", a caption "Enter your password", a text box with inner text "Password", a link "Having problems with your account?", a "LOGIN" button & a password visibility toggle button