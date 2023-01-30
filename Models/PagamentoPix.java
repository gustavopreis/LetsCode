package LocadoraVeiculos.Models;

import java.time.LocalDate;

import LocadoraVeiculos.Enums.SITUACAO_PAGAMENTO;

public class PagamentoPix extends Pagamento {
   
    public PagamentoPix() {
        super.setDataPagamento(LocalDate.now());
        super.setSituacaoPagamento(this.processar());
    }

    @Override
    public SITUACAO_PAGAMENTO processar() {
        // Realiza o proessamento junto a operadora do cartão.
        return SITUACAO_PAGAMENTO.REALIZADO;
    }
    
}
