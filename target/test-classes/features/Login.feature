@unacademy

Feature: Unacademy Application

@Start_learning
 Scenario Outline: Start the learning in unacademy application
    Given Open url of unacademy application
    When I Click on the "startlearning" button on home page of unacademy application
    Then User should navigate to login page of unacademy application
    And Message will be displayed as we are in login page
    And click on search
    #Scenario Outline: Login with valid phone number
    When Click on login option on homepage
    And Enter registered valid "<mobilenumber>" into the Text field
    Then click on login button
    And Enter otp from your logned number
    And click on verifyotp button option
    Then Verify user able to login successfully
     # Scenario Outline: verify the recaplink  
     
     #Then click on recaplink
     #And click on search1
     #Scenario Outline: Add the courses to the cart 
     Then click on okgotit
     And click on my goals
     Then click on add to goal section
     And Message will displayed as we are in search for goal page 
     #Scenario Outline: Searching for courses with validData
     Given Click on Search button before enter courses name
     Then Enter the "<coursename>" into the search text field
     And Click on Search button1
     Then Verify the Course is added to goal section 
       
     #And Message will displayed as we are in recaplink page
    
    Examples: 
      |mobilenumber|
      |9492771838|
  
      
      
 
 #@search
  #Scenario Outline: Searching for courses with validData
   # Given Click on Search button before enter courses name
    #Then Enter the "<coursename>" into the search text field
    #And Click on Search button
    #Then Verify the Course is added to goal section
    
   # Examples:
    #|Course name|
    #|UPSC CSE - Optional |
    
    
    
    