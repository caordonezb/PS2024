package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Segmento extends Model {

    @Id
    private Long id;

    private String numero;

    private Double longitud;

    private String direccion;

    // Constructor
    public Segmento() {}

    public Segmento(Long id, String numero, Double longitud, String direccion) {
        this.id = id;
        this.numero = numero;
        this.longitud = longitud;
        this.direccion = direccion;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static final Finder<Long, Segmento> find = new Finder<>(Segmento.class);
}
