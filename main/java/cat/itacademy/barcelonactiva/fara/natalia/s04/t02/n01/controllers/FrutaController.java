package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.domain.FrutaE;
import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.services.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/fruta") //le doy la ruta donde encontrar mis endpoints

public class FrutaController {
    @Autowired
    private FrutaService frutaService;

    //http://localhost:8000/fruta/add
    //POST/api/v1/frutos/add
    @PostMapping("/add")
    public FrutaE addFruta(@RequestBody FrutaE fruta) {

        return this.frutaService.addFruta(fruta);
    }

    //Http://localhost8080/fruta/getAll
    //GET/api/v1/frutas
    @GetMapping()
    public List<FrutaE> listFrutas() {

        return this.frutaService.listFrutas();
    }
    

    //Http://localhost:8080/fruta/getOne/{id}
    //GET/api/v1/frutas/{id}
    @GetMapping("/{id}")
    public FrutaE getFrutaById(@PathVariable("id") Long id) {
        return this.frutaService.getFrutaById(id);

    }

    //http://localhost:8080/fruta/update
    //PUT/api/v1/frutas/{id} completo update
    //PATCH/api/v1/frutas/{id} parcial update
    @PutMapping (path = "/{id}")
    public FrutaE updateFrutaById(@PathVariable("id") Long id, @RequestBody FrutaE fruta) {
        return this.frutaService.updateById(fruta, id);

    }

    //http://localhost:8080/fruta/delete/{id}
    //DELETE/api/v1/frutas/{id}
    @DeleteMapping("/{id}")
    public String deleteFruta(@PathVariable("id") Long id) {
        boolean ok = this.frutaService.deleteFruta(id);
        if(ok) {
            return "Fruta: " + id + " se ha eliminado";

        }else {
            return "Error";
        }


    }

}
