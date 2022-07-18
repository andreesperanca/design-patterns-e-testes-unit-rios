package com.voltaire.prateleiravirtual.desconto

import com.voltaire.prateleiravirtual.model.Orcamento

class DescontoParaComprasComMaisDeCincoItens (proximo: Desconto?)  : Desconto(proximo) {

    override fun efetuarCalculo(orcamento: Orcamento) : Double = orcamento.valor.times(0.05)
    override fun deveAplicar(orcamento: Orcamento): Boolean = orcamento.qtdItens > 5
}