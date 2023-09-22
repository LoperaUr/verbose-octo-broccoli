## HISTORIAS DE USUARIO (HUs)

### HU01: REGISTRO DE USUARIOS

* **Número:** 1
* **Título:** Registrarse en la tienda en línea
* **Descripción:** Como usuario, quiero poder registrarme en la tienda en línea para poder comprar productos.
* **Criterios de aceptación:**
    * **Debe existir una API para registrar nuevos usuarios.**
    * **Los usuarios deben poder proporcionar detalles como nombre, correo electrónico y contraseña.**
    * **Los usuarios registrados deben ser almacenados en la base de datos con encriptación de contraseña.**

### HU02: INICIO DE SESIÓN DE USUARIOS

* **Número:** 2
* **Título:** Iniciar sesión en la cuenta de usuario
* **Descripción:** Como usuario registrado, quiero poder iniciar sesión en mi cuenta para poder realizar compras.
* **Criterios de aceptación:**
    * **Debe existir una API para iniciar sesión de usuarios.**
    * **Los usuarios deben poder ingresar su correo electrónico y contraseña.**
    * **Solo los usuarios registrados pueden iniciar sesión.**
    * **Una vez iniciada la sesión, el usuario debe recibir un token de autenticación válido.**

### HU03: CREACIÓN DE CATEGORÍAS

* **Número:** 3
* **Título:** Crear categorías para organizar productos
* **Descripción:** Como administrador de la tienda en línea, quiero poder crear nuevas categorías para organizar los productos.
* **Criterios de aceptación:**
    * **Debe existir una API para crear nuevas categorías.**
    * **Se debe proporcionar un nombre y una descripción para la nueva categoría.**
    * **Las categorías creadas deben almacenarse en la base de datos.**

### HU04: CREACIÓN DE PRODUCTOS CON CATEGORÍAS

* **Número:** 4
* **Título:** Crear productos y asignarlos a categorías
* **Descripción:** Como administrador de la tienda en línea, quiero poder crear nuevos productos y asignarlos a categorías existentes.
* **Criterios de aceptación:**
    * **Debe existir una API para crear nuevos productos.**
    * **Se debe proporcionar un nombre, descripción, precio y cantidad en stock para el nuevo producto.**
    * **Debe existir una opción para seleccionar una categoría existente a la que se asignará el producto.**
    * **Los productos creados deben almacenarse en la base de datos y estar asociados a la categoría seleccionada.**

### HU05: GESTIÓN DE PEDIDOS

* **Número:** 5
* **Título:** Realizar un pedido de productos
* **Descripción:** Como usuario, quiero poder realizar un pedido de productos en la tienda en línea.
* **Criterios de aceptación:**
    * **Debe existir una API para realizar pedidos.**
    * **Los usuarios deben poder seleccionar los productos que desean comprar y agregarlos a su carrito de compras.**
    * **Los usuarios deben poder proporcionar información de envío y facturación.**
    * **Los pedidos deben almacenarse en la base de datos.**

### HU06: SEGUIMIENTO DE PEDIDOS

* **Número:** 6
* **Título:** Rastrear el estado de un pedido
* **Descripción:** Como usuario, quiero poder rastrear el estado de mi pedido en la tienda en línea.
* **Criterios de aceptación:**
    * **Debe existir una API para rastrear pedidos.**
    * **Los usuarios deben poder proporcionar el número de seguimiento de su pedido.**
    * **Los usuarios deben poder ver el estado actual de su pedido.**

### HU07: REVISIONES DE PRODUCTOS

* **Número:** 7
* **Título:** Escribir una revisión de un producto
* **Descripción:** Como usuario, quiero poder escribir una revisión de un producto que he comprado en la tienda en línea.
* **Criterios de aceptación:**
    * **Debe existir una API para crear revisiones de productos.**
    * **Los usuarios deben poder proporcionar una calificación y una reseña de un producto.**

### HU08: ADMINISTRACIÓN DE USUARIOS

* **Número:** 8
* **Título:** Administrar usuarios registrados
* **Descripción:** Como administrador de la tienda en línea, quiero poder administrar los usuarios registrados para mantener la seguridad y el orden de la tienda.
* **Criterios de aceptación:**
    * **Debe existir una API para administrar usuarios.**
    * **Los administradores deben poder ver una lista de todos los usuarios registrados.**
    * **Los administradores deben poder editar la información de los usuarios, como el nombre, el correo electrónico y la contraseña.**
    * **Los administradores deben poder eliminar usuarios registrados.**

### HU09: ADMINISTRACIÓN DE PRODUCTOS

* **Número:** 9
* **Título:** Administrar productos en la tienda
* **Descripción:** Como administrador de la tienda en línea, quiero poder administrar los productos en la tienda para mantener la disponibilidad y la calidad de los productos.
* **Criterios de aceptación:**
    * **Debe existir una API para administrar productos.**
    * **Los administradores deben poder ver una lista de todos los productos.**
    * **Los administradores deben poder editar la información de los productos, como el nombre, la descripción, el precio y la cantidad en stock.**
    * **Los administradores deben poder agregar o eliminar productos de la tienda.**

### HU10: ADMINISTRACIÓN DE PEDIDOS

* **Número:** 10
* **Título:** Administrar pedidos realizados en la tienda
* **Descripción:** Como administrador de la tienda en línea, quiero poder administrar los pedidos realizados en la tienda para garantizar que los pedidos se cumplan de manera eficiente y efectiva.
* **Criterios de aceptación:**
    * **Debe existir una API para administrar pedidos.**
    * **Los administradores deben poder ver una lista de todos los pedidos realizados.**
    * **Los administradores deben poder cambiar el estado de los pedidos.**
    * **Los administradores deben poder generar informes sobre los pedidos.**
