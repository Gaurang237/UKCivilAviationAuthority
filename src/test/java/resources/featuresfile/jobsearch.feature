Feature: Search jobs

  @test

  Scenario Outline: Verify User should search jobs Successfully using keywords and Location
    Given I am on homepage
    When I enter in Search by Keyword field "<Search by Keyword>"
    And I enter in Search by Location field "<Search by Location>"
    And I Click on Search Button
    Then User should see result successfullly '"Tester AND London".'

    Examples:
      | Search by Keyword | Search by Location |
      | Tester            | London             |