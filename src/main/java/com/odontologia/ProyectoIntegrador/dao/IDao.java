package com.odontologia.ProyectoIntegrador.dao;

import java.util.List;

public interface IDao<T> {

    T guardar(T t);

    List<T> listarTodos();

    void eliminar(int id);

    T buscarPorId(int id);

    //es un metodo generico, para reutilizar
    T buscarPorCriterio(String criterio);

    T  actualizar(T t);

}
