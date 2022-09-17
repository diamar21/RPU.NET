package RPU.NET.Vista.repository;

import RPU.NET.Vista.entity.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMovimientodineroRepository extends CrudRepository <MovimientoDinero, Long> {
    @Query(value ="Select * from Movimiento where id_empleado =:id",nativeQuery = true)
    public List<MovimientoDinero> getEmpleadoById(@Param("id") Long id);
}
