package com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	List<Usuario> findByUsername(String username);
}
