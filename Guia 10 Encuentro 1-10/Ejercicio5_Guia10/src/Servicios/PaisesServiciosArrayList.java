/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author bruch
 */
public class PaisesServiciosArrayList {
    public TreeSet<Pais> paises= new TreeSet();
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Iterator<Pais> it = paises.iterator();
    
    public Pais CrearPais(){
        System.out.println("Ingrese nuevo pais");
        String nombre = leer.next();
        return new Pais(nombre);
    }
    
    public void CrearListaPaises(){   
        do{
            paises.add(CrearPais());
            System.out.println("Desea agregar otro?\n1-Si\n2-No");
        }while(leer.nextInt()==1);
          
    }
    
    public void MostrarPaises(){
        paises.forEach((pais) -> {
            System.out.println(pais.getNombre());
        });
    }
}
