package LocadoraVeiculos.Dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import LocadoraVeiculos.Enums.ICATEGORIA_VEICULO;
import LocadoraVeiculos.Models.Veiculo;

public abstract class VeiculoDao extends Dao {

    public <T extends Veiculo> T obterPelaPlaca(String placa) throws Exception {

        List<Veiculo> database = super.getDatabase();

        @SuppressWarnings("unchecked")
        Optional<T> veiculo = (Optional<T>)(database.stream()
                .filter(o -> o.getPlaca().equalsIgnoreCase(placa))
                .findFirst());

        if(veiculo.isEmpty())
            return null;
        else
            return veiculo.get();
    }

    public <T extends Veiculo, C extends ICATEGORIA_VEICULO> List<T> obterPelaCategoria(C categoriaVeiculo) throws Exception{
        
        List<T> database = super.getDatabase();

        List<T> veiculos = database.stream()
                .filter(  o -> o.getCategoria() == categoriaVeiculo)
                .collect(Collectors.toList());

        if(veiculos.isEmpty())
            return null;
        else
            return veiculos;
    }       
}
