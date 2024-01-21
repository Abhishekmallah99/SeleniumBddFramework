Feature: Search and place order

  Scenario: Search for product on home and offers page
    Given Users is on greencart landing page
    When User searched with short name "tom" and extracted actual name of product
    Then User searched for same short name in offers page to check if product exist
