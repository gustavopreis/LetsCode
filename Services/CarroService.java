package LocadoraVeiculos.Services;

import java.util.List;

import LocadoraVeiculos.Dao.*;
import LocadoraVeiculos.Enums.CATEGORIA_CARRO;
import LocadoraVeiculos.Models.*;

public class CarroService {

    CarroDao carroDao = new CarroDao();

    public List<Carro> obterTodos() throws Exception {

        return (carroDao.obterTodos());

    }

    public Carro obterPelaPlaca(String placa) throws Exception {

        if (placa.isEmpty())
            throw new Exception("Informe a placa");

        return carroDao.obterPelaPlaca(placa);

    }

    public List<Carro> obterPelaCategoria(CATEGORIA_CARRO categoria) throws Exception {

        return carroDao.obterPelaCategoria(categoria);

    }

    public Carro incluir(Carro carro) throws Exception {

        return carroDao.incluir(carro);

    }

    public void excluir(Carro carro) throws Exception {

        carroDao.excluir(carro);

    }

}
