package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productos")
public class Productos extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String nombre;
    public Double precio;
    public String descripcion;
    public Date fecha_creacion;
    public Boolean disponible;

    public Productos() {
    }

    public Productos(Integer id, String nombre, Double precio, String descripcion, Date fecha_creacion, Boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.disponible = disponible;
    }

    public static Finder<Integer, Productos> find = new Finder<>(Productos.class);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
