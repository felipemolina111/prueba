Feature: Realizar Login
  Scenario: Login exitoso
    Given el usuario se encuentra en la pagina de inicio
    When el usuario ingrese el usuario, contraseña y de click en el botón ingresar
    Then el usuario visualiza la pantalla inicial de cronos connection