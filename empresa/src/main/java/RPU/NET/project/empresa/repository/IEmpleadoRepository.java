package RPU.NET.project.empresa.repository;

import RPU.NET.project.empresa.entity.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import RPU.NET.project.empresa.entity.Empleado;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IEmpleadoRepository extends CrudRepository <Empleado, Long> {

    @Query(value ="Select * from empleado where id_Empresa =:id",nativeQuery = true)
    public List<Empleado> getEmpresaById(@Param("id") Long id);

}
