package com.voltaire.prateleiravirtual.orcamento.situacao

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class EmAnalise: SituacaoOrcamento {

    override fun calcularDescontoExtra(orcamento: Orcamento): Double = 0.0

    override fun aprovar(orcamento: Orcamento) {
        orcamento.trocarSituacaoPara(Aprovado())
    }

    override fun reprovar(orcamento: Orcamento) {
        orcamento.trocarSituacaoPara(Reprovado())
    }
}