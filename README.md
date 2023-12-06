# Api Rest con Spring boot CRUD_H2

****API REST********************************************************************************************************************************
Una API REST (Representational State Transfer) es una interfaz de programación de aplicaciones que sigue los principios del estilo arquitectónico REST.
Permite a los clientes acceder y manipular recursos a través de operaciones HTTP estándar, utilizando formatos de datos comunes como JSON o XML. La separación
cliente-servidor, la transferencia de estado y el uso de URIs y métodos HTTP son algunas de las características clave de una API REST.

Aquí hay algunos aspectos clave de una API REST:

  -Separación cliente-servidor: Una API REST separa la lógica del cliente y del servidor. El cliente es responsable de la interfaz de usuario y la presentación
de datos, mientras que el servidor se encarga del almacenamiento y procesamiento de datos. Esto permite una mayor flexibilidad y escalabilidad en el desarrollo
de aplicaciones.
  -Transferencia de estado: REST utiliza la transferencia de estado representacional, lo que significa que cada solicitud del cliente contiene toda la información
necesaria para comprender y procesar la solicitud. El servidor no guarda información sobre el estado del cliente entre solicitudes. Esto mejora la escalabilidad
y la capacidad de respuesta de la API.
  -Recursos y URI: En una API REST, los datos se representan como recursos, que son objetos o conjuntos de datos específicos. Cada recurso tiene una identificación
única llamada URI (Uniform Resource Identifier). Los clientes pueden acceder a los recursos utilizando las URI correspondientes. Por ejemplo, una URI puede ser
"/usuarios" para acceder a una lista de usuarios.
  -Métodos HTTP: REST utiliza los métodos HTTP estándar para realizar operaciones en los recursos. Los métodos más comunes son GET (obtener), POST (crear), PUT
(actualizar) y DELETE (eliminar). Estos métodos se utilizan para realizar operaciones CRUD (crear, leer, actualizar, eliminar) en los recursos.
  -Formatos de datos: Los datos en una API REST se transfieren generalmente en formatos como JSON (JavaScript Object Notation) o XML (eXtensible Markup Language).
Estos formatos permiten una fácil lectura y escritura de datos en diferentes lenguajes de programación.
  -HATEOAS: HATEOAS (Hypermedia as the Engine of Application State) es un principio de diseño de REST que permite a los clientes navegar y descubrir recursos 
relacionados a través de enlaces hipertexto. Esto significa que la API proporciona enlaces a recursos relacionados en las respuestas, lo que permite a los 
clientes explorar y acceder a otros recursos de manera dinámica.
************************************************************************************************************************************************************ 

- Ejercicio CRUD con H2

Accede en la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:

PROJECT (gestor de dependencias): Maven o Gradle.
LANGUAGE:                         Java.
SPRING BOOT:                     La última versión estable.
PROJECT METADATA Group:          cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01
Artifact:                        S04T02N01GognomsNom
Name:                            S04T02N01GognomsNom
Description:                     S04T02N01GognomsNom
Package name:                    cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01
PACKAGIN:                        Jar
JAVA:                            Mínimo versión 11
Dependencias:
                                 Spring Boot DevTools
                                 Spring Web
                                 Spring Data JPA
                                 H2 Database

Tenemos una entidad llamada "Fruta", que dispone de las siguientes propiedades:
int id
String nombre
int pesoKg

Aprovechando la especificación JPA, tendrás que persistir esta entidad a una base de datos H2, siguiendo el patrón MVC. 
Para lo cual, dependiendo del Package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:

cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.controllers
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.modelo.domain
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.modelo.services
cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.modelo.repository
La clase ubicada al paquete controllers (FruitaController, por ejemplo), tendrá que ser capaz de dar respuesta a las siguientes
peticiones para actualizar y consultar información:

http://localhost:8080/fruta/add

http://localhost:8080/fruta/update

http://localhost:8080/fruta/delete/{*id}

http://localhost:8080/fruta/getOne/{*id}

http://localhost:8080/fruta/getAll

## Enlaces

   - [Enlace H2]([(https://www.youtube.com/watch?v=M7lhQMzzHWU&t=199s)])
   - [Enlace H2]([(https://www.youtube.com/watch?v=hzEpwm_Ew7I)])
     
## Uso

 Para hacer un CRUD (Create, Read, Update, Delete) con H2, que es una base de datos en memoria, puedes seguir los siguientes pasos:

  -1 Configurar la dependencia de H2: En tu archivo pom.xml (si estás utilizando Maven) o build.gradle (si estás utilizando Gradle),
  asegúrate de tener la dependencia de H2 agregada.
  
  -2 Configurar la conexión a la base de datos: En el archivo de configuración de Spring Boot (application.properties o application.yml),configura la conexión a la base de datos H2.
   
  -3 Esto configura la base de datos H2 en memoria con la URL jdbc:h2:mem:testdb, el controlador JDBC org.h2.Driver, y el usuario 
    contraseña predeterminados.
    
    Crear una entidad: Crea una clase que represente la entidad que deseas almacenar en la base de datos. Anota la clase con @Entity
    y define las propiedades y relaciones necesarias. 
    
  -4 Crear un repositorio: Crea una interfaz que extienda JpaRepository de Spring Data JPA para realizar operaciones CRUD en la entidad.
  
  -5 Implementar el CRUD: En tu servicio o controlador, inyecta el repositorio y utiliza sus métodos para realizar operaciones CRUD en la base de datos.
  
  -6 Probar el CRUD: Puedes probar el CRUD utilizando un cliente HTTP, como Postman, o escribiendo pruebas unitarias.
  








  
