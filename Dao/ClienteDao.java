package LocadoraVeiculos.Dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import LocadoraVeiculos.Enums.CATEGORIA_CLIENTE;
import LocadoraVeiculos.Models.*;

public class ClienteDao extends Dao{

    public Cliente obterPeloCpf(String cpf) {
        Optional<Cliente> cliente = Database.clientes.stream()
                .filter(p -> p.getCpf().equalsIgnoreCase(cpf))
                .findFirst();

        if(cliente.isEmpty())
            return null;
        else
            return cliente.get();
    }

    public List<Cliente> obterPelaCategoria(CATEGORIA_CLIENTE categoriaCliente) {
        List<Cliente> clientes = Database.clientes.stream()
                .filter(p -> p.getCategoriaCliente() == categoriaCliente)
                .collect(Collectors.toList())
                ;

        if(clientes.isEmpty())
            return null;
        else
            return clientes;
    }    

}
