package com.voltaire.prateleiravirtual.orcamento

import com.voltaire.prateleiravirtual.orcamento.situacao.EmAnalise
import com.voltaire.prateleiravirtual.orcamento.situacao.SituacaoOrcamento

data class Orcamento(
    var valor: Double,
    val qtdItens: Int,
    var situacao: SituacaoOrcamento = EmAnalise()
) {
    fun aplicarDescontoExtra() {
        val valorDescontoExtra = this.situacao.calcularDescontoExtra(this)
        this.valor = (this.valor - valorDescontoExtra)
    }

    fun trocarSituacaoPara (situacao: SituacaoOrcamento) {
        this.situacao = situacao
    }
}
