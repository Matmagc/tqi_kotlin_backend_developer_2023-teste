package com.jumarket.mercado.Repositorio

import com.jumarket.mercado.Classes.Categoria
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaRef: JpaRepository<Categoria, String> {
}