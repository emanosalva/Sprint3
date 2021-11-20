package co.unab.edu.apigym.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class GymModel {
    @Id
    private String codigo;
    private Long nit;
    private String nombre;
    private String direccion;
    private String contacto;
    private MaquinasModel maquinas;
    private List<HorarioModel> horario;

    public GymModel() {
    }

    public GymModel(String codigo, Long nit, String nombre, String direccion, String contacto, MaquinasModel maquinas,
            List<HorarioModel> horario) {
        this.codigo = codigo;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.maquinas = maquinas;
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public MaquinasModel getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(MaquinasModel maquinas) {
        this.maquinas = maquinas;
    }

    public List<HorarioModel> getHorario() {
        return horario;
    }

    public void setHorario(List<HorarioModel> horario) {
        this.horario = horario;
    }

    
    
}
