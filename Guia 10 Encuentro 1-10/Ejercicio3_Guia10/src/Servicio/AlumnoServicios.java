/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class AlumnoServicios {
    public ArrayList<Alumno> Alumnos= new ArrayList();
    public Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public Iterator<Alumno> it= Alumnos.iterator();
    public Alumno CrearAlumno(){
        
        ArrayList<Integer> notas = new ArrayList();
        
        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        
        for (int i = 0; i < 3 ; i++) {
           System.out.println("Ingrese la "+(i+1)+"° nota:");
           notas.add((Integer)leer.nextInt());
        }
        
        return new Alumno(nombre, notas);
    }
    
    public void CrearListaAlumnos(){
        int continuar;
        do{
            Alumnos.add(CrearAlumno());
            System.out.println("Continuar?");
            continuar= leer.nextInt();
        }while(continuar==1);
    }
    
    public void MostarAlumnos(){
        for (Alumno aux : Alumnos) {
            System.out.println("Nombre: "+ aux.getNombre());
            System.out.println("Notas: "+ aux.getNotas().toString());
        }
    }
    
    public double notaFinal(String nombre){
        double notaF=-1;
        for (int i = 0; i < Alumnos.size(); i++) {
            if(Alumnos.get(i).getNombre().equals(nombre)){
                notaF=CalcularNotaFinal(Alumnos.get(i).getNotas());
            }
        }
        return notaF;
    }
    
    public double CalcularNotaFinal(ArrayList notas){
        int suma=0;
        for (Object nota : notas) {
            suma= suma + (int)nota;
        }
        return suma/notas.size();
    }
}
