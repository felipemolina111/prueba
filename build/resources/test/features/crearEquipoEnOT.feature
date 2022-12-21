Feature: Crear equipo
  Scenario: crear equipo exitoso
    Given el usuario se encuentra en la pagina de inicio
    When el usuario ingrese el usuario, contraseña y de click en el botón ingresar
    When el usuario ingrese a la pantalla de ordenes de trabajo y seleccione una orden
    And el usuario ingrese a la pestaña de avances y luego a solar winds
    And el usuario de click en crear equipo
    And el usuario llene los campos obligatorios del formulario con autoticket
    And el usuario de click en autoticket y llena los demas campos
    And el usuario de click en crear
    Then el usuario visualizara el mensaje de equipo creado correctamente