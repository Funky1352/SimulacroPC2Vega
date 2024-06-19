package com.cibertec.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.cibertec.entity.Producto;

public interface ProductoService {

    //Para el CRUD
    public abstract List<Producto> listarProductos();
    public abstract Producto insertaActualizaProducto(Producto obj);
    public abstract void eliminaProducto(int id);
    public abstract Optional<Producto> obtienePorId(int id);

    
}
