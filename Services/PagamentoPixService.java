package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.*;
import LocadoraVeiculos.Models.*;

public class PagamentoPixService {

    PagamentoPixDao pagamentoPixDao = new PagamentoPixDao();

    public List<PagamentoPix> obterTodos() throws Exception {

        return (pagamentoPixDao.obterTodos());

    }

    public PagamentoPix incluir(PagamentoPix pagamentoPix) throws Exception {

        return pagamentoPixDao.incluir(pagamentoPix);

    }

    public void excluir(PagamentoPix pagamentoPix) throws Exception {

        pagamentoPixDao.excluir(pagamentoPix);

    }


}
