#language: es

@test
Característica: Deberia poder ver un mensaje de registro exitoso en la página de Utest.

    Yo, como usuario de la pagina de utest necesito registrarme en este portal para adquirir nuevas habilidades
    y conocimientos en testing.

  Escenario: El usuario despues de diligenciar todo el formulario deberia poder ver un mensaje de registro exitoso.

    Dado  que estoy en la pagina de utest
    Cuando diligencio todo el formulario de registro
    |nombre    |apellido|correo               |ciudad   |codigo postal|contrasena    |
    |Valentina |Mendez  |valentina10@gmail.com |Bogotá   |230001       |*Valen202309. |
    Entonces  deberia poder ver un mensaje indicando un registro exitoso