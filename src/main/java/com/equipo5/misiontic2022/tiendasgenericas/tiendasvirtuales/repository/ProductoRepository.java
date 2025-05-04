package com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.model.Producto;


public interface ProductoRepository extends MongoRepository<Producto, String>{
	
	List<Producto> findByCodigoproducto(Long codigoproducto);
	
	List<Producto> findByNombreproducto(String nombreproducto);

}
