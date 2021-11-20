package co.unab.edu.apigym.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.unab.edu.apigym.models.GymModel;

@Repository
public interface GymRepository extends MongoRepository<GymModel, String>{

    public abstract ArrayList<GymModel>findByNombre(String nombre);
    
}
