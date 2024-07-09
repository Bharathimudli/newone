Feature: Login to Magento

  Scenario: user needs to purchase the product
    Given launch the URL and maximize 
    When user needs sign into the Magento
    Then User needs to  select the product 
    Then user needs select the size and color of the product
    And user needs add that prodcut in the cart and click on the checkout
    Then user select the delivery adress
    Then user has successfully purchased the product