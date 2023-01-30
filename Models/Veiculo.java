package LocadoraVeiculos.Models;

import java.util.ArrayList;
import java.util.List;

import LocadoraVeiculos.Enums.OPCIONAL;

public abstract class Veiculo {
    String placa;
    String marca;
    String modelo;
    double precoAluguel;
    boolean estaDisponivel;
    List<OPCIONAL> opcionais = new ArrayList<>();

    public List<OPCIONAL> getOpcionais(){
        return this.opcionais;
    }
    
    public void incluirOpcional(OPCIONAL opcional) throws Exception {
        if(!this.opcionais.contains(opcional)){
            this.opcionais.add(opcional);
        }else{
            throw new Exception(opcional.getDescricao() + " já existe nesse veículo");
        }
    }
    
    public void removerOpcional(OPCIONAL opcional) throws Exception {
        if(this.opcionais.contains(opcional)){
            this.opcionais.remove(opcional);
        }else{
            throw new Exception(opcional.getDescricao() + " não existe nesse veículo");
        }
    }
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecoAluguel() {
        return precoAluguel;
    }
    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }
    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }
    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }

    public abstract <T> T getCategoria();
    
    
}
