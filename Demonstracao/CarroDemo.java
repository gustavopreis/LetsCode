package LocadoraVeiculos.Demonstracao;

import java.util.List;

import LocadoraVeiculos.Enums.CATEGORIA_CARRO;
import LocadoraVeiculos.Models.Carro;
import LocadoraVeiculos.Services.CarroService;
import LocadoraVeiculos.Utils.Console;

public class CarroDemo {

    public static CarroService carroService = new CarroService();

    public static void ObterTodos() throws Exception {
        Console.mostrarTitulo("Carro - Obter todos");
        Console.mostrar(carroService.obterTodos());
        Console.pause();
    }

    public static void obterPelaPlaca(String placa) throws Exception {
        Console.mostrarTitulo("Carro - Obter por placa e mostrar");
        Carro carro = carroService.obterPelaPlaca(placa);
        Console.mostrar(carro);
        Console.pause();
    }

    public static void obterPelaCategoria(CATEGORIA_CARRO categoria) throws Exception {
        Console.mostrarTitulo("Carro - Obter por categoria");
        List<Carro> carro = carroService.obterPelaCategoria(categoria);
        Console.mostrar(carro);
        Console.pause();
    }

    public static void Atualizar(String placa, double precoAluguel) throws Exception {
        Console.mostrarTitulo("Carro - Atualizar e mostrar depois de atualizar.");
        Carro carro = carroService.obterPelaPlaca(placa);
        carro.setPrecoAluguel(precoAluguel);
        Console.mostrar(carro);
        Console.pause();
    }

    public static void Excluir(String placa) throws Exception {
        Console.mostrarTitulo("Carro - Excluir por placa e mostrar lista completa");
        Carro carro = carroService.obterPelaPlaca(placa);
        carroService.excluir(carro);
        Console.mostrar(carroService.obterTodos());
        Console.pause();
    }

}
