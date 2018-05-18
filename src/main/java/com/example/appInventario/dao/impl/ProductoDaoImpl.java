/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appInventario.dao.impl;

import com.example.appInventario.dao.IProductoDao;
import com.example.appInventario.data.ProductoData;
import com.example.appInventario.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sala305
 */
@Repository
public class ProductoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }

}
