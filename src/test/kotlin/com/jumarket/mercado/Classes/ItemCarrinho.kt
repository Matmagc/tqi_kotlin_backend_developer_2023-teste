package com.jumarket.mercado.Classes

import org.springframework.boot.autoconfigure.domain.EntityScan

// Classe para representar o carrinho de compras
data class ItemCarrinho(
    val produto: Produto,
    var quantidade: Int)