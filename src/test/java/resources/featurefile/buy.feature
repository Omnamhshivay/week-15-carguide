Feature: Search functionality
  As User I want to buy car on carguide website

  @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:

      | make       | model           | location           | price    |
      | Audi       | Q7              | NSW - Central West | $50,000  |
      | BMW        | 7 Series        | WA - Perth         | $60,000  |
      | Ford       | Mustang         | WA - Country East  | $70,000  |
      | Honda      | Accord          | SA - Murray        | $80,000  |
      | Kia        | Grand Carnival  | NT - North         | $90,000  |
      | Land Rover | Discovery Sport | NT - North         | $100,000 |





