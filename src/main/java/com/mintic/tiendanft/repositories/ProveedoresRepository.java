package com.mintic.tiendanft.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mintic.tiendanft.entities.Producto;
import com.mintic.tiendanft.entities.Proveedores;

public interface ProveedoresRepository extends CrudRepository<Proveedores,Long>  {

}
