## HISTORIAS DE USUARIO (HUs)

### HU01: REGISTRO DE USUARIOS - OK

* **Número:** 1
* **Título:** Registrarse en la tienda en línea
* **Descripción:** Como usuario, quiero poder registrarme en la tienda en línea para poder comprar productos.
* **Criterios de aceptación:**
    * **Debe existir una API para registrar nuevos usuarios.**
    * **Los usuarios deben poder proporcionar detalles como nombre, correo electrónico y contraseña.**
    * **Los usuarios registrados deben ser almacenados en la base de datos con encriptación de contraseña.**

### HU02: INICIO DE SESIÓN DE USUARIOS - OK

* **Número:** 2
* **Título:** Iniciar sesión en la cuenta de usuario
* **Descripción:** Como usuario registrado, quiero poder iniciar sesión en mi cuenta para poder realizar compras.
* **Criterios de aceptación:**
    * **Debe existir una API para iniciar sesión de usuarios.**
    * **Los usuarios deben poder ingresar su correo electrónico y contraseña.**
    * **Solo los usuarios registrados pueden iniciar sesión.**
    * **Una vez iniciada la sesión, el usuario debe recibir un token de autenticación válido.**

### HU03: CREACIÓN DE CATEGORÍAS - OK

* **Número:** 3
* **Título:** Crear categorías para organizar productos
* **Descripción:** Como administrador de la tienda en línea, quiero poder crear nuevas categorías para organizar los productos.
* **Criterios de aceptación:**
    * **Debe existir una API para crear nuevas categorías.**
    * **Se debe proporcionar un nombre y una descripción para la nueva categoría.**
    * **Las categorías creadas deben almacenarse en la base de datos.**

### HU04: CREACIÓN DE PRODUCTOS CON CATEGORÍAS - OK

* **Número:** 4
* **Título:** Crear productos y asignarlos a categorías
* **Descripción:** Como administrador de la tienda en línea, quiero poder crear nuevos productos y asignarlos a categorías existentes.
* **Criterios de aceptación:**
    * **Debe existir una API para crear nuevos productos.**
    * **Se debe proporcionar un nombre, descripción, precio y cantidad en stock para el nuevo producto.**
    * **Los productos creados deben almacenarse en la base de datos y estar asociados a la categoría seleccionada.**

### HU05: IMPLEMENTAR MICRO DE TRAZABILIDAD - PENDING

* **Número:** 5
* **Título:** Implementar microservice de traceability
* **Descripción:** Como administrador de la tienda en línea, quiero poder implementar un microservice de traceability
* **Criterios de aceptación:**
    * **Debe existir una API que guarde los logs de:**
    * **Creación de usuarios**
    * **Creación de categorías**
    * **Creación de productos**
    * **El micro de traceability debe usar una mongodb y estar en un contenedor de docker**

