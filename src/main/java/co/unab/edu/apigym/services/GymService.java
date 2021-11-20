package co.unab.edu.apigym.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.edu.apigym.models.GymModel;
import co.unab.edu.apigym.repositories.GymRepository;

@Service
public class GymService {
    @Autowired
    GymRepository gymRepository;

    //metodo para listar
    public ArrayList<GymModel> obtenerGyms(){
        return (ArrayList<GymModel>) gymRepository.findAll();
    }
    //metodo guardar gym
    public GymModel guardarGym(GymModel gymnasio) {
        return gymRepository.save(gymnasio);
    }

    public boolean eliminarGym(String codigo){

         if(gymRepository.existsById(codigo)){
             gymRepository.deleteById(codigo);
             return true;
         }else{
             return false;
         }
    }

    public Optional<GymModel> obtenerGymPorId(String codigo){
        return gymRepository.findById(codigo);
    }

    public ArrayList <GymModel> obtenerGymPorNombre(String nombre){
        return gymRepository.findByNombre(nombre);
    }

}
