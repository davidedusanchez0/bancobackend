# Proyecto Backend - Banco de Agricultura (Spring Boot)

Este repositorio contiene el código fuente del backend para el proyecto del Banco de Agricultura, desarrollado con:
- Spring Boot
- Spring Mvc
- Jackson
- Hibernate/Jpa
- Java version 21

### Configurar las Credenciales
La configuración de la conexión se encuentra en el archivo: src/main/resources/application.properties

El usuario y contraseña de MySQL coincidan con los valores de este archivo:

Properties: 

spring.datasource.url=jdbc:mysql://localhost:3306/banco
spring.datasource.username=root
spring.datasource.password=1234

**Si el usuario o contraseña son diferentes, actualiza rlas líneas spring.datasource.username y spring.datasource.password con su credenciales.**

La aplicación requiere que existan datos básicos en la base de datos para funcionar, como roles, usuarios iniciales y sucursales.

El script para insertar estos datos se encuentra en: src/main/resources/data.sql

- Acción Requerida: Una vez que hayas creado la base de datos banco, debes ejecutar el contenido de este script SQL en ella. Esto creará los usuarios, roles y datos necesarios para poder probar la aplicación.

## Probando los Endpoints
La API estará disponible en la ruta base http://localhost:8080/api/.

La aplicación está configurada para intentar ejecutar este script automáticamente (spring.sql.init.mode=always), pero se recomienda ejecutarlo manualmente la primera vez para asegurar que la base de datos esté lista.
