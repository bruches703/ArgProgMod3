/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import PeliculasUtilidades.ComparatorsPeliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class ServicioPeliculaArrayList {
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Iterator<Pelicula> it= listaPeliculas.iterator();
    
    /**
     * Agregar una pelicula con el valor de cada atributo a la array list
     */
    public void AgregarPelicula(){
        System.out.println("Ingrese titulo de la pelicula");
        String titulo = leer.next();
        
        System.out.println("Ingrese nombre del director: ");
        String director = leer.next();
        
        System.out.println("Ingrese duracion de la pelicula");
        double duracion = leer.nextDouble();
        
        listaPeliculas.add( new Pelicula(titulo, director,duracion));
    }
    
    public void CrearListaPeliculas(){
        int continuar;
        do{
            AgregarPelicula();
            System.out.println("Desea continuar? \n1-si \n2-no");
            continuar=validacionEntero(leer.nextInt(), "Error, reingrese opcion: ");            
        }while(continuar==1);
    }
    
    public int validacionEntero(int continuar, String mensaje){
        while(continuar!=1 && continuar!=2){
            System.out.println(mensaje);
            continuar=leer.nextInt();
        }
        return continuar;
    }
    
    public void MostarEnPantallaTodasLasPeliculas(){
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
    }
        
    public void MostarPeliculasDeUnaHoraOMas(){
        listaPeliculas.forEach((pelicula) -> {
            if(pelicula.getDuracion()>1){
                System.out.println(pelicula.toString());
            }
        });
    }
    
    public void OrdenarPorMayorDuracion(){
        Collections.sort(listaPeliculas, ComparatorsPeliculas.ordenarPorMayorDuracion);
        MostarEnPantallaTodasLasPeliculas();
    }
    
    public void OrdenarPorMenorDuracion(){
        Collections.sort(listaPeliculas, ComparatorsPeliculas.ordenarPorMenorDuracion);
        MostarEnPantallaTodasLasPeliculas();
    }
    
    public void OrdenarPorDirectorAlf(){
        Collections.sort(listaPeliculas,ComparatorsPeliculas.ordenarPorDirector);
        MostarEnPantallaTodasLasPeliculas();
    }
    
    public void OrdenarPorTituloAlf(){
        Collections.sort(listaPeliculas, ComparatorsPeliculas.ordenarPorTituloAlf);
        MostarEnPantallaTodasLasPeliculas();
    }
    
    //Ordenado por metodo del burbugeo
    //
//    public void OrdenarPorMayorDuracion(){
//        Pelicula aux;
//        for (int i = 0; i < listaPeliculas.size()-1; i++) {
//            for (int j = 1; j < listaPeliculas.size(); j++) {
//                if(listaPeliculas.get(j).getDuracion()> listaPeliculas.get(i).getDuracion()){
//                    aux=listaPeliculas.get(i);
//                    listaPeliculas.set(i, listaPeliculas.get(j));
//                    listaPeliculas.set(j,aux);
//                }
//            }
//        }
//        MostarEnPantallaTodasLasPeliculas();
//    }
//    
    //Ordenado por metodo del burbugeo
    //
//    public void OrdenarPorMenorDuracion(){
//        Pelicula aux;
//        for (int i = 0; i < listaPeliculas.size()-1; i++) {
//            for (int j = 1; j < listaPeliculas.size(); j++) {
//                if(listaPeliculas.get(j).getDuracion()< listaPeliculas.get(i).getDuracion()){
//                    aux=listaPeliculas.get(i);
//                    listaPeliculas.set(i, listaPeliculas.get(j));
//                    listaPeliculas.set(j,aux);
//                }
//            }
//        }
//        MostarEnPantallaTodasLasPeliculas();
//    }
    
    //Ordenado por metodo del burbugeo
    //
//    public void OrdenarPorDirectorAlf(){
//        Pelicula aux;
//        for (int i = 0; i < listaPeliculas.size()-1; i++) {
//            for (int j = 1; j < listaPeliculas.size(); j++) {
//                if(listaPeliculas.get(i).getDirector().compareTo(listaPeliculas.get(j).getDirector())>=0){
//                    aux=listaPeliculas.get(i);
//                    listaPeliculas.set(i, listaPeliculas.get(j));
//                    listaPeliculas.set(j,aux);
//                }
//            }
//        }
//        
//        MostarEnPantallaTodasLasPeliculas();
//    }

    //Ordenado por metodo del burbugeo
    //
//    public void OrdenarPorTituloAlf(){
//        Pelicula aux;
//        for (int i = 0; i < listaPeliculas.size()-1; i++) {
//            for (int j = 1; j < listaPeliculas.size(); j++) {
//                if(listaPeliculas.get(i).getTitulo().compareTo(listaPeliculas.get(j).getTitulo())>=0){
//                    aux=listaPeliculas.get(i);
//                    listaPeliculas.set(i, listaPeliculas.get(j));
//                    listaPeliculas.set(j,aux);
//                }
//            }
//        }
//        MostarEnPantallaTodasLasPeliculas();
//    }

}
