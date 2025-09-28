/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class VentasTotales {
    
    private Cliente[] clientes;
    private int cantidadClientes;
    
    public void agregarCliente(){
        
        cantidadClientes = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de facturas de venta que desea ingresar"));
        clientes = new Cliente[cantidadClientes];
        
        OUTER:
        OUTER_1:
        for (int i = 0; i < clientes.length; i++) {
            String nombre;
            String promotora;
            String tipo;
            int boletas;
            boolean tarjeta;
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
            
            int opcionPromotora= Integer.parseInt(JOptionPane.showInputDialog("Indique la promotora (1= Cine Colombia, 2= Royal Films"));
            switch (opcionPromotora) {
                case 1 -> promotora= "Cine Colombia";
                case 2 -> promotora= "Royal Films";
                default -> {
                    JOptionPane.showMessageDialog(null, "valor inválido");
                    break OUTER;
                }
            }
            int opcionTipo= Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de boleta (1 para 35mm y 2 para 3D"));
            switch (opcionTipo) {
                case 1 -> tipo="35mm";
                case 2 -> tipo="3D";
                default -> {
                    JOptionPane.showMessageDialog(null, "valor inválido");
                    break OUTER_1;
                }
            }
            boletas= Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de boletas compradas por el cliente"));
            String resp = JOptionPane.showInputDialog("¿Tiene tarjeta de descuento? (si/no)");
            tarjeta = resp.equalsIgnoreCase("si");
            
            clientes [i]= new Cliente(nombre,promotora, tipo, boletas,tarjeta);
            JOptionPane.showMessageDialog(null, "Datos de factura " + (i+1) + " ingresados correctamente");
        }
        
    }
    
    public void contarDineroRecibido(){
        
       int total = 0;
        for (Cliente f : clientes) {
            total += f.valorCompra();
        }
        JOptionPane.showMessageDialog(null, "El total recaudado es: $ " + total);
    } 
    
    public void contarDineroPorPromotora(){
        
       double totalCC = 0;
       double totalRY= 0;
        for (Cliente f : clientes) {
            
            if (f.getPromotora().equalsIgnoreCase("Cine Colombia")) {
               totalCC += f.valorCompra(); 
            }
            else if (f.getPromotora().equalsIgnoreCase("Royal Films")) {
               totalRY += f.valorCompra(); 
            }
        } JOptionPane.showMessageDialog(null, 
        "Total Cine Colombia: $" + totalCC + 
        "\nTotal Royal Films: $" + totalRY);
        
    } 
    
    public void contarBoletasTipo(){
        
        int contador35mm = 0;
        int contador3D = 0;

        for (Cliente f : clientes) {
            if (f.getTipo().equalsIgnoreCase("35mm")) {
                contador35mm += f.getBoletas();
            } else if (f.getTipo().equalsIgnoreCase("3D")) {
                contador3D += f.getBoletas();
            }
        }
        JOptionPane.showMessageDialog(null, "la cantidad de boletas de 35mm vendidas es " +contador35mm);
        JOptionPane.showMessageDialog(null, "la cantidad de boletas de 3D vendidas es " +contador3D);
    }
}
