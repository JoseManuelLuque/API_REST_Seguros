---
icon: bell-concierge
---

# Seguro Service



{% code fullWidth="true" %}
```kotlin
package com.example.unsecuredseguros.service

import com.example.unsecuredseguros.model.Seguro
import com.example.unsecuredseguros.repository.SeguroRepository
import org.springframework.stereotype.Service

@Service
class SeguroService(private val seguroRepository: SeguroRepository) {

    private val controlLetters = "TRWAGMYFPDXBNJZSQVHLCKE"
    fun validateNif(nif: String) {
        val numberPart = nif.substring(0, 8).toInt()
        val letterPart = nif[8]
        val correctLetter = controlLetters[numberPart % 23]

        if (letterPart != correctLetter) {
            throw Exception("Letra de control del NIF no válida.")
        }
    }

    fun ValidarSeguro(seguro: Seguro) {
        validateNif(seguro.nif)

        if (seguro.edad<0) {
            throw Exception("No se puede añadir edad negativa")
        }

        if (seguro.edad<17&&seguro.edad>0) {
            throw Exception("La edad debe ser superior a 18 años para adquirir un seguro")
        }

        if(seguro.embarazada == true && seguro.sexo == "Hombre") {
            throw Exception(" Un Hombre no puede estar emebarazado")
        }
    }

    fun getAllSeguros(): List<Seguro> = seguroRepository.findAll()

    fun getSeguroById(id: Int): Seguro? = seguroRepository.findById(id).orElse(null)

    fun saveSeguro(seguro: Seguro): Seguro {
        ValidarSeguro(seguro)
        return seguroRepository.save(seguro)
    }

    fun updateSeguro(id: Int, seguro: Seguro): Seguro {
        if (!seguroRepository.existsById(id)) {
            throw Exception("El seguro con id $id no existe")
        }
        ValidarSeguro(seguro)
        return seguroRepository.save(seguro.copy(idSeguro = id))
    }

    fun deleteSeguro(id: Int) {
        if (!seguroRepository.existsById(id)) {
            throw Exception("El seguro con id $id no existe")
        }
        seguroRepository.deleteById(id)
    }
}

```
{% endcode %}

