package LocadoraVeiculos.Dao;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

public class Dao {


    @SuppressWarnings("unchecked")
    public <T> List<T> getDatabase() throws Exception {
        
            Type c = this.getClass();

            HashMap<Type, List<T>> databases = new HashMap<Type, List<T>>();
            databases.put(FuncionarioDao.class, (List<T>) Database.funcionarios);
            databases.put(ClienteDao.class, (List<T>) Database.clientes);
            databases.put(CarroDao.class, (List<T>) Database.carros);
            databases.put(MotoDao.class, (List<T>) Database.motos);
            databases.put(ContratoDao.class, (List<T>) Database.contratos);
            
            List<T> database = databases.get(c);

            if(database == null){
                throw new Exception("Não foi possível obter o database em " + this.getClass().getSimpleName());
            }
            else{
                return database;
            }

    }

    public <T> List<T> obterTodos() throws Exception {
        List<T> db = getDatabase();
        return (db);
    }

    public <T> T incluir(T object) throws Exception {
        List<T> db = getDatabase();
        db.add(object);
        return object;
    }

    public <T> boolean excluir(T object) throws Exception {
        List<T> db = getDatabase();
        return db.remove(object);
    }

    // Não é necessário implementar o método atualizar porque
    // ao alterar as propriedades dos objetos armazenados nas
    // listas, os valores já são persistidos na lista automaticamente.
    // public <T> boolean atualizar(T object) throws Exception{
    // }

}
