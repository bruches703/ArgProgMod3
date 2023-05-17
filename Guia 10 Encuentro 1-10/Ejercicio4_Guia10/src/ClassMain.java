
import Servicios.ServicioPeliculaArrayList;

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
public class ClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPeliculaArrayList pelServ = new ServicioPeliculaArrayList();
        int opc;
        
        pelServ.CrearListaPeliculas();
        do{
            opc=menu();
            ejecutarOpcion(pelServ, opc);
        }while(opc != 0);
        
    }
    
    public static int menu(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Opc 1- Mostrar por pantalla");
        System.out.println("Opc 2- Mostrar peliculas con mas de 1 hora");
        System.out.println("Opc 3- Ordenar por mayor duracion y motrarlo");
        System.out.println("Opc 4- Ordenar por menor duracion y motrarlo");
        System.out.println("Opc 5- Ordenar por titulo y motrarlo");
        System.out.println("Opc 6- Ordenar por director y motrarlo");
        System.out.println("Opc 0- salir");
        return leer.nextInt();
    }
    
    public static void ejecutarOpcion(ServicioPeliculaArrayList pelServ, int opc){
        switch(opc){
            case 1:
                pelServ.MostarEnPantallaTodasLasPeliculas();
                break;
            case 2:
                pelServ.MostarPeliculasDeUnaHoraOMas();
                break;
            case 3:
                pelServ.OrdenarPorMayorDuracion();
                break;
            case 4:
                pelServ.OrdenarPorMenorDuracion();
                break;
            case 5:
                pelServ.OrdenarPorTituloAlf();
                break;
            case 6:
                pelServ.OrdenarPorDirectorAlf();
                break;
            case 0:
                System.out.println("Finalizo el programa");
                break;
            default:
                System.out.println("Opcion incorrecta, reingrese");
        }
    }
}
