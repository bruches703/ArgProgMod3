
import Servicios.RazaServicioArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruch
 */
public class Ejercicio2_Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RazaServicioArrayList razaServ = new RazaServicioArrayList();
        crearListaDeRazas(razaServ);
        sacarUnaRazaPorNombre(razaServ);
        razaServ.MostrarRazas();
    }
    
    public static void crearListaDeRazas(RazaServicioArrayList razaServ){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int continuar;
        do{
            razaServ.AgregarRaza();
            System.out.println("Continuar?: ");
            continuar= leer.nextInt(); 
            System.out.println("\n\n\n");
        }while(continuar==1);
    }
    
    public static void sacarUnaRazaPorNombre(RazaServicioArrayList razaServ){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese raza a quitar: ");
        razaServ.QuitarRaza(leer.nextLine());
        
    }
}
