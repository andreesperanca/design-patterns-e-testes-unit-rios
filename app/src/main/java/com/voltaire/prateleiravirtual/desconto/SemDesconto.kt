package com.voltaire.prateleiravirtual.desconto

import com.voltaire.prateleiravirtual.model.Orcamento

class SemDesconto : Desconto(null) {

    override fun efetuarCalculo(orcamento: Orcamento): Double = 0.0
    override fun deveAplicar(orcamento: Orcamento): Boolean = true
}