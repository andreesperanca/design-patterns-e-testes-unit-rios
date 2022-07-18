package com.voltaire.prateleiravirtual.desconto

import com.voltaire.prateleiravirtual.orcamento.Orcamento

abstract class Desconto (private val proximo: Desconto?) {

    fun calcular (orcamento: Orcamento): Double {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento)
        }
        return proximo?.calcular(orcamento)!!
    }

    abstract fun efetuarCalculo(orcamento: Orcamento): Double
    abstract fun deveAplicar(orcamento: Orcamento): Boolean
}