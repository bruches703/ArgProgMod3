/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculasUtilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author bruch
 */
public class ComparatorsPeliculas {
    public static Comparator<Pelicula> ordenarPorTituloAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };    
    
    public static Comparator<Pelicula> ordenarPorMayorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            if(t1.getDuracion()<t.getDuracion()){
                return 1;
            } else if (t1.getDuracion()>t.getDuracion()){
                return -1;
            } else {
                return 0;
            }
        }
    };
    
    public static Comparator<Pelicula> ordenarPorMenorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            if(t1.getDuracion()>t.getDuracion()){
                return 1;
            } else if (t1.getDuracion()<t.getDuracion()){
                return -1;
            } else {
                return 0;
            }
        }
    };
}
