# API REST Mutantes

Este proyecto es la resolución del primer parcial de la materia desarrollo de software, que consiste en crear una API REST utilizando Java,springboot, H2 y luego desplegarla en Render.

## Descripción del examen
Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar contra los X-Mens.

Te ha contratado a ti para que desarrolles un proyecto que detecte si un humano es mutante basándose en su secuencia de ADN.

Para eso te ha pedido crear un programa con un método o función con la siguiente firma:

**boolean isMutant(String[] dna);**

En donde recibirás como parámetro un array de Strings que representan cada fila de una tabla de (NxN) con la secuencia del ADN. Las letras de los Strings solo pueden ser: (A,T,C,G), las cuales representa cada base nitrogenada del ADN.

Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro letras iguales, de forma oblicua, horizontal o vertical.

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
Para ejecutar el proyecto en render copia el link en tu navegador y agrega alguno de los endpoints "/mutant/" o "/stats" o copia alguno de los ejemplos de abajo.En el caso del Post es recomendable usar alguna herramienta como POSTMAN
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
   



