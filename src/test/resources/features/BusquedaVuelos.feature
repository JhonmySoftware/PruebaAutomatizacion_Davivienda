#Autor: Jhon Quiñones Arboleda
#language: es

@BuscarVuelos
Característica: Diligenciar el formulario de vuelos y verificar los resultados


  Esquema del escenario: Diligenciar el formulario de vuelos con datos necesarios y buscar vuelo
    Dado que el usuario esta en la pagina de busqueda de vuelos
    Cuando Diligencia el formulario de vuelos con los siguientes datos
      | Origen   | Destino   |
      | <Origen> | <Destino> |
    Y hace clic en el boton buscar vuelos
    Entonces espera y  muestra de resultados seleccionando el segundo vuelo disponible indicando que la prueba es exitosa

    Ejemplos:
      | Origen | Destino |
      | Bogota | Cali    |

  Escenario: Diligenciar el formulario de vuelos sin datos y buscar vuelo
    Dado que el usuario esta en la pagina de busqueda de vuelos
    Cuando hace clic en el boton buscar vuelo sin ingresar datos
    Entonces se espera un mensaje de error indicando que faltan datos


  Escenario: Seleccionar el único vuelo presentado
    Dado que hay un unico resultado de busqueda de vuelos
    Cuando el usuario selecciona el unico vuelo presentado
    Entonces se reporta la prueba con advertencia indicando que solo habia un vuelo