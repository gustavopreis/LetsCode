package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.ClienteDao;
import LocadoraVeiculos.Models.Cliente;




public class ClienteService {

    ClienteDao clienteDao = new ClienteDao();

    public List<Cliente> obterTodos() throws Exception {

        return (clienteDao.obterTodos());

    }

    public Cliente obterPeloCpf(String cpf) throws Exception {

        if (cpf.isEmpty())
            throw new Exception("Informe o cpf");

        return clienteDao.obterPeloCpf(cpf);

    }

    public Cliente incluir(Cliente cliente) throws Exception {

        return clienteDao.incluir(cliente);

    }

    public void excluir(Cliente cliente) throws Exception {

        clienteDao.excluir(cliente);

    }

}
