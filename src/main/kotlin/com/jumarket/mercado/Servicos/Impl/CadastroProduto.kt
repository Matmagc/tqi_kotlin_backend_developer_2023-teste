package com.jumarket.mercado.Servicos.Impl

import com.jumarket.mercado.Classes.Produto
import com.jumarket.mercado.Repositorio.InventarioProdutos
import com.jumarket.mercado.Servicos.ICadastroProduto
import org.springframework.stereotype.Service

@Service
class  CadastroProduto(
    private val inventarioProdutos: InventarioProdutos): ICadastroProduto {
    override fun salvar(produto: Produto): Produto =
        this.inventarioProdutos.save(produto)


    override fun acharId(id: Long): Produto =
        this.inventarioProdutos.findById(id).orElseThrow {
            throw RuntimeException("Não existe este produto.")
        }

    override fun deletar(id: Long) =
        this.inventarioProdutos.deleteById(id)
}