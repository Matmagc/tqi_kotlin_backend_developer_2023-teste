package com.jumarket.mercado.Classes

import jakarta.persistence.Embedded
import jakarta.persistence.Entity

@Entity
data class Categoria(
    val categoria : String
)
