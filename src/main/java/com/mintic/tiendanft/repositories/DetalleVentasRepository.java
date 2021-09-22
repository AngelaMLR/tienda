package com.mintic.tiendanft.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mintic.tiendanft.entities.DetalleVentas;
import com.mintic.tiendanft.entities.Producto;

public interface DetalleVentasRepository extends CrudRepository<DetalleVentas,Long> {

}
