package com.mintic.tiendanft.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mintic.tiendanft.entities.Producto;
import com.mintic.tiendanft.entities.Usuarios;
import com.mintic.tiendanft.repositories.custom.UsuarioRepositoryCustom;

public interface UsuariosRepository extends CrudRepository<Usuarios,Long>,UsuarioRepositoryCustom {
	
	

}
