/*
    Descripción: Codigo de prueba para el codigo padre Boleto
    Fecha: 09/Mayo/2022
    Nombre: Pimentel Mendoza Marco Daniel
 */
package Corte1;


public class Prueba_Boleto {
    
    public static void main(String[] args){
        
        Boleto b = new Boleto();
        b.capturarDatos();
        double subtotal = b.calcularSubtotal();
        double impuesto = b.calcularImpuesto();
        double descuento = b.calcularDescuento();
        double total = b.calcularTotal(subtotal, impuesto, descuento);
        b.Imprimir(subtotal, impuesto, descuento, total);
        
    }
    
}
