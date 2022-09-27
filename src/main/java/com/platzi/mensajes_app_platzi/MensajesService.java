/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app_platzi;

import java.util.Scanner;

/**
 *
 * @author Gomez
 */
public class MensajesService {
    
    public static void crear_mensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        
        MensajesDAO.crear_mensajesDB(registro);
        
    }
    
    public static void listar_mensajes(){
        MensajesDAO.listar_mensajesDB();
        
    }
    
    public static void actualizar_mensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo Mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Escribe el ID del mensaje");
        int id_mensaje = sc.nextInt();
        
        Mensajes actualizacion = new Mensajes();
        actualizacion.setMensaje(mensaje);
        actualizacion.setId_mensaje(id_mensaje);
        MensajesDAO.actualizar_mensajesDB(actualizacion);
        2
                
   
    }
    
    public static void eliminar_mensaje(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es el ID del mensaje");
        int id_mensaje = sc.nextInt();
        MensajesDAO.eliminar_mensajes(id_mensaje);
    }
}
