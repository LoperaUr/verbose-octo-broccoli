## HISTORIAS DE USUARIO (HUs)

1. **HU01: REGISTRO DE USUARIOS**
    - Como usuario, quiero poder registrarme en la tienda en línea.
    - **Criterios de Aceptación:**
        - Debe existir una API para registrar nuevos usuarios.
        - Se deben proporcionar detalles como nombre, correo electrónico y contraseña.
        - Los usuarios registrados deben ser almacenados en la base de datos con encriptación de contraseña.

2. **HU02: INICIO DE SESIÓN DE USUARIOS**
    - Como usuario registrado, quiero poder iniciar sesión en mi cuenta.
    - **Criterios de Aceptación:**
        - Debe existir una API para iniciar sesión de usuarios.
        - Los usuarios deben poder ingresar su correo electrónico y contraseña.
        - Solo los usuarios registrados pueden iniciar sesión.
        - Una vez iniciada la sesión, el usuario debe recibir un token de autenticación válido.

3. **HU03: RECUPERACIÓN DE CONTRASEÑA**
    - Como usuario, quiero poder recuperar mi contraseña si la olvido.
    - **Criterios de Aceptación:**
        - Debe existir una opción para que los usuarios recuperen su contraseña olvidada.
        - El usuario debe proporcionar su correo electrónico registrado.
        - Se debe enviar un correo electrónico con un enlace de restablecimiento de contraseña al usuario.
        - El enlace debe ser de un solo uso y tener una duración limitada.

4. **HU04: ACTUALIZACIÓN DE DATOS DE USUARIO**
    - Como usuario registrado, quiero poder actualizar mi información de perfil.
    - **Criterios de Aceptación:**
        - Debe existir una API para actualizar los detalles del usuario.
        - Los usuarios deben poder cambiar su nombre, dirección de correo electrónico y contraseña.
        - Se debe verificar la contraseña actual del usuario antes de permitir cambios.

5. **HU05: CIERRE DE SESIÓN**
    - Como usuario, quiero poder cerrar sesión en mi cuenta.
    - **Criterios de Aceptación:**
        - Debe existir una API para cerrar sesión de usuarios.
        - Los usuarios deben poder cerrar sesión de manera segura.
        - Una vez cerrada la sesión, el token de autenticación debe invalidarse.

6. **HU06: ELIMINACIÓN DE CUENTA DE USUARIO**
    - Como usuario registrado, quiero poder eliminar permanentemente mi cuenta de usuario.
    - **Criterios de Aceptación:**
        - Debe existir una opción para que los usuarios eliminen sus cuentas.
        - Se debe solicitar una confirmación antes de eliminar la cuenta.
        - Una vez eliminada la cuenta, todos los datos relacionados con el usuario deben eliminarse de la base de datos.
