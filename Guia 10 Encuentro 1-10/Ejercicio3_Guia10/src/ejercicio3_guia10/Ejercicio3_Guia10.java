/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia10;

import Servicio.AlumnoServicios;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class Ejercicio3_Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoServicios alSer= new AlumnoServicios();
        alSer.CrearListaAlumnos();
        alSer.MostarAlumnos();
        mostrarNotaFinalDeAlumno(alSer);
    }
    public static void mostrarNotaFinalDeAlumno( AlumnoServicios alSer){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre del alumno: ");
        String nombre = leer.nextLine();
        double notaFinal= alSer.notaFinal(nombre);
        if(notaFinal==-1){
            System.out.println("No se encontro al alumno "+ nombre);
        } else {
            System.out.println("La nota final de "+nombre+" es:"+notaFinal);
        }
    }
}
