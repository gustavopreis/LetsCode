package LocadoraVeiculos.Models;

import LocadoraVeiculos.Utils.Validacao;

public class Funcionario extends Pessoa {

    private String matricula;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String cpf, String nome, String matricula) throws Exception{
        if (Validacao.isNullOrEmpty(cpf)) throw new Exception("cpf é obrigatório");
        if (Validacao.isNullOrEmpty(nome)) throw new Exception("nome é obrigatório");
        if (Validacao.isNullOrEmpty(matricula)) throw new Exception("matricula é obrigatório");

        super.setCpf(cpf);
        super.setNome(nome);
        this.setMatricula(matricula);
    }


}
