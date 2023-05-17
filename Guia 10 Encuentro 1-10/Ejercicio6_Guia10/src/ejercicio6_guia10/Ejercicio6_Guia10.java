/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia10;

import Servicios.ServicioProductos;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class Ejercicio6_Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejecutarOpciones();
    }
    
    public static void menu(){
        System.out.println("Menu de opciones");
        System.out.println("----------------");
        System.out.println("1-Agregar Producto");
        System.out.println("2-Modificar precio");
        System.out.println("3-Eliminar producto");
        System.out.println("4-Mostrar los productos");
        System.out.println("0-Finalizar");        
    }
    public static void ejecutarOpciones(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ServicioProductos serProd = new ServicioProductos();
        int opc;
        do{
        menu();
        opc=leer.nextInt();
            switch(opc){
                case 1:
                    serProd.AgregarProducto();                    
                    break;
                case 2:
                    serProd.ModificarPrecio();
                    break;
                case 3:
                    serProd.EliminarUnProducto();
                    break;
                case 4:
                    serProd.MostrarProductos();
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Error, valor invalido. Reingrese");
                    break;
            }

            leer.next();
            System.out.println("\n\n\n");
        }while(opc!=0);
    }
}
