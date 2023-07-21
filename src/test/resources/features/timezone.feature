Feature: Timezone

  As a user
  I want to be able to change time zone
  So that i can easily proceed with timezone settings

  Scenario: Verify that changes of timezone effects match data
    Given User opens home page
    When User clicks on first not started event
    Then User sees start time and date of opened event
    When User opens sidebar menu
    And User clicks on 'Settings' button on Sidebar menu
    And User opens timezone dropdown menu
    And User selects timezone from dropdown
    And User clicks 'Apply' timezone preference
    Then User sees start time and date have been changed