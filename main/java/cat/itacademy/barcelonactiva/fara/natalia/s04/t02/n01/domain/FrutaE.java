package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

@Entity
@Table(name = "frutas") //le decimos como se llamara la base de datos
@Getter
@Setter
public class FrutaE {
    //esta clase se va a mapear a la base de datos
    @Id //clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera el valor automatico
    private Long id;
    @Column(name="nombre", nullable = false, length = 100)
    private static String nombre;
    @Column(name="kilos", length = 20)
    private static Long pesoKg;

    public Long getNombre() {
        return null;
    }
    public Long getPesoKg() {
        return null;
    }
}
