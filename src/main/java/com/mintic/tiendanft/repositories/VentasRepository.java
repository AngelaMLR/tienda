package com.mintic.tiendanft.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mintic.tiendanft.entities.Producto;
import com.mintic.tiendanft.entities.Ventas;

public interface VentasRepository extends CrudRepository<Ventas,Long>  {

}
