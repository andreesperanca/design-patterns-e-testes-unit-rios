package com.voltaire.prateleiravirtual.imposto

import com.voltaire.prateleiravirtual.model.Orcamento

class PessoaFisica: Imposto {
    override fun calcular(orcamento: Orcamento) : Double {
        return orcamento.valor * 0.1
    }
}