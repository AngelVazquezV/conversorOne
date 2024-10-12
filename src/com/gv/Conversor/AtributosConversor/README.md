<h1 align="center"> Currency code </h1>
<p align="center">
 <img src= "src/resourcesConversor/c1.png" alt="logo" > 
</p>
<h4 align="center">Ángel Vázquez</h4>

![Java](https://img.shields.io/badge/Programa-%20Java-blue)
![Desarrollo](https://img.shields.io/badge/desarrollo-%20En_construccion-green)
![Software](https://img.shields.io/badge/IDE-%20INTELL_IJ-green)
![Ultima actualizacion](https://img.shields.io/badge/Actualizacion-%20Octubre_2024-green)
![Disponible en](https://img.shields.io/badge/Disponible_en-%20GitHub-green)
![Archivos](https://img.shields.io/badge/Archivos-%20java,_json,_txt-green)
![Bibliotecas](https://img.shields.io/badge/Bibliotecas-%20gson-green)
![Version](https://img.shields.io/badge/Version-%201.0-blue)
![Licencia](https://img.shields.io/badge/Licencia-%20CC_BY_NC_SA-red)

### Índice
- [Descripción](#descripcion)

- [Video del proyecto](#video)

- [Cómo usar la aplicación](#como-usar-la-aplicacion)

- [Integración con servicio de tasa de cambio](#integracion-con-servico-de-tasa-de-cambio)

- [Biblioteca para lenguaje de programación](#biblioteca-para-lenguaje-de-programacion)

- [Funcionalidades](#funcionalidades)

- [Estructura del proyecto y archivos](#estructura-del-proyecto-y-archivos)

- [Historial de conversiones](#historial-de-conversiones-y-registros-con-marca-de-tiempo-y-fecha-extra--)

- [Manejo de excepciones](#manejo-de-excepciones)

- [Compatibilidad](#compatibilidad)

- [Tecnologías utilizadas](#herramientas)

- [Licencia](#licencia)

- [Glosario](#glosario)

- [Consideraciones](#consideraciones)

- [Desarrolladores y contacto](#desarrolladores-y-contacto)

## Descripción
El conversor proporciona los tipos de cambio de diversas monedas y un historial de operaciones realizadas, incluyendo sus fechas y horas, mediante conexión con una API.

### Objetivo ✅
El objetivo de este proyecto fue aprender a utilizar API's y manejar los datos obtenidos según la búsqueda del usuario, para luego mostrarlos en la consola.

## Video
- Video del proyecto [Aqui](https://1drv.ms/v/c/8cd888ee64cb1752/ES01nXv1ys9Mjq_qSzJCQXAB8036Dg7MS2Iu539j_hPZ6Q?e=3BqEE8)
## Cómo usar la aplicación
Configuración⚙ En este proyecto trabajamos con API's y la librería Gson para obtener, procesar y mostrar los datos solicitados.

### Integración con servico de tasa de cambio
El conversor utiliza Exchange Rate para obtener tasas de cambio 💵. Se realiza una solicitud HTTP a la API mediante una URL personalizada para obtener las tasas de cambio. La URL es proporcionada por Exchange Rate.
La API key utilizada en este proyecto está deshabilitada; sin embargo, cada usuario puede obtener su propia API key para usar esta API. Aquí te explico cómo hacerlo:
- Cómo obtener la api_key? 🔑
- Entra a: https://www.exchangerate-api.com/
- Ingresa un correo electrónico y haz click en "obtén una clave gratis"
- Elige una contraseña
- lee los los términos y crea tu "API key" 🔑

### Biblioteca para lenguaje de programación
El proyecto fue desarrollado en un entorno de desarrollo integrado (IDE). Utilizamos la biblioteca Gson para serializar y deserializar objetos Java y convertirlos al formato JSON.

|¿Como descargar Gson?|¿Como agregar Gson a un proyecto?|
|----------------------|---------------------------|
|Ingresa a: https://mvnrepository.com/artifact/com.google.code.gson/gson.|Para entornos de desarrollo integrado (IDE), puedes agregar manualmente el archivo JAR descargado a las dependencias del proyecto.|
|Busca la versión de Gson que deseas descargar (puede ser la más reciente o una versión específica). Para este proyecto, se utilizó la versión 2.10.1.| Haz clic derecho en el proyecto y selecciona 'Open Module Settings'.|
|Selecciona una versión y haz clic en "Download JAR". |Ve a la sección "Libraries", busca el archivo JAR de Gson y agrégalo al proyecto. |

- Para empezar a usar la aplicación, presione el botón de "Ejecutar" ▶. En la consola de la aplicación aparecerá el menú. Cada opción tiene vinculado un número. Escriba el número de la opción que desea usar y presione Enter.

![Iniciar la aplicacion](src/resourcesConversor/showMenu.gif)

- Se habilitará la opción que seleccionó. Ahora puede escribir una cantidad en la moneda de origen, y se mostrará su equivalente en la moneda de destino. Puede seleccionar otra opción o la misma y continuar haciendo conversiones de divisas. En el siguiente ejemplo, se muestran conversiones de dólares.

![conversiones](src/resourcesConversor/useDollars.gif)

- Puede acceder al historial de conversiones que acaba de realizar presionando "13".

![Como ver el historial de conversiones](src/resourcesConversor/showHistory.gif)

- Para cerrar sesión, presione "14".

![salir](src/resourcesConversor/salirOfApp.gif)

## Funcionalidades
| Nombre              | Función                                                                                                                               |
|-------------------- |---------------------------------------------------------------------------------------------------------------------------------------|
| _Dolar a real brasileño_     | Al ver el menú, presiona 1 para convertir una cantidad de dólares a reales brasileños.                                                |
| _Dolar a peso argentino_         | Al ver el menú, presiona 2 para convertir una cantidad de dólares a pesos argentinos.                                                 |
| _Dolar a peso colombiano_            | Al ver el menú, presiona 3 para convertir una cantidad de dólares a pesos colombianos.                                                |
| _Real brasileño a dolar_     | Al ver el menú, presiona 4 para convertir una cantidad de reales brasileños a dólares.                                                |
| _Real brasileño a peso argentino_         | Al ver el menú, presiona 5 para convertir una cantidad de reales brasileños a pesos argentinos.                                       |
| _Real brasileño a peso colombiano_  | Al ver el menú, presiona 6 para convertir una cantidad de reales brasileños a pesos colombianos.                                      |
| _Peso argentino a dolar_       | Al ver el menú, presiona 7 para convertir una cantidad de pesos argentinos a dólares.                                                 |
| _Peso argentino a real brasileño_ | Al ver el menú, presione 8 para convertir una cantidad de pesos argentinos a reales brasileños.                                       |
| _Peso argentino a peso colombiano_  | Al ver el menú, presione 9 para convertir una cantidad de pesos argentinos a peso colombiano.                                         |
| _Peso colombiano a dolar_  | Al ver el menú, presione 10 para convertir una cantidad de pesos colombianos a dolar.                                                 |
| _Peso colombiano a real brasileño_        | Al ver el menú, presione 11 para convertir una cantidad de pesos colombianos a reales brasileños.-                                    
|_Peso colombiano a peso argentino_    | Al ver el menú presione 12 para convertir una cantidad de pesos colombianos a peso argentino.                                         
| _Historial de conversiones_     | Con la opción 13, puede ver el historial de conversiones realizadas.                                                                  
|_consumo de api_| Los datos que solicita el usuario son obtenidos a través de la API de Exchange Rate.                                                  |
|_datos en formato json_| Una vez obtenidos los datos solicitados por el usuario, la biblioteca Gson procesa estos datos para su mejor lectura y visualización. |


- Para convertir dólares a otro tipo de moneda, presione 1, 2 o 3.

![conversiones de dolares](src/resourcesConversor/useDollars.gif)

- Para convertir reales brasileños a otro tipo de moneda, presione 4, 5 o 6.

![conversiones de reales brasileños](src/resourcesConversor/useReales.gif)

- Para convertir pesos argentinos a otro tipo de moneda, presione 7, 8 o 9.

![conversiones de pesos argentinos](src/resourcesConversor/useArgentine.gif)

- Para convertir pesos colombianos a otro tipo de moneda, presione 10, 11 o 12.

![conversiones de pesos colombianos](src/resourcesConversor/useColombian.gif)

## Estructura del proyecto y archivos
- paquete principal: Contiene las clases relacionadas con el manejo de entrada y salida, escritura y lectura de datos, control de excepciones, zonas horarias, clases de utilidad, entre otras. Estas clases permiten procesar, imprimir y almacenar una serie de datos a partir de un número ingresado.
- Main: Es la clase principal que maneja la interacción con el usuario y muestra el menú.
- Principal: Utiliza métodos y la lógica de programación principal. Inicia el proceso de conversión de monedas una vez que se han obtenido los datos mediante una conexión a Exchange Rate.🌐
- Atributos Conversion: Clase encargada de procesar los datos obtenidos de la API para mostrar la conversión de monedas. Representa una moneda y contiene los atributos "moneda_origen" y "moneda_destino".💵
- Conversiones: Clase que representa y almacena la estructura de la respuesta JSON de la API, junto con las fechas y horas en que se realizaron. Es llamada para mostrar el historial de operaciones.
- Historial de conversiones: Aquí se almacenan las operaciones realizadas durante la sesión en la aplicación de manera sencilla.
- Gitignore: En un proyecto Git, el archivo .gitignore indica qué archivos o directorios deben ser ignorados por Git, evitando que se incluyan en el seguimiento del repositorio. En este caso, se han agregado al .gitignore archivos encargados de obtener datos mediante una conexión a una API que incluye una contraseña, lo cual permite proteger estos archivos sensibles.

#### Estructura básica
- .idea:
-  ____ misc.xml
-  ____ modules.xml
-  ____ vsc.xml
-  ____ workspace.xml
- Conversor:
-  ____idea
-  ____out
- src:
- com.gv.Conversor.AtributosConversor:
-  ____gitgnore
-  ____conversiones
-  ____conversiones.json
-  ____conversor.iml
-  ____AtributosConversion.java
-  ____historialConversion.txt
-  ____Main.java
-  ____Principal.java
-  ____Readme.md
-  ____License
-  External libraries:
-  ____gson-2.10.1.jar
-  ____<17>

## Estructura de carpetas 📂
- idea: Contiene los archivos de configuración específicos del entorno de desarrollo para este proyecto, como archivos xml.
- Conversor: Es la raíz del proyecto y contiene los archivos y subcarpetas necesarios para su funcionamiento, incluyendo el código fuente, bibliotecas, entre otros.
- Out: Almacena los archivo compilados.
- src: La carpeta src (source) contiene el código fuente. Aquí se ubican los archivos escritos. Contiene paquetes como:
- com.gv.conversor.atributosConversor: Contiene archivos en formato Java, TXT y JSON que procesan los datos obtenidos de la API y luego los imprimen en la consola.
- External Libraries: Contiene bibliotecas adicionales y dependencias utilizadas en el proyecto, como por ejemplo, Gson-2.10.1.jar.
- <17>: Contiene las clases, bibliotecas y funcionalidades básicas necesarias para el correcto funcionamiento de las aplicaciones en Java.

## Paquetes de java 📦
- java.io: Proporciona el manejo de entrada y salida, con clases para leer y escribir datos. Paquetes de java.io: IOException, FileWriter, entre otros.
- java.net: Proporciona clases para realizar operaciones en red, crear conexiones, manejar URLs y conectar con APIs. Paquetes de java.net: URI, HttpClient, HttpRequest, HttpResponse, entre otros.
- java.time: Proporciona una API moderna y eficiente para manejar fechas y horas. Paquetes de java.time: ZoneId, ZonedDateTime.
- java.util: Ofrece clases para estructuras de datos, manipulación de fechas y horas, clases de utilidad, manejo de entrada y salida de datos, entre otras. Paquetes de java.util: Scanner, ArrayList, InputMismatchException.

## Estructura y descripción de clases
- Main:
- Muestra el menú una vez ejecutada la aplicación y lo mantiene en un ciclo mientras así se desee.
- Maneja excepciones que pueden ocurrir en el uso del menú.
- Switch maneja la lógica del menú y ejecuta un proceso específico según la opción seleccionada.
- Scanner es herramienta muy útil para la entrada de datos.
- Principal:
- Guarda la URL base de la API, a partir de la cual se crea un URI para realizar solicitudes HTTP a la API.🌐
- En la tarea de conexión con APIs, se obtiene el tipo de cambio de la moneda que el usuario desea convertir, representada por la cantidad ingresada previamente. JSON obtiene y almacena el cuerpo de la respuesta.
- Contiene un bloque try-catch para la gestión de excepciones. En caso de excepciones, el menú se imprime de nuevo.
- Con las clases de java.time, se representa la fecha y la hora en una zona horaria.
- Utiliza setters para acceder a valores privados.
- Utiliza la clase AtributosConversión para procesar los datos obtenidos de la API, de acuerdo con los atributos de "AtributosConversión".
- AtributosConversion:
- La anotación @SerializedName indica que un miembro debe ser serializado a JSON con el nombre proporcionado, como en los valores de moneda_origen y moneda_destino.
- El constructor AtributosConversión(Double monedaOrigen, Double monedaDestino) inicializa objetos de la clase, asignando los valores de las monedas origen y destino.
- El método getter se utiliza para acceder al valor de un atributo privado desde fuera de una clase.
- El método toString se utiliza para proporcionar una representación en forma de cadena del objeto. Se ha sobrescrito el método (como lo indica @Override)..
- HistorialConversiones guarda las operaciones realizadas.
- Conversiones almacena en formato JSON las operaciones, junto con sus respectivas fechas y horas en las que fueron realizadas.

## Historial de conversiones y registros con marca de tiempo y fecha (extra) 📆 🕒
- El historial de conversiones incluye la fecha y hora en GMT-4, almacenando los datos en una lista y en archivos JSON y TXT para referencia futura."
![Como ver el historial de conversiones](src/resourcesConversor/showHistory.gif)

## Manejo de excepciones
La aplicación funciona ingresando datos numéricos para su conversión y así mostrar cantidades con sus respectivos tipos de cambio. Cuando, por ejemplo, se ingresan letras, ya sea al elegir una opción del menú o al escribir una cantidad que represente una moneda, el código trata estas excepciones y vuelve a mostrar el menú para permitir la entrada de datos correctos. La aplicación maneja errores en la entrada de datos no numéricos, permitiendo reintentar con datos correctos para realizar la conversión.
- Control de Errores: A continuación, se describen algunas de las estrategias de manejo de errores que se han implementado:
- Validación de entrada del usuario: Se han implementado controles de validación en las entradas del usuario para garantizar que solo se introduzcan valores válidos. Se validan las entradas del usuario y se emite un mensaje de error si no se ingresan números válidos.
- Captura de excepciones: Se han implementado bloques try-catch para capturar excepciones y manejarlas adecuadamente.
- ![Excepcion](src/resourcesConversor/letterInAmountMoney.gif)
- ![Excepcion](src/resourcesConversor/letterInOptionMenu.gif)

## Compatibilidad
- JRE
- Intellij
- java 17 o posterior
- Gson 2.10.1 o posterior

## Herramientas
- Java
- Biblioteca Gson
- Archivo .txt
- Archivos .json
- API's

## Licencia
- Este proyecto tiene licencia CC BY-NC-SA

## Glosario
| Palabra    | Significado                                                        |
|------------|--------------------------------------------------------------------|
| _API_      | Interfaz de programación de aplicaciones(por sus siglas en inglés) 
| _key_      | Llave                                                              |
| _Java_     | Lenguaje de programación                                           |
| _JRE_      | Entorno de ejecución de java(por sus siglas en inglés)             |
| _IDE_      | Entorno de desarrollo integrado(por sus siglas en inglés)          |
| _Gson_     | Formato de texto sencillo para el intercambio de datos.            |
| _TXT_      | Archivo de texto                                                   |
| _Divisa_   | Moneda                                                             |
| _Http_     | Protocolo de transferencia de hipertexto(por sus siglas en inglés) |
| _Request_  | Pedido o solicitud                                                 |
| _Response_ | Respuesta                                                          |
| _Client_   | Cliente                                                            |

## Instalación
1.	Clona el repositorio en tu máquina local.
2.	Instala la biblioteca Gson siguiendo las instrucciones proporcionadas.
3.	Abre el proyecto en tu IDE preferido.
4.	Ejecuta la aplicación desde la clase main.

## Consideraciones
- El conversor solo funciona ingresando números, tanto para elegir opciones del menú como para convertir monedas.
- Puede consultar la documentación de Java en: https://docs.oracle.com/en/java/

## Desarrolladores y contacto
[Ángel Vázquez](https://github.com/AngelVazquezV/)
- Inicia sesión en [Discord](Discord.com) y accede a [este perfil](https://discordapp.com/users/1250691927674978350)
#### Hecho por Ángel Vázquez