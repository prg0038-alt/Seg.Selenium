# Tarea de Evaluación Módulo 16.2

Esta trea tenia como objetivo:
- Automatizar un proceso de login
- Automatizar la selección de productos
- Automatizar la acción de añadir productos al carrito
- Comprobar mediante aserciones que la aplicación responde correctamente
- Organizar el código usando Page Object Model

---

## Estructura del proyecto
Teniamos que crear 4 clases 
- `LoginPage`: contiene los métodos relacionados con el login.
- `InventoryPage`: gestiona las acciones sobre los productos del inventario.
- `LoginTest`: pruebas del inicio de sesión.
- `InventoryTest`: pruebas de añadir y eliminar productos del carrito.

---

## `LoginPage`

- Escribir el nombre de usuario
<img width="716" height="114" alt="image" src="https://github.com/user-attachments/assets/14708174-7525-43d1-852b-acb3b108533c" />
- Escribir la contraseña
<img width="595" height="87" alt="image" src="https://github.com/user-attachments/assets/3f5c8478-2471-46a4-8bf7-3dbd0d2a183d" />
- Pulsar el botón de acceso
<img width="412" height="89" alt="image" src="https://github.com/user-attachments/assets/8f7d1934-e4ed-429a-9328-d1dc2883d9f2" />
- Realizar el login completo con un solo método
<img width="607" height="126" alt="image" src="https://github.com/user-attachments/assets/491514cb-b99a-4896-b11f-c48174531dbe" />

El resultado final seria este:
<img width="946" height="925" alt="image" src="https://github.com/user-attachments/assets/a85b6462-edb7-4cbc-bc9e-e4dbc50ae02f" />
<img width="832" height="330" alt="image" src="https://github.com/user-attachments/assets/2b68c84e-f1bf-49a0-9d4a-78de3ff81e04" />

---

## `InventoryPage`

- Añadir un producto al carrito
<img width="597" height="98" alt="image" src="https://github.com/user-attachments/assets/c2cc7995-5f52-4768-ab12-e9ed3ae4fd98" />
- Obtener el número de productos del carrito
<img width="745" height="243" alt="image" src="https://github.com/user-attachments/assets/a038eac6-b54d-42ac-8df2-f84a4ed94e6f" />
- Comprobar si un texto o botón esperado aparece en pantalla
<img width="620" height="71" alt="image" src="https://github.com/user-attachments/assets/f21cec1a-b207-4aa8-9787-99c3a56bb7da" />
- Realizar un boton dinamico
<img width="1020" height="65" alt="image" src="https://github.com/user-attachments/assets/418c1336-9a9f-4294-a57b-11ef9609c64b" />
- Eliminar un producto
<img width="594" height="74" alt="image" src="https://github.com/user-attachments/assets/a153c886-d8f6-4ba4-bb3d-9d51a8162a15" />


El resultado final seria este:
<img width="1122" height="897" alt="image" src="https://github.com/user-attachments/assets/15a8787f-a578-4abb-a2b7-86998d0cfb24" />
<img width="895" height="287" alt="image" src="https://github.com/user-attachments/assets/e2f06dea-e7be-4140-9013-1779a8c41b8b" />

---

## `LoginTest`

- LoginCorrecto
<img width="604" height="185" alt="image" src="https://github.com/user-attachments/assets/a649ede2-cc61-4f4b-8b3b-d8632182cd20" />
- LoginIncorrecto
<img width="695" height="200" alt="image" src="https://github.com/user-attachments/assets/ad87c7ad-02f2-49dc-8818-ae3b0a128a5b" />

El resultado final seria este:
<img width="925" height="927" alt="image" src="https://github.com/user-attachments/assets/8002a9de-87cd-4e19-8c16-1c646f5550b8" />
<img width="779" height="666" alt="image" src="https://github.com/user-attachments/assets/e5237474-e0a8-4560-b537-48a0276c1445" />

---

##`InventoryTest`

- AnadirUnProductoAlCarrito
<img width="725" height="183" alt="image" src="https://github.com/user-attachments/assets/e09b2083-97ea-4514-9e40-1aaba766983d" />
- AnadirDosProductosAlCarrito
<img width="710" height="212" alt="image" src="https://github.com/user-attachments/assets/2b98a8eb-ca90-4046-83d9-f9df3274324d" />
- BotonCambiaTrasAnadirProducto
<img width="874" height="184" alt="image" src="https://github.com/user-attachments/assets/2629eb07-4180-408d-b4a8-69de8b107a14" />
- EliminarProductoDelCarrito
<img width="644" height="248" alt="image" src="https://github.com/user-attachments/assets/20872da2-6fa3-45df-9d74-2642c7c957a9" />

El resultado final seria este:
<img width="929" height="927" alt="image" src="https://github.com/user-attachments/assets/c505b6ce-c2fa-4dbd-b68c-9e6ac5da8ee3" />
<img width="937" height="795" alt="image" src="https://github.com/user-attachments/assets/dc527a28-4e32-4d5f-b7b1-5d19448426cc" />
<img width="968" height="597" alt="image" src="https://github.com/user-attachments/assets/e4261f08-0ffd-41c6-be71-f0860d2ba909" />

---

## Apreciación y reflexión personal

Esta tarea me ha permitido comprender de forma práctica cómo funciona la automatización de pruebas con Selenium y cómo se estructura un proyecto real de testing.

También me ha ayudado a entender cómo estructurar correctamente los métodos y los tests para poder desarrollarlos de forma más ordenada, reutilizable y fácil de mantener.

En conclusión, esta tarea me ha ayudado a organizar mejor mis ideas sobre los tests y a entender de forma más clara cómo se estructuran dentro de un proyecto de automatización.

---
