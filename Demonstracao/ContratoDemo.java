package LocadoraVeiculos.Demonstracao;

import LocadoraVeiculos.Models.Contrato;
import LocadoraVeiculos.Services.ContratoService;
import LocadoraVeiculos.Utils.Console;

public class ContratoDemo {

    public static ContratoService contratoService = new ContratoService();

    public static void ObterTodos() throws Exception {
        Console.mostrarTitulo("Contrato - Obter todos");
        Console.mostrar(contratoService.obterTodos());
        Console.pause();
    }

    public static void obterPeloNumeroContrato(String numeroContrato) throws Exception {
        Console.mostrarTitulo("Contrato - Obter por numero do contrato e mostrar");
        Contrato contrato = contratoService.obterPeloNumeroContrato(numeroContrato);
        Console.mostrar(contrato);
        Console.pause();
    }

    public static void EncerrarContrato(String numeroContrato) throws Exception {
        Console.mostrarTitulo("Contrato - Encerrar contrato e mostrar");
        Contrato contrato = contratoService.obterPeloNumeroContrato(numeroContrato);
        contrato.encerrar();
        Console.mostrar(contrato);
        Console.pause();
    }

    public static void Excluir(String numeroContrato) throws Exception {
        Console.mostrarTitulo("Contrato - Excluir por número do contrato e mostrar lista completa");
        Contrato contrato = contratoService.obterPeloNumeroContrato(numeroContrato);
        contratoService.excluir(contrato);
        Console.mostrar(contratoService.obterTodos());
        Console.pause();
    }

}
