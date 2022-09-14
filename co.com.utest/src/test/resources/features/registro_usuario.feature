#Autor: Santiago Cardenas
  @stories
  Feature: Registro de usuario en Utest
    @Scenario1
    Scenario: Registro de Santiago en la pagina de Utest
      Given Santiago desea registrarse en Utest
      When El usuario ingresa los datos requeridos por el sistema
        | strNombre | strApellido | strEmail       | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strZip | strPais  | strDispositivoMovil | strModeloMovil | strSistemaOperativoMovil | strClave |
        | Santiago  | Cardenas    | asdf@gmail.com | June             | 15               | 1999             | Bogota    | 110111 | Colombia | Apple               | iPhone 4       | iOS 11.0                 | fox3232# |
      Then El registro se completa al ver el boton de Complete Setup
        | strTextoFinal  |
        | Complete SetUp |
