package com.voltaire.prateleiravirtual.orcamento.situacao

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class Reprovado: SituacaoOrcamento {

    override fun calcularDescontoExtra(orcamento: Orcamento) : Double = 0.0

    override fun finalizar(orcamento: Orcamento) {
        orcamento.trocarSituacaoPara(Finalizado())
    }
}