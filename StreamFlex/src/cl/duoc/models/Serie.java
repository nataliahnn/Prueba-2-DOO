/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Serie extends Catalogo{
    private int id;
    private int numeroTemporada;
    private boolean finalizada; 
    private String nombreSerie;

    public Serie() {
    }

    public Serie(int id, int numeroTemporada, boolean finalizada, String nombreSerie) {
        this.id = id;
        this.numeroTemporada = numeroTemporada;
        this.finalizada = finalizada;
        this.nombreSerie = nombreSerie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    @Override
    public String toString() {
        return "Serie{" + "id=" + id + ", numeroTemporada=" + numeroTemporada + ", finalizada=" + finalizada + ", nombreSerie=" + nombreSerie + '}';
    }
    
    
    

  
}
