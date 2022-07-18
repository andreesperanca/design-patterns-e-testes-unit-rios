package com.voltaire.prateleiravirtual.imposto

import com.voltaire.prateleiravirtual.model.Orcamento

class CalculadoraImposto {

    fun calcular (orcamento : Orcamento, imposto : Imposto) : Double {
        return imposto.calcular(orcamento)
    }
}
