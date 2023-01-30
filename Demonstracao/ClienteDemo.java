package LocadoraVeiculos.Demonstracao;

import LocadoraVeiculos.Models.Cliente;
import LocadoraVeiculos.Services.ClienteService;
import LocadoraVeiculos.Utils.Console;

public class ClienteDemo {

    public static ClienteService clienteService = new ClienteService();

    public static void ObterTodos() throws Exception {
        Console.mostrarTitulo("Listar todos os clientes");
        Console.mostrar(clienteService.obterTodos());
        Console.pause();
    }

    public static void ObterPeloCpf(String cpf) throws Exception {
        Console.mostrarTitulo("Obter cliente por cpf e mostrar");
        Cliente cliente = clienteService.obterPeloCpf(cpf);
        Console.mostrar(cliente);
        Console.pause();
    }

    public static void Atualizar(String cpf, String nome) throws Exception {
        Console.mostrarTitulo("Atualizar cliente e mostrar depois de atualizar.");
        Cliente cliente = clienteService.obterPeloCpf(cpf);
        cliente.setNome(nome);
        Console.mostrar(cliente);
        Console.pause();
    }

    public static void Excluir(String cpf) throws Exception {
        Console.mostrarTitulo("Excluir cliente e mostrar lista completa");
        Cliente cliente = clienteService.obterPeloCpf(cpf);
        clienteService.excluir(cliente);
        Console.mostrar(clienteService.obterTodos());
        Console.pause();
    }

}
