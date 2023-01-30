package LocadoraVeiculos.Dao;

import java.util.Optional;

import LocadoraVeiculos.Models.*;

public class FuncionarioDao extends Dao {

    public Funcionario obterPeloCpf(String cpf) {
        Optional<Funcionario> funcionario = Database.funcionarios.stream()
                .filter(p -> p.getCpf().equalsIgnoreCase(cpf))
                .findFirst();

        if(funcionario.isEmpty())
            return null;
        else
            return funcionario.get();
    }

}
