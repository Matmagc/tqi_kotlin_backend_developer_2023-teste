package com.jumarket.mercado.Servicos

import com.jumarket.mercado.Classes.Categoria

interface ICadastroCategoria {

    fun cadastrarCategoria (categoria: Categoria): Categoria

    fun deletarCategoria (categoria: String)
}