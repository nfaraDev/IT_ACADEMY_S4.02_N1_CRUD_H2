package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.repository;

import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.domain.FrutaE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository//indica el framework a Spring que es un repositorio asi Spring almacena
public interface IFrutaRepository extends JpaRepository<FrutaE, Long> {
    //esta interfaz se extiende de otra interfaz JpaRep.la que aplicara sus metodos CRUD a la base de datos Fruta en y
    // en que tipo de dato Long


}
