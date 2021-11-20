package co.unab.edu.apigym.models;

public class HorarioModel {
    private String dias;
    private String hora;
    
    public HorarioModel() {
    }

    public HorarioModel(String dias, String hora) {
        this.dias = dias;
        this.hora = hora;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
}
