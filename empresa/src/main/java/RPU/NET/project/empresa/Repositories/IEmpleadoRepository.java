package RPU.NET.project.empresa.Repositories;

import RPU.NET.project.empresa.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {
}
