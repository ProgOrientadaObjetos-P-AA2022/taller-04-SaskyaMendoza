/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import Dos.Automotor;
public class Ejecutor {
    
    
    public static void main(String[] args) {
        
        
        String cedula = "1123437538";
        
        String marca = "Chevrolet";
        
        int año = 2021;
       
        double valor = 300000;
        
        Automotor motor1 = new Automotor();
        
        motor1.calcularValorMatricula();
        Automotor motor2 = new Automotor(cedula, marca, año, valor);
        motor2.calcularValorMatricula();
        System.out.println(motor1);
        System.out.println("\n" + motor2);
    }
}
