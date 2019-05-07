Feature: To test the add customer funtionality

  Scenario Outline: To verify the customer ID generated
    Given The user is in add customer pages
    When The user gives valid from "<fname>","<lname>',"<email>",<address>",<phone>"
    When The click the submit button
    Then The user should see the customer ID generate

    Examples: 
      | fname   | lname | email             | address  | phone      |
      | sridhar | sivam | sivamni2gmail.com | tirunel  | 9500770944 |
      | sder    | srem  | ssremni2gmail.com | tirsfdel | 9577770944 |
