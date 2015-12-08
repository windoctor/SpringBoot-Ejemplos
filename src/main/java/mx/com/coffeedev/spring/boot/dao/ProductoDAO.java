package mx.com.coffeedev.spring.boot.dao;

import mx.com.coffeedev.spring.boot.dao.interfaces.IProductoDAO;
import mx.com.coffeedev.spring.boot.dto.Producto;
import org.springframework.stereotype.Component;

/**
 * Created by ascariromopedraza on 07/12/15.
 */
@Component
public class ProductoDAO implements IProductoDAO{

    @Override
    public Producto findById(Integer id) {
        return new Producto(id, "MacBook Pro 15\"", 19500d);
    }
}
