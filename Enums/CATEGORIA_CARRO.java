package LocadoraVeiculos.Enums;

public enum CATEGORIA_CARRO implements ICATEGORIA_VEICULO{
    POPULAR("Popular"),
    LUXO("Luxo"),
    ESPORTIVO("Esportivo"),
    UTILITARIO("Utilitário");

    private String descricao;
    
    CATEGORIA_CARRO(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
