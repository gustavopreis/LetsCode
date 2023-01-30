package LocadoraVeiculos.Enums;

public enum CATEGORIA_MOTO implements ICATEGORIA_VEICULO{
    CUSTOM("Custom"),
    ESPORTIVA("Esportiva"),
    NAKED("Naked");

    private String descricao;
    
    CATEGORIA_MOTO(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
