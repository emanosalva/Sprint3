package co.unab.edu.apigym.services;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//mport ch.qos.logback.core.net.server.Client;
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
        usuario.setNombre( usuario.getNombre().toLowerCase());
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

    public ArrayList<UserModel> obtenerUsuarioPorApellido(String apellido){
        return usuarioRepository.findByApellido(apellido);

    }

    
    // public ArrayList<UserModel> usuarioPorRegistro(LocalDate fechaIngreso){
    //     return usuarioRepository.findByFechaIngreso(fechaIngreso);
    // }
    
}
