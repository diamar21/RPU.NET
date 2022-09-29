package RPU.NET.projectWEB.empresathymeleaf.repository;

import RPU.NET.projectWEB.empresathymeleaf.entity.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IEmpleadoRepository extends CrudRepository <Empleado, Long> {

    @Query(value ="Select * from empleado where id_Empresa =:id",nativeQuery = true)
    public List<Empleado> getEmpresaById(@Param("id") Long id);

}
