package RPU.NET.project.empresa.repository;

import org.springframework.data.repository.CrudRepository;
import RPU.NET.project.empresa.entity.Empleado;
import org.springframework.stereotype.Repository;


public interface IEmpleadoRepository extends CrudRepository <Empleado, Long> {

}
