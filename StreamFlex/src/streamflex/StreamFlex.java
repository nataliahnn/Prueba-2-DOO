/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;

import cl.duoc.models.Catalogo;
import cl.duoc.models.Documental;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Serie;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        List <Catalogo> catalogo =new ArrayList<>();
        
        int opcion=0;
        while (opcion!=3){
            System.out.println("******MENU******");
            System.out.println("[1]Agregar al catalogo");
            System.out.println("[2]Listar contenido");
            System.out.println("[3]Calcular costo total");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("[1]Agregar pelicula");
                    System.out.println("[2]Agregar serie");
                    System.out.println("[3]Agregar documental");
                    opcion=entrada.nextInt();
                while (opcion!=4){
                    switch(opcion){
                        case 1:{
                            Pelicula nuevoPelicula= new Pelicula();
                            System.out.println("Agregar nombre pelicula ");
                            nuevoPelicula.setNombre(entrada.next());
                            
                            System.out.println("id pelicula");
                            nuevoPelicula.setId(entrada.nextInt());
                            
                            System.out.println("Agregar Calificacion");
                            nuevoPelicula.setCalificacion(entrada.nextInt());
                            
                            System.out.println("Agregar duración pelicula");
                            nuevoPelicula.setDuracion(entrada.nextFloat());
                            
                            catalogo.add(nuevoPelicula);
                            break;
                    }
                        case 2: {
                            Serie nuevaSerie = new Serie();
                            System.out.println("Agregar Nombre serie ");
                            nuevaSerie.setNombreSerie(entrada.next());
                            
                            System.out.println("Id Serie");
                            nuevaSerie.setId(entrada.nextInt());
                            
                            System.out.println("Numero de temporadas");
                            nuevaSerie.setNumeroTemporada(entrada.nextInt());
                            
                            System.out.println("Estado de emision");
                            nuevaSerie.setFinalizada(entrada.nextBoolean());
                            catalogo.add(nuevaSerie);
                            break;
                    }
                        case 3 :{
                            Documental nuevoDocumental = new Documental();
                            System.out.println("Agregar Nombre Documental");
                            nuevoDocumental.setNombre(entrada.next());
                            
                            System.out.println("Id Documental");
                            nuevoDocumental.setId(entrada.nextInt());
                            
                            System.out.println("Enfoque Educativo");
                            nuevoDocumental.setEnfoqueEducativo(entrada.next());
                            
                            System.out.println("Duracion documemtal");
                            nuevoDocumental.setDuracionDocu(entrada.nextInt());
                            catalogo.add(nuevoDocumental);
                            break;
                            
                            
                            
                            
                    }
                            
                            
                    }
                
                    
                }
                case 2:
                    System.out.println("Listado de contenido");
                    if (catalogo.isEmpty()){
                        System.out.println("No hay contenido en el catalogo");
                    }else{
                        for (Catalogo i: catalogo){
                            System.out.println("");
                            
                        }
                    }
                
            }
            
        }
    }
    
}
