---
icon: hammer-brush
layout:
  title:
    visible: true
  description:
    visible: false
  tableOfContents:
    visible: true
  outline:
    visible: true
  pagination:
    visible: true
---

# Entidad Seguro

En esta sección se define una clase de Kotlin llamada `Seguro` que está mapeada como una entidad JPA con la tabla `seguros` en una base de datos. La clase `Seguro` utiliza anotaciones de JPA para asignar sus campos a las columnas correspondientes de la tabla. Estos campos incluyen:

* `idSeguro`: Identificador único generado automáticamente.
* `nif`: Identificación fiscal validada mediante una expresión regular.
* `nombre`, `ape1`, `sexo`: Campos obligatorios que no pueden estar en blanco.
* `ape2`: Segundo apellido, campo opcional.
* `edad`: Edad del seguro que no puede ser negativa.
* `numHijos`: Número de hijos, que debe ser positivo o cero.
* `fechaCreacion`: Fecha de creación registrada como un `Timestamp`.
* `casado` y `embarazada`: Campos booleanos que indican estado civil y embarazo.

La clase utiliza restricciones de validación para asegurar que los datos cumplen con ciertos requisitos antes de ser persistidos, aunque algunas validaciones las haré más adelante como la validación correcta del NIE no solo que cimpruebe la cantidad de caracteres y la edad por ejemplo (Validaciones en el service).

{% code fullWidth="true" %}
```kotlin
package com.example.unsecuredseguros.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.Temporal
import jakarta.persistence.TemporalType
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import java.util.Date

@Suppress("JpaObjectClassSignatureInspection")
@Entity
@Table(name = "seguros")
data class Seguro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSeguro")
    val idSeguro: Int = 0,

    //Comprobamos que NIE o DNI tengo obligatoriamente 8 carácteres y 1 dígito
    @Pattern(regexp = "^[0-9]{8}[A-Z]$", message = "El NIF debe tener 8 dígitos seguidos de una letra mayúscula")
    @Column(name = "nif", nullable = false, length = 10)
    val nif: String,

    @Column(name = "nombre", nullable = false, length = 100)
    //Comprobamos que el campo no esté en blanco
    @NotBlank(message = "El nombre no puede estar en blanco")
    val nombre: String,

    @Column(name = "ape1", nullable = false, length = 100)
    @NotBlank(message = "El primer apellido no puede estar en blanco")
    val ape1: String,

    @Column(name = "ape2", length = 100)
    val ape2: String? = null,

    @Column(name = "edad", nullable = false)
    val edad: Int,

    @Column(name = "num_hijos", nullable = false)
    val numHijos: Int,

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    val fechaCreacion: Date,

    @NotBlank(message = "El sexo no puede estar vacío")
    @Column(name = "sexo", nullable = false, length = 10)
    val sexo: String,

    @Column(name = "casado", nullable = false)
    val casado: Boolean,

    @Column(name = "embarazada", nullable = false)
    val embarazada: Boolean
)

```
{% endcode %}

{% file src="../.gitbook/assets/Seguro.kt" %}
Write a caption
{% endfile %}

