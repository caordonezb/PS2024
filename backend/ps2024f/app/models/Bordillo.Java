package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bordillo extends Model {

    @Id
    private Long id;

    @JsonProperty("segmento_id")
    private Long segmentoId;

    private String tipo;

    private Double longitud;

    // Constructor
    public Bordillo() {}

    public Bordillo(Long id, Long segmentoId, String tipo, Double longitud) {
        this.id = id;
        this.segmentoId = segmentoId;
        this.tipo = tipo;
        this.longitud = longitud;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSegmentoId() {
        return segmentoId;
    }

    public void setSegmentoId(Long segmentoId) {
        this.segmentoId = segmentoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public static final Finder<Long, Bordillo> find = new Finder<>(Bordillo.class);
}
