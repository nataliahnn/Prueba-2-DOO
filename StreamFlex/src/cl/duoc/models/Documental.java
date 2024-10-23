/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Catalogo{
    private int id;
    private String nombre, enfoqueEducativo;
    private int duracionDocu;

    public Documental() {
    }

    public Documental(int id, String nombre, String enfoqueEducativo, int duracionDocu) {
        this.id = id;
        this.nombre = nombre;
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionDocu = duracionDocu;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnfoqueEducativo() {
        return enfoqueEducativo;
    }

    public void setEnfoqueEducativo(String enfoqueEducativo) {
        this.enfoqueEducativo = enfoqueEducativo;
    }

    public float getDuracionDocu() {
        return duracionDocu;
    }

    public void setDuracionDocu(int duracionDocu) {
        this.duracionDocu = duracionDocu;
    }

    @Override
    public String toString() {
        return "Documental{" + "id=" + id + ", nombre=" + nombre + ", enfoqueEducativo=" + enfoqueEducativo + ", duracionDocu=" + duracionDocu + '}';
    }

    

    
   
   
    
    
}
