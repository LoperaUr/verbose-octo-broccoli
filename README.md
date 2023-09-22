## HISTORIAS DE USUARIO (HUs)

1. **HU01: REGISTRO DE USUARIOS** ✔✔
    - Como usuario, quiero poder registrarme en la tienda en línea.
    - **Criterios de Aceptación:**
        - Debe existir una API para registrar nuevos usuarios.
        - Se deben proporcionar detalles como nombre, correo electrónico y contraseña.
        - Los usuarios registrados deben ser almacenados en la base de datos con encriptación de contraseña.

2. **HU02: INICIO DE SESIÓN DE USUARIOS** ✔✔
    - Como usuario registrado, quiero poder iniciar sesión en mi cuenta.
    - **Criterios de Aceptación:**
        - Debe existir una API para iniciar sesión de usuarios.
        - Los usuarios deben poder ingresar su correo electrónico y contraseña.
        - Solo los usuarios registrados pueden iniciar sesión.
        - Una vez iniciada la sesión, el usuario debe recibir un token de autenticación válido.

3. **HU03: CREACIÓN DE CATEGORÍAS**
    - Como administrador de la tienda en línea, quiero poder crear nuevas categorías para organizar los productos.
    - **Criterios de Aceptación:**
        - Debe existir una API para crear nuevas categorías.
        - Se debe proporcionar un nombre y una descripción para la nueva categoría.
        - Las categorías creadas deben almacenarse en la base de datos.

4. **HU04: CREACIÓN DE PRODUCTOS CON CATEGORÍAS**
    - Como administrador de la tienda en línea, quiero poder crear nuevos productos y asignarlos a categorías
      existentes.
    - **Criterios de Aceptación:**
        - Debe existir una API para crear nuevos productos.
        - Se debe proporcionar un nombre, descripción, precio y cantidad en stock para el nuevo producto.
        - Debe existir una opción para seleccionar una categoría existente a la que se asignará el producto.
        - Los productos creados deben almacenarse en la base de datos y estar asociados a la categoría seleccionada.
