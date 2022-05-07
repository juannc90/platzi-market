package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> { //El segundo parámetro es el tipo de la clave primaria de producto
    //Método que recupera toda la lista de productos que pertenecen a una categoría en específico//QueryMethod
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) //Manera nativa de hacerlo
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
