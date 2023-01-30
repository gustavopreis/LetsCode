package LocadoraVeiculos.Models;

import LocadoraVeiculos.Enums.CATEGORIA_CARRO;
import LocadoraVeiculos.Utils.Validacao;

public class Carro extends Veiculo {
    private int numeroPassageiros;
    private int numeroPortas;
    CATEGORIA_CARRO categoria;

    public int getNumeroPassageiros() {
        return this.numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroPortas() {
        return this.numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CATEGORIA_CARRO getCategoria() {
        return categoria;
    }

    public void setCategoria(CATEGORIA_CARRO categoria) {
        this.categoria = categoria;
    }
    

    public Carro(String placa, String marca, String modelo, boolean estaDisponivel, double precoAluguel, 
                CATEGORIA_CARRO categoria, int numeroPassageiros, int numeroPortas) throws Exception{

        if (Validacao.isNullOrEmpty(placa)) throw new Exception("placa é obrigatório");
        if (Validacao.isNullOrEmpty(marca)) throw new Exception("marca é obrigatório");
        if (Validacao.isNullOrEmpty(modelo)) throw new Exception("modelo é obrigatório");
        if (precoAluguel < 0) throw new Exception("precoAluguel deve ser maior ou igual a zero");
        if (numeroPassageiros <= 0) throw new Exception("numeropassageiros deve ser maior que zero");
        if (numeroPortas <= 0) throw new Exception("numeroPortas deve ser maior que zero");

        super.setPlaca(placa);
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setEstaDisponivel(estaDisponivel);
        super.setPrecoAluguel(precoAluguel);
        
        this.setNumeroPassageiros(numeroPassageiros);
        this.setNumeroPortas(numeroPortas);
        this.setCategoria(categoria);
    }
}
