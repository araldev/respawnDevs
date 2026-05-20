# Proyecto Restaurante RespawnDevs

Este es un proyecto full-stack que consiste en un backend de Spring Boot y un frontend de Angular.

## Prerrequisitos

Asegúrate de tener instalado lo siguiente:

- **Java Development Kit (JDK)**: Versión 21
- **Node.js y npm**: Node.js versión 20.x o superior, y npm (que viene con Node.js).
- **Maven**: Aunque el proyecto incluye el wrapper de Maven (`mvnw`), tener Maven instalado globalmente puede ser útil.

## Cómo levantar el proyecto

Sigue estos pasos para poner en marcha la aplicación.

### 1. Levantar el Backend (Spring Boot)

El backend es una aplicación de Spring Boot.

1.  **Navega a la carpeta del backend:**

    ```bash
    cd backend
    ```

2.  **Ejecuta la aplicación:**
    Utiliza el wrapper de Maven para compilar y ejecutar la aplicación.

    En Linux/macOS:

    ```bash
    ./mvnw spring-boot:run
    ```

    En Windows:

    ```bash
    mvnw.cmd spring-boot:run
    ```

    El servidor backend se iniciará por defecto en `http://localhost:8080`.

### 2. Levantar el Frontend (Angular)

El frontend es una aplicación de Angular.

1.  **Abre una nueva terminal.**

2.  **Navega a la carpeta del frontend:**

    ```bash
    cd frontend
    ```

3.  **Instala las dependencias de Node.js:**
    Este comando leerá el archivo `package.json` e instalará todas las librerías necesarias.

    ```bash
    npm install
    ```

4.  **Ejecuta el servidor de desarrollo de Angular:**

    ```bash
    npm start
    ```

    o

    ```bash
    ng serve
    ```

    La aplicación frontend estará disponible en `http://localhost:4200`. El servidor de desarrollo se recargará automáticamente si cambias alguno de los archivos fuente.

## Acceso a la aplicación

Una vez que tanto el backend como el frontend estén en ejecución, puedes acceder a la aplicación abriendo tu navegador y visitando:

[http://localhost:4200](http://localhost:4200)
