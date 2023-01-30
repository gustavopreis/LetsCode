package LocadoraVeiculos;

import java.util.Scanner;

import LocadoraVeiculos.Demonstracao.CarroDemo;
import LocadoraVeiculos.Demonstracao.ClienteDemo;
import LocadoraVeiculos.Demonstracao.ContratoDemo;
import LocadoraVeiculos.Demonstracao.FuncionarioDemo;
import LocadoraVeiculos.Enums.CATEGORIA_CARRO;
import LocadoraVeiculos.Models.Pagamento;
import LocadoraVeiculos.Models.PagamentoCartaoCredito;
import LocadoraVeiculos.Seed.Seed;
import LocadoraVeiculos.Services.ContratoService;
import LocadoraVeiculos.Utils.*;

public class Main {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Console.limpar();

        try {

            Seed.funcionario();
            Seed.cliente();
            Seed.carro();
            Seed.moto();
            Seed.contrato();

            FuncionarioDemo.ObterTodos();
            FuncionarioDemo.ObterPeloCpf("222.222.222-22");
            FuncionarioDemo.Atualizar("222.222.222-22", "Maria Clara");
            FuncionarioDemo.Excluir("222.222.222-22");

            ClienteDemo.ObterTodos();
            ClienteDemo.ObterPeloCpf("666.666.666-66");
            ClienteDemo.Atualizar("666.666.666-66", "Carlo Lopes");
            ClienteDemo.Excluir("666.666.666-66");

            CarroDemo.ObterTodos();
            CarroDemo.obterPelaPlaca("BRA 1A01");
            CarroDemo.Atualizar("BRA 1A01", 600);
            CarroDemo.Excluir("BRA 1A01");
            CarroDemo.obterPelaCategoria(CATEGORIA_CARRO.ESPORTIVO);

            ContratoDemo.ObterTodos();
            ContratoDemo.obterPeloNumeroContrato("00000001");
            ContratoDemo.EncerrarContrato("00000001");

            

        } catch (Exception e) {
            Mensagem.Mostrar(e.getMessage());
        }

    }

}
