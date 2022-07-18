package com.voltaire.prateleiravirtual.orcamento.situacao

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class Aprovado: SituacaoOrcamento {

    override fun calcularDescontoExtra(orcamento: Orcamento) : Double = orcamento.valor.times(0.1)

    override fun finalizar(orcamento: Orcamento) {
        orcamento.trocarSituacaoPara(Finalizado())
    }
}