package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.*;
import LocadoraVeiculos.Models.*;

public class PagamentoCartaoCreditoService {

    PagamentoCartaoCreditoDao pagamentoCartaoCreditoDao = new PagamentoCartaoCreditoDao();

    public List<PagamentoCartaoCredito> obterTodos() throws Exception {

        return (pagamentoCartaoCreditoDao.obterTodos());

    }

    public PagamentoCartaoCredito incluir(PagamentoCartaoCredito pagamentoCartaoCredito) throws Exception {

        return pagamentoCartaoCreditoDao.incluir(pagamentoCartaoCredito);

    }

    public void excluir(PagamentoCartaoCredito pagamentoCartaoCredito) throws Exception {

        pagamentoCartaoCreditoDao.excluir(pagamentoCartaoCredito);

    }


}
