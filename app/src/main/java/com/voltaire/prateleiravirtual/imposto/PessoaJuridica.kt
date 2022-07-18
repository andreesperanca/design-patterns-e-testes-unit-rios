package com.voltaire.prateleiravirtual.imposto

import com.voltaire.prateleiravirtual.orcamento.Orcamento

class PessoaJuridica: Imposto {
    override fun calcular(orcamento: Orcamento) : Double {
        return orcamento.valor * 0.2
    }
}