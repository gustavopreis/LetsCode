package LocadoraVeiculos.Enums;

public enum SITUACAO_PAGAMENTO{
    PENDENTE("Pedente"),
    REALIZADO("Realizado");

    private String descricao;
    
    SITUACAO_PAGAMENTO(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
