package com.Practica1.practica.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "arbol")
public class Arbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_arbol") 
    private Long id;

    @Column(name = "Ruta_imagent")
    private String rutaImagen;

    @Column(name = "nombre_comun")
    private String nombreComun;

    @Column(name = "tipo_flor")
    private String tipoFlor;

    @Column(name = "dureza")
    private int dureza;

    @Column(name = "descripcion")
    private String descripcion;

    public Arbol() {
    }

    public Arbol(Long id, String rutaImagen, String nombreComun, String tipoFlor, int dureza, String descripcion) {
        this.id = id;
        this.rutaImagen = rutaImagen;
        this.nombreComun = nombreComun;
        this.tipoFlor = tipoFlor;
        this.dureza = dureza;
        this.descripcion = descripcion;
    }

    public Arbol(String rutaImagen, String nombreComun, String tipoFlor, int dureza, String descripcion) {
        this.rutaImagen = rutaImagen;
        this.nombreComun = nombreComun;
        this.tipoFlor = tipoFlor;
        this.dureza = dureza;
        this.descripcion = descripcion;
    }

    public Long getIdArbol() {
        return id;
    }

    public void setIdArbol(Long id) {
        this.id = id;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "id=" + id +
                ", rutaImagen='" + rutaImagen + '\'' +
                ", nombreComun='" + nombreComun + '\'' +
                ", tipoFlor='" + tipoFlor + '\'' +
                ", dureza=" + dureza +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
