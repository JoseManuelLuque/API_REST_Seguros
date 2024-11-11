package com.example.unsecuredseguros.repository

import com.example.unsecuredseguros.model.Seguro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SeguroRepository : JpaRepository<Seguro, Int>
