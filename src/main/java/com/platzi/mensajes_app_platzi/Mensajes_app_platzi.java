/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.platzi.mensajes_app_platzi;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Gomez
 */
public class Mensajes_app_platzi {

    public static void main(String[] args) {
//        Conexion conexion = new Conexion();
//        
//        try(Connection cnx = conexion.get_connection()) {
//            
//        } catch (Exception e) {
//            System.out.println(e);
//        }


       Scanner sc = new Scanner(System.in);
        int response = 0;
        
        
        do { 
            System.out.println("----------------------");
            System.out.println("Aplicaicon de Mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Ver Mensajes");
            System.out.println("3. Actualizar Mensaje");
            System.out.println("4. Eliminar Mensaje");
            System.out.println("5. Salir");
            
            response = sc.nextInt();
            switch (response) {
                case 1:
                    MensajesService.crear_mensaje();
                    break;
                case 2:
                    MensajesService.listar_mensajes();
                    break;
                case 3:
                    MensajesService.actualizar_mensaje();
                    break;
                case 4:
                    MensajesService.eliminar_mensaje();
                    break;
                default:
                    break;
            }
            
        } while (response!= 5);
    }
}
