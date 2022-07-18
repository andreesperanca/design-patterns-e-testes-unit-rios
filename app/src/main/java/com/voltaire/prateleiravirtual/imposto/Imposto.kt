package com.voltaire.prateleiravirtual.imposto

import com.voltaire.prateleiravirtual.orcamento.Orcamento

interface Imposto {
    fun calcular(orcamento: Orcamento) : Double
}
