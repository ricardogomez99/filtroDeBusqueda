package filtro.busqueda.demo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 60)
    private String nombre;

    @Column(nullable = false,length = 60)
    private String marca;

    @Column(nullable = false,length = 60)
    private String hechoEn;

    @Column(nullable = false)
    private float precio;

    public Producto() {
    }

    public Producto(Long id, String nombre, String marca, String hechoEn, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.hechoEn = hechoEn;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHechoEn() {
        return hechoEn;
    }

    public void setHechoEn(String hechoEn) {
        this.hechoEn = hechoEn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", hechoEn=" + hechoEn + ", precio="
                + precio + "]";
    }
    
}