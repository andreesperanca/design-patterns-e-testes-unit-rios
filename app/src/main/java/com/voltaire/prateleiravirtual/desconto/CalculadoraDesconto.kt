package com.voltaire.prateleiravirtual.desconto

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class CalculadoraDesconto {

    fun calcular (orcamento: Orcamento) : Double {
        val desconto =
            DescontoParaValoresAcimaDeQuinhentosReais(
            proximo = DescontoParaComprasComMaisDeCincoItens(
                proximo = SemDesconto()))
        return desconto.calcular(orcamento)
    }

}