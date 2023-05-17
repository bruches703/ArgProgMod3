/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author bruch
 */
public class ServicioProductos {
    HashMap<String, Integer> productos = new HashMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void AgregarProducto(){
        System.out.println("Ingrese nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese precio");
        Integer precio = leer.nextInt();
        productos.put(nombre, precio);
        System.out.println("Se agrego correctamente");
        System.out.println("---------------------------------");
    }
    
    public void ModificarPrecio(){
        System.out.println("Ingrese producto a modificar");
        String nombre = leer.next();
        
        productos.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            if (key.equals(nombre)) {
                System.out.println("Ingrese nuevo precio: ");
                productos.replace(key, leer.nextInt());
            }
            System.out.println("Se modifico correctamente");
            System.out.println("---------------------------------");
        });
        
    }
    
    public void EliminarUnProducto(){
        System.out.println("Ingrese producto a Eliminar");
        String nombre = leer.next();
        System.out.println("");
        System.out.println("");
        if(productos.remove(nombre)!=null){
            System.out.println("Se removio exitosamente");
        } else {
            System.out.println("El producto no se encontro");
        }
        System.out.println("---------------------------------");
    }
    
    public void MostrarProductos(){
        if(productos.isEmpty()){
            System.out.println("Lista vacia");
        }else{
            productos.entrySet().forEach((entry) -> {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Producto: "+key+"   Precio: "+value);
            }); 
        }
        
    }
}
