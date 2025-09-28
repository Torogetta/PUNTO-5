/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller5;

import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.VentasTotales;

/**
 *
 * @author tomas
 */
public class Taller5 {

    public static void main(String[] args) {
        VentasTotales ventas= new VentasTotales();
        
        
        int opcion;
        do{ 
        opcion= Integer.parseInt(JOptionPane.showInputDialog("""
        Menu 
    1. Agregar facturas clientes 
      2. Mostrar recaudo total 
        3. Mostrar recaudo total por promotora 
        4. Mostrar cantidad de boletas por tipo
        5. salir
        Elige una opci\u00f3n: """)); 
        switch (opcion){
            case 1 -> {
                  ventas.agregarCliente(); 
            }
            case 2 -> {
                    ventas.contarDineroRecibido();
            }
            case 3 -> {
                    ventas.contarDineroPorPromotora();
            }
            case 4 -> {
                
                    ventas.contarBoletasTipo();
                
            }
            case 5-> {
                break;
            }
            default -> JOptionPane.showMessageDialog(null, "Opción inválida");
        }        
        }while(opcion !=5);
    }
}
