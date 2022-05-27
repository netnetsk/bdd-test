Feature: test for bdd err

  @testFail
  Scenario:aaaaaaaaaaaa
    Given select title
    When select body
    Then select fail res

