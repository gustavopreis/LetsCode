package LocadoraVeiculos.Models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import LocadoraVeiculos.Dao.Database;

public class Contrato {

    private String numeroContrato;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private int quantidadeDiarias;
    private Veiculo veiculo;
    private double valorDiaria;
    private Pagamento pagamento;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
        this.pagamento.processar();
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getValorContrato() {
        return this.valorDiaria * this.quantidadeDiarias;
    }

    public Contrato(LocalDate dataInicio, LocalDate dataTermino, Veiculo veiculo) throws Exception {

        if(!veiculo.estaDisponivel){
            throw new Exception("O veículo não está disponível");
        }

        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.veiculo = veiculo;
        
        this.numeroContrato = gerarNumeroContrato();;
        this.valorDiaria = veiculo.getPrecoAluguel();
        this.quantidadeDiarias =  calcularQuantidadeDiarias(this.dataInicio, dataTermino);

    }

    public boolean encerrar() throws Exception{
        LocalDate hoje = LocalDate.now();
        if(!hoje.isEqual(this.dataTermino)){
            this.dataTermino = hoje;
            this.quantidadeDiarias = calcularQuantidadeDiarias(this.dataInicio, this.dataTermino);
        }
        return true;
    }

    private String gerarNumeroContrato(){
        String numeroContrato = "";
        List<Contrato> database = Database.contratos;
        int proxNumero = database.size()+1;
        numeroContrato = String.valueOf(proxNumero);
        do {
            numeroContrato = "0" + numeroContrato;
        } while (numeroContrato.length() <= 7);
        return numeroContrato;
    }

    private int calcularQuantidadeDiarias(LocalDate dataInicio, LocalDate dataTermino) throws Exception{
        int quantidadeDiarias = (int)ChronoUnit.DAYS.between(this.dataInicio, dataTermino);
        if(quantidadeDiarias <=0){
            throw new Exception("A data de término do contrato deve ser maior do que a data de início");
        }
        return quantidadeDiarias;
    }


}
