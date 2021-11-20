package co.unab.edu.apigym.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.unab.edu.apigym.models.GymModel;
import co.unab.edu.apigym.services.GymService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/gym")
public class gymController {
    @Autowired
    GymService gymService;

    @GetMapping()
    public ArrayList<GymModel> obtenerGyms(){
        return gymService.obtenerGyms();
    }
    
    @PostMapping()
    public GymModel guardarGym(@RequestBody GymModel gymnasio){
        return gymService.guardarGym(gymnasio);
    }

    @DeleteMapping(path = "/{codigo}")
    public String eliminarGymPorId(@PathVariable("codigo") String codigo){
        boolean resultadoGymEliminar=this.gymService.eliminarGym(codigo);
        if(resultadoGymEliminar){
            return "se ha eliminado el Gymnasio con el codigo: "+codigo;
        }else{
            return"no se pudo eliminar el Gymnasio con el codigo: " +codigo;
        }
    }

    @GetMapping(path="/{codigo}")
    public Optional <GymModel> ObtenerGymPorId(@PathVariable("codigo") String codigo){
        return this.gymService.obtenerGymPorId(codigo);
    }
    @GetMapping("/gnombre")
    public ArrayList<GymModel> gymPorNombre(@RequestParam("nombre") String nombre){
        return this.gymService.obtenerGymPorNombre(nombre);
    }
}
