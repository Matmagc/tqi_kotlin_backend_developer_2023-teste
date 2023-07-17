package com.jumarket.mercado.Classes

import org.springframework.boot.autoconfigure.domain.EntityScan

// Classe para representar um produto
data class Produto(
    var nome: String,
    var unidade: String,
    var preco: Double,
    var categoria: String,
    val id: Long )