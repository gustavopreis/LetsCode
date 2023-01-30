package LocadoraVeiculos.Models;

import LocadoraVeiculos.Enums.CATEGORIA_MOTO;

public class Moto extends Veiculo {
    private int cilindradas;
    private CATEGORIA_MOTO categoria;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CATEGORIA_MOTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CATEGORIA_MOTO categoria) {
        this.categoria = categoria;
    }

    public Moto(String placa, String marca, String modelo, boolean estaDisponivel, double precoAluguel,
            int cilindradas, CATEGORIA_MOTO categoria) {

        super.setPlaca(placa);
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setEstaDisponivel(estaDisponivel);
        super.setPrecoAluguel(precoAluguel);

        this.cilindradas = cilindradas;
        this.categoria = categoria;
    }

}
