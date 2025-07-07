#language: es
@Google
Característica: Realizar una búsqueda en Google


  @BusquedaCiudad @HAPPY1
  Escenario: [HAPPY PATH] Realiza busqueda exitosa de resultado en Google
    Dado que el actor abre la página de Google
    Cuando escribo "Trujillo"
    Y accedo al primer resultado
    Entonces valido que salí de Google

  @BusquedaCiudad @HAPPY2
  Esquema del escenario: [HAPPY PATH] Realiza busqueda exitosa de resultado en Google
    Dado que el actor abre la página de Google
    Cuando escribo "<Ciudad>"
    Y accedo al primer resultado
    Entonces valido que salí de Google
    Ejemplos:
      | Ciudad   |
      | Trujillo |
      | Lima     |