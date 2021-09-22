package com.mintic.tiendanft.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.mintic.tiendanft.dto.Usuario;
import com.mintic.tiendanft.entities.Usuarios;
import com.mintic.tiendanft.repositories.custom.UsuarioRepositoryCustom;

public class UsuariosRepositoryImpl implements UsuarioRepositoryCustom {

	@Override
	public Boolean validate(Usuarios usuarios) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadCurso");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Usuario> consultar = em.createNamedQuery("Usuarios.validate", Usuario.class);
		consultar.setParameter("usuario", "usuario");
		consultar.setParameter("password", "password");
		Usuario usuario = consultar.getSingleResult();
		if (usuario != null)
			return true;
		else
			return false;
	}

}
