# API REST Mutantes

Este proyecto es la resolución del primer parcial de la materia desarrollo de software, que consiste en crear una API REST utilizando Java,springboot, H2 y luego desplegarla en Render.


## Descripción del Proyecto

Este proyecto es una API REST desarrollada en Java utilizando Spring Boot. La base de datos utilizada es H2, una base de datos en memoria que facilita el desarrollo y las pruebas. La API está diseñada para manejar operaciones Post(donde se crea un nuevo dna y se verifica si es mutante) y Get(donde se obtiene informacion general sobre todos los dna cargados).

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación.
- **JPA**: Java Persistence API.
- **Hibernate**: Implementación de JPA.
- **Envers**: Biblioteca para auditoría de datos.
- **Lombok**: Biblioteca para reducir el código boilerplate.
- **Gradle**: Herramienta de gestión de dependencias.
- **H2**: Sistema de gestión de bases de datos relacionales.
- **Spring Boot**: Framework para la creación de aplicaciones Java.
- **Render**: Plataforma de despliegue en la nube.


## Ejecucion del proyecto en Render
1. Link en render:

   ```bash
   https://parcialmutantes-visedomatias.onrender.com
2. Ejemplo POST:
   ```bash
   https://parcialmutantes-visedomatias.onrender.com/mutant/

 Body:
  { 
        "dna": ["ATGATT",
                "CGATGA",
                "GTATGA",
                "TAGTAC",
                "TGATCG",
                "AAAATG"] 
 }
 
   
3. Ejemplo GET:
    ```bash
   https://parcialmutantes-visedomatias.onrender.com/stats
   



