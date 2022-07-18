package com.voltaire.prateleiravirtual.imposto

import com.voltaire.prateleiravirtual.model.Orcamento

interface Imposto {
    fun calcular(orcamento: Orcamento) : Double
}
