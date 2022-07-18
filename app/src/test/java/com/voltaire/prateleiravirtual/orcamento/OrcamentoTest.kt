package com.voltaire.prateleiravirtual.orcamento


import com.voltaire.prateleiravirtual.orcamento.Orcamento
import com.voltaire.prateleiravirtual.orcamento.situacao.Finalizado
import com.voltaire.prateleiravirtual.orcamento.situacao.Reprovado
import junit.framework.Assert.assertEquals
import org.junit.Test

internal class OrcamentoTest {

    @Test
    fun testaCalculoDeDescontoExtraParaOrcamentosEmAnalise() {
        val orcamento = Orcamento(100.0, 5)
        val calcularDescontoExtra = orcamento.situacao.calcularDescontoExtra(orcamento)
        assertEquals(0.0, calcularDescontoExtra)
    }

    @Test
    fun testaCalculoDeDescontoExtraParaOrcamentosReprovados() {
        val orcamento = Orcamento(100.0,5, Reprovado())
        val calcularDescontoExtra = orcamento.situacao.calcularDescontoExtra(orcamento)
        assertEquals(0.0, calcularDescontoExtra)
    }

    @Test
    fun testaCalculoDeDescontoExtraParaOrcamentosFinalidos() {
        val orcamento = Orcamento(100.0,5, Finalizado())
        val calcularDescontoExtra = orcamento.situacao.calcularDescontoExtra(orcamento)
        assertEquals(5.0, calcularDescontoExtra)
    }

    @Test
    fun testaValorDoOrcamentoFinalFinalizado() {
        val orcamento = Orcamento(100.0,5, Finalizado())
        orcamento.aplicarDescontoExtra()
        assertEquals(95.0, orcamento.valor)
    }

}