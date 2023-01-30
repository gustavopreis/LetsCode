package LocadoraVeiculos.Enums;

public enum CATEGORIA_CLIENTE {
    BRONZE("Bronze"),
    PRATA("Prata"),
    OURO("Ouro");

    private String descricao;
    
    CATEGORIA_CLIENTE(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
