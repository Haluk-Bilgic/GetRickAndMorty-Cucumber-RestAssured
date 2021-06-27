Feature:Verify different operations using Rest Assured and Rick And Morty Apis

  Scenario:Verify one character
    Given I perform Get Operations for "/character"
    And I perform Get for the Character number "4"
    Then I should see Character's name as "Beth"

  Scenario: Verify Character Get parameter
    Given I perform Get Operations for "/character"
    Then I should see verify GET parameter

  Scenario: Verify one episode
    Given I perform Get operations for episodes
    Then I should see verify name as "Pilot"

  Scenario: Verify Location episode
    Given I perform Get operations for Location
    Then I should see verify wrong Location