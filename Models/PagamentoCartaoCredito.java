package LocadoraVeiculos.Models;

import java.time.LocalDate;

import LocadoraVeiculos.Enums.SITUACAO_PAGAMENTO;

public class PagamentoCartaoCredito extends Pagamento {

    private String numeroCartao;
    private String cvv;
    

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

   
    public PagamentoCartaoCredito(String numeroCartao, String cvv) {
        super.setDataPagamento(LocalDate.now());
        super.setSituacaoPagamento(this.processar());
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
    }

    @Override
    public SITUACAO_PAGAMENTO processar() {
        // Realiza o proessamento junto a operadora do cartão.
        return SITUACAO_PAGAMENTO.REALIZADO;
    }
    
}
