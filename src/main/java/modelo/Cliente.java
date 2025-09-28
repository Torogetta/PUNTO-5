/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author tomas
 */
public class Cliente {
    
    private String nombre;
    private String promotora;
    private String tipo;
    private int boletas;
    private boolean tarjeta;

    public Cliente(String nombre, String promotora, String tipo, int boletas, boolean tarjeta) {
        this.nombre = nombre;
        this.promotora = promotora;
        this.tipo = tipo;
        this.boletas = boletas;
        this.tarjeta = tarjeta;
    }

 

    public String getPromotora() {
        return promotora;
    }

    public String getTipo() {
        return tipo;
    }

    public int getBoletas() {
        return boletas;
    }


    
    public int valorCompra(){
        
        int precio=0;
        
         if (promotora.equalsIgnoreCase("Cine Colombia")) {
            if (tipo.equalsIgnoreCase("35mm")) {
                precio = 8000;
            } else if (tipo.equalsIgnoreCase("3D")) {
                precio = 9500;
            }
        } else if (promotora.equalsIgnoreCase("Royal Films")) {
            if (tipo.equalsIgnoreCase("35mm")) {
                precio = 6500;
            } else if (tipo.equalsIgnoreCase("3D")) {
                precio = 8500;
            }
        }
         
        int valorTotal= precio * boletas;
        
        if (tarjeta) {
            valorTotal *= 0.9;
        }

    return valorTotal;
    }
    
}
