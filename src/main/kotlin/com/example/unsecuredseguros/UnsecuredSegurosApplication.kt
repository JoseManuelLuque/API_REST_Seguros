package com.example.unsecuredseguros

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class UnsecuredSegurosApplication : SpringBootServletInitializer() {

	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(UnsecuredSegurosApplication::class.java)
	}
}

fun main(args: Array<String>) {
	runApplication<UnsecuredSegurosApplication>(*args)
}