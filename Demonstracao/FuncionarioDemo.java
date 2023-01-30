package LocadoraVeiculos.Demonstracao;

import LocadoraVeiculos.Models.Funcionario;
import LocadoraVeiculos.Services.FuncionarioService;
import LocadoraVeiculos.Utils.Console;

public class FuncionarioDemo {

    public static FuncionarioService funcionarioService = new FuncionarioService();

    public static void ObterTodos() throws Exception {
        Console.mostrarTitulo("Listar todos os funcionarios");
        Console.mostrar(funcionarioService.obterTodos());
        Console.pause();
    }

    public static void ObterPeloCpf(String cpf) throws Exception {
        Console.mostrarTitulo("Obter Funcionário pelo CPF e mostrar");
        Funcionario funcionario = funcionarioService.obterPeloCpf(cpf);
        Console.mostrar(funcionario);
        Console.pause();
    }

    public static void Atualizar(String cpf, String nome) throws Exception {
        Console.mostrarTitulo("Atualizar funcionária e mostrar depois de atualizar.");
        Funcionario funcionario = funcionarioService.obterPeloCpf(cpf);
        funcionario.setNome(nome);
        Console.mostrar(funcionario);
        Console.pause();
    }

    public static void Excluir(String cpf) throws Exception {
        Console.mostrarTitulo("Excluir funcionária e mostrar lista completa");
        Funcionario funcionario = funcionarioService.obterPeloCpf(cpf);
        funcionarioService.excluir(funcionario);
        Console.mostrar(funcionarioService.obterTodos());
        Console.pause();
    }

}
