package LocadoraVeiculos.Models;

import java.time.LocalDate;

import LocadoraVeiculos.Enums.SITUACAO_PAGAMENTO;

public abstract class Pagamento {

    private LocalDate dataPagamento;
    private double valor;    
    private SITUACAO_PAGAMENTO situacaoPagamento;

    public SITUACAO_PAGAMENTO getSituacaoPagamento() {
        return situacaoPagamento;
    }
    public void setSituacaoPagamento(SITUACAO_PAGAMENTO situacaoPagamento) {
        this.situacaoPagamento = situacaoPagamento;
    }


    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public double getValorPago() {
        return valor;
    }
    public void setValorPago(double valor) {
        this.valor = valor;
    }

    public abstract SITUACAO_PAGAMENTO processar();
    
}
