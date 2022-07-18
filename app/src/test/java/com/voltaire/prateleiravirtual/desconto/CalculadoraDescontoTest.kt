package com.voltaire.prateleiravirtual.desconto

import com.voltaire.prateleiravirtual.model.Orcamento
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class CalculadoraDescontoTest {

    private val calculadoraDesconto = CalculadoraDesconto()

    @Test
    fun testeDescontoParaComprasComMaisDeCincoItens() {
        val orcamentoComMaisDeCincoItens = Orcamento(valor = 100, qtdItens = 6)
        val descontoCalculado = calculadoraDesconto.calcular(orcamentoComMaisDeCincoItens)
        assertEquals(5.0, descontoCalculado)
    }

    @Test
    fun testeDescontoParaComprasComValoresAcimadeQuinhentosReais() {
        val orcamentoComValorAcimaDeQuinhentosReais = Orcamento(valor = 501, qtdItens = 1)
        val orcamentoCalculado = calculadoraDesconto.calcular(orcamentoComValorAcimaDeQuinhentosReais)
        assertEquals(50.1, orcamentoCalculado)
    }

    @Test
    fun testeDePrioridadeDeDescontoParaComprasComValorAcimaDeQuinhentosReais(){
        val orcamentoComValoresAcimaDeQuinhentosReaisEComMaisDeCincoItens = Orcamento(valor = 501, qtdItens = 5)
        val orcamentoCalculado = calculadoraDesconto.calcular(
            orcamentoComValoresAcimaDeQuinhentosReaisEComMaisDeCincoItens)
        assertEquals(50.1, orcamentoCalculado)
    }

    @Test
    fun testeSemDesconto() {
        val orcamentoSemRequisitosParaDescontos = Orcamento(valor = 100, qtdItens = 4)
        val descontoCalculado = calculadoraDesconto.calcular(orcamentoSemRequisitosParaDescontos)
        assertEquals(0.0, descontoCalculado)
    }

}