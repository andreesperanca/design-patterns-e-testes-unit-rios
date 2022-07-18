package com.voltaire.prateleiravirtual.desconto

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class DescontoParaValoresAcimaDeQuinhentosReais(proximo: Desconto?) : Desconto(proximo) {

    override fun efetuarCalculo(orcamento: Orcamento): Double = orcamento.valor.times(0.1)


    override fun deveAplicar(orcamento: Orcamento): Boolean = orcamento.valor > 500

}