package LocadoraVeiculos.Dao;

import java.util.ArrayList;
import java.util.List;
import LocadoraVeiculos.Models.*;

public class Database {
    public static List<Funcionario> funcionarios = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Carro> carros = new ArrayList<>();
    public static List<Moto> motos = new ArrayList<>();
    public static List<Contrato> contratos = new ArrayList<>();
    public static List<PagamentoCartaoCredito> pagamentosCartaoCredito = new ArrayList<>();
    public static List<PagamentoPix> pagamentosPix = new ArrayList<>();
}
