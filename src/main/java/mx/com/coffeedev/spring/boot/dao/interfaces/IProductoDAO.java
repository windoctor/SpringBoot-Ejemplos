package mx.com.coffeedev.spring.boot.dao.interfaces;

import mx.com.coffeedev.spring.boot.dto.Producto;

/**
 * Created by ascariromopedraza on 07/12/15.
 */
public interface IProductoDAO {

    Producto findById(Integer id);

}
