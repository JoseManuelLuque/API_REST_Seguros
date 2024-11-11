package com.example.unsecuredseguros.controller

import com.example.unsecuredseguros.model.Seguro
import com.example.unsecuredseguros.service.SeguroService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/seguros")
class SeguroController(private val seguroService: SeguroService) {

    @GetMapping
    fun getAllSeguros(): List<Seguro> = seguroService.getAllSeguros()

    @GetMapping("/{id}")
    fun getSeguroById(@PathVariable id: Int): Seguro =
        seguroService.getSeguroById(id) ?: throw Exception("El seguro con id $id no existe")

    @PostMapping
    fun createSeguro(@RequestBody seguro: Seguro): Seguro = seguroService.saveSeguro(seguro)

   @PutMapping("/{id}")
    fun updateSeguro(@PathVariable id: Int, @RequestBody seguro: Seguro): Seguro =
        seguroService.updateSeguro(id, seguro)

    @DeleteMapping("/{id}")
    fun deleteSeguro(@PathVariable id: Int) = seguroService.deleteSeguro(id)
}
