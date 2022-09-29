package RPU.NET.projectWEB.empresathymeleaf.repository;

import RPU.NET.projectWEB.empresathymeleaf.entity.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMovimientodineroRepository extends CrudRepository <MovimientoDinero, Long> {
    @Query(value ="Select * from Movimiento where id_empleado =:id",nativeQuery = true)
    public List<MovimientoDinero> getEmpleadoById(@Param("id") Long id);
}
