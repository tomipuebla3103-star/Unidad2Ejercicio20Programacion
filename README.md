<img width="730" height="343" alt="WhatsApp Image 2026-10-06 at 00 08 03" src="https://github.com/user-attachments/assets/0b03cff7-5f0a-46cd-9a85-fafc1be8df7c" />

El Sistema de Gestión de Flotas de Vuelos y Torres de Control

Descripción
Este proyecto consiste en un sistema en Java que simula la comunicación entre aviones y una torre de control. Los aviones solicitan autorización para aterrizar y la torre verifica si la pista está libre antes de aprobar o rechazar la solicitud.

Clases
- **Avion:** almacena el código de vuelo, la aerolínea y el estado actual del vuelo. Contiene el método `cambiarEstado(String estado)` para actualizar su situación.
- **TorreControl:** controla la disponibilidad de la pista y utiliza el método `autorizarAterrizaje(Avion avion)` para evaluar las solicitudes de aterrizaje.

Funcionamiento
En el `main` se crea una torre de control y varios aviones. Cada avión solicita autorización para aterrizar de manera consecutiva. La torre verifica si la pista está disponible y responde según la situación. Finalmente, se muestran por consola los resultados de cada solicitud.

Recorrido del mensaje
1. El programa crea la torre de control y los aviones con sus datos iniciales.
2. Cada avión envía una solicitud de aterrizaje a la torre.
3. La torre recibe el mensaje mediante el método `autorizarAterrizaje()`.
4. La torre verifica si la pista está libre.
5. Si la pista está disponible, autoriza el aterrizaje, cambia el estado del avión a "Aterrizando" y marca la pista como ocupada.
6. Si la pista está ocupada, rechaza la solicitud hasta que vuelva a estar disponible.
7. Finalmente, se muestran por consola los resultados de la coordinación del tráfico aéreo.

Validaciones
El sistema debe impedir que dos aviones utilicen la pista al mismo tiempo. Cuando un avión termina de aterrizar y queda en tierra, la torre puede liberar la pista para autorizar a otro avión.

 Objetivo
Practicar la comunicación entre objetos en Java, el envío de objetos como parámetros, la modificación de estados y el uso de condiciones para coordinar solicitudes y controlar la disponibilidad de un recurso compartido.
