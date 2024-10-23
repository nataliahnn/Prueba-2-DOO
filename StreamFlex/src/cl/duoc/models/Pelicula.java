/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Catalogo {
    private int id;
    private int calificacion;
    private float duracion;
    private String nombre;

    public Pelicula() {
    }

    public Pelicula(int id, int calificacion, float duracion, String nombre) {
        this.id = id;
        this.calificacion = calificacion;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", calificacion=" + calificacion + ", duracion=" + duracion + ", nombre=" + nombre + '}';
    }

    
  
    
    
    
    
    
}
