package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;



import java.util.List;

public interface IMovimientoDineroService {
    public MovimientoDinero findById(long id);
    public List<MovimientoDinero> getEmpleadoById(long id);

    public List<MovimientoDinero> findByAll();
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);
    public MovimientoDinero updateMovimientoDinero(MovimientoDinero movimientoDinero);
    public void deletemovimientoDinero(long id);
    public List<List<MovimientoDinero>> findByIdmovimiento(long id);


}

