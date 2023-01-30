package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.*;
import LocadoraVeiculos.Enums.CATEGORIA_CARRO;
import LocadoraVeiculos.Models.*;

public class MotoService {

    MotoDao motoDao = new MotoDao();

    public List<Moto> obterTodos() throws Exception {

        return (motoDao.obterTodos());

    }

    public Moto obterPelaPlaca(String placa) throws Exception {

        if (placa.isEmpty())
            throw new Exception("Informe a placa");

        return motoDao.obterPelaPlaca(placa);

    }

    public List<Moto> obterPelaCategoria(CATEGORIA_CARRO categoria) throws Exception {

        return motoDao.obterPelaCategoria(categoria);

    }

    public Moto incluir(Moto moto) throws Exception {

        return motoDao.incluir(moto);

    }

    public void excluir(Moto moto) throws Exception {

        motoDao.excluir(moto);

    }

}
