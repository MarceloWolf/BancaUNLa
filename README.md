# BancaUNLa

1-Descargar el proyecto de manera local.
2-Montarlo en la aplicación Spring Boot o Eclipse EE (tener configurado Apache tomcat versión 8.5 o superior en este último)
3-La BD está en MySQL, la misma funciona mediante annotations, por lo que el procedimiento para hacerla correr es el siguiente:
  *levantar la BBDD abriéndola con localhost:3306, user:root, password: root, o en application properties editar el usuario y/o contraseña.
  *Generar el Script "create schema `bancaUnla`;" y correrlo. Una vez creado y usado ejecutar el Script "USE `bancaUnla`;"
4-El programa corre en localhost:8080.
