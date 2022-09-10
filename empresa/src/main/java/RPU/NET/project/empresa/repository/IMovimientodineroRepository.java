package RPU.NET.project.empresa.repository;

import RPU.NET.project.empresa.entity.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMovimientodineroRepository extends CrudRepository <MovimientoDinero, Long> {
 @Query(value ="Select * from Empresa where id_Empresa =:id",nativeQuery = true)
    public List<Empresa> getEmpresasById(@Param("id") long id);
}
