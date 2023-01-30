package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.*;
import LocadoraVeiculos.Models.*;

public class ContratoService {

    ContratoDao contratoDao = new ContratoDao();

    public List<Contrato> obterTodos() throws Exception {

        return (contratoDao.obterTodos());

    }

    public Contrato obterPeloNumeroContrato(String numeroContrato) throws Exception {

        return contratoDao.obterPeloNumeroContrato(numeroContrato);

    }

    public Contrato incluir(Contrato contrato) throws Exception {

        return contratoDao.incluir(contrato);

    }

    public void excluir(Contrato contrato) throws Exception {

        contratoDao.excluir(contrato);

    }


}
