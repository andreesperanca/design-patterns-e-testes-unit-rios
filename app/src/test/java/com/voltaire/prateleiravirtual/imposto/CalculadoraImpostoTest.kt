package com.voltaire.prateleiravirtual.imposto

import com.voltaire.prateleiravirtual.orcamento.Orcamento
import junit.framework.Assert.assertEquals
import org.junit.Test

internal class CalculadoraImpostoTest {

    private val calculadora = CalculadoraImposto()
    private val orcamento: Orcamento = Orcamento(valor = 10.0, qtdItens = 5)

    @Test
    fun calcularImpostoPessoaFisica() {
        val pessoaFisicaImposto = PessoaFisica()
        assertEquals(1.0, calculadora.calcular(orcamento = this.orcamento, imposto = pessoaFisicaImposto))
    }

    @Test
    fun calcularImpostoPessoaJuridica() {
        val orcamento = Orcamento(valor = 10.0, qtdItens = 5)
        val pessoaJuridica = PessoaJuridica()
        assertEquals(2.0, calculadora.calcular(this.orcamento, imposto = pessoaJuridica))
    }
}