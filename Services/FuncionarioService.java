package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.*;
import LocadoraVeiculos.Models.*;

public class FuncionarioService {

    FuncionarioDao funcionarioDao = new FuncionarioDao();

    public Funcionario obterPeloCpf(String cpf) throws Exception {

        if (cpf.isEmpty())
            throw new Exception("Informe o cpf");

        return funcionarioDao.obterPeloCpf(cpf);

    }


    public List<Funcionario> obterTodos() throws Exception {

        return funcionarioDao.obterTodos();

    }

    public Funcionario incluir(Funcionario funcionario) throws Exception {

        return funcionarioDao.incluir(funcionario);

    }

    public void excluir(Funcionario funcionario) throws Exception {

        funcionarioDao.excluir(funcionario);

    }

}
