package LocadoraVeiculos.Dao;

import java.util.Optional;

import LocadoraVeiculos.Models.Contrato;

public class ContratoDao extends Dao{
 
    public Contrato obterPeloNumeroContrato(String numeroContrato) {
        Optional<Contrato> contrato = Database.contratos.stream()
                .filter(p -> p.getNumeroContrato().equalsIgnoreCase(numeroContrato))
                .findFirst();

        if(contrato.isEmpty())
            return null;
        else
            return contrato.get();
    }

}
