package  com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

	List<Cliente> findByCedulacliente(Long cedulacliente);
	List<Cliente> findByNombrecliente(String nombrecliente);
	List<Cliente> findByEmailcliente(String emailcliente);
	
	
	void deleteByCedulacliente(Long cedulacliente);
	void deleteByNombrecliente(String nombrecliente);
	void deleteByEmailcliente(String emailcliente);



}

