package com.example.RespawnDevs.Entidades;

import java.util.List;

public class PlatoSugerido {
    private Long id;
    private String nombre;
    private String descripcion;
    private String instrucciones;
    private Double precio;
    private String urlImagen;
    private List<String> ingredientes;
    private List<String> alergenos;

    public PlatoSugerido() {}

    public PlatoSugerido(Long id, String nombre, String descripcion, String instrucciones,
                         Double precio, String urlImagen, List<String> ingredientes,
                         List<String> alergenos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.precio = precio;
        this.urlImagen = urlImagen;
        this.ingredientes = ingredientes;
        this.alergenos = alergenos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getInstrucciones() { return instrucciones; }
    public void setInstrucciones(String instrucciones) { this.instrucciones = instrucciones; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public String getUrlImagen() { return urlImagen; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen; }
    public List<String> getIngredientes() { return ingredientes; }
    public void setIngredientes(List<String> ingredientes) { this.ingredientes = ingredientes; }
    public List<String> getAlergenos() { return alergenos; }
    public void setAlergenos(List<String> alergenos) { this.alergenos = alergenos; }
}
