package com.voltaire.prateleiravirtual.orcamento.situacao

import com.voltaire.prateleiravirtual.orcamento.Orcamento

interface SituacaoOrcamento {

    fun calcularDescontoExtra(orcamento: Orcamento) : Double

    fun aprovar(orcamento: Orcamento) {
        throw Exception("")
    }
    fun reprovar(orcamento: Orcamento) {
        throw Exception("")
    }
    fun finalizar(orcamento: Orcamento) {
        throw Exception("")
    }
}
