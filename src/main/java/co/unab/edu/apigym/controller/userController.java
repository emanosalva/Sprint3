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

import co.unab.edu.apigym.models.UserModel;
import co.unab.edu.apigym.services.UsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/usuario")

public class userController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UserModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UserModel guardarUsuario(@RequestBody UserModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUserPorId(@PathVariable("id") String id){
        boolean resultadoEliminar=this.usuarioService.eliminarUsuario(id);
        if(resultadoEliminar){
            return "Se elimino el usuario con el id: "+id;
        }else{
            return "No se pudo eliminar el usuario con el Id: "+id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> obternerUsuarioPorId(@PathVariable("id") String id){
        return this.usuarioService.obternerUsuarioPorId(id);
    }
    
    @GetMapping("/unombre")
    public ArrayList<UserModel> userPorNombre(@RequestParam ("nombre") String nombre){
        return this.usuarioService.obtenerUsuarioPorNombre(nombre);
    }

}
