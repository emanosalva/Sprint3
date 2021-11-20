package co.unab.edu.apigym.repositories;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import co.unab.edu.apigym.models.UserModel;

@Repository
public interface UsuarioRepository extends MongoRepository<UserModel , String>{

    public abstract ArrayList<UserModel>findByNombre(String nombre);


    @Query("{fechaIngreso:'?0'}")
    ArrayList<UserModel>findByFechaIngreso(LocalDate fechaIngreso);
}
