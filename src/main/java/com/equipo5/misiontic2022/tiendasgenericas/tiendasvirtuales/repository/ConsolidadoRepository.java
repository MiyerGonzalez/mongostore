package com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.model.Consolidado;

public interface ConsolidadoRepository  extends MongoRepository<Consolidado, String>{
	
	List<Consolidado> findByCiudad(String ciudad);
}
