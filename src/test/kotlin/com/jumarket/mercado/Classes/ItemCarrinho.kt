package com.jumarket.mercado.Classes

import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

// Classe para representar o carrinho de compras
@Entity
@Table(name = "Carrinho")
data class ItemCarrinho(
    @Embedded val produto: Produto,
    var quantidade: Int )