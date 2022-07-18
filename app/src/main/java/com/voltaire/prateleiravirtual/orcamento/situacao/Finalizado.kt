package com.voltaire.prateleiravirtual.orcamento.situacao

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class Finalizado: SituacaoOrcamento {

    override fun calcularDescontoExtra(orcamento: Orcamento) : Double = orcamento.valor.times(0.05)
}