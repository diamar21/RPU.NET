package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.MovimientoDinero;



import java.util.List;

public interface IMovimientoDineroService {
    public MovimientoDinero findById(long id);
    public List<MovimientoDinero> findByAll();
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);
    public MovimientoDinero updateMovimientoDinero(long id, MovimientoDinero movimientoDinero);
    public void deletemovimientoDinero(long id);


}
