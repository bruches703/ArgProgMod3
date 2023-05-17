/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia10;

import Servicios.RazaServicioArrayList;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class Ejercicio1_Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RazaServicioArrayList razaServ = new RazaServicioArrayList();
        crearListaDeRazas(razaServ);
        razaServ.MostrarRazas();
    }
    
    public static void crearListaDeRazas(RazaServicioArrayList razaServ){
        Scanner leer = new Scanner(System.in);
        int continuar;
        do{
            razaServ.AgregarRaza();
            System.out.println("Continuar?: ");
            continuar= leer.nextInt(); 
        }while(continuar==1);
    }
    
}
