/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class RazaServicioArrayList {
    private ArrayList<Raza> listaRaza;
    private Scanner leer;
    
    public RazaServicioArrayList() {
        this.listaRaza = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void AgregarRaza(){
        System.out.println("Ingrese raza nueva: ");
        String nombre = leer.next();
        listaRaza.add(new Raza(nombre));
    }
    
    public void MostrarRazas(){
        for (Raza raza : listaRaza) {
            System.out.println(raza.getNombre());
        }
    }
}
