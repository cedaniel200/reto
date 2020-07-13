Feature: Tarifario
  Yo como usuario quiero ver el tarifario para conocer las tarifas

  Scenario: Ver tarifario
    Given Cesar se encuentra en el portal personas
    When Cesar ingresa al tarifario
    Then Cesar deberia ver el tarifario