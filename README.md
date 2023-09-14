<!-- HISTORIAS DE USUARIO (HUs) -->
## HISTORIAS DE USUARIO (HUs)

1. **HU01: REGISTRO DE USUARIOS**
    - Como usuario, quiero poder registrarme en la tienda en línea.
    - **Criterios de Aceptación:**
        - Debe existir una API para registrar nuevos usuarios.
        - Se deben proporcionar detalles como nombre, correo electrónico y contraseña.
        - Los usuarios registrados deben ser almacenados en la base de datos con encriptación de contraseña.


2. **HU02: AGREGAR PRODUCTOS AL CATÁLOGO**
    - Como administrador, quiero poder agregar nuevos productos al catálogo de la tienda.
    - **Criterios de Aceptación:**
        - Debe existir una API para agregar nuevos productos.
        - Se deben proporcionar detalles como nombre del producto, descripción y precio.
        - Los productos deben ser almacenados en la base de datos.


3. **HU03: AGREGAR PRODUCTOS AL CARRITO**
    - Como usuario, quiero poder agregar productos al carrito de compras.
    - **Criterios de Aceptación:**
        - Debe existir una API para agregar productos al carrito de un usuario.
        - Se debe proporcionar el ID del producto y la cantidad.
        - Los detalles del carrito deben ser almacenados en la base de datos.


4. **HU04: REALIZAR UNA ORDEN DE COMPRA**
    - Como usuario, quiero poder realizar una orden de compra con los productos en mi carrito.
    - **Criterios de Aceptación:**
        - Debe existir una API para crear una nueva orden de compra.
        - Se debe proporcionar el ID del usuario.
        - Los productos del carrito deben ser asociados a la orden y retirados del inventario.


5. **HU05: VER HISTORIAL DE ÓRDENES**
    - Como usuario, quiero ver el historial de mis órdenes anteriores.
    - **Criterios de Aceptación:**
        - Debe existir una API para obtener el historial de órdenes de un usuario.
        - Las órdenes deben ser recuperadas desde la base de datos y devueltas como respuesta.


6. **HU06: ADMINISTRAR INVENTARIO**
    - Como administrador, quiero poder gestionar el inventario de productos.
    - **Criterios de Aceptación:**
        - Debe existir una API para actualizar la información de los productos en el catálogo.
        - Se debe proporcionar el ID del producto y los nuevos detalles.
        - Los cambios deben ser almacenados en la base de datos.