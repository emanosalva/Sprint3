package co.unab.edu.apigym.models;

import org.springframework.data.annotation.Id;

public class MaquinasModel {
    @Id
    private String numMaquina;
    private String tipo;
    private String nombreMaquina;
    private Integer cantidad;
    private boolean estadoMaquina;

    public MaquinasModel() {
    }

    public MaquinasModel(String numMaquina, String tipo, String nombreMaquina, Integer cantidad,
            boolean estadoMaquina) {
        this.numMaquina = numMaquina;
        this.tipo = tipo;
        this.nombreMaquina = nombreMaquina;
        this.cantidad = cantidad;
        this.estadoMaquina = estadoMaquina;
    }

    public String getNumMaquina() {
        return numMaquina;
    }

    public void setNumMaquina(String numMaquina) {
        this.numMaquina = numMaquina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreMaquina() {
        return nombreMaquina;
    }

    public void setNombreMaquina(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(boolean estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    

    /*AEROBICOS
    bicicletas verticales y reclinadas, cintas de correr, 
    cintas andadoras, elípticas, escaleras y steppers y remos.
    
    Musculación
    Máquinas de Placas, Máquinas de Palanca,
    Máquinas Multifunción, Racks y Multipowers, Bancos, 
    Estaciones multifuncionales y Jaulas*/

    //semana 3 v4 1:31
    
}