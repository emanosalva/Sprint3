package co.unab.edu.apigym.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unab.edu.apigym.models.UserModel;
import co.unab.edu.apigym.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //crear metodo para listar los usuarios
    public ArrayList<UserModel> obtenerUsuarios(){
        return (ArrayList<UserModel>) usuarioRepository.findAll();
    }

    public UserModel guardarUsuario(UserModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(String id){
        
       if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return true;
       }else{
           return false;
       }    
    }

    public Optional<UserModel> obternerUsuarioPorId(String id){
        return usuarioRepository.findById(id);
    }

    public ArrayList <UserModel> obtenerUsuarioPorNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }

    public ArrayList<UserModel> usuarioPorRegistro(LocalDate fechaIngreso){
        return usuarioRepository.findByFechaIngreso(fechaIngreso);
    }
    
}
