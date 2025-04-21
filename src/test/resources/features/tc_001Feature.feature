Feature: Verificar la navegación inicial

  Scenario: La página de inicio se carga correctamente y muestra la barra de navegación principal
    Given que el usuario abre el navegador y accede a la URL de la aplicación
    Then la página de inicio se carga correctamente
    And la barra de navegación principal es visible y funcional