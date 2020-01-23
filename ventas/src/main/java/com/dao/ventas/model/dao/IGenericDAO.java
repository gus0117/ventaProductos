package com.dao.ventas.model.dao;

import java.util.List;

public interface IGenericDAO <T, ID>{
	void agregar(T object);
	void actualizar(T object);
	void borrar(T object);
	List<T> listar(Class<T> type);
}
