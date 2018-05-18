/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appInventario.business.impl;

import com.example.appInventario.business.IProductoBusiness;
import com.example.appInventario.dao.IProductoDao;
import com.example.appInventario.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sala305
 */
@Service
public class ProductoBusinessImpl implements IProductoBusiness {

    @Autowired
    private IProductoDao productoDao;

    @Override
    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
    }

}
