package LocadoraVeiculos.Models;

import LocadoraVeiculos.Enums.CATEGORIA_CLIENTE;
import LocadoraVeiculos.Utils.Validacao;

public class Cliente extends Pessoa  {

    private CATEGORIA_CLIENTE categoriaCliente;

    private int Idade;

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public CATEGORIA_CLIENTE getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(CATEGORIA_CLIENTE categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    public Cliente(String cpf, String nome, CATEGORIA_CLIENTE categoriaCliente) throws Exception {
        
        if (Validacao.isNullOrEmpty(cpf)) throw new Exception("cpf é obrigatório");
        if (Validacao.isNullOrEmpty(nome)) throw new Exception("nome é obrigatório");

        super.setCpf(cpf);
        super.setNome(nome);
        this.categoriaCliente = categoriaCliente;
    }
   
}
