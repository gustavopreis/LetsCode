package LocadoraVeiculos.Seed;

import java.time.LocalDate;

import LocadoraVeiculos.Enums.CATEGORIA_CARRO;
import LocadoraVeiculos.Enums.CATEGORIA_CLIENTE;
import LocadoraVeiculos.Enums.CATEGORIA_MOTO;
import LocadoraVeiculos.Enums.OPCIONAL;
import LocadoraVeiculos.Models.Carro;
import LocadoraVeiculos.Models.Cliente;
import LocadoraVeiculos.Models.Contrato;
import LocadoraVeiculos.Models.Funcionario;
import LocadoraVeiculos.Models.Moto;
import LocadoraVeiculos.Models.PagamentoCartaoCredito;
import LocadoraVeiculos.Models.PagamentoPix;
import LocadoraVeiculos.Services.CarroService;
import LocadoraVeiculos.Services.ClienteService;
import LocadoraVeiculos.Services.ContratoService;
import LocadoraVeiculos.Services.FuncionarioService;
import LocadoraVeiculos.Services.MotoService;

public class Seed {

    private static ClienteService clienteService = new ClienteService();
    private static FuncionarioService funcionarioService = new FuncionarioService();
    private static CarroService carroService = new CarroService();
    private static MotoService motoService = new MotoService();
    private static ContratoService contratoService = new ContratoService();

    public static void funcionario() throws Exception {

        funcionarioService.incluir(new Funcionario("111.111.111-11", "Paula", "111"));
        funcionarioService.incluir(new Funcionario("222.222.222-22", "Maria", "222"));
        funcionarioService.incluir(new Funcionario("333.333.333-33", "Joana", "333"));

    }

    public static void cliente() throws Exception {

        clienteService.incluir(new Cliente("444.444.444-44", "Mario", CATEGORIA_CLIENTE.BRONZE));
        clienteService.incluir(new Cliente("555.555.555-55", "Paulo", CATEGORIA_CLIENTE.PRATA));
        clienteService.incluir(new Cliente("666.666.666-66", "Carlo", CATEGORIA_CLIENTE.PRATA));

    }

    public static void carro() throws Exception {

        carroService.incluir(new Carro("BRA 1A01", "BMW", "X6", true, 500, CATEGORIA_CARRO.LUXO, 5, 4));
        Carro a5 = carroService.incluir(new Carro("RIO 2E05", "AUDI", "A5", true, 700, CATEGORIA_CARRO.LUXO, 5, 4));
        Carro classeE = carroService.incluir(new Carro("BRA 2E05", "Mercedes-Benz", "Classe E", true, 800, CATEGORIA_CARRO.LUXO, 5, 4));
        carroService.incluir(new Carro("BRA 3B02", "Honda", "Civic", true, 250, CATEGORIA_CARRO.ESPORTIVO, 5, 4));
        carroService.incluir(new Carro("RIO 4D04", "Ferrari", "F40", true, 1500, CATEGORIA_CARRO.ESPORTIVO, 2, 2));
        carroService.incluir(new Carro("SPO 5C03", "VW", "Gol", true, 150, CATEGORIA_CARRO.POPULAR, 5, 4));
        carroService.incluir(new Carro("SPO 6C03", "Renault", "Sandero", true, 150, CATEGORIA_CARRO.POPULAR, 5, 4));

        a5.incluirOpcional(OPCIONAL.AR_CONDICIONADO);
        a5.incluirOpcional(OPCIONAL.DIRECAO_ELETRICA);
        classeE.incluirOpcional(OPCIONAL.AR_CONDICIONADO);
        classeE.incluirOpcional(OPCIONAL.DIRECAO_ELETRICA);
        classeE.incluirOpcional(OPCIONAL.FREIOS_ABS);

    }

    public static void moto() throws Exception {

        Moto harley = motoService.incluir(new Moto("MOT 0001", "Harley-Davidson", "Breakout 117", true, 300, 1500, CATEGORIA_MOTO.CUSTOM));
        motoService.incluir(new Moto("MOT 0002", "Yamaha", "MT03", true, 700, 200, CATEGORIA_MOTO.NAKED));

        harley.incluirOpcional(OPCIONAL.FREIOS_ABS);

    }

    public static void contrato() throws Exception {

        Contrato c1 = contratoService.incluir(new Contrato(
                LocalDate.of(2023, 1, 25),
                LocalDate.of(2023, 1, 30),
                carroService.obterPelaPlaca("BRA 2E05")));

                c1.setPagamento(new PagamentoCartaoCredito("1111-1111-1111-1111","1111"));

        Contrato c2 = contratoService.incluir(new Contrato(
                LocalDate.of(2023, 1, 25),
                LocalDate.of(2023, 2, 5),
                carroService.obterPelaPlaca("RIO 4D04")));

                c2.setPagamento(new PagamentoPix());

        contratoService.incluir(new Contrato(
                LocalDate.of(2023, 1, 25),
                LocalDate.of(2023, 02, 10),
                motoService.obterPelaPlaca("MOT 0001")));

    }

}
