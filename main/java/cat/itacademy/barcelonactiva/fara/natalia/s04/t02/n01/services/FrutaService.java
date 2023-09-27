package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.services;

import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.domain.FrutaE;
import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n01.repository.IFrutaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter

public class FrutaService {
    @Autowired//esta dependencia de frutaRepository la usara en toda la clase
    private IFrutaRepository frutaRepository;

    //add
    public FrutaE addFruta(FrutaE fruta) {

        return frutaRepository.save(fruta);
    }
    //ID
    public FrutaE getFrutaById(Long id) {
        Optional<FrutaE> optionalFruta = frutaRepository.findById(id);
        return optionalFruta.get();

    }

    //List
    public List<FrutaE> listFrutas(){
        return frutaRepository.findAll();

    }


    //UPDATE
    public FrutaE updateById(FrutaE request, Long id) {
        Optional<FrutaE> optionalFruta = frutaRepository.findById(id);
        if(optionalFruta.isPresent()) {
            FrutaE fruta = optionalFruta.get();
            fruta.setId(request.getNombre());
            fruta.setId(request.getPesoKg());
            //Guarda los cambios en la bd
            return frutaRepository.save(fruta);
        }else {
            throw new FrutaNotFoundException("Fruta: " + id + " no existe");
        }

    }

    //Delete
    public boolean deleteFruta(Long id){
        try {
            frutaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }


    }

}

