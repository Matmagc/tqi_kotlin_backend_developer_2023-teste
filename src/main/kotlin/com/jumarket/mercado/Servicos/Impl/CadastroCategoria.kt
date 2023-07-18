package com.jumarket.mercado.Servicos.Impl

import com.jumarket.mercado.Classes.Categoria
import com.jumarket.mercado.Repositorio.CategoriaRef
import com.jumarket.mercado.Servicos.ICadastroCategoria
import org.springframework.stereotype.Service

@Service
class CadastroCategoria(
    private val categoriaRef: CategoriaRef
): ICadastroCategoria {
    override fun cadastrarCategoria(categoria: Categoria): Categoria =
        this.categoriaRef.save(categoria)

    override fun deletarCategoria(categoria: String) =
        this.categoriaRef.deleteById(categoria)


}
