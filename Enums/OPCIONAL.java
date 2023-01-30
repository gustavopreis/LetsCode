package LocadoraVeiculos.Enums;

public enum OPCIONAL {
    AR_CONDICIONADO("Ar-condicionado"),
    DIRECAO_ELETRICA("Direção elétrica"),
    FREIOS_ABS("Freios ABS");

    private String descricao;
    
    OPCIONAL(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
