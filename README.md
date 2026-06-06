# LlanquihueTour
Sistema básico de gestión para la agencia Llanquihue Tour desarrollado en Java.

## Información General

**Asignatura:** Desarrollo Orientado a Objetos I

**Actividad Sumativa 1:** Semana 3 – Realizando validación, excepciones y relaciones entre clases

**Alumno:** Sebastián Ignacio Ávila Sanhueza

---

## Descripción

LlanquihueTour es un sistema básico desarrollado en Java para representar personas vinculadas a una agencia de turismo. El proyecto aplica conceptos fundamentales de Programación Orientada a Objetos como encapsulamiento, herencia, composición, constructores, getters, setters y método toString().

---

## Estructura del Proyecto

### Paquete app

* Main.java

### Paquete model

* Direccion.java
* Persona.java
* GuiaTuristico.java

---

## Conceptos de POO Aplicados

### Encapsulamiento

Los atributos de las clases fueron declarados como privados y se utilizan métodos getters y setters para acceder a ellos.

### Composición

La clase Persona contiene un objeto de tipo Direccion.

### Herencia

La clase GuiaTuristico hereda de la clase Persona mediante la palabra clave `extends`.

### Reutilización

La herencia permite reutilizar los atributos y métodos definidos en la clase Persona.

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase Main.java.
3. Observar los resultados mostrados en la consola.

---

## Resultado Esperado

El programa crea tres objetos de tipo GuiaTuristico y muestra su información mediante el método toString(), incluyendo nombre, rut, dirección y especialidad.

---

## Autor

Sebastián Ignacio Ávila Sanhueza
