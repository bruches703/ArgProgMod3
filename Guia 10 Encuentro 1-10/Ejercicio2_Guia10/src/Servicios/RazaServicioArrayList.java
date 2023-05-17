/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class RazaServicioArrayList {
    private ArrayList<String> listaRaza;
    private Scanner leer;

    
    public RazaServicioArrayList() {
        this.listaRaza = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void AgregarRaza(){
        System.out.println("Ingrese raza nueva: ");
        String nombre = leer.next();
        
        listaRaza.add(nombre);
    }
    
    public void MostrarRazas(){
        System.out.println("\n\n\n\n\n");
        for (String string : listaRaza) {
            System.out.println(string);
            
        }
    }
    
    public void QuitarRaza(String razaAQuitar){
        Iterator<String> it = listaRaza.iterator();
        boolean flag=true;
        while(it.hasNext()){
            if(razaAQuitar.equals(it.next())){
                it.remove();
                flag=false;
            }
        }
        if(flag){
            System.out.println("No se encontro la raza");
        }

    }
    
}
