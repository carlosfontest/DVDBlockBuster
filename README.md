# DVDBlockBuster [JAVA]

## ***Introducción***
Sistema de administración de empresa que vende DVD's de películas. Implementa una base de datos con *Archivos de Texto*, y un *sistema de búsqueda* basado en el ***Indexing*** y el ***Hashing***. El sistema permite el alquiler de DVD's, así como un sistema completo de administración de los clientes y de las películas.


## ***ScreenShots***

### *Inicio de Sesión*
![Inicio de Sesión](https://i.ibb.co/C1hp7QR/Block-Buster1.png)

### *Alquiler de DVD's*
![Alquiler de DVD's](https://i.ibb.co/9prdQfc/Block-Buster2.png)

### *Administración de Clientes*
![Administración de Clientes](https://i.ibb.co/64g3hC5/Block-Buster3.png)

### *Administración de Películas*
![Administración de Películas](https://i.ibb.co/WcBMx26/Block-Buster4.png)

### *Base de Datos*
![Base de Datos](https://i.ibb.co/SNGcT6h/Block-Buster-BDD.png)


## ***Especificaciones de desarrollo***
> Software desarrollado con el IDE *NetBeans*, en el lenguaje ***JAVA***


## ***Especificaciones del Sistema***
La popular franquicia de alquiler de películas DVD Blockbuster desea volver al negocio y, para ello, consideran que necesitan mejorar su sistema de búsqueda; por ello usted ha sido contratado para realizar el diseño de dicho sistema.

De cada cliente se debe tener la siguiente información:

* Numero de cedula (clave primaria)
* Nombre y Apellido (40 caracteres)
* ID de película alquilada (0 si no tiene ninguna en alquiler)
* Fecha de alquiler y devolución. (En caso de tener una película alquilada)

De cada película se debe tener la siguiente información:

* Título (clave primaria)
* Género (clave secundaria)
* Descripción (60 caracteres)
* Precio de Alquiler por día
* Rating (entero [0-5]) (clave secundaria)
* Stock (Cantidad de películas restantes en inventario)

Funcionalidades:

1. Se debe poder agregar, modificar, eliminar y consultar películas
2. Se debe poder agregar, modificar, eliminar y consultar clientes.
3. Se debe poder buscar películas por:
   * Clave Primaria: Título (Búsqueda sobre índice primario)
   * Clave Secundaria: Rating:(Leer sobre índices secundarios y claves secundarias)
   * Clave Secundaria: Género (Leer sobre índices secundarios y claves secundarias).
4. El cliente debe poder alquilar y devolver películas (Un cliente solo puede tener una película alquilada a la vez)
5. Al buscar una película, el sistema deberá indicar su nombre, género, descripción, precio, rating y si hay stock o no, de no haberlo, también indicará el nombre del cliente que está más pronto a devolverla y la fecha de devolución.
6. El cliente debe escoger por cuánto tiempo tendrá alquilada la
película, con un máximo de 9 días.

Requerimientos:

1. Las búsquedas relacionadas con películas se deben hacer mediante
el método de “Indexing”
2. El manejo del sistema debe hacerse a través de una interfaz
gráfica, tome en cuenta que la interfaz será evaluada según su
aspecto.
3. La información ingresada al sistema se debe almacenar en un
archivo (texto u objeto) cuando se cierre el programa y cargarse
cuando se inicie nuevamente.